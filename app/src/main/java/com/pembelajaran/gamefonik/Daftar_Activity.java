package com.pembelajaran.gamefonik;

import android.Manifest;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
//    DatabaseHelper db;
    ImageView imageView;


    final int REQUEST_CODE_GALLERY = 999;

    public static DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_2);
        init();

        db = new DatabaseHelper(this);
        db.queryData("CREATE TABLE IF NOT EXISTS t_user(ID INTEGER PRIMARY KEY, username TEXT, password TEXT, nama_lengkap TEXT, alamat TEXT, jenis_kel TEXT, tgl_lahir TEXT, foto_profil BLOB)");

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

        upload_foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions(
                        Daftar_Activity.this,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        REQUEST_CODE_GALLERY
                );
            }
        });


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
                String upload = upload_foto.getText().toString().trim();
                byte[] gambar = imageViewToByte(imageView);
                if (pwd.equals(cnf_pwd)) {
                    long val = db.addUser(user, pwd, nama, almt, jenis, tanggal, gambar);
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

    public static byte[] imageViewToByte(ImageView image) {
        Bitmap bitmap = ((BitmapDrawable)image.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if(requestCode == REQUEST_CODE_GALLERY){
            if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, REQUEST_CODE_GALLERY);
            }
            else {
                SweetAlertDialog pDialog = new SweetAlertDialog(Daftar_Activity.this, SweetAlertDialog.ERROR_TYPE);
                pDialog.setTitleText("Peringatan!");
                pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                pDialog.setContentText("Kamu tidak memiliki hak akses menuju lokasi data!");
                pDialog.setCancelable(false);
                pDialog.show();
//                Toast.makeText(getApplicationContext(), "You don't have permission to access file location!", Toast.LENGTH_SHORT).show();
            }
            return;
        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == REQUEST_CODE_GALLERY && resultCode == RESULT_OK && data != null){
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
    private void init(){
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        batal = findViewById(R.id.batal);
        alamat = findViewById(R.id.alamat);
        nama_lengkap = findViewById(R.id.namaLengkap);
        btnDaftar = findViewById(R.id.btnDaftar);
        tanggal_lahir=(EditText) findViewById(R.id.tanggal_lahir);
        tanggal_lahir.setInputType(InputType.TYPE_NULL);
        radioJenis = (RadioGroup) findViewById(R.id.radioJenis);
        imageView = (ImageView) findViewById(R.id.imageView);
        upload_foto = (Button) findViewById(R.id.upload_foto);
    }

}
