package com.pembelajaran.gamefonik;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;


public class TesPendengaranActivity extends Activity {


    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private Button buttonConfirmNext;
    private Button buttonPlaySound;



    private TextView textViewQuestion;
    private TextView textViewScore;
    private TextView textViewQuestionCount;
    private TextView textViewCountDown;


    private ArrayList<Questions> questionList;
    private int questionCounter;
    private int questionTotalCount;
    private Questions currentQuestions;
    private boolean answerd;


    private final Handler handler = new Handler();




    private int correctAns = 0, wrongAns = 0;

    private TimerDialog timerDialog;
    private CorrectDialog correctDialog;
    private WrongDialog wrongDialog;

    private PlayAudioForAnswers playAudioForAnswers;

    int FLAG = 0;

    int score =0;
    String suara="";
    int suaraMp3;
    private static final long COUNTDOWN_IN_MILLIS = 30000;
    private CountDownTimer countDownTimer;
    private long timeleftinMillis;

    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        playAudioForAnswers = new PlayAudioForAnswers(this);
        setContentView(R.layout.activity_tes_pendegaran);
        setupUI();
        fetchDB();
        Log.i("BUGBUG","onCreate() in QuizActivity");

        timerDialog = new TimerDialog(this);
        correctDialog = new CorrectDialog(this);
        wrongDialog = new WrongDialog(this);
    }



    private void setupUI(){
        textViewQuestion = findViewById(R.id.txtQuestionContainer);

        textViewScore = findViewById(R.id.txtScore);
        textViewQuestionCount = findViewById(R.id.txtTotalQuestion);
        textViewCountDown = findViewById(R.id.txtViewTimer);



        rbGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_button1);
        rb2 = findViewById(R.id.radio_button2);
        rb3 = findViewById(R.id.radio_button3);
        rb4 = findViewById(R.id.radio_button4);
        buttonConfirmNext = findViewById(R.id.button);
        buttonPlaySound = findViewById(R.id.button2);
        buttonPlaySound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudioForAnswers.playMusic(suaraMp3);
            }
        });
    }

    public void fetchDB() {
        QuizDbHelper dbHelper = new QuizDbHelper(this);
        questionList = dbHelper.getAllQuestions();
        startQuiz();

    }


    public void startQuiz() {

        questionTotalCount = questionList.size();
        Collections.shuffle(questionList);

        showQuestions();   // calling showQuestion() method



        rbGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {



                switch (checkedId){

                    case R.id.radio_button1:

                        rb1.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                        rb2.setTextColor(Color.BLACK);
                        rb3.setTextColor(Color.BLACK);
                        rb4.setTextColor(Color.BLACK);


//                        rb1.setBackgroundColor(Color.GREEN);
                        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.when_answer_selected));
                        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
                        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
                        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));

                        break;
                    case R.id.radio_button2:
                        rb2.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

                        rb1.setTextColor(Color.BLACK);
                        rb3.setTextColor(Color.BLACK);
                        rb4.setTextColor(Color.BLACK);


//                        rb2.setBackgroundColor(Color.GREEN);
                        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.when_answer_selected));
                        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
                        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
                        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));

                        break;

                    case R.id.radio_button3:
                        rb3.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                        rb2.setTextColor(Color.BLACK);
                        rb1.setTextColor(Color.BLACK);
                        rb4.setTextColor(Color.BLACK);

