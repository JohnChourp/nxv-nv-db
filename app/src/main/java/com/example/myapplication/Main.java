package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.myapplication.characters.NarutoUzumaki;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout charactersLinearLayout = findViewById(R.id.charactersLinearLayout);
        int plus16 = (int) getResources().getDimension(R.dimen.plus16);
        int plus96 = (int) getResources().getDimension(R.dimen.plus96);
        int plus192 = (int) getResources().getDimension(R.dimen.plus192);
        int plus288 = (int) getResources().getDimension(R.dimen.plus288);
        int minus80 = (int) getResources().getDimension(R.dimen.minus80);
        int minus176 = (int) getResources().getDimension(R.dimen.minus176);
        int minus272 = (int) getResources().getDimension(R.dimen.minus272);
        int minus464 = (int) getResources().getDimension(R.dimen.minus464);

        ImageView naruto_uzumaki_Id = findViewById(R.id.naruto_uzumaki_Id);
        ImageView sasuke_uchiha_Id = findViewById(R.id.sasuke_uchiha_Id);
        ImageView boruto_uzumaki_id = findViewById(R.id.boruto_uzumaki_id);
        ImageView choji_akimichi_id = findViewById(R.id.choji_akimichi_id);
        ImageView kiba_inuzuka_id = findViewById(R.id.kiba_inuzuka_id);
        ImageView temari_id = findViewById(R.id.temari_id);
        ImageView might_guy_id = findViewById(R.id.might_guy_id);
        ImageView deidara_id = findViewById(R.id.deidara_id);
        ImageView hidan_id = findViewById(R.id.hidan_id);
        ImageView suigetsu_hozuki_id = findViewById(R.id.suigetsu_hozuki_id);
        ImageView killer_bee_id = findViewById(R.id.killer_bee_id);
        ImageView kabuto_yakushi__snake_cloak__id = findViewById(R.id.kabuto_yakushi__snake_cloak__id);
        ImageView darui_id = findViewById(R.id.darui_id);
        ImageView minato_namikaze__reanimation__id = findViewById(R.id.minato_namikaze__reanimation__id);
        ImageView obito_uchiha__ten_tails_jinchuriki__id = findViewById(R.id.obito_uchiha__ten_tails_jinchuriki__id);
        ImageView naruto_uzumaki__nine_tails_chakra_mode__id = findViewById(R.id.naruto_uzumaki__nine_tails_chakra_mode__id);
        ImageView sasuke_uchiha__hebi__id = findViewById(R.id.sasuke_uchiha__hebi__id);
        ImageView tsunade__great_ninja_war__id = findViewById(R.id.tsunade__great_ninja_war__id);
        ImageView kimimaro__reanimation__id = findViewById(R.id.kimimaro__reanimation__id);
        ImageView kinkaku__reanimation__id = findViewById(R.id.kinkaku__reanimation__id);
        ImageView madara_uchiha__six_paths__id = findViewById(R.id.madara_uchiha__six_paths__id);
        ImageView sakura_uchiha__new_year_s_games__id = findViewById(R.id.sakura_uchiha__new_year_s_games__id);
        ImageView madara_uchiha__illusionary_world_outfit__thumb_id = findViewById(R.id.madara_uchiha__illusionary_world_outfit__thumb_id);
        ImageView itachi_uchiha__illusionary_world_outfit__thumb_id = findViewById(R.id.itachi_uchiha__illusionary_world_outfit__thumb_id);
        ImageView sasuke_uchiha__the_final_showdown__thumb_id = findViewById(R.id.sasuke_uchiha__the_final_showdown__thumb_id);

        ViewGroup.LayoutParams params = charactersLinearLayout.getLayoutParams();
        int defaultLayoutParamHeight = params.height;

        ImageButton btn_attack = findViewById(R.id.btn_attack);
        ImageButton btn_assist = findViewById(R.id.btn_assist);
        ImageButton btn_defense = findViewById(R.id.btn_defense);
        ImageButton btn_skill = findViewById(R.id.btn_skill);
        ImageButton btn_utility = findViewById(R.id.btn_utility);
        Button btn_show_all = findViewById(R.id.btn_show_all);

        btn_show_all.setOnClickListener(view -> {
            params.height = defaultLayoutParamHeight;
            charactersLinearLayout.setLayoutParams(params);

            for (int i = 0; i < charactersLinearLayout.getChildCount(); i++) {
                charactersLinearLayout.getChildAt(i).setVisibility(ImageView.VISIBLE);
            }

            boruto_uzumaki_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams boruto_uzumaki_id_Params = (LinearLayout.LayoutParams) boruto_uzumaki_id.getLayoutParams();
            boruto_uzumaki_id_Params.setMargins(0, plus16, 0, 0);
            boruto_uzumaki_id.setLayoutParams(boruto_uzumaki_id_Params);

            choji_akimichi_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams choji_akimichi_id_Params = (LinearLayout.LayoutParams) choji_akimichi_id.getLayoutParams();
            choji_akimichi_id_Params.setMargins(0, plus16, 0, 0);
            choji_akimichi_id.setLayoutParams(choji_akimichi_id_Params);

            kiba_inuzuka_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams kiba_inuzuka_id_Params = (LinearLayout.LayoutParams) kiba_inuzuka_id.getLayoutParams();
            kiba_inuzuka_id_Params.setMargins(plus96, minus80, 0, 0);
            kiba_inuzuka_id.setLayoutParams(kiba_inuzuka_id_Params);

            temari_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams temari_id_Params = (LinearLayout.LayoutParams) temari_id.getLayoutParams();
            temari_id_Params.setMargins(0, plus16, 0, 0);
            temari_id.setLayoutParams(temari_id_Params);

            might_guy_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams might_guy_id_Params = (LinearLayout.LayoutParams) might_guy_id.getLayoutParams();
            might_guy_id_Params.setMargins(0, plus16, 0, 0);
            might_guy_id.setLayoutParams(might_guy_id_Params);

            deidara_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams deidara_id_Params = (LinearLayout.LayoutParams) deidara_id.getLayoutParams();
            deidara_id_Params.setMargins(plus192, minus80, 0, 0);
            deidara_id.setLayoutParams(deidara_id_Params);

            hidan_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams hidan_id_Params = (LinearLayout.LayoutParams) hidan_id.getLayoutParams();
            hidan_id_Params.setMargins(plus96, minus80, 0, 0);
            hidan_id.setLayoutParams(hidan_id_Params);

            suigetsu_hozuki_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams suigetsu_hozuki_id_Params = (LinearLayout.LayoutParams) suigetsu_hozuki_id.getLayoutParams();
            suigetsu_hozuki_id_Params.setMargins(plus96, minus80, 0, 0);
            suigetsu_hozuki_id.setLayoutParams(suigetsu_hozuki_id_Params);

            killer_bee_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams killer_bee_id_Params = (LinearLayout.LayoutParams) killer_bee_id.getLayoutParams();
            killer_bee_id_Params.setMargins(plus96, minus80, 0, 0);
            killer_bee_id.setLayoutParams(killer_bee_id_Params);

            darui_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams darui_id_Params = (LinearLayout.LayoutParams) darui_id.getLayoutParams();
            darui_id_Params.setMargins(0, plus16, 0, 0);
            darui_id.setLayoutParams(darui_id_Params);

            minato_namikaze__reanimation__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams minato_namikaze__reanimation__id_Params = (LinearLayout.LayoutParams) minato_namikaze__reanimation__id.getLayoutParams();
            minato_namikaze__reanimation__id_Params.setMargins(plus192, minus80, 0, 0);
            minato_namikaze__reanimation__id.setLayoutParams(minato_namikaze__reanimation__id_Params);

            obito_uchiha__ten_tails_jinchuriki__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams obito_uchiha__ten_tails_jinchuriki__id_Params = (LinearLayout.LayoutParams) obito_uchiha__ten_tails_jinchuriki__id.getLayoutParams();
            obito_uchiha__ten_tails_jinchuriki__id_Params.setMargins(plus96, minus80, 0, 0);
            obito_uchiha__ten_tails_jinchuriki__id.setLayoutParams(obito_uchiha__ten_tails_jinchuriki__id_Params);

            naruto_uzumaki__nine_tails_chakra_mode__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams naruto_uzumaki__nine_tails_chakra_mode__id_Params = (LinearLayout.LayoutParams) naruto_uzumaki__nine_tails_chakra_mode__id.getLayoutParams();
            naruto_uzumaki__nine_tails_chakra_mode__id_Params.setMargins(0, plus16, 0, 0);
            naruto_uzumaki__nine_tails_chakra_mode__id.setLayoutParams(naruto_uzumaki__nine_tails_chakra_mode__id_Params);

            sasuke_uchiha__hebi__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams sasuke_uchiha__hebi__id_Params = (LinearLayout.LayoutParams) sasuke_uchiha__hebi__id.getLayoutParams();
            sasuke_uchiha__hebi__id_Params.setMargins(plus96, minus80, 0, 0);
            sasuke_uchiha__hebi__id.setLayoutParams(sasuke_uchiha__hebi__id_Params);

            tsunade__great_ninja_war__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams tsunade__great_ninja_war__id_Params = (LinearLayout.LayoutParams) tsunade__great_ninja_war__id.getLayoutParams();
            tsunade__great_ninja_war__id_Params.setMargins(plus288, minus80, 0, 0);
            tsunade__great_ninja_war__id.setLayoutParams(tsunade__great_ninja_war__id_Params);

            kimimaro__reanimation__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams kimimaro__reanimation__id_Params = (LinearLayout.LayoutParams) kimimaro__reanimation__id.getLayoutParams();
            kimimaro__reanimation__id_Params.setMargins(0, plus16, 0, 0);
            kimimaro__reanimation__id.setLayoutParams(kimimaro__reanimation__id_Params);

            kinkaku__reanimation__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams kinkaku__reanimation__id_Params = (LinearLayout.LayoutParams) kinkaku__reanimation__id.getLayoutParams();
            kinkaku__reanimation__id_Params.setMargins(plus96, minus80, 0, 0);
            kinkaku__reanimation__id.setLayoutParams(kinkaku__reanimation__id_Params);

            madara_uchiha__six_paths__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams madara_uchiha__six_paths__id_Params = (LinearLayout.LayoutParams) madara_uchiha__six_paths__id.getLayoutParams();
            madara_uchiha__six_paths__id_Params.setMargins(plus288, minus80, 0, 0);
            madara_uchiha__six_paths__id.setLayoutParams(madara_uchiha__six_paths__id_Params);

            sakura_uchiha__new_year_s_games__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams sakura_uchiha__new_year_s_games__id_Params = (LinearLayout.LayoutParams) sakura_uchiha__new_year_s_games__id.getLayoutParams();
            sakura_uchiha__new_year_s_games__id_Params.setMargins(0, plus16, 0, 0);
            sakura_uchiha__new_year_s_games__id.setLayoutParams(sakura_uchiha__new_year_s_games__id_Params);

            madara_uchiha__illusionary_world_outfit__thumb_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams madara_uchiha__illusionary_world_outfit__thumb_id_Params = (LinearLayout.LayoutParams) madara_uchiha__illusionary_world_outfit__thumb_id.getLayoutParams();
            madara_uchiha__illusionary_world_outfit__thumb_id_Params.setMargins(plus96, minus80, 0, 0);
            madara_uchiha__illusionary_world_outfit__thumb_id.setLayoutParams(madara_uchiha__illusionary_world_outfit__thumb_id_Params);

            itachi_uchiha__illusionary_world_outfit__thumb_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams itachi_uchiha__illusionary_world_outfit__thumb_id_Params = (LinearLayout.LayoutParams) itachi_uchiha__illusionary_world_outfit__thumb_id.getLayoutParams();
            itachi_uchiha__illusionary_world_outfit__thumb_id_Params.setMargins(plus192, minus80, 0, 0);
            itachi_uchiha__illusionary_world_outfit__thumb_id.setLayoutParams(itachi_uchiha__illusionary_world_outfit__thumb_id_Params);

            sasuke_uchiha__the_final_showdown__thumb_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams sasuke_uchiha__the_final_showdown__thumb_id_Params = (LinearLayout.LayoutParams) sasuke_uchiha__the_final_showdown__thumb_id.getLayoutParams();
            sasuke_uchiha__the_final_showdown__thumb_id_Params.setMargins(0, plus16, 0, 0);
            sasuke_uchiha__the_final_showdown__thumb_id.setLayoutParams(sasuke_uchiha__the_final_showdown__thumb_id_Params);
        });

        btn_attack.setOnClickListener(view -> {
            params.height = 1800;
            charactersLinearLayout.setLayoutParams(params);

            for (int i = 0; i < charactersLinearLayout.getChildCount(); i++) {
                charactersLinearLayout.getChildAt(i).setVisibility(ImageView.INVISIBLE);
            }
            naruto_uzumaki_Id.setVisibility(ImageView.VISIBLE);
            sasuke_uchiha_Id.setVisibility(ImageView.VISIBLE);

            boruto_uzumaki_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams boruto_uzumaki_id_Params = (LinearLayout.LayoutParams) boruto_uzumaki_id.getLayoutParams();
            boruto_uzumaki_id_Params.setMargins(plus192, minus176, 0, 0);
            boruto_uzumaki_id.setLayoutParams(boruto_uzumaki_id_Params);

            choji_akimichi_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams choji_akimichi_id_Params = (LinearLayout.LayoutParams) choji_akimichi_id.getLayoutParams();
            choji_akimichi_id_Params.setMargins(plus288, minus80, 0, 0);
            choji_akimichi_id.setLayoutParams(choji_akimichi_id_Params);

            kiba_inuzuka_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams kiba_inuzuka_id_Params = (LinearLayout.LayoutParams) kiba_inuzuka_id.getLayoutParams();
            kiba_inuzuka_id_Params.setMargins(0, plus16, 0, 0);
            kiba_inuzuka_id.setLayoutParams(kiba_inuzuka_id_Params);

            temari_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams temari_id_Params = (LinearLayout.LayoutParams) temari_id.getLayoutParams();
            temari_id_Params.setMargins(plus96, minus80, 0, 0);
            temari_id.setLayoutParams(temari_id_Params);

            might_guy_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams might_guy_id_Params = (LinearLayout.LayoutParams) might_guy_id.getLayoutParams();
            might_guy_id_Params.setMargins(plus192, minus80, 0, 0);
            might_guy_id.setLayoutParams(might_guy_id_Params);

            deidara_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams deidara_id_Params = (LinearLayout.LayoutParams) deidara_id.getLayoutParams();
            deidara_id_Params.setMargins(plus288, minus80, 0, 0);
            deidara_id.setLayoutParams(deidara_id_Params);

            hidan_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams hidan_id_Params = (LinearLayout.LayoutParams) hidan_id.getLayoutParams();
            hidan_id_Params.setMargins(0, minus272, 0, 0);
            hidan_id.setLayoutParams(hidan_id_Params);

            suigetsu_hozuki_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams suigetsu_hozuki_id_Params = (LinearLayout.LayoutParams) suigetsu_hozuki_id.getLayoutParams();
            suigetsu_hozuki_id_Params.setMargins(plus96, minus272, 0, 0);
            suigetsu_hozuki_id.setLayoutParams(suigetsu_hozuki_id_Params);

            killer_bee_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams killer_bee_id_Params = (LinearLayout.LayoutParams) killer_bee_id.getLayoutParams();
            killer_bee_id_Params.setMargins(plus192, minus464, 0, 0);
            killer_bee_id.setLayoutParams(killer_bee_id_Params);

            kabuto_yakushi__snake_cloak__id.setVisibility(ImageView.VISIBLE);

            darui_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams darui_id_Params = (LinearLayout.LayoutParams) darui_id.getLayoutParams();
            darui_id_Params.setMargins(0, minus80, 0, 0);
            darui_id.setLayoutParams(darui_id_Params);

            minato_namikaze__reanimation__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams minato_namikaze__reanimation__id_Params = (LinearLayout.LayoutParams) minato_namikaze__reanimation__id.getLayoutParams();
            minato_namikaze__reanimation__id_Params.setMargins(plus96, minus80, 0, 0);
            minato_namikaze__reanimation__id.setLayoutParams(minato_namikaze__reanimation__id_Params);

            obito_uchiha__ten_tails_jinchuriki__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams obito_uchiha__ten_tails_jinchuriki__id_Params = (LinearLayout.LayoutParams) obito_uchiha__ten_tails_jinchuriki__id.getLayoutParams();
            obito_uchiha__ten_tails_jinchuriki__id_Params.setMargins(plus192, minus176, 0, 0);
            obito_uchiha__ten_tails_jinchuriki__id.setLayoutParams(obito_uchiha__ten_tails_jinchuriki__id_Params);

            naruto_uzumaki__nine_tails_chakra_mode__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams naruto_uzumaki__nine_tails_chakra_mode__id_Params = (LinearLayout.LayoutParams) naruto_uzumaki__nine_tails_chakra_mode__id.getLayoutParams();
            naruto_uzumaki__nine_tails_chakra_mode__id_Params.setMargins(plus288, minus80, 0, 0);
            naruto_uzumaki__nine_tails_chakra_mode__id.setLayoutParams(naruto_uzumaki__nine_tails_chakra_mode__id_Params);

            sasuke_uchiha__hebi__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams sasuke_uchiha__hebi__id_Params = (LinearLayout.LayoutParams) sasuke_uchiha__hebi__id.getLayoutParams();
            sasuke_uchiha__hebi__id_Params.setMargins(0, plus16, 0, 0);
            sasuke_uchiha__hebi__id.setLayoutParams(sasuke_uchiha__hebi__id_Params);

            tsunade__great_ninja_war__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams tsunade__great_ninja_war__id_Params = (LinearLayout.LayoutParams) tsunade__great_ninja_war__id.getLayoutParams();
            tsunade__great_ninja_war__id_Params.setMargins(plus96, minus80, 0, 0);
            tsunade__great_ninja_war__id.setLayoutParams(tsunade__great_ninja_war__id_Params);

            kimimaro__reanimation__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams kimimaro__reanimation__id_Params = (LinearLayout.LayoutParams) kimimaro__reanimation__id.getLayoutParams();
            kimimaro__reanimation__id_Params.setMargins(plus192, minus176, 0, 0);
            kimimaro__reanimation__id.setLayoutParams(kimimaro__reanimation__id_Params);

            kinkaku__reanimation__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams kinkaku__reanimation__id_Params = (LinearLayout.LayoutParams) kinkaku__reanimation__id.getLayoutParams();
            kinkaku__reanimation__id_Params.setMargins(plus288, minus176, 0, 0);
            kinkaku__reanimation__id.setLayoutParams(kinkaku__reanimation__id_Params);

            madara_uchiha__six_paths__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams madara_uchiha__six_paths__id_Params = (LinearLayout.LayoutParams) madara_uchiha__six_paths__id.getLayoutParams();
            madara_uchiha__six_paths__id_Params.setMargins(0, plus16, 0, 0);
            madara_uchiha__six_paths__id.setLayoutParams(madara_uchiha__six_paths__id_Params);

            sakura_uchiha__new_year_s_games__id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams sakura_uchiha__new_year_s_games__id_Params = (LinearLayout.LayoutParams) sakura_uchiha__new_year_s_games__id.getLayoutParams();
            sakura_uchiha__new_year_s_games__id_Params.setMargins(plus96, minus272, 0, 0);
            sakura_uchiha__new_year_s_games__id.setLayoutParams(sakura_uchiha__new_year_s_games__id_Params);

            madara_uchiha__illusionary_world_outfit__thumb_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams madara_uchiha__illusionary_world_outfit__thumb_id_Params = (LinearLayout.LayoutParams) madara_uchiha__illusionary_world_outfit__thumb_id.getLayoutParams();
            madara_uchiha__illusionary_world_outfit__thumb_id_Params.setMargins(plus192, minus272, 0, 0);
            madara_uchiha__illusionary_world_outfit__thumb_id.setLayoutParams(madara_uchiha__illusionary_world_outfit__thumb_id_Params);

            itachi_uchiha__illusionary_world_outfit__thumb_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams itachi_uchiha__illusionary_world_outfit__thumb_id_Params = (LinearLayout.LayoutParams) itachi_uchiha__illusionary_world_outfit__thumb_id.getLayoutParams();
            itachi_uchiha__illusionary_world_outfit__thumb_id_Params.setMargins(plus288, minus80, 0, 0);
            itachi_uchiha__illusionary_world_outfit__thumb_id.setLayoutParams(itachi_uchiha__illusionary_world_outfit__thumb_id_Params);

            sasuke_uchiha__the_final_showdown__thumb_id.setVisibility(ImageView.VISIBLE);
            LinearLayout.LayoutParams sasuke_uchiha__the_final_showdown__thumb_id_Params = (LinearLayout.LayoutParams) sasuke_uchiha__the_final_showdown__thumb_id.getLayoutParams();
            sasuke_uchiha__the_final_showdown__thumb_id_Params.setMargins(0, plus16, 0, 0);
            sasuke_uchiha__the_final_showdown__thumb_id.setLayoutParams(sasuke_uchiha__the_final_showdown__thumb_id_Params);
        });
//        //Setup anim
//        AlphaAnimation alphaAnimation = new AlphaAnimation(1, (float) 0.5);
//
//        //Setup anim with desired properties
//        alphaAnimation.setInterpolator(new LinearInterpolator());
//        alphaAnimation.setRepeatCount(Animation.INFINITE); //Repeat animation indefinitely
//        alphaAnimation.setDuration(1000); //Put desired duration per anim cycle here, in milliseconds
//
//        //Start animation
//        naruto_uzumaki.startAnimation(alphaAnimation);
//        //Later on, use view.setAnimation(null) to stop it.

        naruto_uzumaki_Id.setOnClickListener(v -> openNarutoUzumaki());
    }

    private void openNarutoUzumaki() {
        Intent intent = new Intent(this, NarutoUzumaki.class);
        startActivity(intent);
    }
}