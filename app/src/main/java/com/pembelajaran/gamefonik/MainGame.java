package com.pembelajaran.gamefonik;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainGame extends Activity {
    private TextView jawabanTxt,testText;
    TextView soal;
    private String textA;
    TextView textView;


    SpeechRecognizer mSpeechRecognizer;
    Intent mSpeechRecognizerIntent;

    private static final String isPlaying = "";
    private MediaPlayer player;
    Button kembali;
    String jawabanHuruf;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_game_act);
        jawabanTxt = findViewById(R.id.jawabanTxt);
        testText = findViewById(R.id.testText);
        kembali = findViewById(R.id.backBtn);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        testText.setText(Objects.requireNonNull(getIntent().getExtras()).getString("id"));
        soal = findViewById(R.id.soalimg);
        String data = Objects.requireNonNull(getIntent().getExtras()).getString("id");
        assert data != null;
        switch (data) {
            case "a":
                jawabanHuruf = "a";
                soal.setBackgroundResource(R.drawable.a11);
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
                jawabanHuruf = "be";
                soal.setBackgroundResource(R.drawable.b1);
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
                jawabanHuruf = "ce";
                soal.setBackgroundResource(R.drawable.c1);
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
                jawabanHuruf = "de";
                soal.setBackgroundResource(R.drawable.d1);
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
                jawabanHuruf = "e";
                soal.setBackgroundResource(R.drawable.e1);
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
                jawabanHuruf = "f";
                soal.setBackgroundResource(R.drawable.f1);
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
                jawabanHuruf = "ge";
                soal.setBackgroundResource(R.drawable.g1);
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
                jawabanHuruf = "ha";
                soal.setBackgroundResource(R.drawable.h1);
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
                jawabanHuruf = "i";
                soal.setBackgroundResource(R.drawable.i1);
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
                jawabanHuruf = "je";
                soal.setBackgroundResource(R.drawable.j1);
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
                jawabanHuruf = "ka";
                soal.setBackgroundResource(R.drawable.k1);
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
                jawabanHuruf = "l";
                soal.setBackgroundResource(R.drawable.l1);
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
                jawabanHuruf = "m";
                soal.setBackgroundResource(R.drawable.m1);
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
                jawabanHuruf = "n";
                soal.setBackgroundResource(R.drawable.n1);
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
                jawabanHuruf = "o";
                soal.setBackgroundResource(R.drawable.o1);
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
                jawabanHuruf = "pe";
                soal.setBackgroundResource(R.drawable.p1);
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
                jawabanHuruf = "q";
                soal.setBackgroundResource(R.drawable.q1);
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
                jawabanHuruf = "r";
                soal.setBackgroundResource(R.drawable.r1);
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
                jawabanHuruf = "s";
                soal.setBackgroundResource(R.drawable.s1);
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
                jawabanHuruf = "te";
                soal.setBackgroundResource(R.drawable.t1);
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
                jawabanHuruf = "u";
                soal.setBackgroundResource(R.drawable.u1);
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
                jawabanHuruf = "v";
                soal.setBackgroundResource(R.drawable.v1);
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
                jawabanHuruf = "we";
                soal.setBackgroundResource(R.drawable.w1);
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
                jawabanHuruf = "x";
                soal.setBackgroundResource(R.drawable.x1);
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
                jawabanHuruf = "ye";
                soal.setBackgroundResource(R.drawable.y1);
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
                jawabanHuruf = "zet";
                soal.setBackgroundResource(R.drawable.z1);
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
            case "ba":
                jawabanHuruf = "ba";
                soal.setBackgroundResource(R.drawable.ba1);
                Button ba = this.findViewById(R.id.suaraBtn);
                ba.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(27);
                    }
                });
                Button bainfo = findViewById(R.id.infoBtn);
                bainfo.setOnClickListener(new View.OnClickListener() {

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
            case "bi":
                jawabanHuruf = "bi";
                soal.setBackgroundResource(R.drawable.bi1);
                Button bi = this.findViewById(R.id.suaraBtn);
                bi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
                    }
                });
                Button biinfo = findViewById(R.id.infoBtn);
                biinfo.setOnClickListener(new View.OnClickListener() {

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
            case "bu":
                jawabanHuruf = "bu";
                soal.setBackgroundResource(R.drawable.bu1);
                Button bu = this.findViewById(R.id.suaraBtn);
                bu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
                    }
                });
                Button buinfo = findViewById(R.id.infoBtn);
                buinfo.setOnClickListener(new View.OnClickListener() {

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
            case "be":
                jawabanHuruf = "be";
                soal.setBackgroundResource(R.drawable.be1);
                Button be = this.findViewById(R.id.suaraBtn);
                be.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
                    }
                });
                Button beinfo = findViewById(R.id.infoBtn);
                beinfo.setOnClickListener(new View.OnClickListener() {

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
            case "bo":
                jawabanHuruf = "bo";
                soal.setBackgroundResource(R.drawable.bo1);
                Button bo = this.findViewById(R.id.suaraBtn);
                bo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
                    }
                });
                Button boinfo = findViewById(R.id.infoBtn);
                boinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ca":
                jawabanHuruf = "ca";
                soal.setBackgroundResource(R.drawable.ca1);
                Button ca = this.findViewById(R.id.suaraBtn);
                ca.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(32);
                    }
                });
                Button cainfo = findViewById(R.id.infoBtn);
                cainfo.setOnClickListener(new View.OnClickListener() {

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
            case "ci":
                jawabanHuruf = "ci";
                soal.setBackgroundResource(R.drawable.ci1);
                Button ci = this.findViewById(R.id.suaraBtn);
                ci.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(33);
                    }
                });
                Button ciinfo = findViewById(R.id.infoBtn);
                ciinfo.setOnClickListener(new View.OnClickListener() {

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
            case "cu":
                jawabanHuruf = "cu";
                soal.setBackgroundResource(R.drawable.cu1);
                Button cu = this.findViewById(R.id.suaraBtn);
                cu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(34);
                    }
                });
                Button cuinfo = findViewById(R.id.infoBtn);
                cuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ce":
                jawabanHuruf = "ce";
                soal.setBackgroundResource(R.drawable.ce1);
                Button ce = this.findViewById(R.id.suaraBtn);
                ce.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(35);
                    }
                });
                Button ceinfo = findViewById(R.id.infoBtn);
                ceinfo.setOnClickListener(new View.OnClickListener() {

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
            case "co":
                jawabanHuruf = "co";
                soal.setBackgroundResource(R.drawable.co1);
                Button co = this.findViewById(R.id.suaraBtn);
                co.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(36);
                    }
                });
                Button coinfo = findViewById(R.id.infoBtn);
                coinfo.setOnClickListener(new View.OnClickListener() {

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

            case "da":
                jawabanHuruf = "da";
                soal.setBackgroundResource(R.drawable.da1);
                Button da = this.findViewById(R.id.suaraBtn);
                da.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(37);
                    }
                });
                Button dainfo = findViewById(R.id.infoBtn);
                dainfo.setOnClickListener(new View.OnClickListener() {

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
            case "di":
                jawabanHuruf = "di";
                soal.setBackgroundResource(R.drawable.di1);
                Button di = this.findViewById(R.id.suaraBtn);
                di.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(38);
                    }
                });
                Button diinfo = findViewById(R.id.infoBtn);
                diinfo.setOnClickListener(new View.OnClickListener() {

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
            case "du":
                jawabanHuruf = "du";
                soal.setBackgroundResource(R.drawable.du1);
                Button du = this.findViewById(R.id.suaraBtn);
                du.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(39);
                    }
                });
                Button duinfo = findViewById(R.id.infoBtn);
                duinfo.setOnClickListener(new View.OnClickListener() {

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
            case "de":
                jawabanHuruf = "de";
                soal.setBackgroundResource(R.drawable.de1);
                Button de = this.findViewById(R.id.suaraBtn);
                de.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(40);
                    }
                });
                Button deinfo = findViewById(R.id.infoBtn);
                deinfo.setOnClickListener(new View.OnClickListener() {

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
            case "do":
                jawabanHuruf = "do";
                soal.setBackgroundResource(R.drawable.do1);
                Button doo = this.findViewById(R.id.suaraBtn);
                doo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(41);
                    }
                });
                Button dooinfo = findViewById(R.id.infoBtn);
                dooinfo.setOnClickListener(new View.OnClickListener() {

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
            case "fa":
                jawabanHuruf = "fa";
                soal.setBackgroundResource(R.drawable.fa1);
                Button fa = this.findViewById(R.id.suaraBtn);
                fa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(42);
                    }
                });
                Button fainfo = findViewById(R.id.infoBtn);
                fainfo.setOnClickListener(new View.OnClickListener() {

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
            case "fi":
                jawabanHuruf = "fi";
                soal.setBackgroundResource(R.drawable.fi1);
                Button fi = this.findViewById(R.id.suaraBtn);
                fi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(43);
                    }
                });
                Button fiinfo = findViewById(R.id.infoBtn);
                fiinfo.setOnClickListener(new View.OnClickListener() {

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
            case "fu":
                jawabanHuruf = "fu";
                soal.setBackgroundResource(R.drawable.fu1);
                Button fu = this.findViewById(R.id.suaraBtn);
                fu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(44);
                    }
                });
                Button fuinfo = findViewById(R.id.infoBtn);
                fuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "fe":
                jawabanHuruf = "fe";
                soal.setBackgroundResource(R.drawable.fe1);
                Button fe = this.findViewById(R.id.suaraBtn);
                fe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(45);
                    }
                });
                Button feinfo = findViewById(R.id.infoBtn);
                feinfo.setOnClickListener(new View.OnClickListener() {

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
            case "fo":
                jawabanHuruf = "fo";
                soal.setBackgroundResource(R.drawable.fo1);
                Button fo = this.findViewById(R.id.suaraBtn);
                fo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(46);
                    }
                });
                Button foinfo = findViewById(R.id.infoBtn);
                foinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ga":
                jawabanHuruf = "ga";
                soal.setBackgroundResource(R.drawable.ga1);
                Button ga = this.findViewById(R.id.suaraBtn);
                ga.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(47);
                    }
                });
                Button gainfo = findViewById(R.id.infoBtn);
                gainfo.setOnClickListener(new View.OnClickListener() {

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
            case "gi":
                jawabanHuruf = "gi";
                soal.setBackgroundResource(R.drawable.gi1);
                Button gi = this.findViewById(R.id.suaraBtn);
                gi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(48);
                    }
                });
                Button giinfo = findViewById(R.id.infoBtn);
                giinfo.setOnClickListener(new View.OnClickListener() {

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
            case "gu":
                jawabanHuruf = "gu";
                soal.setBackgroundResource(R.drawable.gu1);
                Button gu = this.findViewById(R.id.suaraBtn);
                gu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(49);
                    }
                });
                Button guinfo = findViewById(R.id.infoBtn);
                guinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ge":
                jawabanHuruf = "ge";
                soal.setBackgroundResource(R.drawable.ge1);
                Button ge = this.findViewById(R.id.suaraBtn);
                ge.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(50);
                    }
                });
                Button geinfo = findViewById(R.id.infoBtn);
                geinfo.setOnClickListener(new View.OnClickListener() {

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
            case "go":
                jawabanHuruf = "go";
                soal.setBackgroundResource(R.drawable.go1);
                Button go = this.findViewById(R.id.suaraBtn);
                go.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(51);
                    }
                });
                Button goinfo = findViewById(R.id.infoBtn);
                goinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ha":
                jawabanHuruf = "ha";
                soal.setBackgroundResource(R.drawable.ha1);
                Button ha = this.findViewById(R.id.suaraBtn);
                ha.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(52);
                    }
                });
                Button hainfo = findViewById(R.id.infoBtn);
                hainfo.setOnClickListener(new View.OnClickListener() {

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
            case "hi":
                jawabanHuruf = "hi";
                soal.setBackgroundResource(R.drawable.hi1);
                Button hi = this.findViewById(R.id.suaraBtn);
                hi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(53);
                    }
                });
                Button hiinfo = findViewById(R.id.infoBtn);
                hiinfo.setOnClickListener(new View.OnClickListener() {

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
            case "hu":
                jawabanHuruf = "hu";
                soal.setBackgroundResource(R.drawable.hu1);
                Button hu = this.findViewById(R.id.suaraBtn);
                hu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(54);
                    }
                });
                Button huinfo = findViewById(R.id.infoBtn);
                huinfo.setOnClickListener(new View.OnClickListener() {

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
            case "he":
                jawabanHuruf = "he";
                soal.setBackgroundResource(R.drawable.he1);
                Button he = this.findViewById(R.id.suaraBtn);
                he.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(55);
                    }
                });
                Button heinfo = findViewById(R.id.infoBtn);
                heinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ho":
                jawabanHuruf = "ho";
                soal.setBackgroundResource(R.drawable.ho1);
                Button ho = this.findViewById(R.id.suaraBtn);
                ho.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(56);
                    }
                });
                Button hoinfo = findViewById(R.id.infoBtn);
                hoinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ja":
                jawabanHuruf = "ja";
                soal.setBackgroundResource(R.drawable.ja1);
                Button ja = this.findViewById(R.id.suaraBtn);
                ja.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(57);
                    }
                });
                Button jainfo = findViewById(R.id.infoBtn);
                jainfo.setOnClickListener(new View.OnClickListener() {

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
            case "ji":
                jawabanHuruf = "ji";
                soal.setBackgroundResource(R.drawable.ji1);
                Button ji = this.findViewById(R.id.suaraBtn);
                ji.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(58);
                    }
                });
                Button jiinfo = findViewById(R.id.infoBtn);
                jiinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ju":
                jawabanHuruf = "ju";
                soal.setBackgroundResource(R.drawable.ju1);
                Button ju = this.findViewById(R.id.suaraBtn);
                ju.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(59);
                    }
                });
                Button juinfo = findViewById(R.id.infoBtn);
                juinfo.setOnClickListener(new View.OnClickListener() {

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
            case "je":
                jawabanHuruf = "je";
                soal.setBackgroundResource(R.drawable.je1);
                Button je = this.findViewById(R.id.suaraBtn);
                je.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(60);
                    }
                });
                Button jeinfo = findViewById(R.id.infoBtn);
                jeinfo.setOnClickListener(new View.OnClickListener() {

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
            case "jo":
                jawabanHuruf = "jo";
                soal.setBackgroundResource(R.drawable.jo1);
                Button jo = this.findViewById(R.id.suaraBtn);
                jo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(61);
                    }
                });
                Button joinfo = findViewById(R.id.infoBtn);
                joinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ka":
                jawabanHuruf = "ka";
                soal.setBackgroundResource(R.drawable.ka1);
                Button ka = this.findViewById(R.id.suaraBtn);
                ka.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(62);
                    }
                });
                Button kainfo = findViewById(R.id.infoBtn);
                kainfo.setOnClickListener(new View.OnClickListener() {

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
            case "ki":
                jawabanHuruf = "ki";
                soal.setBackgroundResource(R.drawable.ki1);
                Button ki = this.findViewById(R.id.suaraBtn);
                ki.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(63);
                    }
                });
                Button kiinfo = findViewById(R.id.infoBtn);
                kiinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ku":
                jawabanHuruf = "ku";
                soal.setBackgroundResource(R.drawable.ku1);
                Button ku = this.findViewById(R.id.suaraBtn);
                ku.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(64);
                    }
                });
                Button kuinfo = findViewById(R.id.infoBtn);
                kuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ke":
                jawabanHuruf = "ke";
                soal.setBackgroundResource(R.drawable.ke1);
                Button ke = this.findViewById(R.id.suaraBtn);
                ke.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(65);
                    }
                });
                Button keinfo = findViewById(R.id.infoBtn);
                keinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ko":
                jawabanHuruf = "ko";
                soal.setBackgroundResource(R.drawable.ko1);
                Button ko = this.findViewById(R.id.suaraBtn);
                ko.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(66);
                    }
                });
                Button koinfo = findViewById(R.id.infoBtn);
                koinfo.setOnClickListener(new View.OnClickListener() {

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
            case "la":
                jawabanHuruf = "la";
                soal.setBackgroundResource(R.drawable.la1);
                Button la = this.findViewById(R.id.suaraBtn);
                la.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(67);
                    }
                });
                Button lainfo = findViewById(R.id.infoBtn);
                lainfo.setOnClickListener(new View.OnClickListener() {

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
            case "li":
                jawabanHuruf = "li";
                soal.setBackgroundResource(R.drawable.li1);
                Button li = this.findViewById(R.id.suaraBtn);
                li.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(68);
                    }
                });
                Button liinfo = findViewById(R.id.infoBtn);
                liinfo.setOnClickListener(new View.OnClickListener() {

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
            case "lu":
                jawabanHuruf = "lu";
                soal.setBackgroundResource(R.drawable.lu1);
                Button lu = this.findViewById(R.id.suaraBtn);
                lu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(69);
                    }
                });
                Button luinfo = findViewById(R.id.infoBtn);
                luinfo.setOnClickListener(new View.OnClickListener() {

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
            case "le":
                jawabanHuruf = "le";
                soal.setBackgroundResource(R.drawable.le1);
                Button le = this.findViewById(R.id.suaraBtn);
                le.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(70);
                    }
                });
                Button leinfo = findViewById(R.id.infoBtn);
                leinfo.setOnClickListener(new View.OnClickListener() {

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
            case "lo":
                jawabanHuruf = "lo";
                soal.setBackgroundResource(R.drawable.lo1);
                Button lo = this.findViewById(R.id.suaraBtn);
                lo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(71);
                    }
                });
                Button loinfo = findViewById(R.id.infoBtn);
                loinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ma":
                jawabanHuruf = "ma";
                soal.setBackgroundResource(R.drawable.ma1);
                Button ma = this.findViewById(R.id.suaraBtn);
                ma.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(72);
                    }
                });
                Button mainfo = findViewById(R.id.infoBtn);
                mainfo.setOnClickListener(new View.OnClickListener() {

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
            case "mi":
                jawabanHuruf = "mi";
                soal.setBackgroundResource(R.drawable.mi1);
                Button mi = this.findViewById(R.id.suaraBtn);
                mi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(73);
                    }
                });
                Button miinfo = findViewById(R.id.infoBtn);
                miinfo.setOnClickListener(new View.OnClickListener() {

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
            case "mu":
                jawabanHuruf = "mu";
                soal.setBackgroundResource(R.drawable.mu1);
                Button mu = this.findViewById(R.id.suaraBtn);
                mu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(74);
                    }
                });
                Button muinfo = findViewById(R.id.infoBtn);
                muinfo.setOnClickListener(new View.OnClickListener() {

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
            case "me":
                jawabanHuruf = "me";
                soal.setBackgroundResource(R.drawable.me1);
                Button me = this.findViewById(R.id.suaraBtn);
                me.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(75);
                    }
                });
                Button meinfo = findViewById(R.id.infoBtn);
                meinfo.setOnClickListener(new View.OnClickListener() {

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
            case "mo":
                jawabanHuruf = "mo";
                soal.setBackgroundResource(R.drawable.mo1);
                Button mo = this.findViewById(R.id.suaraBtn);
                mo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(76);
                    }
                });
                Button moinfo = findViewById(R.id.infoBtn);
                moinfo.setOnClickListener(new View.OnClickListener() {

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
            case "na":
                jawabanHuruf = "na";
                soal.setBackgroundResource(R.drawable.na1);
                Button na = this.findViewById(R.id.suaraBtn);
                na.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(77);
                    }
                });
                Button nainfo = findViewById(R.id.infoBtn);
                nainfo.setOnClickListener(new View.OnClickListener() {

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
            case "ni":
                jawabanHuruf = "ni";
                soal.setBackgroundResource(R.drawable.ni1);
                Button ni = this.findViewById(R.id.suaraBtn);
                ni.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(78);
                    }
                });
                Button niinfo = findViewById(R.id.infoBtn);
                niinfo.setOnClickListener(new View.OnClickListener() {

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
            case "nu":
                jawabanHuruf = "nu";
                soal.setBackgroundResource(R.drawable.nu1);
                Button nu = this.findViewById(R.id.suaraBtn);
                nu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(79);
                    }
                });
                Button nuinfo = findViewById(R.id.infoBtn);
                nuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ne":
                jawabanHuruf = "ne";
                soal.setBackgroundResource(R.drawable.ne1);
                Button ne = this.findViewById(R.id.suaraBtn);
                ne.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(80);
                    }
                });
                Button neinfo = findViewById(R.id.infoBtn);
                neinfo.setOnClickListener(new View.OnClickListener() {

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
            case "no":
                jawabanHuruf = "no";
                soal.setBackgroundResource(R.drawable.no1);
                Button no = this.findViewById(R.id.suaraBtn);
                no.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(81);
                    }
                });
                Button noinfo = findViewById(R.id.infoBtn);
                noinfo.setOnClickListener(new View.OnClickListener() {

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
            case "pa":
                jawabanHuruf = "pa";
                soal.setBackgroundResource(R.drawable.pa1);
                Button pa = this.findViewById(R.id.suaraBtn);
                pa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(82);
                    }
                });
                Button painfo = findViewById(R.id.infoBtn);
                painfo.setOnClickListener(new View.OnClickListener() {

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
            case "pi":
                jawabanHuruf = "pi";
                soal.setBackgroundResource(R.drawable.pi1);
                Button pi = this.findViewById(R.id.suaraBtn);
                pi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(83);
                    }
                });
                Button piinfo = findViewById(R.id.infoBtn);
                piinfo.setOnClickListener(new View.OnClickListener() {

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
            case "pu":
                jawabanHuruf = "pu";
                soal.setBackgroundResource(R.drawable.pu1);
                Button pu = this.findViewById(R.id.suaraBtn);
                pu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(84);
                    }
                });
                Button puinfo = findViewById(R.id.infoBtn);
                puinfo.setOnClickListener(new View.OnClickListener() {

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
            case "pe":
                jawabanHuruf = "pe";
                soal.setBackgroundResource(R.drawable.pe1);
                Button pe = this.findViewById(R.id.suaraBtn);
                pe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(85);
                    }
                });
                Button peinfo = findViewById(R.id.infoBtn);
                peinfo.setOnClickListener(new View.OnClickListener() {

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
            case "po":
                jawabanHuruf = "po";
                soal.setBackgroundResource(R.drawable.po1);
                Button po = this.findViewById(R.id.suaraBtn);
                po.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(86);
                    }
                });
                Button poinfo = findViewById(R.id.infoBtn);
                poinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ra":
                jawabanHuruf = "ra";
                soal.setBackgroundResource(R.drawable.ra1);
                Button ra = this.findViewById(R.id.suaraBtn);
                ra.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(87);
                    }
                });
                Button rainfo = findViewById(R.id.infoBtn);
                rainfo.setOnClickListener(new View.OnClickListener() {

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
            case "ri":
                jawabanHuruf = "ri";
                soal.setBackgroundResource(R.drawable.ri1);
                Button ri = this.findViewById(R.id.suaraBtn);
                ri.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(88);
                    }
                });
                Button riinfo = findViewById(R.id.infoBtn);
                riinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ru":
                jawabanHuruf = "ru";
                soal.setBackgroundResource(R.drawable.ru1);
                Button ru = this.findViewById(R.id.suaraBtn);
                ru.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(89);
                    }
                });
                Button ruinfo = findViewById(R.id.infoBtn);
                ruinfo.setOnClickListener(new View.OnClickListener() {

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
            case "re":
                jawabanHuruf = "re";
                soal.setBackgroundResource(R.drawable.re1);
                Button re = this.findViewById(R.id.suaraBtn);
                re.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(90);
                    }
                });
                Button reinfo = findViewById(R.id.infoBtn);
                reinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ro":
                jawabanHuruf = "ro";
                soal.setBackgroundResource(R.drawable.ro1);
                Button ro = this.findViewById(R.id.suaraBtn);
                ro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(91);
                    }
                });
                Button roinfo = findViewById(R.id.infoBtn);
                roinfo.setOnClickListener(new View.OnClickListener() {

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
            case "sa":
                jawabanHuruf = "sa";
                soal.setBackgroundResource(R.drawable.sa1);
                Button sa = this.findViewById(R.id.suaraBtn);
                sa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(92);
                    }
                });
                Button sainfo = findViewById(R.id.infoBtn);
                sainfo.setOnClickListener(new View.OnClickListener() {

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
            case "si":
                jawabanHuruf = "si";
                soal.setBackgroundResource(R.drawable.si1);
                Button si = this.findViewById(R.id.suaraBtn);
                si.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(93);
                    }
                });
                Button siinfo = findViewById(R.id.infoBtn);
                siinfo.setOnClickListener(new View.OnClickListener() {

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
            case "su":
                jawabanHuruf = "su";
                soal.setBackgroundResource(R.drawable.su1);
                Button su = this.findViewById(R.id.suaraBtn);
                su.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(94);
                    }
                });
                Button suinfo = findViewById(R.id.infoBtn);
                suinfo.setOnClickListener(new View.OnClickListener() {

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
            case "se":
                jawabanHuruf = "se";
                soal.setBackgroundResource(R.drawable.se1);
                Button se = this.findViewById(R.id.suaraBtn);
                se.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(95);
                    }
                });
                Button seinfo = findViewById(R.id.infoBtn);
                seinfo.setOnClickListener(new View.OnClickListener() {

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
            case "so":
                jawabanHuruf = "so";
                soal.setBackgroundResource(R.drawable.so1);
                Button so = this.findViewById(R.id.suaraBtn);
                so.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(96);
                    }
                });
                Button soinfo = findViewById(R.id.infoBtn);
                soinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ta":
                jawabanHuruf = "ta";
                soal.setBackgroundResource(R.drawable.ta1);
                Button ta = this.findViewById(R.id.suaraBtn);
                ta.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(97);
                    }
                });
                Button tainfo = findViewById(R.id.infoBtn);
                tainfo.setOnClickListener(new View.OnClickListener() {

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
            case "ti":
                jawabanHuruf = "ti";
                soal.setBackgroundResource(R.drawable.ti1);
                Button ti = this.findViewById(R.id.suaraBtn);
                ti.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(98);
                    }
                });
                Button tiinfo = findViewById(R.id.infoBtn);
                tiinfo.setOnClickListener(new View.OnClickListener() {

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
            case "tu":
                jawabanHuruf = "tu";
                soal.setBackgroundResource(R.drawable.tu1);
                Button tu = this.findViewById(R.id.suaraBtn);
                tu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(99);
                    }
                });
                Button tuinfo = findViewById(R.id.infoBtn);
                tuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "te":
                jawabanHuruf = "te";
                soal.setBackgroundResource(R.drawable.te1);
                Button te = this.findViewById(R.id.suaraBtn);
                te.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(100);
                    }
                });
                Button teinfo = findViewById(R.id.infoBtn);
                teinfo.setOnClickListener(new View.OnClickListener() {

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
            case "to":
                jawabanHuruf = "to";
                soal.setBackgroundResource(R.drawable.to1);
                Button to = this.findViewById(R.id.suaraBtn);
                to.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(101);
                    }
                });
                Button toinfo = findViewById(R.id.infoBtn);
                toinfo.setOnClickListener(new View.OnClickListener() {

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
            case "za":
                jawabanHuruf = "za";
                soal.setBackgroundResource(R.drawable.za1);
                Button za = this.findViewById(R.id.suaraBtn);
                za.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(102);
                    }
                });
                Button zainfo = findViewById(R.id.infoBtn);
                zainfo.setOnClickListener(new View.OnClickListener() {

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
            case "zi":
                jawabanHuruf = "zi";
                soal.setBackgroundResource(R.drawable.zi1);
                Button zi = this.findViewById(R.id.suaraBtn);
                zi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(103);
                    }
                });
                Button ziinfo = findViewById(R.id.infoBtn);
                ziinfo.setOnClickListener(new View.OnClickListener() {

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
            case "zu":
                jawabanHuruf = "zu";
                soal.setBackgroundResource(R.drawable.zu1);
                Button zu = this.findViewById(R.id.suaraBtn);
                zu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(104);
                    }
                });
                Button zuinfo = findViewById(R.id.infoBtn);
                zuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ze":
                jawabanHuruf = "ze";
                soal.setBackgroundResource(R.drawable.ze1);
                Button ze = this.findViewById(R.id.suaraBtn);
                ze.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(105);
                    }
                });
                Button zeinfo = findViewById(R.id.infoBtn);
                zeinfo.setOnClickListener(new View.OnClickListener() {

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
            case "zo":
                jawabanHuruf = "zo";
                soal.setBackgroundResource(R.drawable.zo1);
                Button zo = this.findViewById(R.id.suaraBtn);
                zo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(106);
                    }
                });
                Button zoinfo = findViewById(R.id.infoBtn);
                zoinfo.setOnClickListener(new View.OnClickListener() {

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
            case "paku":
                soal.setBackgroundResource(R.drawable.paku1);
                Button paku = this.findViewById(R.id.suaraBtn);
                paku.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(107);
                    }
                });
                Button pakuinfo = findViewById(R.id.infoBtn);
                pakuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "piano":
                soal.setBackgroundResource(R.drawable.piano1);
                Button piano = this.findViewById(R.id.suaraBtn);
                piano.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(108);
                    }
                });
                Button pianoinfo = findViewById(R.id.infoBtn);
                pianoinfo.setOnClickListener(new View.OnClickListener() {

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
            case "poci":
                soal.setBackgroundResource(R.drawable.poci1);
                Button poci = this.findViewById(R.id.suaraBtn);
                poci.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(109);
                    }
                });
                Button pociinfo = findViewById(R.id.infoBtn);
                pociinfo.setOnClickListener(new View.OnClickListener() {

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
            case "pulpen":
                soal.setBackgroundResource(R.drawable.pulpen1);
                Button pulpen = this.findViewById(R.id.suaraBtn);
                pulpen.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(110);
                    }
                });
                Button pulpeninfo = findViewById(R.id.infoBtn);
                pulpeninfo.setOnClickListener(new View.OnClickListener() {

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
            case "pensil":
                soal.setBackgroundResource(R.drawable.pensil1);
                Button pensil = this.findViewById(R.id.suaraBtn);
                pensil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(111);
                    }
                });
                Button pensilinfo = findViewById(R.id.infoBtn);
                pensilinfo.setOnClickListener(new View.OnClickListener() {

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
            case "ban":
                soal.setBackgroundResource(R.drawable.ban1);
                Button ban = this.findViewById(R.id.suaraBtn);
                ban.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(112);
                    }
                });
                Button baninfo = findViewById(R.id.infoBtn);
                baninfo.setOnClickListener(new View.OnClickListener() {

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
            case "biola":
                soal.setBackgroundResource(R.drawable.biola1);
                Button biola = this.findViewById(R.id.suaraBtn);
                biola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(113);
                    }
                });
                Button biolainfo = findViewById(R.id.infoBtn);
                biolainfo.setOnClickListener(new View.OnClickListener() {

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
            case "buku":
                soal.setBackgroundResource(R.drawable.buku1);
                Button buku = this.findViewById(R.id.suaraBtn);
                buku.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(114);
                    }
                });
                Button bukuinfo = findViewById(R.id.infoBtn);
                bukuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "bebek":
                soal.setBackgroundResource(R.drawable.bebek1);
                Button bebek = this.findViewById(R.id.suaraBtn);
                bebek.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(115);
                    }
                });
                Button bebekinfo = findViewById(R.id.infoBtn);
                bebekinfo.setOnClickListener(new View.OnClickListener() {

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
            case "botol":
                soal.setBackgroundResource(R.drawable.botol1);
                Button botol = this.findViewById(R.id.suaraBtn);
                botol.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(116);
                    }
                });
                Button botolinfo = findViewById(R.id.infoBtn);
                botolinfo.setOnClickListener(new View.OnClickListener() {

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
            case "mata":
                soal.setBackgroundResource(R.drawable.mata1);
                Button mata = this.findViewById(R.id.suaraBtn);
                mata.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(117);
                    }
                });
                Button matainfo = findViewById(R.id.infoBtn);
                matainfo.setOnClickListener(new View.OnClickListener() {

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
            case "mistar":
                soal.setBackgroundResource(R.drawable.mistar1);
                Button mistar = this.findViewById(R.id.suaraBtn);
                mistar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(118);
                    }
                });
                Button mistarinfo = findViewById(R.id.infoBtn);
                mistarinfo.setOnClickListener(new View.OnClickListener() {

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
            case "mutiara":
                soal.setBackgroundResource(R.drawable.mutiara1);
                Button mutiara = this.findViewById(R.id.suaraBtn);
                mutiara.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(119);
                    }
                });
                Button mutiarainfo = findViewById(R.id.infoBtn);
                mutiarainfo.setOnClickListener(new View.OnClickListener() {

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
            case "mobil":
                soal.setBackgroundResource(R.drawable.mobil1);
                Button mobil = this.findViewById(R.id.suaraBtn);
                mobil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(120);
                    }
                });
                Button mobilinfo = findViewById(R.id.infoBtn);
                mobilinfo.setOnClickListener(new View.OnClickListener() {

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
            case "nasi":
                soal.setBackgroundResource(R.drawable.nasi1);
                Button nasi = this.findViewById(R.id.suaraBtn);
                nasi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(121);
                    }
                });
                Button nasiinfo = findViewById(R.id.infoBtn);
                nasiinfo.setOnClickListener(new View.OnClickListener() {

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
            case "nenek":
                soal.setBackgroundResource(R.drawable.nenek1);
                Button nenek = this.findViewById(R.id.suaraBtn);
                nenek.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(122);
                    }
                });
                Button nenekinfo = findViewById(R.id.infoBtn);
                nenekinfo.setOnClickListener(new View.OnClickListener() {

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
            case "tas":
                soal.setBackgroundResource(R.drawable.tas1);
                Button tas = this.findViewById(R.id.suaraBtn);
                tas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(123);
                    }
                });
                Button tasinfo = findViewById(R.id.infoBtn);
                tasinfo.setOnClickListener(new View.OnClickListener() {

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
            case "tikus":
                soal.setBackgroundResource(R.drawable.tikus1);
                Button tikus = this.findViewById(R.id.suaraBtn);
                tikus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(124);
                    }
                });
                Button tikusinfo = findViewById(R.id.infoBtn);
                tikus.setOnClickListener(new View.OnClickListener() {

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
            case "tupai":
                soal.setBackgroundResource(R.drawable.tupai1);
                Button tupai = this.findViewById(R.id.suaraBtn);
                tupai.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(125);
                    }
                });
                Button tupaiinfo = findViewById(R.id.infoBtn);
                tupaiinfo.setOnClickListener(new View.OnClickListener() {

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
            case "teko":
                soal.setBackgroundResource(R.drawable.teko1);
                Button teko = this.findViewById(R.id.suaraBtn);
                teko.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(126);
                    }
                });
                Button tekoinfo = findViewById(R.id.infoBtn);
                tekoinfo.setOnClickListener(new View.OnClickListener() {

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
            case "toko":
                soal.setBackgroundResource(R.drawable.toko1);
                Button toko = this.findViewById(R.id.suaraBtn);
                toko.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(127);
                    }
                });
                Button tokoinfo = findViewById(R.id.infoBtn);
                tokoinfo.setOnClickListener(new View.OnClickListener() {

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
            case "radio":
                soal.setBackgroundResource(R.drawable.radio1);
                Button radio = this.findViewById(R.id.suaraBtn);
                radio.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(128);
                    }
                });
                Button radioinfo = findViewById(R.id.infoBtn);
                radioinfo.setOnClickListener(new View.OnClickListener() {

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
            case "rumah":
                soal.setBackgroundResource(R.drawable.rumah1);
                Button rumah = this.findViewById(R.id.suaraBtn);
                rumah.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(129);
                    }
                });
                Button rumahinfo = findViewById(R.id.infoBtn);
                rumahinfo.setOnClickListener(new View.OnClickListener() {

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
            case "roti":
                soal.setBackgroundResource(R.drawable.roti1);
                Button roti = this.findViewById(R.id.suaraBtn);
                roti.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(130);
                    }
                });
                Button rotiinfo = findViewById(R.id.infoBtn);
                rotiinfo.setOnClickListener(new View.OnClickListener() {

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
            case "laut":
                soal.setBackgroundResource(R.drawable.laut1);
                Button laut = this.findViewById(R.id.suaraBtn);
                laut.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(131);
                    }
                });
                Button lautinfo = findViewById(R.id.infoBtn);
                lautinfo.setOnClickListener(new View.OnClickListener() {

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
            case "lilin":
                soal.setBackgroundResource(R.drawable.lilin1);
                Button lilin = this.findViewById(R.id.suaraBtn);
                lilin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(132);
                    }
                });
                Button lilininfo = findViewById(R.id.infoBtn);
                lilininfo.setOnClickListener(new View.OnClickListener() {

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
            case "lonceng":
                soal.setBackgroundResource(R.drawable.lonceng1);
                Button lonceng = this.findViewById(R.id.suaraBtn);
                lonceng.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(133);
                    }
                });
                Button loncenginfo = findViewById(R.id.infoBtn);
                loncenginfo.setOnClickListener(new View.OnClickListener() {

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
            case "sabun":
                soal.setBackgroundResource(R.drawable.sabun1);
                Button sabun = this.findViewById(R.id.suaraBtn);
                sabun.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(134);
                    }
                });
                Button sabuninfo = findViewById(R.id.infoBtn);
                sabuninfo.setOnClickListener(new View.OnClickListener() {

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
            case "siku":
                soal.setBackgroundResource(R.drawable.siku1);
                Button siku1 = this.findViewById(R.id.suaraBtn);
                siku1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(135);
                    }
                });
                Button sikuinfo = findViewById(R.id.infoBtn);
                sikuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "susu":
                soal.setBackgroundResource(R.drawable.susu1);
                Button susu = this.findViewById(R.id.suaraBtn);
                susu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button susuinfo = findViewById(R.id.infoBtn);
                susuinfo.setOnClickListener(new View.OnClickListener() {

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
            case "sekolah":
                soal.setBackgroundResource(R.drawable.sekolah1);
                Button sekolah = this.findViewById(R.id.suaraBtn);
                sekolah.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(137);
                    }
                });
                Button sekolahinfo = findViewById(R.id.infoBtn);
                sekolahinfo.setOnClickListener(new View.OnClickListener() {

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
            case "gaun":
                soal.setBackgroundResource(R.drawable.gaun1);
                Button gaun = this.findViewById(R.id.suaraBtn);
                gaun.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(135);
                    }
                });
                Button gauninfo = findViewById(R.id.infoBtn);
                gauninfo.setOnClickListener(new View.OnClickListener() {

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
            case "gitar":
                soal.setBackgroundResource(R.drawable.gitar1);
                Button gitar = this.findViewById(R.id.suaraBtn);
                gitar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button gitarinfo = findViewById(R.id.infoBtn);
                gitarinfo.setOnClickListener(new View.OnClickListener() {

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
            case "gula":
                soal.setBackgroundResource(R.drawable.gula1);
                Button gula = this.findViewById(R.id.suaraBtn);
                gula.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button gulainfo = findViewById(R.id.infoBtn);
                gulainfo.setOnClickListener(new View.OnClickListener() {

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
            case "gelas":
                soal.setBackgroundResource(R.drawable.gelas1);
                Button gelas = this.findViewById(R.id.suaraBtn);
                gelas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button gelasinfo = findViewById(R.id.infoBtn);
                gelasinfo.setOnClickListener(new View.OnClickListener() {

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

            case "halte":
                soal.setBackgroundResource(R.drawable.halte1);
                Button halte = this.findViewById(R.id.suaraBtn);
                halte.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button halteinfo = findViewById(R.id.infoBtn);
                halteinfo.setOnClickListener(new View.OnClickListener() {

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

            case "hidung":
                soal.setBackgroundResource(R.drawable.hidung1);
                Button hidung = this.findViewById(R.id.suaraBtn);
                hidung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button hidunginfo = findViewById(R.id.infoBtn);
                hidunginfo.setOnClickListener(new View.OnClickListener() {

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

            case "hutan":
                soal.setBackgroundResource(R.drawable.hutan1);
                Button hutan = this.findViewById(R.id.suaraBtn);
                hutan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button hutaninfo = findViewById(R.id.infoBtn);
                hutaninfo.setOnClickListener(new View.OnClickListener() {

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

            case "helm":
                soal.setBackgroundResource(R.drawable.helm1);
                Button helm = this.findViewById(R.id.suaraBtn);
                helm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button helminfo = findViewById(R.id.infoBtn);
                helminfo.setOnClickListener(new View.OnClickListener() {

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

            case "hotel":
                soal.setBackgroundResource(R.drawable.hotel1);
                Button hotel = this.findViewById(R.id.suaraBtn);
                hotel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button hotelinfo = findViewById(R.id.infoBtn);
                hotelinfo.setOnClickListener(new View.OnClickListener() {

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

            case "jam":
                soal.setBackgroundResource(R.drawable.jam1);
                Button jam = this.findViewById(R.id.suaraBtn);
                jam.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button jaminfo = findViewById(R.id.infoBtn);
                jaminfo.setOnClickListener(new View.OnClickListener() {

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

            case "jilbab":
                soal.setBackgroundResource(R.drawable.jilbab1);
                Button jilbab = this.findViewById(R.id.suaraBtn);
                jilbab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button jilbabinfo = findViewById(R.id.infoBtn);
                jilbabinfo.setOnClickListener(new View.OnClickListener() {

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

            case "kaleng":
                soal.setBackgroundResource(R.drawable.kaleng1);
                Button kaleng = this.findViewById(R.id.suaraBtn);
                kaleng.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button kalenginfo = findViewById(R.id.infoBtn);
                kalenginfo.setOnClickListener(new View.OnClickListener() {

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

            case "kue":
                soal.setBackgroundResource(R.drawable.kue1);
                Button kue = this.findViewById(R.id.suaraBtn);
                kue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button kueinfo = findViewById(R.id.infoBtn);
                kueinfo.setOnClickListener(new View.OnClickListener() {

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

            case "kertas":
                soal.setBackgroundResource(R.drawable.kertas1);
                Button kertas = this.findViewById(R.id.suaraBtn);
                kertas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button kertasinfo = findViewById(R.id.infoBtn);
                kertasinfo.setOnClickListener(new View.OnClickListener() {

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

            case "kopi":
                soal.setBackgroundResource(R.drawable.kopi1);
                Button kopi = this.findViewById(R.id.suaraBtn);
                kopi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button kopiinfo = findViewById(R.id.infoBtn);
                kopiinfo.setOnClickListener(new View.OnClickListener() {

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

            case "cabai":
                soal.setBackgroundResource(R.drawable.cabai1);
                Button cabai = this.findViewById(R.id.suaraBtn);
                cabai.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button cabaiinfo = findViewById(R.id.infoBtn);
                cabaiinfo.setOnClickListener(new View.OnClickListener() {

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

            case "cincin":
                soal.setBackgroundResource(R.drawable.cincin1);
                Button cincin = this.findViewById(R.id.suaraBtn);
                cincin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button cincininfo = findViewById(R.id.infoBtn);
                cincininfo.setOnClickListener(new View.OnClickListener() {

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

            case "cuka":
                soal.setBackgroundResource(R.drawable.cuka1);
                Button cuka = this.findViewById(R.id.suaraBtn);
                cuka.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button cukainfo = findViewById(R.id.infoBtn);
                cukainfo.setOnClickListener(new View.OnClickListener() {

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

            case "celana":
                soal.setBackgroundResource(R.drawable.celana1);
                Button celana = this.findViewById(R.id.suaraBtn);
                celana.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button celanainfo = findViewById(R.id.infoBtn);
                celanainfo.setOnClickListener(new View.OnClickListener() {

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

            case "dadu":
                soal.setBackgroundResource(R.drawable.dadu1);
                Button dadu = this.findViewById(R.id.suaraBtn);
                dadu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button daduinfo = findViewById(R.id.infoBtn);
                daduinfo.setOnClickListener(new View.OnClickListener() {

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

            case "dipan":
                soal.setBackgroundResource(R.drawable.dipan1);
                Button dipan = this.findViewById(R.id.suaraBtn);
                dipan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button dipaninfo = findViewById(R.id.infoBtn);
                dipaninfo.setOnClickListener(new View.OnClickListener() {

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

            case "duri":
                soal.setBackgroundResource(R.drawable.duri1);
                Button duri = this.findViewById(R.id.suaraBtn);
                duri.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button duriinfo = findViewById(R.id.infoBtn);
                duriinfo.setOnClickListener(new View.OnClickListener() {

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

            case "domba":
                soal.setBackgroundResource(R.drawable.domba1);
                Button domba = this.findViewById(R.id.suaraBtn);
                domba.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button dombainfo = findViewById(R.id.infoBtn);
                dombainfo.setOnClickListener(new View.OnClickListener() {

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
            case "wayang":
                soal.setBackgroundResource(R.drawable.wayang1);
                Button wayang = this.findViewById(R.id.suaraBtn);
                wayang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(136);
                    }
                });
                Button wayanginfo = findViewById(R.id.infoBtn);
                wayanginfo.setOnClickListener(new View.OnClickListener() {

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



        }

    }

    @Override
    public void onPause() {
        try {
            super.onPause();
            player.pause();
        } catch (Exception ignored) {

        }
    }

    private void playSound(int arg) {
        try {
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        } catch (Exception e) {
//            Toast.makeText(this, isPlaying,Toast.LENGTH_LONG).show();
        }
        if (arg == 1) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_a2);
        } else if (arg == 2) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_b2);
        } else if (arg == 3) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_c2);
        } else if (arg == 4) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_d2);
        } else if (arg == 5) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_e2);
        } else if (arg == 6) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_f2);
        } else if (arg == 7) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_g2);
        } else if (arg == 8) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_h2);
        } else if (arg == 9) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_i2);
        } else if (arg == 10) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_j2);
        } else if (arg == 11) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_k2);
        } else if (arg == 12) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_l2);
        } else if (arg == 13) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_m2);
        } else if (arg == 14) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_n2);
        } else if (arg == 15) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_o2);
        } else if (arg == 16) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_p2);
        } else if (arg == 17) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_q2);
        } else if (arg == 18) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_r2);
        } else if (arg == 19) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_s2);
        } else if (arg == 20) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_t2);
        } else if (arg == 21) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_u2);
        } else if (arg == 22) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_v2);
        } else if (arg == 23) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_w2);
        } else if (arg == 24) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_x2);
        } else if (arg == 25) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_y2);
        } else if (arg == 26) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.soal_z2);
        } else if (arg == 27) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.basound);
        } else if (arg == 28) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.bisound);
        } else if (arg == 29) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.busound);
        } else if (arg == 30) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.besound);
        } else if (arg == 31) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.bosound);
        }else if (arg == 32) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.casound);
        } else if (arg == 33) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.cisound);
        } else if (arg == 34) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.cusound);
        } else if (arg == 35) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.cesound);
        }else if (arg == 36) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.cosound);
        } else if (arg == 37) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.dasound);
        } else if (arg == 38) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.disound);
        } else if (arg == 39) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.dusound);
        }else if (arg == 40) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.desound);
        } else if (arg == 41) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.dosound);
        } else if (arg == 42) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.fasound);
        } else if (arg == 43) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.fisound);
        }else if (arg == 44) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.fusound);
        } else if (arg == 45) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.fesound);
        } else if (arg == 46) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.fosound);
        } else if (arg == 47) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.gasound);
        }else if (arg == 48) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.gisound);
        } else if (arg == 49) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.gusound);
        } else if (arg == 50) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.gesound);
        } else if (arg == 51) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.gosound);
        }else if (arg == 52) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.hasound);
        } else if (arg == 53) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.hisound);
        } else if (arg == 54) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.husound);
        } else if (arg == 55) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.hesound);
        }else if (arg == 56) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.hosund);
        } else if (arg == 57) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.jasound);
        } else if (arg == 58) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.jisound);
        } else if (arg == 59) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.jusound);
        }else if (arg == 60) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.jesound);
        } else if (arg == 61) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.josound);
        } else if (arg == 62) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.kasound);
        } else if (arg == 63) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.kisound);
        }else if (arg == 64) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.kusound);
        } else if (arg == 65) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.kesound);
        } else if (arg == 66) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.kosound);
        } else if (arg == 67) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.lasound);
        }else if (arg == 68) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.lisound);
        } else if (arg == 69) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.lusound);
        } else if (arg == 70) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.lesound);
        } else if (arg == 71) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.losound);
        }else if (arg == 72) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.masound);
        } else if (arg == 73) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.misound);
        } else if (arg == 74) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.musound);
        } else if (arg == 75) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.mesound);
        }else if (arg == 76) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.mosound);
        } else if (arg == 77) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.nasound);
        } else if (arg == 78) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.nisound);
        } else if (arg == 79) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.nusound);
        }else if (arg == 80) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.nesound);
        } else if (arg == 81) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.nosound);
        } else if (arg == 82) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.pasound);
        } else if (arg == 83) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.pisound);
        }else if (arg == 84) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.pusound);
        } else if (arg == 85) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.pesound);
        } else if (arg == 86) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.posound);
        } else if (arg == 87) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.rasound);
        }else if (arg == 88) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.risound);
        } else if (arg == 89) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.rusound);
        } else if (arg == 90) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.resound);
        } else if (arg == 91) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.rosound);
        }else if (arg == 92) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.sasound);
        } else if (arg == 93) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.sisound);
        } else if (arg == 94) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.susound);
        } else if (arg == 95) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.sesound);
        }else if (arg == 96) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.sosound);
        } else if (arg == 97) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.tasound);
        } else if (arg == 98) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.tisound);
        } else if (arg == 99) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.tusound);
        }else if (arg == 100) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.tesound);
        } else if (arg == 101) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.tosound);
        } else if (arg == 102) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.zasound);
        } else if (arg == 103) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.zisound);
        }else if (arg == 104) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.zusound);
        }else if (arg == 103) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.zesound);
        }else if (arg == 104) {
//            Toast.makeText(this,isPlaying+"Play Pelafalan",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.zosound);
        }
        player.setLooping(false);
        player.start();

    }

    public void getSpeechInput(View view) {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Masukkan suara");

        startActivityForResult(intent, 10);

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            if ((resultCode == RESULT_OK && data != null)) {
                ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                assert result != null;
                DecimalFormat df2 = new DecimalFormat("#.##");
                String resultVoice = result.get(0);
                String jawaban = testText.getText().toString();

                if (result.get(0).equalsIgnoreCase(jawaban)) {
                    jawabanTxt.setText("100%");
                } else {
                    Double jumlahHurufsalah = (double) 0;
                    Double jumlahHuruf = (double) jawaban.length();
                    if (resultVoice.length() > jumlahHuruf) {
                        jumlahHurufsalah = resultVoice.length() - jumlahHuruf;
                        if (resultVoice.contains(jawaban)) {
                            Double persentaseSalah = 100 - (jumlahHurufsalah / resultVoice.length() * 100);
                            jawabanTxt.setText(df2.format(persentaseSalah) + "%");
                        } else {
                            jawabanTxt.setText("0%");
                        }
                    } else {
                        jumlahHurufsalah = jumlahHuruf - resultVoice.length();
                        if (jawaban.contains(resultVoice)) {
                            Double persentaseSalah = 100 - (jumlahHurufsalah / jumlahHuruf * 100);
                            jawabanTxt.setText(df2.format(persentaseSalah) + "%");
                        } else {
                            jawabanTxt.setText("0%");
                        }
                    }

                }
                final SweetAlertDialog pDialog;
                if (jawabanTxt.getText().equals("100%")) {
                    pDialog = new SweetAlertDialog(MainGame.this, SweetAlertDialog.SUCCESS_TYPE);
                    pDialog.setContentText("jawaban kamu " + resultVoice + ", kamu tepat nilai kamu adalah " + jawabanTxt.getText());
                } else if (!jawabanTxt.getText().equals("100%") && !jawabanTxt.getText().equals("0%")) {
                    pDialog = new SweetAlertDialog(MainGame.this, SweetAlertDialog.WARNING_TYPE);
                    pDialog.setContentText("jawaban kamu " + resultVoice + ", kamu hampir tepat nilai kamu adalah " + jawabanTxt.getText());
                } else {
                    pDialog = new SweetAlertDialog(MainGame.this, SweetAlertDialog.ERROR_TYPE);
                    pDialog.setContentText("jawaban kamu " + resultVoice + ", kamu kurang tepat nilai kamu adalah " + jawabanTxt.getText());
                }
                pDialog.setTitleText("Penilaian!");
                pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                pDialog.setConfirmText("Kembali");
                pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        finish();
                    }
                });
                pDialog.setCancelable(true);
                pDialog.show();
            }
        }
        //String result =null;

       // if(j.compareTo(res) ==0) {

            //Toast.makeText(getApplicationContext(), "Sama",Toast.LENGTH_LONG);
        //}else{
            //Toast.makeText(getApplicationContext(), "Beda",Toast.LENGTH_LONG);
        }
    }

        //protected void onActivityResult(int requestCode,int resultCode, Intent data){
        //super.onActivityResult(requestCode, resultCode,data);
        //ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
        //assert result != null;
        //jawabanTxt.setText(result.get(0));

        //if (requestCode == 10) {
        //if ((resultCode == RESULT_OK && data != null)) {
        //ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
        //assert result != null;
        //jawabanTxt.setText(result.get(0));


