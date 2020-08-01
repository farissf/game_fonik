package com.pembelajaran.gamefonik;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.MediaPlayer;

import com.pembelajaran.gamefonik.QuizContract.QuestionTable;

import java.util.ArrayList;

public class QuizDbHelper extends SQLiteOpenHelper {
    private Context context;
    private MediaPlayer mediaPlayer;
    private static final String DATABASE_NAME = "GoQuiz.db";
    private static final int DATBASE_VERSION = 1;

    private SQLiteDatabase db;


    QuizDbHelper(Context context) {
        super(context, DATABASE_NAME,null, DATBASE_VERSION);
        this.context = context;
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);

    }


    private void fillQuestionsTable() {
        int questsuara1 = R.raw.sapi;
        Questions q1 = new Questions("Suara apakah ini ?", questsuara1, "Sapi", "Ular", "Lonceng", "Kucing", 1);
        addQuestions(q1);
//        playSuara(questsuara1);

        int questsuara2 = R.raw.kucing;
        Questions q2 = new Questions("Suara apakah ini ?", questsuara2, "", "", "", "", 2);
        addQuestions(q2);
//        playSuara(questsuara2);

        int questsuara3 = R.raw.kuda;
        Questions q3 = new Questions("Suara apakah ini ?", questsuara3, "", "", "", "", 3);
        addQuestions(q3);
//        playSuara(questsuara3);

        int questsuara4 = R.raw.ayam;
        Questions q4 = new Questions("Suara apakah ini ?", questsuara4, "", "", "", "", 1);
        addQuestions(q4);
//        playSuara(questsuara4);

        int questsuara5 = R.raw.serigala;
        Questions q5 = new Questions("Suara apakah ini ?", questsuara5, "", "", "", "", 4);
        addQuestions(q5);
//        playSuara(questsuara5);

        int questsuara6 = R.raw.gajah;
        Questions q6 = new Questions("Suara apakah ini ?", questsuara6, "Mobil", "Gajah", "Lonceng", "Kucing", 2);
        addQuestions(q6);
//        playSuara(questsuara6);
    }

    private void playSuara(final int suara) {

        mediaPlayer = MediaPlayer.create(context,suara);

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                    mediaPlayer.start();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
            }
        });
    }

    private void addQuestions(Questions question){

        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION,question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1,question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2,question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3,question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4,question.getOption4());
        cv.put(QuestionTable.COLUMN_ANSWER_NR,question.getAnswerNr());

        db.insert(QuestionTable.TABLE_NAME,null,cv);

    }

    public ArrayList<Questions> getAllQuestions() {

        ArrayList<Questions> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] Projection = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR
        };



        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                null,
                null,
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                Questions question = new Questions();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;

    }


}



