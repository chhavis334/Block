package com.example.block;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class block6 extends AppCompatActivity {
//images and seekBar
    SeekBar seekBar;
    ImageView image2;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block6);
        seekBar = findViewById(R.id.seekbar);
        image2 = findViewById(R.id.image2);
        image2.setImageResource(R.drawable.image);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int lastprogress;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lastprogress = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                image2.setColorFilter(Color.argb(255,0,lastprogress,255-lastprogress));

            }
        });
        next = findViewById(R.id.nextblock8);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(block6.this,block7.class);
                startActivity(intent);
            }
        });

    }
}