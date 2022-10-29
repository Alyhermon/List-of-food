package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class carnes extends AppCompatActivity {

    String CarneLista[]= {"Bife De chorizo", "Espaldilla","Solomillo",  "Lomo"};
    int ImagenLista[] = {R.drawable.bife_chorizo,R.drawable.espaldilla,  R.drawable.solomillo, R.drawable.lomo1};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnes);

        listView = findViewById(R.id.ListPostres);
        Adaptador Bclase = new Adaptador(getApplicationContext(), CarneLista, ImagenLista);
        listView.setAdapter(Bclase);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intent0 = new Intent(carnes.this, DetalleCarne1.class);
                        startActivity(intent0);
                        break;

                    case 1:
                        Intent intent1 = new Intent(carnes.this, DetalleEspaldilla.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(carnes.this, DetalleSolomillo.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(carnes.this, DetalleLomo.class);
                        startActivity(intent3);
                        break;


                }

            }
        });
    }
}