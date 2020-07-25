package com.pembelajaran.gamefonik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SukuKataActivity extends AppCompatActivity {
    private Button buttonba,buttonbi,buttonbu,buttonbe,buttonbo,buttonca,buttonci,buttoncu,buttonce,buttonco,
            buttonda,buttondi,buttondu,buttonde,buttondo,buttonfa,buttonfi,buttonfu,buttonfe,buttonfo,
            buttonga,buttongi,buttongu,buttonge,buttongo,buttonha,buttonhi,buttonhu,buttonhe,buttonho,
            buttonja,buttonji,buttonju,buttonje,buttonjo,buttonka,buttonki,buttonku,buttonke,buttonko,
            buttonla,buttonli,buttonlu,buttonle,buttonlo,buttonma,buttonmi,buttonmu,buttonme,buttonmo,
            buttonna,buttonni,buttonnu,buttonne,buttonno,buttonpa,buttonpi,buttonpu,buttonpe,buttonpo,
            buttonra,buttonri,buttonru,buttonre,buttonro,buttonsa,buttonsi,buttonsu,buttonse,buttonso,
            buttonta,buttonti,buttontu,buttonte,buttonto,buttonwa,buttonwi,buttonwu,buttonwe,buttonwo,
            buttonya,buttonyi,buttonyu,buttonye,buttonyo,buttonza,buttonzi,buttonzu,buttonze,buttonzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suku_kata);

        buttonba  = (Button)findViewById(R.id.baBtn);
        buttonba.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonba);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonba);
                startActivity(intent);
            }
        });
        buttonbi  = (Button)findViewById(R.id.biBtn);
        buttonbi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonbi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonbi);
                startActivity(intent);
            }
        });
        buttonbu  = (Button)findViewById(R.id.buBtn);
        buttonbu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonbu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonbu);
                startActivity(intent);
            }
        });
        buttonbe  = (Button)findViewById(R.id.beBtn);
        buttonbe.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonbe);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonbe);
                startActivity(intent);
            }
        });
        buttonbo  = (Button)findViewById(R.id.boBtn);
        buttonbo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonbo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonbo);
                startActivity(intent);
            }
        });
        buttonca  = (Button)findViewById(R.id.caBtn);
        buttonca.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonca);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonca);
                startActivity(intent);
            }
        });
        buttonci  = (Button)findViewById(R.id.ciBtn);
        buttonci.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonci);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonci);
                startActivity(intent);
            }
        });
        buttoncu  = (Button)findViewById(R.id.cuBtn);
        buttoncu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttoncu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttoncu);
                startActivity(intent);
            }
        });
        buttonce  = (Button)findViewById(R.id.ceBtn);
        buttonce.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonce);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonce);
                startActivity(intent);
            }
        });
        buttonco  = (Button)findViewById(R.id.coBtn);
        buttonco.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonco);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonco);
                startActivity(intent);
            }
        });
        buttonda  = (Button)findViewById(R.id.daBtn);
        buttonda.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonda);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonda);
                startActivity(intent);
            }
        });
        buttondi  = (Button)findViewById(R.id.diBtn);
        buttondi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttondi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttondi);
                startActivity(intent);
            }
        });
        buttondu  = (Button)findViewById(R.id.duBtn);
        buttondu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttondu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttondu);
                startActivity(intent);
            }
        });
        buttonde  = (Button)findViewById(R.id.deBtn);
        buttonde.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonde);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonde);
                startActivity(intent);
            }
        });
        buttondo  = (Button)findViewById(R.id.doBtn);
        buttondo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttondo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttondo);
                startActivity(intent);
            }
        });
        buttonfa  = (Button)findViewById(R.id.faBtn);
        buttonfa.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonfa);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonfa);
                startActivity(intent);
            }
        });
        buttonfi  = (Button)findViewById(R.id.fiBtn);
        buttonfi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonfi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonfi);
                startActivity(intent);
            }
        });
        buttonfu  = (Button)findViewById(R.id.fuBtn);
        buttonfu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonfu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonfu);
                startActivity(intent);
            }
        });
        buttonfe  = (Button)findViewById(R.id.feBtn);
        buttonfe.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonfe);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonfe);
                startActivity(intent);
            }
        });
        buttonfo  = (Button)findViewById(R.id.foBtn);
        buttonfo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonfo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonfo);
                startActivity(intent);
            }
        });
        buttonga  = (Button)findViewById(R.id.gaBtn);
        buttonga.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonga);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonga);
                startActivity(intent);
            }
        });
        buttongi  = (Button)findViewById(R.id.giBtn);
        buttongi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttongi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttongi);
                startActivity(intent);
            }
        });
        buttongu  = (Button)findViewById(R.id.guBtn);
        buttongu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttongu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttongu);
                startActivity(intent);
            }
        });
        buttonge  = (Button)findViewById(R.id.geBtn);
        buttonge.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonge);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonge);
                startActivity(intent);
            }
        });
        buttongo  = (Button)findViewById(R.id.goBtn);
        buttongo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonfo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttongo);
                startActivity(intent);
            }
        });
        buttonha  = (Button)findViewById(R.id.haBtn);
        buttonha.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonha);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonha);
                startActivity(intent);
            }
        });
        buttonhi  = (Button)findViewById(R.id.hiBtn);
        buttonhi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonhi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonhi);
                startActivity(intent);
            }
        });
        buttonhu  = (Button)findViewById(R.id.huBtn);
        buttonhu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonhu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonhu);
                startActivity(intent);
            }
        });
        buttonhe  = (Button)findViewById(R.id.heBtn);
        buttonhe.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonhe);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonhe);
                startActivity(intent);
            }
        });
        buttonho  = (Button)findViewById(R.id.hoBtn);
        buttonho.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonho);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonho);
                startActivity(intent);
            }
        });
        buttonja  = (Button)findViewById(R.id.jaBtn);
        buttonja.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonja);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonja);
                startActivity(intent);
            }
        });
        buttonji  = (Button)findViewById(R.id.jiBtn);
        buttonji.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonji);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonji);
                startActivity(intent);
            }
        });
        buttonju  = (Button)findViewById(R.id.juBtn);
        buttonju.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonju);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonju);
                startActivity(intent);
            }
        });
        buttonje  = (Button)findViewById(R.id.jeBtn);
        buttonje.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonje);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonje);
                startActivity(intent);
            }
        });
        buttonjo  = (Button)findViewById(R.id.joBtn);
        buttonjo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonjo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonjo);
                startActivity(intent);
            }
        });
        buttonka  = (Button)findViewById(R.id.kaBtn);
        buttonka.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonka);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonka);
                startActivity(intent);
            }
        });
        buttonki  = (Button)findViewById(R.id.kiBtn);
        buttonki.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonki);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonki);
                startActivity(intent);
            }
        });
        buttonku  = (Button)findViewById(R.id.kuBtn);
        buttonku.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonku);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonku);
                startActivity(intent);
            }
        });
        buttonke  = (Button)findViewById(R.id.keBtn);
        buttonke.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonke);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonke);
                startActivity(intent);
            }
        });
        buttonko  = (Button)findViewById(R.id.koBtn);
        buttonko.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonko);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonko);
                startActivity(intent);
            }
        });
        buttonla  = (Button)findViewById(R.id.laBtn);
        buttonla.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonla);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonla);
                startActivity(intent);
            }
        });
        buttonli  = (Button)findViewById(R.id.liBtn);
        buttonli.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonfi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonli);
                startActivity(intent);
            }
        });
        buttonlu  = (Button)findViewById(R.id.luBtn);
        buttonlu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonlu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonlu);
                startActivity(intent);
            }
        });
        buttonle  = (Button)findViewById(R.id.leBtn);
        buttonle.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonle);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonle);
                startActivity(intent);
            }
        });
        buttonlo  = (Button)findViewById(R.id.loBtn);
        buttonlo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonlo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonlo);
                startActivity(intent);
            }
        });
        buttonma  = (Button)findViewById(R.id.maBtn);
        buttonma.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonma);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonma);
                startActivity(intent);
            }
        });
        buttonmi  = (Button)findViewById(R.id.miBtn);
        buttonmi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonmi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonmi);
                startActivity(intent);
            }
        });
        buttonmu  = (Button)findViewById(R.id.muBtn);
        buttonmu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonsu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonmu);
                startActivity(intent);
            }
        });
        buttonme  = (Button)findViewById(R.id.meBtn);
        buttonfe.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonme);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonme);
                startActivity(intent);
            }
        });
        buttonmo  = (Button)findViewById(R.id.moBtn);
        buttonmo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonmo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonfo);
                startActivity(intent);
            }
        });
        buttonna  = (Button)findViewById(R.id.naBtn);
        buttonna.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonna);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonna);
                startActivity(intent);
            }
        });
        buttonni  = (Button)findViewById(R.id.niBtn);
        buttonni.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonni);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonni);
                startActivity(intent);
            }
        });
        buttonnu  = (Button)findViewById(R.id.nuBtn);
        buttonnu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonnu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonnu);
                startActivity(intent);
            }
        });
        buttonne  = (Button)findViewById(R.id.neBtn);
        buttonne.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonne);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonne);
                startActivity(intent);
            }
        });
        buttonno  = (Button)findViewById(R.id.noBtn);
        buttonno.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonno);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonno);
                startActivity(intent);
            }
        });
        buttonpa  = (Button)findViewById(R.id.paBtn);
        buttonpa.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonpa);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonpa);
                startActivity(intent);
            }
        });
        buttonpi  = (Button)findViewById(R.id.piBtn);
        buttonpi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonpi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonpi);
                startActivity(intent);
            }
        });
        buttonpu  = (Button)findViewById(R.id.puBtn);
        buttonpu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonpu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonpu);
                startActivity(intent);
            }
        });
        buttonpe  = (Button)findViewById(R.id.peBtn);
        buttonpe.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonpe);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonpe);
                startActivity(intent);
            }
        });
        buttonpo  = (Button)findViewById(R.id.poBtn);
        buttonpo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonpo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonpo);
                startActivity(intent);
            }
        });
        buttonra  = (Button)findViewById(R.id.raBtn);
        buttonra.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonra);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonra);
                startActivity(intent);
            }
        });
        buttonri  = (Button)findViewById(R.id.riBtn);
        buttonri.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonri);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonri);
                startActivity(intent);
            }
        });
        buttonru  = (Button)findViewById(R.id.ruBtn);
        buttonru.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonru);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonru);
                startActivity(intent);
            }
        });
        buttonre  = (Button)findViewById(R.id.reBtn);
        buttonre.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonre);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonre);
                startActivity(intent);
            }
        });
        buttonro  = (Button)findViewById(R.id.roBtn);
        buttonro.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonfo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonro);
                startActivity(intent);
            }
        });
        buttonsa  = (Button)findViewById(R.id.saBtn);
        buttonsa.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonsa);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonsa);
                startActivity(intent);
            }
        });
        buttonsi  = (Button)findViewById(R.id.siBtn);
        buttonsi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonsi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonsi);
                startActivity(intent);
            }
        });
        buttonsu  = (Button)findViewById(R.id.suBtn);
        buttonsu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonsu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonre);
                startActivity(intent);
            }
        });
        buttonse  = (Button)findViewById(R.id.seBtn);
        buttonse.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonse);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonro);
                startActivity(intent);
            }
        });
        buttonso  = (Button)findViewById(R.id.soBtn);
        buttonso.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonso);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonso);
                startActivity(intent);
            }
        });
        buttonta  = (Button)findViewById(R.id.taBtn);
        buttonta.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonta);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonta);
                startActivity(intent);
            }
        });
        buttonti  = (Button)findViewById(R.id.tiBtn);
        buttonti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonti);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonti);
                startActivity(intent);
            }
        });
        buttontu  = (Button)findViewById(R.id.tuBtn);
        buttontu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttontu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttontu);
                startActivity(intent);
            }
        });
        buttonte  = (Button)findViewById(R.id.teBtn);
        buttonte.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonte);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonte);
                startActivity(intent);
            }
        });
        buttonto  = (Button)findViewById(R.id.toBtn);
        buttonto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonto);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonto);
                startActivity(intent);
            }
        });

        buttonza  = (Button)findViewById(R.id.zaBtn);
        buttonza.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonza);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonza);
                startActivity(intent);
            }
        });
        buttonzi  = (Button)findViewById(R.id.ziBtn);
        buttonzi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonzi);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonzi);
                startActivity(intent);
            }
        });
        buttonzu  = (Button)findViewById(R.id.zuBtn);
        buttonzu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonzu);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonzu);
                startActivity(intent);
            }
        });
        buttonze  = (Button)findViewById(R.id.zeBtn);
        buttonze.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonze);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonze);
                startActivity(intent);
            }
        });
        buttonzo  = (Button)findViewById(R.id.zoBtn);
        buttonzo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i("info", ""+v.getTag());
                Log.i("view", ""+buttonzo);
                // Do something
                Intent intent = new Intent(SukuKataActivity.this, MainGame.class);
                if(v.getTag() != null)
                    intent.putExtra("id", "" + v.getTag().toString());
                intent.putExtra("view",""+ buttonzo);
                startActivity(intent);
            }
        });

    }
}
