package com.example.block;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class block2 extends AppCompatActivity {
//clickable list
    ListView listview;
    Button cast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block2);
        listview = findViewById(R.id.listview);
        List_Adapter la = new List_Adapter(block2.this);
        listview.setAdapter(la);
        cast = findViewById(R.id.cast);

    }
}