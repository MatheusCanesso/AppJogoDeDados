package com.example.appjogodedados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView dado;
    int [] imagens = {
            R.drawable.dado1,
            R.drawable.dado2,
            R.drawable.dado3,
            R.drawable.dado4,
            R.drawable.dado5,
            R.drawable.dado6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dado = findViewById(R.id.dado);

        dado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Daleatorios = new Random().nextInt(imagens.length);
                dado.setImageResource(imagens[Daleatorios]);
            }
        });
    }
}