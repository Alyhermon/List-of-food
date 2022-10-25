package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Postres extends AppCompatActivity {

    //Arrays
    String PostresLista[]= {"Vainilla", "Chocolate", "Fresas", "Arandano"};
    int ImagenLista[] = {R.drawable.vainilla, R.drawable.chocolate, R.drawable.fresa, R.drawable.arandano};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);
        listView = findViewById(R.id.ListPostres);
        Conexion Bclase = new Conexion(getApplicationContext(), PostresLista, ImagenLista);
        listView.setAdapter(Bclase);
    }
}