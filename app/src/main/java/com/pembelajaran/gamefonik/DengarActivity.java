package com.pembelajaran.gamefonik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DengarActivity extends Activity {
    Button kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dengar);
        kembali = findViewById(R.id.backBtn);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void musik(View view){
        Intent intent = new Intent(this, MusikActivity.class);
        startActivity(intent);
    }

    public void sekitar(View view){
        Intent intent = new Intent(this, SekitarActivity.class);
        startActivity(intent);
    }
    public void binatang (View view){
        Intent intent = new Intent(this,BinatangActivity.class);
        startActivity(intent);
    }
    public void pendengaran (View view){
        Intent intent = new Intent(this, TesPendengaranActivity.class);
        startActivity(intent);
    }
}
