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

import cn.pedant.SweetAlert.SweetAlertDialog;

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
                soal.setBackgroundResource(R.drawable.a);
                Button a = this.findViewById(R.id.suaraBtn);
                a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    playSound(1);
                }
                });
                Button ainfo = findViewById(R.id.infoBtn);
                ainfo.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                        .setTitleText("Gambar Pengucapan")
                        .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                        .setCustomImage(R.drawable.soal_a)
                        .show();
                }
                });
                break;
            case "b":
                soal.setBackgroundResource(R.drawable.b);
                Button b = this.findViewById(R.id.suaraBtn);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(2);
                    }
                });
                Button binfo = findViewById(R.id.infoBtn);
                binfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_b)
                                .show();
                    }
                });
                break;
            case "c":
                soal.setBackgroundResource(R.drawable.c);
                Button c = this.findViewById(R.id.suaraBtn);
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(3);
                    }
                });
                Button cinfo = findViewById(R.id.infoBtn);
                cinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_c)
                                .show();
                    }
                });
                break;
            case "d":
                soal.setBackgroundResource(R.drawable.d);
                Button d = this.findViewById(R.id.suaraBtn);
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(4);
                    }
                });
                Button dinfo = findViewById(R.id.infoBtn);
                dinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_d)
                                .show();
                    }
                });
                break;
            case "e":
                soal.setBackgroundResource(R.drawable.e);
                Button e = this.findViewById(R.id.suaraBtn);
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(5);
                    }
                });
                Button einfo = findViewById(R.id.infoBtn);
                einfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_e)
                                .show();
                    }
                });
                break;
            case "f":
                soal.setBackgroundResource(R.drawable.f);
                Button f = this.findViewById(R.id.suaraBtn);
                f.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(6);
                    }
                });
                Button finfo = findViewById(R.id.infoBtn);
                finfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_f)
                                .show();
                    }
                });
                break;
            case "g":
                soal.setBackgroundResource(R.drawable.g);
                Button g = this.findViewById(R.id.suaraBtn);
                g.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(7);
                    }
                });
                Button ginfo = findViewById(R.id.infoBtn);
                ginfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_g)
                                .show();
                    }
                });
                break;
            case "h":
                soal.setBackgroundResource(R.drawable.h);
                Button h = this.findViewById(R.id.suaraBtn);
                h.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(8);
                    }
                });
                Button hinfo = findViewById(R.id.infoBtn);
                hinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_h)
                                .show();
                    }
                });
                break;
            case "i":
                soal.setBackgroundResource(R.drawable.i);
                Button i = this.findViewById(R.id.suaraBtn);
                i.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(9);
                    }
                });
                Button iinfo = findViewById(R.id.infoBtn);
                iinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_i)
                                .show();
                    }
                });
                break;
            case "j":
                soal.setBackgroundResource(R.drawable.j);
                Button j = this.findViewById(R.id.suaraBtn);
                j.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(10);
                    }
                });
                Button jinfo = findViewById(R.id.infoBtn);
                jinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_j)
                                .show();
                    }
                });
                break;
            case "k":
                soal.setBackgroundResource(R.drawable.k);
                Button k = this.findViewById(R.id.suaraBtn);
                k.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(11);
                    }
                });
                Button kinfo = findViewById(R.id.infoBtn);
                kinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_k)
                                .show();
                    }
                });
                break;
            case "l":
                soal.setBackgroundResource(R.drawable.l);
                Button l = this.findViewById(R.id.suaraBtn);
                l.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(12);
                    }
                });
                Button linfo = findViewById(R.id.infoBtn);
                linfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_l)
                                .show();
                    }
                });
                break;
            case "m":
                soal.setBackgroundResource(R.drawable.m);
                Button m = this.findViewById(R.id.suaraBtn);
                m.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(13);
                    }
                });
                Button minfo = findViewById(R.id.infoBtn);
                minfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_m)
                                .show();
                    }
                });
                break;
            case "n":
                soal.setBackgroundResource(R.drawable.n);
                Button n = this.findViewById(R.id.suaraBtn);
                n.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(14);
                    }
                });
                Button ninfo = findViewById(R.id.infoBtn);
                ninfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_n)
                                .show();
                    }
                });
                break;
            case "o":
                soal.setBackgroundResource(R.drawable.o);
                Button o = this.findViewById(R.id.suaraBtn);
                o.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(15);
                    }
                });
                Button oinfo = findViewById(R.id.infoBtn);
                oinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_o)
                                .show();
                    }
                });
                break;
            case "p":
                soal.setBackgroundResource(R.drawable.p);
                Button p = this.findViewById(R.id.suaraBtn);
                p.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(16);
                    }
                });
                Button pinfo = findViewById(R.id.infoBtn);
                pinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_p)
                                .show();
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
                Button qinfo = findViewById(R.id.infoBtn);
                qinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.q)
                                .show();
                    }
                });
                break;
            case "r":
                soal.setBackgroundResource(R.drawable.r);
                Button r = this.findViewById(R.id.suaraBtn);
                r.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(18);
                    }
                });
                Button rinfo = findViewById(R.id.infoBtn);
                rinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_r)
                                .show();
                    }
                });
                break;
            case "s":
                soal.setBackgroundResource(R.drawable.s);
                Button s = this.findViewById(R.id.suaraBtn);
                s.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(19);
                    }
                });
                Button sinfo = findViewById(R.id.infoBtn);
                sinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_s)
                                .show();
                    }
                });
                break;
            case "t":
                soal.setBackgroundResource(R.drawable.t);
                Button t = this.findViewById(R.id.suaraBtn);
                t.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(20);
                    }
                });
                Button tinfo = findViewById(R.id.infoBtn);
                tinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_t)
                                .show();
                    }
                });
                break;
            case "u":
                soal.setBackgroundResource(R.drawable.u);
                Button u = this.findViewById(R.id.suaraBtn);
                u.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(21);
                    }
                });
                Button uinfo = findViewById(R.id.infoBtn);
                uinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_u)
                                .show();
                    }
                });
                break;
            case "v":
                soal.setBackgroundResource(R.drawable.v);
                Button v = this.findViewById(R.id.suaraBtn);
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(22);
                    }
                });
                Button vinfo = findViewById(R.id.infoBtn);
                vinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_v)
                                .show();
                    }
                });
                break;
            case "w":
                soal.setBackgroundResource(R.drawable.w);
                Button w = this.findViewById(R.id.suaraBtn);
                w.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(23);
                    }
                });
                Button winfo = findViewById(R.id.infoBtn);
                winfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_w)
                                .show();
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
                Button xinfo = findViewById(R.id.infoBtn);
                xinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.x)
                                .show();
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
                Button yinfo = findViewById(R.id.infoBtn);
                yinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.y)
                                .show();
                    }
                });
                break;
            case "z":
                soal.setBackgroundResource(R.drawable.z);
                Button z = this.findViewById(R.id.suaraBtn);
                z.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(26);
                    }
                });
                Button zinfo = findViewById(R.id.infoBtn);
                zinfo.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        new SweetAlertDialog(MainGame.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                                .setTitleText("Gambar Pengucapan")
                                .setContentText(". Info pengucapan & Cara penanggulangan ucapan")
                                .setCustomImage(R.drawable.soal_z)
                                .show();
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
        }catch (Exception e){
//            Toast.makeText(this, isPlaying,Toast.LENGTH_LONG).show();
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