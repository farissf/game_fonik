package com.pembelajaran.gamefonik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class KataActivity extends AppCompatActivity {
    private Button pakuBtn, pianoBtn, pociBtn, pulpenBtn, pensilBtn, banBtn, biolaBtn, bukuBtn, bebekBtn, botolBtn,
            mataBtn, mistarBtn, mutiaraBtn, mejaBtn, mobilBtn, nasiBtn, nenekBtn, tasBtn, tikusBtn, tupaiBtn, tekoBtn,
            tokoBtn, radioBtn, rumahBtn, rotiBtn, lautBtn, lilinBtn, lebahBtn, loncengBtn, sabunBtn, sikuBtn, susuBtn, sekolahBtn,
            gaunBtn, gitarBtn, gulaBtn, gelasBtn, halteBtn, hidungBtn, hutanBtn, helmBtn, hotelBtn, jamBtn, jilbabBtn, kalengBtn,
            kueBtn, kertasBtn, kopiBtn, cabaiBtn, cincinBtn, cukaBtn, celanaBtn, daduBtn, dipanBtn, duriBtn, dombaBtn, wayangBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata);

        pakuBtn = (Button) findViewById(R.id.pakuBtn);
        pakuBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + pakuBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + pakuBtn);
                startActivity(intent);
            }
        });
        pianoBtn = (Button) findViewById(R.id.pianoBtn);
        pianoBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + pianoBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + pianoBtn);
                startActivity(intent);
            }
        });
        pociBtn = (Button) findViewById(R.id.pociBtn);
        pociBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + pociBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + pociBtn);
                startActivity(intent);
            }
        });
        pulpenBtn = (Button) findViewById(R.id.pulpenBtn);
        pulpenBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + pulpenBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + pulpenBtn);
                startActivity(intent);
            }
        });
        pensilBtn = (Button) findViewById(R.id.pensilBtn);
        pensilBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + pensilBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + pensilBtn);
                startActivity(intent);
            }
        });
        banBtn = (Button) findViewById(R.id.banBtn);
        banBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + banBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + banBtn);
                startActivity(intent);
            }
        });
        biolaBtn = (Button) findViewById(R.id.biolaBtn);
        biolaBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + biolaBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + biolaBtn);
                startActivity(intent);
            }
        });
        bukuBtn = (Button) findViewById(R.id.bebekBtn);
        bebekBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + bebekBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + bebekBtn);
                startActivity(intent);
            }
        });
        botolBtn = (Button) findViewById(R.id.botolBtn);
        botolBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + botolBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + botolBtn);

                startActivity(intent);
            }
        });
        mataBtn = (Button) findViewById(R.id.mataBtn);
        mataBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + mataBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + mataBtn);
                startActivity(intent);
            }
        });
        mistarBtn = (Button) findViewById(R.id.mistarBtn);
        mistarBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + mistarBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + mistarBtn);
                startActivity(intent);
            }
        });
        mutiaraBtn = (Button) findViewById(R.id.mutiaraBtn);
        mutiaraBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + mutiaraBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + mutiaraBtn);
                startActivity(intent);
            }
        });
        mejaBtn = (Button) findViewById(R.id.mejaBtn);
        mejaBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + mejaBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + mejaBtn);
                startActivity(intent);
            }
        });
        mobilBtn = (Button) findViewById(R.id.mobilBtn);
        mobilBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + mobilBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + mobilBtn);
                startActivity(intent);
            }
        });
        nasiBtn = (Button) findViewById(R.id.nasiBtn);
        nasiBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + nasiBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + nasiBtn);
                startActivity(intent);
            }
        });
        nenekBtn = (Button) findViewById(R.id.nenekBtn);
        nenekBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + nenekBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + nenekBtn);
                startActivity(intent);
            }
        });
        tasBtn = (Button) findViewById(R.id.tasBtn);
        tasBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + tasBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + tasBtn);
                startActivity(intent);
            }
        });
        tikusBtn = (Button) findViewById(R.id.tikusBtn);
        tikusBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + tikusBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + tikusBtn);
                startActivity(intent);
            }
        });
        tupaiBtn = (Button) findViewById(R.id.tupaiBtn);
        tupaiBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + tupaiBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + tupaiBtn);
                startActivity(intent);
            }
        });
        tekoBtn = (Button) findViewById(R.id.tekoBtn);
        tekoBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + tekoBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + tekoBtn);
                startActivity(intent);
            }
        });
        tokoBtn = (Button) findViewById(R.id.tokoBtn);
        tokoBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + tokoBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + tokoBtn);
                startActivity(intent);
            }
        });
        radioBtn = (Button) findViewById(R.id.radioBtn);
        radioBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + radioBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + radioBtn);
                startActivity(intent);
            }
        });
        rumahBtn = (Button) findViewById(R.id.rumahBtn);
        rumahBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + rumahBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + rumahBtn);
                startActivity(intent);
            }
        });
        rotiBtn = (Button) findViewById(R.id.rotiBtn);
        rotiBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + rotiBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + rotiBtn);
                startActivity(intent);
            }
        });
        lautBtn = (Button) findViewById(R.id.lautBtn);
        lautBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + lautBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + lautBtn);
                startActivity(intent);
            }
        });
        lilinBtn = (Button) findViewById(R.id.lilinBtn);
        lilinBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + lilinBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + lilinBtn);
                startActivity(intent);
            }
        });
        lebahBtn = (Button) findViewById(R.id.lebahBtn);
        lebahBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + lebahBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + lebahBtn);
                startActivity(intent);
            }
        });
        loncengBtn = (Button) findViewById(R.id.loncengBtn);
        loncengBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + loncengBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + loncengBtn);
                startActivity(intent);
            }
        });
        sabunBtn = (Button) findViewById(R.id.sabunBtn);
        sabunBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + sabunBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + sabunBtn);
                startActivity(intent);
            }
        });
        sikuBtn = (Button) findViewById(R.id.sikuBtn);
        sikuBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + sikuBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + sikuBtn);
                startActivity(intent);
            }
        });
        susuBtn = (Button) findViewById(R.id.susuBtn);
        susuBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + susuBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + susuBtn);
                startActivity(intent);
            }
        });
        sekolahBtn = (Button) findViewById(R.id.sekolahBtn);
        sekolahBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + sekolahBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + sekolahBtn);
                startActivity(intent);
            }
        });
        gaunBtn = (Button) findViewById(R.id.gaunBtn);
        gaunBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + gaunBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + gaunBtn);
                startActivity(intent);
            }
        });
        gitarBtn = (Button) findViewById(R.id.gitarBtn);
        gitarBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + gitarBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + gitarBtn);
                startActivity(intent);
            }
        });
        gulaBtn = (Button) findViewById(R.id.gulaBtn);
        gulaBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + gulaBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + gulaBtn);
                startActivity(intent);
            }
        });
        gelasBtn = (Button) findViewById(R.id.gelasBtn);
        gelasBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + gelasBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + gelasBtn);
                startActivity(intent);
            }
        });
        halteBtn = (Button) findViewById(R.id.halteBtn);
        halteBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + halteBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + halteBtn);
                startActivity(intent);
            }
        });
        hidungBtn = (Button) findViewById(R.id.hidungBtn);
        hidungBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + hidungBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + hidungBtn);
                startActivity(intent);
            }
        });
        hutanBtn = (Button) findViewById(R.id.hutanBtn);
        hutanBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + hutanBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + hutanBtn);
                startActivity(intent);
            }
        });
        helmBtn = (Button) findViewById(R.id.helmBtn);
        helmBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + helmBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + helmBtn);
                startActivity(intent);
            }
        });
        hotelBtn = (Button) findViewById(R.id.hotelBtn);
        hotelBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + hotelBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + hotelBtn);
                startActivity(intent);
            }
        });
        jamBtn = (Button) findViewById(R.id.jamBtn);
        jamBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + jamBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + jamBtn);
                startActivity(intent);
            }
        });
        jilbabBtn = (Button) findViewById(R.id.jilbabBtn);
        jilbabBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + jilbabBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + jilbabBtn);
                startActivity(intent);
            }
        });
        kalengBtn = (Button) findViewById(R.id.kalengBtn);
        kalengBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + kalengBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + kalengBtn);
                startActivity(intent);
            }
        });
        kueBtn = (Button) findViewById(R.id.kueBtn);
        kueBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + kueBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + kueBtn);
                startActivity(intent);
            }
        });
        kertasBtn = (Button) findViewById(R.id.kertasBtn);
        kertasBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + kertasBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + kertasBtn);
                startActivity(intent);
            }
        });
        kopiBtn = (Button) findViewById(R.id.kopiBtn);
        kopiBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + kopiBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + kopiBtn);
                startActivity(intent);
            }
        });
        cabaiBtn = (Button) findViewById(R.id.cabaiBtn);
        cabaiBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + cabaiBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + cabaiBtn);
                startActivity(intent);
            }
        });
        cincinBtn = (Button) findViewById(R.id.cincinBtn);
        cincinBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + cincinBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + cincinBtn);
                startActivity(intent);
            }
        });
        cukaBtn = (Button) findViewById(R.id.cukaBtn);
        cukaBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + cukaBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + cukaBtn);
                startActivity(intent);
            }
        });
        celanaBtn = (Button) findViewById(R.id.celanaBtn);
        celanaBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + celanaBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + celanaBtn);
                startActivity(intent);
            }
        });
        daduBtn = (Button) findViewById(R.id.daduBtn);
        daduBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + daduBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + daduBtn);
                startActivity(intent);
            }
        });
        dipanBtn = (Button) findViewById(R.id.dipanBtn);
        dipanBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + dipanBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + dipanBtn);
                startActivity(intent);
            }
        });
        duriBtn = (Button) findViewById(R.id.duriBtn);
        duriBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + duriBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + duriBtn);
                startActivity(intent);
            }
        });
        dombaBtn = (Button) findViewById(R.id.dombaBtn);
        dombaBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + dombaBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + dombaBtn);
                startActivity(intent);
            }
        });
        wayangBtn = (Button) findViewById(R.id.wayangBtn);
        wayangBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "" + v.getTag());
                Log.i("view", "" + wayangBtn);
                // Do something
                Intent intent = new Intent(KataActivity.this, MainGame.class);
                if (v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view", "" + wayangBtn);
                startActivity(intent);
            }
        });
    }
}

