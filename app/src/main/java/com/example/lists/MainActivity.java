package com.example.lists;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity{

    Spinner lista;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.TComida_spinner);

        //Menu de Comida
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:

                        Intent postre = new Intent(MainActivity.this, postres.class);
                        startActivity(postre);
                        break;
                    case 2:

                        Intent pasta = new Intent(MainActivity.this, pastas.class);
                        startActivity(pasta);
                        break;

                    case 3:

                        Intent bebida = new Intent(MainActivity.this, bebidas.class);
                        startActivity(bebida);
                        break;

                    case 4:

                        Intent carne = new Intent(MainActivity.this, carnes.class);
                        startActivity(carne);
                        break;

                    case 5:

                        Intent especialidad = new Intent(MainActivity.this, especialidades.class);
                        startActivity(especialidad);
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}