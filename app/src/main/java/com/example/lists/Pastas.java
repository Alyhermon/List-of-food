package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Pastas extends AppCompatActivity {

    String PastaLista[]= {"Spaghetti", "Rollos de Canela", "Canelones", "Canelei"};
    int ImagenLista[] = {R.drawable.vainilla, R.drawable.chocolate, R.drawable.fresa, R.drawable.arandano};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastas);
        listView = findViewById(R.id.ListPostres);
        Conexion Bclase = new Conexion(getApplicationContext(), PastaLista, ImagenLista);
        listView.setAdapter(Bclase);
    }
}