//                        rb3.setBackgroundColor(Color.GREEN);
                        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.when_answer_selected));
                        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
                        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
                        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));

                        break;

                    case R.id.radio_button4:
                        rb4.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                        rb2.setTextColor(Color.BLACK);
                        rb3.setTextColor(Color.BLACK);
                        rb1.setTextColor(Color.BLACK);


                        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.when_answer_selected));
                        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
                        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
                        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));

                        break;
                }

            }
        });

        buttonConfirmNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!answerd) {
                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()) {

                        quizOperation();
                    } else {

                        Toast.makeText(TesPendengaranActivity.this, "Pilih dahulu jawabannya ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }


    public void showQuestions() {

        playAudioForAnswers = new PlayAudioForAnswers(this);
        rbGroup.clearCheck();

        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));
        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_default_background));


        rb1.setTextColor(Color.BLACK);
        rb2.setTextColor(Color.BLACK);
        rb3.setTextColor(Color.BLACK);
        rb4.setTextColor(Color.BLACK);


        if (questionCounter < questionTotalCount) {
            currentQuestions = questionList.get(questionCounter);
            textViewQuestion.setText(currentQuestions.getQuestion());

//            int id1 = getApplicationContext().getResources().getIdentifier(currentQuestions.getOption1().toLowerCase(), "drawable", getApplicationContext().getPackageName());
//            int id2 = getApplicationContext().getResources().getIdentifier(currentQuestions.getOption2().toLowerCase(), "drawable", getApplicationContext().getPackageName());
//            int id3 = getApplicationContext().getResources().getIdentifier(currentQuestions.getOption3().toLowerCase(), "drawable", getApplicationContext().getPackageName());
//            int id4 = getApplicationContext().getResources().getIdentifier(currentQuestions.getOption4().toLowerCase(), "drawable", getApplicationContext().getPackageName());
            rb1.setText(currentQuestions.getOption1());
//            rb1.setBackgroundResource(id1);
            rb2.setText(currentQuestions.getOption2());
//            rb2.setBackgroundResource(id2);
            rb3.setText(currentQuestions.getOption3());
//            rb3.setBackgroundResource(id3);
            rb4.setText(currentQuestions.getOption4());
//            rb4.setBackgroundResource(id4);
            suara = "";
            if(currentQuestions.getAnswerNr() == 1){
                suara = currentQuestions.getOption1().toLowerCase();
            }else if(currentQuestions.getAnswerNr()==2){
                suara = currentQuestions.getOption2().toLowerCase();
            }else if(currentQuestions.getAnswerNr()==3){
                suara = currentQuestions.getOption3().toLowerCase();
            }else{
                suara = currentQuestions.getOption4().toLowerCase();
            }
            suaraMp3 = getApplicationContext().getResources().getIdentifier(suara, "raw", getApplicationContext().getPackageName());
            playAudioForAnswers.playMusic(suaraMp3);
            questionCounter++;
            answerd = false;
            buttonConfirmNext.setText("Ok");

            textViewQuestionCount.setText("Pertanyaan: " + questionCounter + "/" + questionTotalCount);


            timeleftinMillis = COUNTDOWN_IN_MILLIS;
            startCountDown();




        } else {

            // If Number of Questions Finishes then we need to finish the Quiz and Shows the User Quiz Performance


            Toast.makeText(this, "Kuis Selesai", Toast.LENGTH_SHORT).show();

            rb1.setClickable(false);
            rb2.setClickable(false);
            rb3.setClickable(false);
            rb4.setClickable(false);
            buttonConfirmNext.setClickable(false);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    finalResult();

                }
            }, 2000);
        }
    }

    private void quizOperation() {
        answerd = true;

        countDownTimer.cancel();

        RadioButton rbselected = findViewById(rbGroup.getCheckedRadioButtonId());
        int answerNr = rbGroup.indexOfChild(rbselected) + 1;

        checkSolution(answerNr, rbselected);

    }


    private void checkSolution(int answerNr, RadioButton rbselected) {

        switch (currentQuestions.getAnswerNr()) {
            case 1:
                if (currentQuestions.getAnswerNr() == answerNr) {

                    rb1.setBackground(ContextCompat.getDrawable(
                            this, R.drawable.correct_option_background));
                    rb1.setTextColor(Color.BLACK);
                    correctAns++;

                    score += 10;
                    textViewScore.setText("Skor: " + String.valueOf(score));
                    correctDialog.correctDialog(score,this);

                    FLAG = 1;

                } else {
                    changetoIncorrectColor(rbselected);
                    wrongAns++;

                    String correctAnswer = (String) rb1.getText();
                    wrongDialog.wrongDialog(correctAnswer,this);

                    FLAG = 2;

                }
                playAudioForAnswers.setAudioforAnswer(FLAG);
                break;
            case 2:
                if (currentQuestions.getAnswerNr() == answerNr) {
                    rb2.setBackground(ContextCompat.getDrawable(this, R.drawable.correct_option_background));
                    rb2.setTextColor(Color.BLACK);
                    correctAns++;
                    score += 10;
                    textViewScore.setText("Skor: " + String.valueOf(score));
                    correctDialog.correctDialog(score,this);

                    FLAG = 1;


                } else {
                    changetoIncorrectColor(rbselected);
                    wrongAns++;


                    String correctAnswer = (String) rb2.getText();
                    wrongDialog.wrongDialog(correctAnswer,this);

                    FLAG = 2;


                }
                playAudioForAnswers.setAudioforAnswer(FLAG);
                break;
            case 3:
                if (currentQuestions.getAnswerNr() == answerNr) {

                    rb3.setBackground(ContextCompat.getDrawable(this, R.drawable.correct_option_background));
                    rb3.setTextColor(Color.BLACK);


                    correctAns++;


                    score += 10;
                    textViewScore.setText("Skor: " + String.valueOf(score));
                    correctDialog.correctDialog(score,this);

                    FLAG = 1;


                } else {
                    changetoIncorrectColor(rbselected);
                    wrongAns++;


                    String correctAnswer = (String) rb3.getText();
                    wrongDialog.wrongDialog(correctAnswer,this);

                    FLAG = 2;


                }
                playAudioForAnswers.setAudioforAnswer(FLAG);
                break;
            case 4:
                if (currentQuestions.getAnswerNr() == answerNr) {

                    rb4.setBackground(ContextCompat.getDrawable(this, R.drawable.correct_option_background));
                    rb4.setTextColor(Color.BLACK);


                    correctAns++;


                    score += 10;
                    textViewScore.setText("Skor: " + String.valueOf(score));
                    correctDialog.correctDialog(score,this);

                    FLAG = 1;


                } else {
                    changetoIncorrectColor(rbselected);
                    wrongAns++;


                    String correctAnswer = (String) rb4.getText();
                    wrongDialog.wrongDialog(correctAnswer,this);

                    FLAG = 2;


                }
                playAudioForAnswers.setAudioforAnswer(FLAG);
                break;
        }
        if (questionCounter == questionTotalCount) {
            buttonConfirmNext.setText("Selesai");
        }
    }

    void changetoIncorrectColor(RadioButton rbselected) {
        rbselected.setBackground(ContextCompat.getDrawable(this, R.drawable.wrong_answer_background));

        rbselected.setTextColor(Color.BLACK);
    }



    //  the timer code

    private void startCountDown(){

        countDownTimer = new CountDownTimer(timeleftinMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeleftinMillis = millisUntilFinished;

                updateCountDownText();
            }

            @Override
            public void onFinish() {

                timeleftinMillis = 0;
                updateCountDownText();

            }
        }.start();

    }



    private void updateCountDownText(){

        int minutes = (int) (timeleftinMillis/1000) /60;
        int seconds = (int) (timeleftinMillis/1000) % 60;

        //  String timeFormatted = String.format(Locale.getDefault(),"02d:%02d",minutes,seconds);

        String timeFormatted = String.format(Locale.getDefault(),"%02d:%02d",minutes, seconds);
        textViewCountDown.setText(timeFormatted);


        if (timeleftinMillis < 10000){


            textViewCountDown.setTextColor(ContextCompat.getColor(this,R.color.red));

            FLAG = 3;
            playAudioForAnswers.setAudioforAnswer(FLAG);


        }else {
            textViewCountDown.setTextColor(ContextCompat.getColor(this,R.color.white));
        }


        if (timeleftinMillis == 0 ){


            Toast.makeText(this, "Oops waktu habis!", Toast.LENGTH_SHORT).show();


            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    timerDialog.timerDialog();

                }
            },2000);



        }
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("BUGBUG","onRestart() in QuizActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("BUGBUG","onStop() in QuizActivity");
        finish();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("BUGBUG","onPause() in QuizActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("BUGBUG","onResume() in QuizActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("BUGBUG","onStart() in QuizActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (countDownTimer!=null){
            countDownTimer.cancel();
        }
        Log.i("BUGBUG","onDestroy() in QuizActivity");


    }


    private void finalResult(){

        Intent resultData = new Intent(TesPendengaranActivity.this,ResultActivity.class);

        resultData.putExtra("Skor Kamu",score);
        resultData.putExtra("Banyak Pertanyaan",questionTotalCount);
        resultData.putExtra("Benar",correctAns);
        resultData.putExtra("Salah",wrongAns);
        startActivity(resultData);

    }


    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){

            Intent intent = new Intent(TesPendengaranActivity.this,TerapiActivity.class);
            startActivity(intent);

        }else {
            Toast.makeText(this, "Press Again to Exit", Toast.LENGTH_SHORT).show();

        }
        backPressedTime = System.currentTimeMillis();
    }
}
