package com.example.block;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class block8 extends AppCompatActivity {
RatingBar stars;
Button enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block8);
        enter = findViewById(R.id.enter);
        stars = findViewById(R.id.ratingBar);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(block8.this,block8_2.class);
                float rating = stars.getRating();
                intent.putExtra("nbstars",rating);
                startActivity(intent);
            }
        });

    }
}