package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetalleRomero extends AppCompatActivity {

    Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_romero);
        //Boton de Atras...
        atras = findViewById(R.id.atras);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listaPostres = new Intent(DetalleRomero.this, Pastas.class);
                startActivity(listaPostres);
            }


        });
    }
}