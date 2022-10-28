package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetallePArandano extends AppCompatActivity {

    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_parandano);

        //Boton de Atras...
        atras = findViewById(R.id.atras);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listaPostres = new Intent(DetallePArandano.this, Postres.class);
                startActivity(listaPostres);
            }


        });
    }
}