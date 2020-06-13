package com.pembelajaran.gamefonik;

import android.app.Activity;
import android.content.Intent;
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

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_game_act);
        jawabanTxt = (TextView) findViewById(R.id.jawabanTxt);

        soal = (TextView) findViewById(R.id.soalimg);
        String data = Objects.requireNonNull(getIntent().getExtras()).getString("id");
        assert data != null;
        switch (data) {
            case "a":
                soal.setBackgroundResource(R.drawable.a);
                break;
            case "b":
                soal.setBackgroundResource(R.drawable.b);
                break;
            case "c":
                soal.setBackgroundResource(R.drawable.c);
                break;
            case "d":
                soal.setBackgroundResource(R.drawable.d);
                break;
            case "e":
                soal.setBackgroundResource(R.drawable.e);
                break;
            case "f":
                soal.setBackgroundResource(R.drawable.f);
                break;
            case "g":
                soal.setBackgroundResource(R.drawable.g);
                break;
            case "h":
                soal.setBackgroundResource(R.drawable.h);
                break;
            case "i":
                soal.setBackgroundResource(R.drawable.i);
                break;
            case "j":
                soal.setBackgroundResource(R.drawable.j);
                break;
            case "k":
                soal.setBackgroundResource(R.drawable.k);
                break;
            case "l":
                soal.setBackgroundResource(R.drawable.l);
                break;
            case "m":
                soal.setBackgroundResource(R.drawable.m);
                break;
            case "n":
                soal.setBackgroundResource(R.drawable.n);
                break;
            case "o":
                soal.setBackgroundResource(R.drawable.o);
                break;
            case "p":
                soal.setBackgroundResource(R.drawable.p);
                break;
            case "q":
                soal.setBackgroundResource(R.drawable.q);
                break;
            case "r":
                soal.setBackgroundResource(R.drawable.r);
                break;
            case "s":
                soal.setBackgroundResource(R.drawable.s);
                break;
            case "t":
                soal.setBackgroundResource(R.drawable.t);
                break;
            case "u":
                soal.setBackgroundResource(R.drawable.u);
                break;
            case "v":
                soal.setBackgroundResource(R.drawable.v);
                break;
            case "w":
                soal.setBackgroundResource(R.drawable.w);
                break;
            case "x":
                soal.setBackgroundResource(R.drawable.x);
                break;
            case "y":
                soal.setBackgroundResource(R.drawable.y);
                break;
            case "z":
                soal.setBackgroundResource(R.drawable.z);
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