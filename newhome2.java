package com.example.uksk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newhome2 extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newhome2);
        btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newhome2.this,water.class);
                startActivity(intent);
            }
        });

        btn2 = findViewById(R.id.button8);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newhome2.this,waste.class);
                startActivity(intent);
            }
        });
        btn3 = findViewById(R.id.button9);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newhome2.this,electricity.class);
                startActivity(intent);
            }
        });
        btn4 = findViewById(R.id.button13);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newhome2.this,pantry2.class);
                startActivity(intent);
            }
        });
        btn5 = findViewById(R.id.button11);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newhome2.this,watertime.class);
                startActivity(intent);
            }
        });
        btn6 = findViewById(R.id.button12);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newhome2.this,next.class);
                startActivity(intent);
            }
        });
    }
}
