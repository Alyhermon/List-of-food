package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Pastas extends AppCompatActivity {

    String PastaLista[]= {"Spaghetti", "Canelones","Romero",  "Napoles"};
    int ImagenLista[] = {R.drawable.spaguetti,R.drawable.canelones,  R.drawable.romero, R.drawable.napoles};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastas);
        listView = findViewById(R.id.ListPostres);
        Adaptador Bclase = new Adaptador(getApplicationContext(), PastaLista, ImagenLista);
        listView.setAdapter(Bclase);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intent0 = new Intent(Pastas.this, DetalleSpaguetthi.class);
                        startActivity(intent0);
                        break;

                    case 1:
                        Intent intent1 = new Intent(Pastas.this, DetalleCanelones.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(Pastas.this, DetalleRomero.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(Pastas.this, DetalleNapoles.class);
                        startActivity(intent3);
                        break;


                }

            }
        });
    }
}