package com.example.ilya.gb_android2_les5_broadcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Intent intent = getIntent();
        Toast.makeText(this, String.valueOf(intent.getIntExtra("level",-1)), Toast.LENGTH_SHORT).show();
    }
}
