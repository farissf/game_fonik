package com.pembelajaran.gamefonik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SukuKataActivity extends AppCompatActivity {
    private Button buttonae,buttonai,buttonao,buttonau,buttonea,buttonei,buttoneo,buttoneu,buttonia,buttonie,
            buttonio,buttoniu,buttonoi,buttonou,buttonua,buttonue,buttonui,buttonuo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suku_kata);
        buttonae  = (Button)findViewById(R.id.aeBtn);
        buttonae.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonae);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonae);
                startActivity(intent);
            }
        });
        buttonai  = (Button)findViewById(R.id.aiBtn);
        buttonai.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonai);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonai);
                startActivity(intent);
            }
        });
        buttonao  = (Button)findViewById(R.id.aoBtn);
        buttonao.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonao);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonao);
                startActivity(intent);
            }
        });
        buttonau  = (Button)findViewById(R.id.auBtn);
        buttonau.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonau);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonau);
                startActivity(intent);
            }
        });
        buttonea  = (Button)findViewById(R.id.eaBtn);
        buttonea.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonea);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonea);
                startActivity(intent);
            }
        });
        buttonei  = (Button)findViewById(R.id.eiBtn);
        buttonei.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonei);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonei);
                startActivity(intent);
            }
        });
        buttoneo  = (Button)findViewById(R.id.eoBtn);
        buttoneo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttoneo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttoneo);
                startActivity(intent);
            }
        });
        buttoneu  = (Button)findViewById(R.id.euBtn);
        buttoneu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttoneu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttoneu);
                startActivity(intent);
            }
        });
        buttonia  = (Button)findViewById(R.id.iaBtn);
        buttonia.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonia);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonia);
                startActivity(intent);
            }
        });
        buttonie  = (Button)findViewById(R.id.ieBtn);
        buttonie.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonie);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonie);
                startActivity(intent);
            }
        });
        buttonio  = (Button)findViewById(R.id.ioBtn);
        buttonio.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonio);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonio);
                startActivity(intent);
            }
        });
        buttoniu  = (Button)findViewById(R.id.iuBtn);
        buttoniu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttoniu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttoniu);
                startActivity(intent);
            }
        });
        buttonoi  = (Button)findViewById(R.id.oiBtn);
        buttonoi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonoi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonoi);
                startActivity(intent);
            }
        });
        buttonou  = (Button)findViewById(R.id.ouBtn);
        buttonou.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonou);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonou);
                startActivity(intent);
            }
        });
        buttonua  = (Button)findViewById(R.id.uaBtn);
        buttonua.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonua);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonua);
                startActivity(intent);
            }
        });
        buttonue  = (Button)findViewById(R.id.ueBtn);
        buttonue.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonue);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonue);
                startActivity(intent);
            }
        });
        buttonui  = (Button)findViewById(R.id.uiBtn);
        buttonui.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonui);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonui);
                startActivity(intent);
            }
        });
        buttonuo  = (Button)findViewById(R.id.uoBtn);
        buttonuo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonuo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonuo);
                startActivity(intent);
            }
        });
    }
}
