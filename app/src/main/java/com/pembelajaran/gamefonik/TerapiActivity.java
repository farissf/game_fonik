package com.pembelajaran.gamefonik;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class TerapiActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terapi_activity);
    }
    public void perkembangan(View view){
        Intent intent = new Intent(this, PerkembanganActivity.class);
        startActivity(intent);
    }

    public void dengar(View view){
        Intent intent = new Intent(this, DengarActivity.class);
        startActivity(intent);
    }

    public void huruf(View view){
        Intent intent = new Intent(this, HurufActivity.class);
        startActivity(intent);
    }
    public void suku_kata(View view){
        Intent intent = new Intent(this, SukuKataActivity.class);
        startActivity(intent);
    }
    public void kata(View view){
        Intent intent = new Intent(this, KataActivity.class);
        startActivity(intent);
    }
    public void keluar(View view){
        Button btn1 = (Button) findViewById(R.id.keluarBtn);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                final SweetAlertDialog pDialog = new SweetAlertDialog(TerapiActivity.this, SweetAlertDialog.WARNING_TYPE);
                pDialog.setTitleText("Peringatan!");
                pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                pDialog.setContentText("Apakah anda ingin keluar dari aplikasi ini ?");
                pDialog.setConfirmText("Ya");
                pDialog.setCancelText("Tidak");
                pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        finish();
                        Intent intent = new Intent(TerapiActivity.this,Login_Activity.class);
                        startActivity(intent);
                    }
                });
                pDialog.setCancelable(true);
                pDialog.show();
            }
        });
    }

}
