package com.example.mynote;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TotalPage extends AppCompatActivity {

    Button total_btn1;
    Button total_btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_page);

        total_btn1 = findViewById(R.id.button_note);
        total_btn2 = findViewById(R.id.button_tally);

        total_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(TotalPage.this, MainActivity2.class);
                startActivity(intent1);
            }
        });

        total_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(TotalPage.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}