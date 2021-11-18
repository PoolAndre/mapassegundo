package com.example.mapassegundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {


    Button lugar, antiguo, moderna, grafico, salir,agencias,restaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lugar = findViewById(R.id.lugar);
        antiguo = findViewById(R.id.antiguo);
        moderna = findViewById(R.id.moderna);
        grafico = findViewById(R.id.grafico);
        salir = findViewById(R.id.btnSalir);
        agencias = findViewById(R.id.agencias);
        restaurantes = findViewById(R.id.restaurantes);


        lugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this,Lugares.class);
                startActivity(intent);
            }
        });
        antiguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this,Antiguos.class);
                startActivity(intent);
            }
        });

        moderna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this,Modernos.class);
                startActivity(intent);
            }
        });

        grafico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this,Grafico.class);
                startActivity(intent);
            }
        });

        agencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this,AgenciasMaps.class);
                startActivity(intent);
            }
        });

        restaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this,RestaurantesMaps.class);
                startActivity(intent);
            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}