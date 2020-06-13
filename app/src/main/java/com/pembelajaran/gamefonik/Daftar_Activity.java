package com.pembelajaran.gamefonik;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Daftar_Activity extends AppCompatActivity {
    EditText etUsername;
    EditText etPassword;
    EditText etConfirmPassword;
    EditText tanggal_lahir;
    DatePickerDialog picker;
    EditText alamat;
    EditText nama_lengkap;
    TextView batal;
    RadioGroup radioJenis;
    RadioButton jenis_kelamin;
    Button btnDaftar;
    Button upload_foto;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_2);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        batal = findViewById(R.id.batal);
        alamat = findViewById(R.id.alamat);
        nama_lengkap = findViewById(R.id.namaLengkap);
        btnDaftar = findViewById(R.id.btnDaftar);
        tanggal_lahir=(EditText) findViewById(R.id.tanggal_lahir);
        tanggal_lahir.setInputType(InputType.TYPE_NULL);
        db = new DatabaseHelper(this);
        radioJenis = (RadioGroup) findViewById(R.id.radioJenis);
        radioJenis.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.laki:
                    case R.id.perempuan:
                        // do operations specific to this selection
                        jenis_kelamin = (RadioButton)findViewById(checkedId);
                        break;
                }
            }
        });
        tanggal_lahir.setOnClickListener(new View.OnClickListener() {
            // Buat pilih tanggal lahir
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(Daftar_Activity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                tanggal_lahir.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });
        // tutup tanggal lahir


        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Daftar_Activity.this, Login_Activity.class);
                startActivity(intent);
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etUsername.getText().toString().trim();
                String pwd = etPassword.getText().toString().trim();
                String cnf_pwd = etConfirmPassword.getText().toString().trim();
                String nama = nama_lengkap.getText().toString().trim();
                String almt = alamat.getText().toString().trim();
                String jenis = jenis_kelamin.getText().toString().trim();
                String tanggal = tanggal_lahir.getText().toString().trim();
//                String upload = upload_foto.getText().toString().trim();
                if (pwd.equals(cnf_pwd)) {
                    long val = db.addUser(user, pwd, nama, almt, jenis, tanggal);
                    if (val > 0) {
                        SweetAlertDialog pDialog = new SweetAlertDialog(Daftar_Activity.this, SweetAlertDialog.ERROR_TYPE);
                        pDialog.setTitleText("Peringatan!");
                        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                        pDialog.setContentText("Anda telah terdaftar!");
                        pDialog.setCancelable(false);
                        pDialog.show();
//                        Toast.makeText(Daftar_Activity.this, "Anda telah terdaftar!", Toast.LENGTH_SHORT).show();
                        Intent intentMoveToLogin = new Intent(Daftar_Activity.this, Login_Activity.class);
                        startActivity(intentMoveToLogin);
                    } else {
                        SweetAlertDialog pDialog = new SweetAlertDialog(Daftar_Activity.this, SweetAlertDialog.ERROR_TYPE);
                        pDialog.setTitleText("Peringatan!");
                        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                        pDialog.setContentText("Pendaftaran gagal!");
                        pDialog.setCancelable(false);
                        pDialog.show();
//                        Toast.makeText(Daftar_Activity.this, "Pendaftaran gagal!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    SweetAlertDialog pDialog = new SweetAlertDialog(Daftar_Activity.this, SweetAlertDialog.ERROR_TYPE);
                    pDialog.setTitleText("Peringatan!");
                    pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                    pDialog.setContentText("Password tidak sama!");
                    pDialog.setCancelable(false);
                    pDialog.show();
//                    Toast.makeText(Daftar_Activity.this, "Password tidak sama!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


}
