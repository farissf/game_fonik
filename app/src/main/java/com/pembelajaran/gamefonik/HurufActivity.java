package com.pembelajaran.gamefonik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;

public class HurufActivity extends AppCompatActivity {
    private Button buttona,buttonb,buttonc,buttond,buttone,buttonf,buttong,buttonh,buttoni,buttonj,
            buttonk,buttonl,buttonm,buttonn,buttono,buttonp,buttonq,buttonr,buttons,buttont,buttonu,
            buttonv,buttonw,buttonx,buttony,buttonz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);

//        Button buttons[] = new Button [26];
        buttona  = (Button)findViewById(R.id.aBtn);
        buttona.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttona);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttona);
                startActivity(intent);
            }
        });
        buttonb  = (Button)findViewById(R.id.bBtn);
        buttonb.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonb);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonb);
                startActivity(intent);
            }
        });
        buttonc  = (Button)findViewById(R.id.cBtn);
        buttonc.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonc);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonc);
                startActivity(intent);
            }
        });
        buttond  = (Button)findViewById(R.id.dBtn);
        buttond.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttond);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttond);

                startActivity(intent);
            }
        });
        buttone  = (Button)findViewById(R.id.eBtn);
        buttone.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttone);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttone);
                startActivity(intent);
            }
        });
        buttonf  = (Button)findViewById(R.id.fBtn);
        buttonf.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonf);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonf);
                startActivity(intent);
            }
        });
        buttong  = (Button)findViewById(R.id.gBtn);
        buttong.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttong);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttong);
                startActivity(intent);
            }
        });
        buttonh  = (Button)findViewById(R.id.hBtn);
        buttonh.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonh);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonh);
                startActivity(intent);
            }
        });
        buttoni  = (Button)findViewById(R.id.iBtn);
        buttoni.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttoni);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttoni);
                startActivity(intent);
            }
        });
        buttonj  = (Button)findViewById(R.id.jBtn);
        buttonj.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonj);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonj);
                startActivity(intent);
            }
        });
        buttonk  = (Button)findViewById(R.id.kBtn);
        buttonk.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonk);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonk);
                startActivity(intent);
            }
        });
        buttonl  = (Button)findViewById(R.id.lBtn);
        buttonl.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonl);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonl);
                startActivity(intent);
            }
        });
        buttonm  = (Button)findViewById(R.id.mBtn);
        buttonm.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonm);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonm);
                startActivity(intent);
            }
        });
        buttonn  = (Button)findViewById(R.id.nBtn);
        buttonn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonn);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonn);
                startActivity(intent);
            }
        });
        buttono  = (Button)findViewById(R.id.oBtn);
        buttono.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttono);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttono);
                startActivity(intent);
            }
        });
        buttonp  = (Button)findViewById(R.id.pBtn);
        buttonp.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonp);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonp);
                startActivity(intent);
            }
        });
        buttonq  = (Button)findViewById(R.id.qBtn);
        buttonq.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonq);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonq);
                startActivity(intent);
            }
        });
        buttonr  = (Button)findViewById(R.id.rBtn);
        buttonr.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonr);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonr);
                startActivity(intent);
            }
        });
        buttons  = (Button)findViewById(R.id.sBtn);
        buttons.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttons);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttons);
                startActivity(intent);
            }
        });
        buttont  = (Button)findViewById(R.id.tBtn);
        buttont.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttont);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttont);
                startActivity(intent);
            }
        });
        buttonu  = (Button)findViewById(R.id.uBtn);
        buttonu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonu);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonu);
                startActivity(intent);
            }
        });
        buttonv  = (Button)findViewById(R.id.vBtn);
        buttonv.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonv);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonv);
                startActivity(intent);
            }
        });
        buttonw  = (Button)findViewById(R.id.wBtn);
        buttonw.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonw);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonw);
                startActivity(intent);
            }
        });
        buttonx  = (Button)findViewById(R.id.xBtn);
        buttonx.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonx);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonx);
                startActivity(intent);
            }
        });
        buttony  = (Button)findViewById(R.id.yBtn);
        buttony.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttony);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttony);
                startActivity(intent);
            }
        });
        buttonz  = (Button)findViewById(R.id.zBtn);
        buttonz.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonz);
                // Do something
                Intent intent = new Intent(HurufActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                    intent.putExtra("view",""+ buttonz);
                startActivity(intent);
            }
        });
    }
}
