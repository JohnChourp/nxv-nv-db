package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView[] characterThumbImages = new ImageView[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characterThumbImages[0] = findViewById(R.id.naruto_uzumaki_Id);
        characterThumbImages[1] = findViewById(R.id.sasuke_uchiha_Id);
        characterThumbImages[2] = findViewById(R.id.sakura_haruno_Id);
        characterThumbImages[2] = findViewById(R.id.kakashi_hatake_Id);
    }
}