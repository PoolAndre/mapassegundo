
package com.example.mapassegundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splashtres extends AppCompatActivity {

    public static final long SPLAH_SCREEN_DELAY = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashtres);
        //implementar tiempo
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                    Intent intent = new Intent().setClass(Splashtres.this, Principal.class);
                startActivity(intent);
                finish();
            }
        };
        // se ejecuta una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time,SPLAH_SCREEN_DELAY);
    }
}