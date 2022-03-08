package com.example.myapplication.characters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.cards_tools.naruto_uzumaki.ninjutsus_1_star.Itskindalikebam;
import com.example.myapplication.cards_tools.naruto_uzumaki.ninjutsus_3_star.AThousandYearsofDeath;
import com.example.myapplication.cards_tools.naruto_uzumaki.ninjutsus_3_star.AWarmHand;
import com.example.myapplication.cards_tools.naruto_uzumaki.ninjutsus_4_star.BecauseThatsWhoNarutoIs;
import com.example.myapplication.cards_tools.naruto_uzumaki.ninjutsus_4_star.BecauseYoureMeToo;
import com.example.myapplication.cards_tools.naruto_uzumaki.ninjutsus_4_star.HaremJutsu;
import com.example.myapplication.cards_tools.naruto_uzumaki.ninjutsus_4_star.LetterinHisHeart;
import com.example.myapplication.cards_tools.naruto_uzumaki.ultimate_jutsus_5_star.ARampagingPower;
import com.example.myapplication.cards_tools.naruto_uzumaki.ultimate_jutsus_5_star.NarutovsPain;
import com.example.myapplication.cards_tools.naruto_uzumaki.ultimate_jutsus_5_star.TheFinalGamble;

public class NarutoUzumaki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naruto_uzumaki);

        ImageView naruto_uzumaki_ult1_artwork_id = findViewById(R.id.naruto_uzumaki_ult1_artwork_id);
        naruto_uzumaki_ult1_artwork_id.setOnClickListener(v -> openNarutovsPain());

        ImageView naruto_uzumaki_ult2_artwork_id = findViewById(R.id.naruto_uzumaki_ult2_artwork_id);
        naruto_uzumaki_ult2_artwork_id.setOnClickListener(v -> openTheFinalGamble());

        ImageView naruto_uzumaki_ult3_artwork_id = findViewById(R.id.naruto_uzumaki_ult3_artwork_id);
        naruto_uzumaki_ult3_artwork_id.setOnClickListener(v -> openARampagingPower());

        ImageView naruto_uzumaki_4_star_j1_artwork_id = findViewById(R.id.naruto_uzumaki_4_star_j1_artwork_id);
        naruto_uzumaki_4_star_j1_artwork_id.setOnClickListener(v -> openBecauseYoureMeToo());

        ImageView naruto_uzumaki_4_star_j2_artwork_id = findViewById(R.id.naruto_uzumaki_4_star_j2_artwork_id);
        naruto_uzumaki_4_star_j2_artwork_id.setOnClickListener(v -> openHaremJutsu());

        ImageView naruto_uzumaki_4_star_j3_artwork = findViewById(R.id.naruto_uzumaki_4_star_j3_artwork_id);
        naruto_uzumaki_4_star_j3_artwork.setOnClickListener(v -> openBecauseThatsWhoNarutoIs());

        ImageView naruto_uzumaki_4_star_j4_artwork_id = findViewById(R.id.naruto_uzumaki_4_star_j4_artwork_id);
        naruto_uzumaki_4_star_j4_artwork_id.setOnClickListener(v -> openLetterinHisHeart());

        ImageView naruto_uzumaki_3_star_j1_artwork_id = findViewById(R.id.naruto_uzumaki_3_star_j1_artwork_id);
        naruto_uzumaki_3_star_j1_artwork_id.setOnClickListener(v -> openAWarmHand());

        ImageView naruto_uzumaki_3_star_j2_artwork_id = findViewById(R.id.naruto_uzumaki_3_star_j2_artwork_id);
        naruto_uzumaki_3_star_j2_artwork_id.setOnClickListener(v -> openAThousandYearsofDeath());

        ImageView naruto_uzumaki_1_star_j1_artwork_id = findViewById(R.id.naruto_uzumaki_1_star_j1_artwork_id);
        naruto_uzumaki_1_star_j1_artwork_id.setOnClickListener(v -> openItskindalikebam());
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

    private void openBecauseYoureMeToo() {
        Intent intent = new Intent(this, BecauseYoureMeToo.class);
        startActivity(intent);
    }

    private void openHaremJutsu() {
        Intent intent = new Intent(this, HaremJutsu.class);
        startActivity(intent);
    }

    private void openBecauseThatsWhoNarutoIs() {
        Intent intent = new Intent(this, BecauseThatsWhoNarutoIs.class);
        startActivity(intent);
    }

    private void openLetterinHisHeart() {
        Intent intent = new Intent(this, LetterinHisHeart.class);
        startActivity(intent);
    }

    private void openAWarmHand() {
        Intent intent = new Intent(this, AWarmHand.class);
        startActivity(intent);
    }

    private void openAThousandYearsofDeath() {
        Intent intent = new Intent(this, AThousandYearsofDeath.class);
        startActivity(intent);
    }

    private void openItskindalikebam() {
        Intent intent = new Intent(this, Itskindalikebam.class);
        startActivity(intent);
    }
}