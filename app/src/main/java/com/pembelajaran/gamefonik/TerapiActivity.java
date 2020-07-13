package com.pembelajaran.gamefonik;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.FileNotFoundException;
import java.io.InputStream;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class TerapiActivity extends Activity {
    ImageView imageView;
    TextView namaSiswa;

    public static DatabaseHelper db;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terapi_activity);

        namaSiswa = findViewById(R.id.namaSiswa);
        imageView = findViewById(R.id.fProfile);

        db = new DatabaseHelper(this);
        String query = "SELECT nama_lengkap FROM t_user";
        Cursor database = db.getData(query);
        while (database.moveToNext()) {
            String nama_lengkap = database.getString(0);
            namaSiswa.setText(nama_lengkap);
        }

        String query1 = "SELECT foto_profil FROM t_user";
        Cursor database2 = db.getData(query1);
        while (database2.moveToNext()) {
            byte[] foto_profil = database2.getBlob(0);
            Bitmap bitmap = BitmapFactory.decodeByteArray(foto_profil, 0, foto_profil.length);
            imageView.setImageBitmap(bitmap);

        }
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

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if(requestCode == 888){
            if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, 888);
            }
            else {
                Toast.makeText(getApplicationContext(), "You don't have permission to access file location!", Toast.LENGTH_SHORT).show();
            }
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == 888 && resultCode == RESULT_OK && data != null){
            Uri uri = data.getData();
            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                imageView.setImageBitmap(bitmap);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    public void keluar(View view){
        Button btn1 = findViewById(R.id.keluarBtn);
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
