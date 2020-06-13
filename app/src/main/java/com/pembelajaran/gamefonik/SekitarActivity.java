package com.pembelajaran.gamefonik;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SekitarActivity extends Activity  {
    private static final String isPlaying = "";
    private MediaPlayer player;
    Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekitar);
        kembali = findViewById(R.id.backBtn);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button angin = (Button) this.findViewById(R.id.angin);
        angin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(1);
            }
        });
        Button petir = (Button) this.findViewById(R.id.petir);
        petir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(2);
            }
        });
        Button peluit = (Button) this.findViewById(R.id.peluit);
        peluit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(3);
            }
        });
        Button api = (Button) this.findViewById(R.id.api);
        api.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(4);
            }
        });
        Button piano = (Button) this.findViewById(R.id.piano);
        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(5);
            }
        });
        Button suling = (Button) this.findViewById(R.id.suling);
        suling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(6);
            }
        });

    }
    @Override
    public void onPause(){
        try{
            super.onPause();
            player.pause();
        }catch(Exception ignored){

        }
    }

    private void playSound(int arg){
        try{
            if (player.isPlaying()){
                player.stop();
                player.release();
            }
        }catch (Exception e){
            Toast.makeText(this, isPlaying,Toast.LENGTH_LONG).show();
        }
        if(arg == 1){
            Toast.makeText(this,isPlaying+"Suara angin",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.angin);
        }else if(arg == 2){
            Toast.makeText(this,isPlaying+"Suara petir",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.petir);
        }else if(arg == 3){
            Toast.makeText(this,isPlaying+"Suara peluit",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.peluit);
        }else if(arg == 4){
            Toast.makeText(this,isPlaying+"Suara api",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.api);
        }else if(arg == 5){
            Toast.makeText(this,isPlaying+"Suara piano",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.piano);
        }else if(arg == 6){
            Toast.makeText(this,isPlaying+"Suara suling",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.suling);
        }
        player.setLooping(false);
        player.start();

    }
}
