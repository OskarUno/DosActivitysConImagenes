package com.awakelab.oskar.dosactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SegundaPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        initListeners();
        Intent intentGet = getIntent();
        int idImg = intentGet.getIntExtra("Img", 0);
        Log.d("Imagen en Segunda Actividad", String.valueOf(idImg));

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(idImg);
    }

    private void initListeners() {
        Button btnAtras = findViewById(R.id.btnAtras);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}