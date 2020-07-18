package com.pembelajaran.gamefonik;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BinatangActivity extends Activity{
    private static final String isPlaying = "";
    private MediaPlayer player;
    Button kembali;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binatang);
        kembali = findViewById(R.id.backBtn);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Button anjing = (Button) this.findViewById(R.id.anjing);
        anjing.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View arg0) {
               playSound(1);
           }
       });
        Button ayam = (Button) this.findViewById(R.id.ayam);
        ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(2);
            }
        });
        Button bebek = (Button) this.findViewById(R.id.bebek);
        bebek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(3);
            }
        });
        Button elang = (Button) this.findViewById(R.id.elang);
        elang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(4);
            }
        });
        Button kambing = (Button) this.findViewById(R.id.kambing);
        kambing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(5);
            }
        });
        Button katak = (Button) this.findViewById(R.id.katak);
        katak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(6);
            }
        });
        Button kucing = (Button) this.findViewById(R.id.kucing);
        kucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(7);
            }
        });
        Button kuda = (Button) this.findViewById(R.id.kuda);
        kuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(8);
            }
        });
        Button gajah = (Button) this.findViewById(R.id.gajah);
        gajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(9);
            }
        });
        Button monyet = (Button) this.findViewById(R.id.monyet);
        monyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(10);
            }
        });
        Button sapi = (Button) this.findViewById(R.id.sapi);
        sapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(11);
            }
        });
        Button serigala = (Button) this.findViewById(R.id.serigala);
        serigala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(12);
            }
        });
        Button ular = (Button) this.findViewById(R.id.ular);
        ular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(13);
            }
        });
        Button singa = (Button) this.findViewById(R.id.singa);
        singa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(14);
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
        }catch (Exception e){Toast.makeText(this, isPlaying,Toast.LENGTH_LONG).show();
        }
        if(arg == 1){
            Toast.makeText(this,isPlaying+"Suara anjing",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.anjing);
        }else if(arg == 2){
            Toast.makeText(this,isPlaying+"Suara ayam",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.ayam);
        }else if(arg == 3){
            Toast.makeText(this,isPlaying+"Suara bebek",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.bebek);
        }else if(arg == 4){
            Toast.makeText(this,isPlaying+"Suara elang",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.elang);
        }else if(arg == 5){
            Toast.makeText(this,isPlaying+"Suara kambing",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.kambing);
        }else if(arg == 6){
            Toast.makeText(this,isPlaying+"Suara kodok",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.kodok);
        }else if(arg == 7){
            Toast.makeText(this,isPlaying+"Suara kucing",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.kucing);
        }else if(arg == 8){
            Toast.makeText(this,isPlaying+"Suara kuda",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.kuda);
        }else if(arg == 9){
            Toast.makeText(this,isPlaying+"Suara gajah",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.gajah);
        }else if(arg == 10){
            Toast.makeText(this,isPlaying+"Suara monyet",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.monyet);
        }else if(arg == 11){
            Toast.makeText(this,isPlaying+"Suara sapi",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.sapi);
        }else if(arg == 12){
            Toast.makeText(this,isPlaying+"Suara serigala",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.serigala);
        }else if(arg == 13){
            Toast.makeText(this,isPlaying+"Suara singa",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.singa);
        }else if(arg == 14){
            Toast.makeText(this,isPlaying+"Suara ular",Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.ular);
        }
        player.setLooping(false);
        player.start();

    }


}
