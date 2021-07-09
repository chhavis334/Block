package com.example.block;
//Block-1 buttons and toast
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class block1 extends AppCompatActivity {
    //Block-1 buttons and toast
    Button blue,pink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block1);
        blue = findViewById(R.id.blue);
        pink = findViewById(R.id.pink);
         blue.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getApplicationContext(),"you clicked button 1",Toast.LENGTH_SHORT).show();
               v.setVisibility(View.INVISIBLE);

           }
       });
       pink.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(block1.this, "you clicked on button 2", Toast.LENGTH_SHORT).show();
               v.setVisibility(View.INVISIBLE);
               Intent intent = new Intent(block1.this,block2.class);
               startActivity(intent);
           }
       });

    }
}