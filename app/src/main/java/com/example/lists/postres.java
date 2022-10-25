package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class postres extends AppCompatActivity {

    //Arrays
    String PostresList[]= {"Vainilla", "Chocolate", "Fresas", "Arandano"};
    int PostresListas[] = {R.drawable.vainilla, R.drawable.chocolate, R.drawable.fresa, R.drawable.arandano};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);
        listView = findViewById(R.id.ListPostres);
        base Bclase = new base (getApplicationContext(), PostresList, PostresListas);
        listView.setAdapter(Bclase);
    }
}