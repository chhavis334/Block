package com.example.block;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class block8_2 extends AppCompatActivity {
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block8_2);
        Intent intent = getIntent();
        float rating = intent.getFloatExtra("nbstars",0);
        textView = findViewById(R.id.textView);
        textView.setText("welcome to second activity, your rating: "+ rating);
        button = findViewById(R.id.nextblock9);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent1 = new Intent(block8_2.this,block9.class);
//                startActivity(intent1);
//            }
//        });


    }
}