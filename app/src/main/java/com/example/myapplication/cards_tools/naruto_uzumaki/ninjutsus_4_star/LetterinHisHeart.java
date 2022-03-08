package com.example.myapplication.cards_tools.naruto_uzumaki.ninjutsus_4_star;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.cards_tools.cards.CheckByLvlCards;
import com.example.myapplication.cards_tools.cards.JutsuCards;

public class LetterinHisHeart extends AppCompatActivity {

    @SuppressLint({"SetTextI18n", "UseCompatLoadingForDrawables"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letterin_his_heart);
        Resources res = getResources();

        TextView rt_lvl_1_id = findViewById(R.id.rt_lvl_1_id);
        TextView cpcost_lvl_1_id = findViewById(R.id.cpcost_lvl_1_id);
        TextView cri_lvl_1_id = findViewById(R.id.cri_lvl_1_id);
        TextView pow_lvl_1_id = findViewById(R.id.pow_lvl_1_id);

        TextView rt_lvl_2_id = findViewById(R.id.rt_lvl_2_id);
        TextView cpcost_lvl_2_id = findViewById(R.id.cpcost_lvl_2_id);
        TextView cri_lvl_2_id = findViewById(R.id.cri_lvl_2_id);
        TextView pow_lvl_2_id = findViewById(R.id.pow_lvl_2_id);

        TextView rt_lvl_3_id = findViewById(R.id.rt_lvl_3_id);
        TextView cpcost_lvl_3_id = findViewById(R.id.cpcost_lvl_3_id);
        TextView cri_lvl_3_id = findViewById(R.id.cri_lvl_3_id);
        TextView pow_lvl_3_id = findViewById(R.id.pow_lvl_3_id);

        TextView rt_lvl_4_id = findViewById(R.id.rt_lvl_4_id);
        TextView cpcost_lvl_4_id = findViewById(R.id.cpcost_lvl_4_id);
        TextView cri_lvl_4_id = findViewById(R.id.cri_lvl_4_id);
        TextView pow_lvl_4_id = findViewById(R.id.pow_lvl_4_id);

        TextView rt_lvl_5_id = findViewById(R.id.rt_lvl_5_id);
        TextView cpcost_lvl_5_id = findViewById(R.id.cpcost_lvl_5_id);
        TextView cri_lvl_5_id = findViewById(R.id.cri_lvl_5_id);
        TextView pow_lvl_5_id = findViewById(R.id.pow_lvl_5_id);

        TextView rt_lvl_6_id = findViewById(R.id.rt_lvl_6_id);
        TextView cpcost_lvl_6_id = findViewById(R.id.cpcost_lvl_6_id);
        TextView cri_lvl_6_id = findViewById(R.id.cri_lvl_6_id);
        TextView pow_lvl_6_id = findViewById(R.id.pow_lvl_6_id);

        TextView rt_lvl_7_id = findViewById(R.id.rt_lvl_7_id);
        TextView cpcost_lvl_7_id = findViewById(R.id.cpcost_lvl_7_id);
        TextView cri_lvl_7_id = findViewById(R.id.cri_lvl_7_id);
        TextView pow_lvl_7_id = findViewById(R.id.pow_lvl_7_id);

        TextView rt_lvl_8_id = findViewById(R.id.rt_lvl_8_id);
        TextView cpcost_lvl_8_id = findViewById(R.id.cpcost_lvl_8_id);
        TextView cri_lvl_8_id = findViewById(R.id.cri_lvl_8_id);
        TextView pow_lvl_8_id = findViewById(R.id.pow_lvl_8_id);

        CheckByLvlCards checkByLvlCards = new CheckByLvlCards(6,5, 100, 1, 1800, 5, 100, 6, 2660);

        rt_lvl_1_id.setText(String.valueOf(checkByLvlCards.getRt_lvl_1()));
        cpcost_lvl_1_id.setText(String.valueOf(checkByLvlCards.getCpcost_lvl_1()));
        cri_lvl_1_id.setText(checkByLvlCards.getCri_lvl_1() + ".00%");
        pow_lvl_1_id.setText(String.valueOf(checkByLvlCards.getPow_lvl_1()));

        rt_lvl_2_id.setText(String.valueOf(checkByLvlCards.getRt_lvl_2()));
        cpcost_lvl_2_id.setText(String.valueOf(checkByLvlCards.getCpcost_lvl_2()));
        cri_lvl_2_id.setText(checkByLvlCards.getCri_lvl_2() + ".00%");
        pow_lvl_2_id.setText(String.valueOf(checkByLvlCards.getPow_lvl_2()));

        rt_lvl_3_id.setText(String.valueOf(checkByLvlCards.getRt_lvl_3()));
        cpcost_lvl_3_id.setText(String.valueOf(checkByLvlCards.getCpcost_lvl_3()));
        cri_lvl_3_id.setText(checkByLvlCards.getCri_lvl_3() + ".00%");
        pow_lvl_3_id.setText(String.valueOf(checkByLvlCards.getPow_lvl_3()));

        rt_lvl_4_id.setText(String.valueOf(checkByLvlCards.getRt_lvl_4()));
        cpcost_lvl_4_id.setText(String.valueOf(checkByLvlCards.getCpcost_lvl_4()));
        cri_lvl_4_id.setText(checkByLvlCards.getCri_lvl_4() + ".00%");
        pow_lvl_4_id.setText(String.valueOf(checkByLvlCards.getPow_lvl_4()));

        rt_lvl_5_id.setText(String.valueOf(checkByLvlCards.getRt_lvl_5()));
        cpcost_lvl_5_id.setText(String.valueOf(checkByLvlCards.getCpcost_lvl_5()));
        cri_lvl_5_id.setText(checkByLvlCards.getCri_lvl_5() + ".00%");
        pow_lvl_5_id.setText(String.valueOf(checkByLvlCards.getPow_lvl_5()));

        rt_lvl_6_id.setText(String.valueOf(checkByLvlCards.getRt_lvl_6()));
        cpcost_lvl_6_id.setText(String.valueOf(checkByLvlCards.getCpcost_lvl_6()));
        cri_lvl_6_id.setText(checkByLvlCards.getCri_lvl_6() + ".00%");
        pow_lvl_6_id.setText(String.valueOf(checkByLvlCards.getPow_lvl_6()));

        rt_lvl_7_id.setText(String.valueOf(checkByLvlCards.getRt_lvl_7()));
        cpcost_lvl_7_id.setText(String.valueOf(checkByLvlCards.getCpcost_lvl_7()));
        cri_lvl_7_id.setText(checkByLvlCards.getCri_lvl_7() + ".00%");
        pow_lvl_7_id.setText(String.valueOf(checkByLvlCards.getPow_lvl_7()));

        rt_lvl_8_id.setText(String.valueOf(checkByLvlCards.getRt_lvl_8()));
        cpcost_lvl_8_id.setText(String.valueOf(checkByLvlCards.getCpcost_lvl_8()));
        cri_lvl_8_id.setText(checkByLvlCards.getCri_lvl_8() + ".00%");
        pow_lvl_8_id.setText(String.valueOf(checkByLvlCards.getPow_lvl_8()));

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

        JutsuCards jutsuCards = new JutsuCards("Ninjutsu", "Skill", 6, "Lunge", checkByLvlCards.getCpcost_lvl_8(), checkByLvlCards.getCri_lvl_8(), checkByLvlCards.getPow_lvl_8(), checkByLvlCards.getRt_lvl_8());

        type_id.setText(jutsuCards.getType());

        card_id.setText(String.valueOf(jutsuCards.getCategory()));
        lvl_card_id.setText(jutsuCards.getLvlCard());

        hp_value_id.setText(String.valueOf(jutsuCards.getHp()));
        cp_value_id.setText(String.valueOf(jutsuCards.getCp()));
        atk_value_id.setText(String.valueOf(jutsuCards.getAtk()));
        def_value_id.setText(String.valueOf(jutsuCards.getDef()));
        cri_value_id.setText(jutsuCards.getCri() + "0%");
        eva_value_id.setText(jutsuCards.getEva() + "0%");

        nature_id.setText(jutsuCards.getNature());
        ninjutsu_lvl_value_id.setText(jutsuCards.getLvlJutsu());
        cpcost_value_id.setText(String.valueOf(jutsuCards.getCpcost()));
        cri_jutsu_value_id.setText(jutsuCards.getCriJutsu() + ".00%");
        pow_jutsu_value_id.setText(String.valueOf(jutsuCards.getPow()));
        rt_value_id.setText(String.valueOf(jutsuCards.getRt()));

        type_image_id.setImageDrawable(res.getDrawable(jutsuCards.getTypeImage()));
        rank_image_id.setImageDrawable(res.getDrawable(jutsuCards.getRank()));
        nature_image_id.setImageDrawable(res.getDrawable(jutsuCards.getNatureImage()));
    }
}