package com.example.uksk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class electricity extends AppCompatActivity {
Button btnele;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);
        btnele = findViewById(R.id.button_e2);
        btnele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(electricity.this,electricity2.class);
                startActivity(intent);
            }
        });
    }
}
