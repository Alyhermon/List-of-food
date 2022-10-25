package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class pastas extends AppCompatActivity {

    String PostresList[]= {"Vainilla", "Chocolate", "Fresas", "Arandano"};
    int PostresListas[] = {R.drawable.vainilla, R.drawable.chocolate, R.drawable.fresa, R.drawable.arandano};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastas);
        listView = findViewById(R.id.ListPostres);
        base Bclase = new base (getApplicationContext(), PostresList, PostresListas);
        listView.setAdapter(Bclase);
    }
}