package com.example.mapassegundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void mapa(View view) {
        Intent intent = new Intent(MainActivity.this,MapsActivity1.class);
        startActivity(intent);
    }

    public void mi(View view) {
        Intent intent = new Intent(MainActivity.this,MapsActivityubicacion.class);
        startActivity(intent);
    }

    public void tipo(View view) {
        Intent intent = new Intent(MainActivity.this,MapsActivityTipos.class);
        startActivity(intent);
    }

    public void cambiarHibrido(View view) {
    }

    public void cambiarNormal(View view) {
    }

    public void cambiarSatelital(View view) {
    }

    public void cambiarTerreno(View view) {
    }
}