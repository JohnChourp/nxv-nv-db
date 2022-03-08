package com.example.myapplication.cards_tools.naruto_uzumaki.ultimate_jutsus_5_star;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.cards_tools.ultimate_jutsu.JutsuCards;

public class ARampagingPower extends AppCompatActivity {

    @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arampaging_power);
        Resources res = getResources();

        TextView type_id = findViewById(R.id.type_id);
        ImageView type_image_id = findViewById(R.id.type_image_id);

        TextView card_id = findViewById(R.id.card_id);
        TextView lvl_card_id = findViewById(R.id.lvl_card_id);
        ImageView rank_image_id = findViewById(R.id.rank_image_id);

        TextView hp_value_id = findViewById(R.id.hp_value_id);
        TextView cp_value_id = findViewById(R.id.cp_value_id);
        TextView atk_value_id = findViewById(R.id.atk_value_id);
        TextView def_value_id = findViewById(R.id.def_value_id);
        TextView cri_value_id = findViewById(R.id.cri_value_id);
        TextView eva_value_id = findViewById(R.id.eva_value_id);

        TextView nature_id = findViewById(R.id.nature_id);
        ImageView nature_image_id = findViewById(R.id.nature_image_id);
        TextView ninjutsu_lvl_value_id = findViewById(R.id.ninjutsu_lvl_value_id);

        TextView cpcost_value_id = findViewById(R.id.cpcost_value_id);
        TextView cri_jutsu_value_id = findViewById(R.id.cri_jutsu_value_id);
        TextView pow_jutsu_value_id = findViewById(R.id.pow_jutsu_value_id);

        TextView rt_value_id = findViewById(R.id.rt_value_id);

        JutsuCards jutsuCards = new JutsuCards("Ultimate Jutsu","Attack", 6, "Impact", 250, 36, 5100, 60);

        type_id.setText(jutsuCards.getType());

        card_id.setText(String.valueOf(jutsuCards.getCategory()));
        lvl_card_id.setText(jutsuCards.getLvlCard());

        hp_value_id.setText(String.valueOf(jutsuCards.getHp()));
        cp_value_id.setText(String.valueOf(jutsuCards.getCp()));
        atk_value_id.setText(String.valueOf(jutsuCards.getAtk()));
        def_value_id.setText(String.valueOf(jutsuCards.getDef()));
        cri_value_id.setText(jutsuCards.getCri()+"0%");
        eva_value_id.setText(jutsuCards.getEva()+"0%");

        nature_id.setText(jutsuCards.getNature());
        ninjutsu_lvl_value_id.setText(jutsuCards.getLvlJutsu());
        cpcost_value_id.setText(String.valueOf(jutsuCards.getCpcost()));
        cri_jutsu_value_id.setText(jutsuCards.getCriJutsu()+".00%");
        pow_jutsu_value_id.setText(String.valueOf(jutsuCards.getPow()));
        rt_value_id.setText(String.valueOf(jutsuCards.getRt()));

        type_image_id.setImageDrawable(res.getDrawable(jutsuCards.getTypeImage()));
        rank_image_id.setImageDrawable(res.getDrawable(jutsuCards.getRank()));
        nature_image_id.setImageDrawable(res.getDrawable(jutsuCards.getNatureImage()));
    }
}