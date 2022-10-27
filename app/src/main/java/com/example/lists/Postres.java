package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Postres extends AppCompatActivity {

    //Arrays
    String PostresLista[]= {"Tres Leches", "Postre de Chocolate", "Postre de Fresas", "Postre de Arandano"};
    int ImagenLista[] = {R.drawable.vainilla, R.drawable.chocolate, R.drawable.fresa, R.drawable.arandano};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);
        listView = findViewById(R.id.ListPostres);
        Adaptador Bclase = new Adaptador(getApplicationContext(), PostresLista, ImagenLista );
        listView.setAdapter(Bclase);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intent0 = new Intent(Postres.this, DetallePostres.class);
                        startActivity(intent0);
                        break;

                    case 1:
                        Intent intent1 = new Intent(Postres.this, DetallePChocolate.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(Postres.this, DetallePFresa.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(Postres.this, DetallePArandano.class);
                        startActivity(intent3);
                        break;


                }

            }
        });

    }
}