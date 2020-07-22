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
                soal.setBackgroundResource(R.drawable.bo);
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
                soal.setBackgroundResource(R.drawable.ca1);
                Button ca = this.findViewById(R.id.suaraBtn);
                ca.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ci1);
                Button ci = this.findViewById(R.id.suaraBtn);
                ci.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.cu1);
                Button cu = this.findViewById(R.id.suaraBtn);
                cu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.ce1);
                Button ce = this.findViewById(R.id.suaraBtn);
                ce.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.co1);
                Button co = this.findViewById(R.id.suaraBtn);
                co.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.da1);
                Button da = this.findViewById(R.id.suaraBtn);
                da.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.di1);
                Button di = this.findViewById(R.id.suaraBtn);
                di.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.du1);
                Button du = this.findViewById(R.id.suaraBtn);
                du.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.de1);
                Button de = this.findViewById(R.id.suaraBtn);
                de.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.do1);
                Button doo = this.findViewById(R.id.suaraBtn);
                doo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
            case "faa":
                soal.setBackgroundResource(R.drawable.fa1);
                Button fa = this.findViewById(R.id.suaraBtn);
                fa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.fi1);
                Button fi = this.findViewById(R.id.suaraBtn);
                fi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.fu1);
                Button fu = this.findViewById(R.id.suaraBtn);
                fu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.fe1);
                Button fe = this.findViewById(R.id.suaraBtn);
                fe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.fo1);
                Button fo = this.findViewById(R.id.suaraBtn);
                fo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ga1);
                Button ga = this.findViewById(R.id.suaraBtn);
                ga.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.gi1);
                Button gi = this.findViewById(R.id.suaraBtn);
                gi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.gu1);
                Button gu = this.findViewById(R.id.suaraBtn);
                gu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.ge1);
                Button ge = this.findViewById(R.id.suaraBtn);
                ge.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.go1);
                Button go = this.findViewById(R.id.suaraBtn);
                go.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ha1);
                Button ha = this.findViewById(R.id.suaraBtn);
                ha.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.hi1);
                Button hi = this.findViewById(R.id.suaraBtn);
                hi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.hu1);
                Button hu = this.findViewById(R.id.suaraBtn);
                hu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.he1);
                Button he = this.findViewById(R.id.suaraBtn);
                he.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.ho1);
                Button ho = this.findViewById(R.id.suaraBtn);
                ho.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ja1);
                Button ja = this.findViewById(R.id.suaraBtn);
                ja.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ji1);
                Button ji = this.findViewById(R.id.suaraBtn);
                ji.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.ju1);
                Button ju = this.findViewById(R.id.suaraBtn);
                ju.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.je1);
                Button je = this.findViewById(R.id.suaraBtn);
                je.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.jo1);
                Button jo = this.findViewById(R.id.suaraBtn);
                jo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ka1);
                Button ka = this.findViewById(R.id.suaraBtn);
                ka.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ki1);
                Button ki = this.findViewById(R.id.suaraBtn);
                ki.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.ku1);
                Button ku = this.findViewById(R.id.suaraBtn);
                ku.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.ke1);
                Button ke = this.findViewById(R.id.suaraBtn);
                ke.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.ko1);
                Button ko = this.findViewById(R.id.suaraBtn);
                ko.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.la1);
                Button la = this.findViewById(R.id.suaraBtn);
                la.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.li1);
                Button li = this.findViewById(R.id.suaraBtn);
                li.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.lu1);
                Button lu = this.findViewById(R.id.suaraBtn);
                lu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.le1);
                Button le = this.findViewById(R.id.suaraBtn);
                le.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.lo1);
                Button lo = this.findViewById(R.id.suaraBtn);
                lo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ma1);
                Button ma = this.findViewById(R.id.suaraBtn);
                ma.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.mi1);
                Button mi = this.findViewById(R.id.suaraBtn);
                mi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.mu1);
                Button mu = this.findViewById(R.id.suaraBtn);
                mu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.me1);
                Button me = this.findViewById(R.id.suaraBtn);
                me.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.mo1);
                Button mo = this.findViewById(R.id.suaraBtn);
                mo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.na1);
                Button na = this.findViewById(R.id.suaraBtn);
                na.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ni1);
                Button ni = this.findViewById(R.id.suaraBtn);
                ni.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.nu1);
                Button nu = this.findViewById(R.id.suaraBtn);
                nu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.ne1);
                Button ne = this.findViewById(R.id.suaraBtn);
                ne.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.no1);
                Button no = this.findViewById(R.id.suaraBtn);
                no.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.pa1);
                Button pa = this.findViewById(R.id.suaraBtn);
                pa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.pi1);
                Button pi = this.findViewById(R.id.suaraBtn);
                pi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.pu1);
                Button pu = this.findViewById(R.id.suaraBtn);
                pu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.pe1);
                Button pe = this.findViewById(R.id.suaraBtn);
                pe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.po1);
                Button po = this.findViewById(R.id.suaraBtn);
                po.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ra1);
                Button ra = this.findViewById(R.id.suaraBtn);
                ra.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ri1);
                Button ri = this.findViewById(R.id.suaraBtn);
                ri.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.ru1);
                Button ru = this.findViewById(R.id.suaraBtn);
                ru.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.re1);
                Button re = this.findViewById(R.id.suaraBtn);
                re.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.ro1);
                Button ro = this.findViewById(R.id.suaraBtn);
                ro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.sa1);
                Button sa = this.findViewById(R.id.suaraBtn);
                sa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.si1);
                Button si = this.findViewById(R.id.suaraBtn);
                si.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.su1);
                Button su = this.findViewById(R.id.suaraBtn);
                su.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.se1);
                Button se = this.findViewById(R.id.suaraBtn);
                se.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.so1);
                Button so = this.findViewById(R.id.suaraBtn);
                so.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ta1);
                Button ta = this.findViewById(R.id.suaraBtn);
                ta.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.ti1);
                Button ti = this.findViewById(R.id.suaraBtn);
                ti.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.tu1);
                Button tu = this.findViewById(R.id.suaraBtn);
                tu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.te1);
                Button te = this.findViewById(R.id.suaraBtn);
                te.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.to1);
                Button to = this.findViewById(R.id.suaraBtn);
                to.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.za1);
                Button za = this.findViewById(R.id.suaraBtn);
                za.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
                soal.setBackgroundResource(R.drawable.zi1);
                Button zi = this.findViewById(R.id.suaraBtn);
                zi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(28);
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
                soal.setBackgroundResource(R.drawable.zu1);
                Button zu = this.findViewById(R.id.suaraBtn);
                zu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(29);
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
                soal.setBackgroundResource(R.drawable.ze1);
                Button ze = this.findViewById(R.id.suaraBtn);
                ze.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(30);
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
                soal.setBackgroundResource(R.drawable.zo1);
                Button zo = this.findViewById(R.id.suaraBtn);
                zo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(31);
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
        ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
        assert result !=null;
        //String result =null;
        jawabanTxt.setText(result.get(0));
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


