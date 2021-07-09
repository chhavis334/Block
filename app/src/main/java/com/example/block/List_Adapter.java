package com.example.block;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class List_Adapter extends BaseAdapter {
    String title[] = {"stranger things","lucifer","supergirl","teen wolf"};
    int images[] = {R.drawable.st,R.drawable.lucifer,R.drawable.sg,R.drawable.teenwolf};
    Context c;

    public List_Adapter(Context c) {
        this.c = c;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.list_items,null);
        EditText name;
        ImageView poster;
        Button cast;
        name = convertView.findViewById(R.id.series);
        poster = convertView.findViewById(R.id.poster);
        cast = convertView.findViewById(R.id.cast);
        name.setText(title[position]);
        poster.setImageResource(images[position]);
        cast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(c,block4.class);
                c.startActivity(intent);

            }
        });
        return convertView;
    }
}
