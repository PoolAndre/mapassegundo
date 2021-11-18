package com.example.mapassegundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class antigua7 extends AppCompatActivity {
    Button btn1,mapa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antigua7);

        btn1 = findViewById(R.id.btnAtras);
        mapa = findViewById(R.id.mapamoderna1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antigua7.this,Antiguos.class);
                startActivity(intent);
            }
        });
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antigua7.this,Antigua7Maps.class);
                startActivity(intent);
            }
        });

    }
}