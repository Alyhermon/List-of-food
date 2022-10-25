package com.example.lists;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Conexion extends BaseAdapter {

    Context context;
    String ListasT[];
    int ImagenesList[];
    LayoutInflater inflater;

    public Conexion(Context ctx, String [] postreList, int [] images){
        this.context = ctx;
        this.ListasT = postreList;
        this.ImagenesList = images;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return ListasT.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_postres, null);
        TextView txtView = convertView.findViewById(R.id.textView);
        ImageView ImagenesList2 = convertView.findViewById(R.id.ImagenIcon);
        txtView.setText(ListasT[position]);
        ImagenesList2.setImageResource(ImagenesList[position]);
        return convertView;
    }
}
