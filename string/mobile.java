package com.example.simpleapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Find the TextView by ID and set the message
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello, this is a simple Android app!");
    }
}
