package com.example.block;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class block7 extends AppCompatActivity {
//web pages
    NumberPicker picker;
    WebView webView;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block7);
        picker = findViewById(R.id.numberpicker);
        webView = findViewById(R.id.webview);
        String []choices = {"Coursera",
                            "Pinterest",
                            "GeeksforGeeks"};
        picker.setDisplayedValues(choices);
        picker.setMinValue(0);
        picker.setMaxValue(choices.length-1);
    }

    public void navigate(View view) {
        int ch = picker.getValue();
        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
        webView.setWebViewClient(new WebViewClient());
        if(ch==0)
        {
            Toast.makeText(this, "clickkkk", Toast.LENGTH_SHORT).show();
            webView.loadUrl("http://www.coursera.org");
        }
        else if (ch==1)
            webView.loadUrl("http://www.pinterest.com");
        else if (ch == 2)
            webView.loadUrl("http://www.geeksforgeeks.org");


    }

    public void next(View view) {
        Intent intent = new Intent(block7.this,block8.class);
        startActivity(intent);
    }
}