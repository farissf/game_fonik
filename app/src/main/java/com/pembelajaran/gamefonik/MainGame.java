package com.pembelajaran.gamefonik;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class MainGame extends Activity {
    private TextView jawabanTxt;
    TextView soal;
    private String textA;
    TextView textView;

    SpeechRecognizer mSpeechRecognizer;
    Intent mSpeechRecognizerIntent;

    private static final String isPlaying = "";
    private MediaPlayer player;
    Button kembali;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_game_act);
        jawabanTxt = findViewById(R.id.jawabanTxt);
        kembali = findViewById(R.id.backBtn);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        soal = findViewById(R.id.soalimg);
        String data = Objects.requireNonNull(getIntent().getExtras()).getString("id");
        assert data != null;
        switch (data) {
            case "a":
                soal.setBackgroundResource(R.drawable.soal_a);
                Button soal_a = this.findViewById(R.id.suaraBtn);
                soal_a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(1);
                    }
                });
                break;
            case "b":
                soal.setBackgroundResource(R.drawable.soal_b);
                Button soal_b = this.findViewById(R.id.suaraBtn);
                soal_b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(2);
                    }
                });
                break;
            case "c":
                soal.setBackgroundResource(R.drawable.soal_c);
                Button soal_c = this.findViewById(R.id.suaraBtn);
                soal_c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(3);
                    }
                });
                break;
            case "d":
                soal.setBackgroundResource(R.drawable.soal_d);
                Button soal_d = this.findViewById(R.id.suaraBtn);
                soal_d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(4);
                    }
                });
                break;
            case "e":
                soal.setBackgroundResource(R.drawable.soal_e);
                Button soal_e = this.findViewById(R.id.suaraBtn);
                soal_e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(5);
                    }
                });
                break;
            case "f":
                soal.setBackgroundResource(R.drawable.soal_f);
                Button soal_f = this.findViewById(R.id.suaraBtn);
                soal_f.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(6);
                    }
                });
                break;
            case "g":
                soal.setBackgroundResource(R.drawable.soal_g);
                Button soal_g = this.findViewById(R.id.suaraBtn);
                soal_g.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(7);
                    }
                });
                break;
            case "h":
                soal.setBackgroundResource(R.drawable.soal_h);
                Button soal_h = this.findViewById(R.id.suaraBtn);
                soal_h.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(8);
                    }
                });
                break;
            case "i":
                soal.setBackgroundResource(R.drawable.soal_i);
                Button soal_i = this.findViewById(R.id.suaraBtn);
                soal_i.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(9);
                    }
                });
                break;
            case "j":
                soal.setBackgroundResource(R.drawable.soal_j);
                Button soal_j = this.findViewById(R.id.suaraBtn);
                soal_j.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(10);
                    }
                });
                break;
            case "k":
                soal.setBackgroundResource(R.drawable.soal_k);
                Button soal_k = this.findViewById(R.id.suaraBtn);
                soal_k.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(11);
                    }
                });
                break;
            case "l":
                soal.setBackgroundResource(R.drawable.soal_l);
                Button soal_l = this.findViewById(R.id.suaraBtn);
                soal_l.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(12);
                    }
                });
                break;
            case "m":
                soal.setBackgroundResource(R.drawable.soal_m);
                Button soal_m = this.findViewById(R.id.suaraBtn);
                soal_m.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(13);
                    }
                });
                break;
            case "n":
                soal.setBackgroundResource(R.drawable.soal_n);
                Button soal_n = this.findViewById(R.id.suaraBtn);
                soal_n.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(14);
                    }
                });
                break;
            case "o":
                soal.setBackgroundResource(R.drawable.soal_o);
                Button soal_o = this.findViewById(R.id.suaraBtn);
                soal_o.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(15);
                    }
                });
                break;
            case "p":
                soal.setBackgroundResource(R.drawable.soal_p);
                Button soal_p = this.findViewById(R.id.suaraBtn);
                soal_p.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(16);
                    }
                });
                break;
            case "q":
                soal.setBackgroundResource(R.drawable.q);
                Button q = this.findViewById(R.id.suaraBtn);
                q.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(17);
                    }
                });
                break;
            case "r":
                soal.setBackgroundResource(R.drawable.soal_r);
                Button soal_r = this.findViewById(R.id.suaraBtn);
                soal_r.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(18);
                    }
                });
                break;
            case "s":
                soal.setBackgroundResource(R.drawable.soal_s);
                Button soal_s = this.findViewById(R.id.suaraBtn);
                soal_s.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(19);
                    }
                });
                break;
            case "t":
                soal.setBackgroundResource(R.drawable.soal_t);
                Button soal_t = this.findViewById(R.id.suaraBtn);
                soal_t.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(20);
                    }
                });
                break;
            case "u":
                soal.setBackgroundResource(R.drawable.soal_u);
                Button soal_u = this.findViewById(R.id.suaraBtn);
                soal_u.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(21);
                    }
                });
                break;
            case "v":
                soal.setBackgroundResource(R.drawable.soal_v);
                Button soal_v = this.findViewById(R.id.suaraBtn);
                soal_v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(22);
                    }
                });
                break;
            case "w":
                soal.setBackgroundResource(R.drawable.soal_w);
                Button soal_w = this.findViewById(R.id.suaraBtn);
                soal_w.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(23);
                    }
                });
                break;
            case "x":
                soal.setBackgroundResource(R.drawable.x);
                Button x = this.findViewById(R.id.suaraBtn);
                x.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(24);
                    }
                });
                break;
            case "y":
                soal.setBackgroundResource(R.drawable.y);
                Button y = this.findViewById(R.id.suaraBtn);
                y.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(25);
                    }
                });
                break;
            case "z":
                soal.setBackgroundResource(R.drawable.soal_z);
                Button soal_z = this.findViewById(R.id.suaraBtn);
                soal_z.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(26);
                    }
                });
                break;
            case "ae":
                soal.setBackgroundResource(R.drawable.ae);
                break;
            case "ai":
                soal.setBackgroundResource(R.drawable.ai);
                break;
            case "ao":
                soal.setBackgroundResource(R.drawable.ao);
                break;
            case "au":
                soal.setBackgroundResource(R.drawable.au);
                break;
            case "ea":
                soal.setBackgroundResource(R.drawable.ea);
                break;
            case "ei":
                soal.setBackgroundResource(R.drawable.ei);
                break;
            case "eo":
                soal.setBackgroundResource(R.drawable.eo);
                break;
            case "eu":
                soal.setBackgroundResource(R.drawable.eu);
                break;
            case "ia":
                soal.setBackgroundResource(R.drawable.ia);
                break;
            case "ie":
                soal.setBackgroundResource(R.drawable.ie);
                break;
            case "io":
                soal.setBackgroundResource(R.drawable.io);
                break;
            case "iu":
                soal.setBackgroundResource(R.drawable.iu);
                break;
            case "oi":
                soal.setBackgroundResource(R.drawable.oi);
                break;
            case "ou":
                soal.setBackgroundResource(R.drawable.ou);
                break;
            case "ua":
                soal.setBackgroundResource(R.drawable.ua);
                break;
            case "ue":
                soal.setBackgroundResource(R.drawable.ue);
                break;
            case "ui":
                soal.setBackgroundResource(R.drawable.ui);
                break;
            case "uo":
                soal.setBackgroundResource(R.drawable.uo);
                break;
        }

    }
    @Override
    public void onPause(){
        try{
            super.onPause();
            player.pause();
        }catch(Exception ignored){

        }
    }

    private void playSound(int arg){
        try{
            if (player.isPlaying()){
                player.stop();
                player.release();
            }
        }catch (Exception e){Toast.makeText(this, isPlaying,Toast.LENGTH_LONG).show();
        }
        if(arg == 1){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_a2);
        }else if(arg == 2){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_b2);
        }else if(arg == 3){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_c2);
        }else if(arg == 4){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_d2);
        }else if(arg == 5){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_e2);
        }else if(arg == 6){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_f2);
        }else if(arg == 7){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_g2);
        }else if(arg == 8){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_h2);
        }else if(arg == 9){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_i2);
        }else if(arg == 10){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_j2);
        }else if(arg == 11){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_k2);
        }else if(arg == 12){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_l2);
        }else if(arg == 13){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_m2);
        }else if(arg == 14){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_n2);
        }else if(arg == 15){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_o2);
        }else if(arg == 16){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_p2);
        }else if(arg == 17){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_q2);
        }else if(arg == 18){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_r2);
        }else if(arg == 19){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_s2);
        }else if(arg == 20){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_t2);
        }else if(arg == 21){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_u2);
        }else if(arg == 22){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_v2);
        }else if(arg == 23){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_w2);
        }else if(arg == 24){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_x2);
        }else if(arg == 25){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_y2);
        }else if(arg == 26){
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.soal_z2);
        }
        player.setLooping(false);
        player.start();

    }

    public void getSpeechInput(View view){
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,Locale.getDefault());

        if(intent.resolveActivity(getPackageManager())!=null) {
            startActivityForResult(intent, 10);
        } else {
            Toast.makeText(this, "Perangkat anda tidak  mendukung", Toast.LENGTH_SHORT).show();
        }
    }
    protected void onActivityResult(int requestCode,int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode,data);

        if (requestCode == 10) {
            if ((resultCode == RESULT_OK && data != null)) {
                ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                assert result != null;
                jawabanTxt.setText(result.get(0));
            }
        }
    }
}