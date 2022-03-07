package com.example.myapplication.characters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.cards_tools.naruto_uzumaki.ultimate_jutsus_5_star.ARampagingPower;
import com.example.myapplication.cards_tools.naruto_uzumaki.ultimate_jutsus_5_star.NarutovsPain;
import com.example.myapplication.cards_tools.naruto_uzumaki.ultimate_jutsus_5_star.TheFinalGamble;

public class NarutoUzumaki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naruto_uzumaki);

        ImageView naruto_uzumaki_ult1_artwork = findViewById(R.id.naruto_uzumaki_ult1_artwork_id);
        naruto_uzumaki_ult1_artwork.setOnClickListener(v -> openNarutovsPain());

        ImageView naruto_uzumaki_ult2_artwork = findViewById(R.id.naruto_uzumaki_ult2_artwork_id);
        naruto_uzumaki_ult2_artwork.setOnClickListener(v -> openTheFinalGamble());

        ImageView naruto_uzumaki_ult3_artwork = findViewById(R.id.naruto_uzumaki_ult3_artwork_id);
        naruto_uzumaki_ult3_artwork.setOnClickListener(v -> openARampagingPower());
    }

    private void openNarutovsPain() {
        Intent intent = new Intent(this, NarutovsPain.class);
        startActivity(intent);
    }

    private void openTheFinalGamble() {
        Intent intent = new Intent(this, TheFinalGamble.class);
        startActivity(intent);
    }

    private void openARampagingPower() {
        Intent intent = new Intent(this, ARampagingPower.class);
        startActivity(intent);
    }
}