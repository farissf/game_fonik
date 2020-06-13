package com.pembelajaran.gamefonik;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Login_Activity extends AppCompatActivity {
    EditText etUsername;
    EditText etPassword;
    Button tvDaftar;
    Button btnLogin;
    DatabaseHelper db;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_2);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        tvDaftar = findViewById(R.id.tvDaftar);
        btnLogin = findViewById(R.id.btnLogin);
        db = new DatabaseHelper(this);

        tvDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this, Daftar_Activity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etUsername.getText().toString().trim();
                String pwd = etPassword.getText().toString().trim();
                boolean res = db.checkUser(user, pwd);
                if (res)
                {
                    SweetAlertDialog pDialog = new SweetAlertDialog(Login_Activity.this, SweetAlertDialog.SUCCESS_TYPE);
                    pDialog.setTitleText("Peringatan!");
                    pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                    pDialog.setContentText("Login Berhasil!");
                    pDialog.setCancelable(false);
                    pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                            Intent intentMoveToMain = new Intent(Login_Activity.this, TerapiActivity.class);
                            startActivity(intentMoveToMain);
                            sweetAlertDialog.dismissWithAnimation();
                        }
                    });
                    pDialog.show();
//                    Toast.makeText(Login_Activity.this, "Login Berhasil!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SweetAlertDialog pDialog = new SweetAlertDialog(Login_Activity.this, SweetAlertDialog.ERROR_TYPE);
                    pDialog.setTitleText("Peringatan!");
                    pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                    pDialog.setContentText("Username atau password salah");
                    pDialog.setCancelable(false);
                    pDialog.show();
//                    Toast.makeText(Login_Activity.this, "Login Gagal!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){

            Intent intent = new Intent(Login_Activity.this,MainActivity.class);
            startActivity(intent);

        }else {
            Toast.makeText(this, "Tekan sekali lagi untuk kembali", Toast.LENGTH_SHORT).show();

        }
        backPressedTime = System.currentTimeMillis();
    }
}
