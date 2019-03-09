package com.example.uksk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantry2 extends AppCompatActivity {
Button btnpy3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantry2);
        btnpy3 = findViewById(R.id.button_pyc2);
        btnpy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pantry2.this,pantry3.class);
                startActivity(intent);
            }
        });
    }
}
