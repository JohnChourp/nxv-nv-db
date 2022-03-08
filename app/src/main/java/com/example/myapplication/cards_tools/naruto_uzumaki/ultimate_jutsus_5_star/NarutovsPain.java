package com.example.myapplication.cards_tools.naruto_uzumaki.ultimate_jutsus_5_star;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.cards_tools.ultimate_jutsu.UltimateJutsus;

public class NarutovsPain extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naruto_vs_pain);
        Resources res = getResources();

        TextView type_id = findViewById(R.id.type_id);
        ImageView type_image_id = findViewById(R.id.type_image_id);

        TextView lvl_ninjutsu_id = findViewById(R.id.lvl_ninjutsu_id);
        ImageView rank_image_id = findViewById(R.id.rank_image_id);

        TextView hp_value_id = findViewById(R.id.hp_value_id);
        TextView cp_value_id = findViewById(R.id.cp_value_id);
        TextView atk_value_id = findViewById(R.id.atk_value_id);
        TextView def_value_id = findViewById(R.id.def_value_id);
        TextView cri_value_id = findViewById(R.id.cri_value_id);
        TextView eva_value_id = findViewById(R.id.eva_value_id);

        TextView nature_id = findViewById(R.id.nature_id);
        ImageView nature_image_id = findViewById(R.id.nature_image_id);
        TextView lvl_jutsu_id = findViewById(R.id.lvl_jutsu_id);

        TextView cpcost_value_id = findViewById(R.id.cpcost_value_id);
        TextView cri_jutsu_value_id = findViewById(R.id.cri_jutsu_value_id);
        TextView pow_jutsu_value_id = findViewById(R.id.pow_jutsu_value_id);

        TextView rt_value_id = findViewById(R.id.rt_value_id);

        UltimateJutsus ultimateJutsus = new UltimateJutsus("Attack", 6, "Release", 300, 36, 9320, 60);

        type_id.setText(ultimateJutsus.getType());

        lvl_ninjutsu_id.setText(ultimateJutsus.getLvlCard());

        hp_value_id.setText(String.valueOf(ultimateJutsus.getHp()));
        cp_value_id.setText(String.valueOf(ultimateJutsus.getCp()));
        atk_value_id.setText(String.valueOf(ultimateJutsus.getAtk()));
        def_value_id.setText(String.valueOf(ultimateJutsus.getDef()));
        cri_value_id.setText(String.valueOf(ultimateJutsus.getCri()));
        eva_value_id.setText(String.valueOf(ultimateJutsus.getEva()));

        nature_id.setText(ultimateJutsus.getNature());
        lvl_jutsu_id.setText(ultimateJutsus.getLvlJutsu());
        cpcost_value_id.setText(String.valueOf(ultimateJutsus.getCpcost()));
        cri_jutsu_value_id.setText(String.valueOf(ultimateJutsus.getCriJutsu()));
        pow_jutsu_value_id.setText(String.valueOf(ultimateJutsus.getPow()));
        rt_value_id.setText(String.valueOf(ultimateJutsus.getRt()));

        type_image_id.setImageDrawable(res.getDrawable(R.drawable.attack));
        rank_image_id.setImageDrawable(res.getDrawable(R.drawable.icon6star));
        nature_image_id.setImageDrawable(res.getDrawable(R.drawable.release));
    }
}