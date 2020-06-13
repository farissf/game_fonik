package com.pembelajaran.gamefonik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void terapi(View view){
        Intent intent = new Intent(this, Login_Activity.class);
        startActivity(intent);
    }
    public void carapenggunaan (View view){
        Intent intent = new Intent(this,MainGame.class);
        startActivity(intent);
    }
}
