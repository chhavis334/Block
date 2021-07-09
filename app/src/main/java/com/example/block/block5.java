package com.example.block;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class block5 extends AppCompatActivity {
//saving preferences and radio buttons
    RadioGroup color;
    Button next;
    RelativeLayout layout;
    SharedPreferences sharedPreferences;
//    RadioButton green,blue,yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block5);
//        green = findViewById(R.id.radioButton1);
//        blue = findViewById(R.id.radioButton2);
//        yellow = findViewById(R.id.radioButton3);
        next = findViewById(R.id.nextblock6);
        layout = findViewById(R.id.relativelayout);
        color = findViewById(R.id.rgroupcolor);
        sharedPreferences = getSharedPreferences("Colors",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if(sharedPreferences.contains("colorId"))
            layout.setBackgroundColor(sharedPreferences.getInt("colorId",0));

        color.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //hold the id of color variable
                int colorCode = 0 ;
                switch (checkedId) {
                    case R.id.radioButton1:
                        colorCode = Color.GREEN;
                        break;
                    case R.id.radioButton2:
                        colorCode = Color.BLUE;
                        break;
                    case R.id.radioButton3:
                        colorCode = Color.YELLOW;
                        break;
                }
                layout.setBackgroundColor(colorCode);
                editor.putInt("colorId",colorCode);
                editor.commit();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(block5.this,block6.class);
                startActivity(intent);
            }
        });
    }
}