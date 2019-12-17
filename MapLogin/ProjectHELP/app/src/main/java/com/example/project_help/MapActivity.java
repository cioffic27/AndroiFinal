package com.example.project_help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        final ImageView monImgView = findViewById(R.id.monImgView);
        final ImageView stuImgView = findViewById(R.id.stuImgView);
        final ImageView dreyImgView = findViewById(R.id.dreyImgView);
        final ImageView mansionImgView = findViewById(R.id.mansionImgView);
        final ImageView zenImgView = findViewById(R.id.zenImgView);
        final ImageView sciImgView = findViewById(R.id.sciImgView);

        //Monninger Center (1)
        Button monBtn = findViewById(R.id.monBtn);
        monBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monImgView.setVisibility(View.VISIBLE);
                stuImgView.setVisibility(View.GONE);
                dreyImgView.setVisibility(View.GONE);
                zenImgView.setVisibility(View.GONE);
                sciImgView.setVisibility(View.GONE);
                mansionImgView.setVisibility(View.GONE);
            }
        });

        //Student Center (2)
        Button stuBtn = findViewById(R.id.stuBtn);
        stuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stuImgView.setVisibility(View.VISIBLE);
                monImgView.setVisibility(View.GONE);
                dreyImgView.setVisibility(View.GONE);
                zenImgView.setVisibility(View.GONE);
                sciImgView.setVisibility(View.GONE);
                mansionImgView.setVisibility(View.GONE);
            }
        });

        //Dreyfus Building (3)
        Button dreyBtn = findViewById(R.id.dreyBtn);
        dreyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dreyImgView.setVisibility(View.VISIBLE);
                stuImgView.setVisibility(View.GONE);
                monImgView.setVisibility(View.GONE);
                zenImgView.setVisibility(View.GONE);
                sciImgView.setVisibility(View.GONE);
                mansionImgView.setVisibility(View.GONE);
            }
        });

        //Zen Building (4)
        Button zenBtn = findViewById(R.id.zenBtn);
        zenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zenImgView.setVisibility(View.VISIBLE);
                stuImgView.setVisibility(View.GONE);
                dreyImgView.setVisibility(View.GONE);
                monImgView.setVisibility(View.GONE);
                sciImgView.setVisibility(View.GONE);
                mansionImgView.setVisibility(View.GONE);
            }
        });

        //Science Building (5)
        Button sciBtn = findViewById(R.id.sciBtn);
        sciBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sciImgView.setVisibility(View.VISIBLE);
                stuImgView.setVisibility(View.GONE);
                dreyImgView.setVisibility(View.GONE);
                zenImgView.setVisibility(View.GONE);
                monImgView.setVisibility(View.GONE);
                mansionImgView.setVisibility(View.GONE);
            }
        });

        //The Mansion (6)
        Button mansionBtn = findViewById(R.id.mansionBtn);
        mansionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mansionImgView.setVisibility(View.VISIBLE);
                stuImgView.setVisibility(View.GONE);
                dreyImgView.setVisibility(View.GONE);
                zenImgView.setVisibility(View.GONE);
                sciImgView.setVisibility(View.GONE);
                monImgView.setVisibility(View.GONE);
            }
        });

        //HOME BUTTON
        Button homeBtn = findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
