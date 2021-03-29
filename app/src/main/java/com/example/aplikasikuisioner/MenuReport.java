package com.example.aplikasikuisioner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_report);

        Button btnMove = findViewById(R.id.btnRP1);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuReport.this, Pilihan.class));
            }
        });

        Button btnMove1 = findViewById(R.id.btnRP2);

        btnMove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuReport.this, PieChart2.class));
            }
        });

        Button btnMove2 = findViewById(R.id.btnRP3);

        btnMove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuReport.this, PieChart3.class));
            }
        });
    }
}