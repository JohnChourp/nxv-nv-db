package com.example.myapplication.cards_tools.naruto_uzumaki.ultimate_jutsus_5_star;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class ARampagingPower extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arampaging_power);
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

        ImageView rt_image_id = findViewById(R.id.rt_image_id);
        TextView rt_value_id = findViewById(R.id.rt_value_id);

        TextView equip_id = findViewById(R.id.equip_id);

        type_id.setText(R.string.attack);
        type_image_id.setImageDrawable(res.getDrawable(R.drawable.attack));

        lvl_ninjutsu_id.setText(R.string.lv_70_70);
        rank_image_id.setImageDrawable(res.getDrawable(R.drawable.icon6star));

        hp_value_id.setText(R.string._1128);
        cp_value_id.setText(R.string._102);
        atk_value_id.setText(R.string._829);
        def_value_id.setText(R.string._534);
        cri_value_id.setText(R.string._1_30);
        eva_value_id.setText(R.string._1_30);

        nature_id.setText(R.string.impact);
        nature_image_id.setImageDrawable(res.getDrawable(R.drawable.impact));

        lvl_jutsu_id.setText(R.string._8_8);
        cpcost_value_id.setText(R.string._250);
        cri_jutsu_value_id.setText(R.string._36_00);
        pow_jutsu_value_id.setText(R.string._5100);
        rt_value_id.setText(R.string._60);
        rt_image_id.setImageDrawable(res.getDrawable(R.drawable.recharge_time));

        equip_id.setText(R.string.naruto_uzumaki);
    }
}