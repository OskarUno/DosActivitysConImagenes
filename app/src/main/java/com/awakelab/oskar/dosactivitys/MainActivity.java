package com.awakelab.oskar.dosactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int img1 = R.drawable.baseline_downhill_skiing_24;
    int img2 = R.drawable.baseline_drive_eta_24;
    int img3 = R.drawable.baseline_email_24;
    int img4 = R.drawable.baseline_park_24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        ImageButton btn1 = findViewById(R.id.imageButton1);
        ImageButton btn2 = findViewById(R.id.imageButton2);
        ImageButton btn3 = findViewById(R.id.imageButton3);
        ImageButton btn4 = findViewById(R.id.imageButton4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverASegundaActividad(img1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverASegundaActividad(img2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverASegundaActividad(img3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moverASegundaActividad(img4);
            }
        });
    }

    private void moverASegundaActividad(int img) {
        Intent vista2 = new Intent(MainActivity.this, SegundaPantalla.class);
        vista2.putExtra("Img", img);
        startActivity(vista2);
    }
}