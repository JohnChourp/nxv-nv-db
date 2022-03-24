package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
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

        SetParamsForCharThumb setParams = new SetParamsForCharThumb();
        LinearLayout charactersLinearLayout = findViewById(R.id.charactersLinearLayout);
        int plus16 = (int) getResources().getDimension(R.dimen.plus16);
        int plus96 = (int) getResources().getDimension(R.dimen.plus96);
        int plus192 = (int) getResources().getDimension(R.dimen.plus192);
        int plus288 = (int) getResources().getDimension(R.dimen.plus288);
        int minus80 = (int) getResources().getDimension(R.dimen.minus80);
        int minus176 = (int) getResources().getDimension(R.dimen.minus176);
        int minus272 = (int) getResources().getDimension(R.dimen.minus272);
        int minus368 = (int) getResources().getDimension(R.dimen.minus368);
        int minus464 = (int) getResources().getDimension(R.dimen.minus464);

        ImageView naruto_uzumaki_Id = findViewById(R.id.naruto_uzumaki_Id);
        ImageView sasuke_uchiha_Id = findViewById(R.id.sasuke_uchiha_Id);
        ImageView sakura_haruno_Id = findViewById(R.id.sakura_haruno_Id);
        ImageView kakashi_hatake_Id = findViewById(R.id.kakashi_hatake_Id);
        ImageView hinata_hyuga_id = findViewById(R.id.hinata_hyuga_id);
        ImageView gaara_id = findViewById(R.id.gaara_id);
        ImageView kisame_hoshigaki_id = findViewById(R.id.kisame_hoshigaki_id);
        ImageView rock_lee_id = findViewById(R.id.rock_lee_id);
        ImageView boruto_uzumaki_id = findViewById(R.id.boruto_uzumaki_id);
        ImageView konohamaru_sarutobi_id = findViewById(R.id.konohamaru_sarutobi_id);
        ImageView kankuro_id = findViewById(R.id.kankuro_id);
        ImageView ino_yamanaka_id = findViewById(R.id.ino_yamanaka_id);
        ImageView choji_akimichi_id = findViewById(R.id.choji_akimichi_id);
        ImageView kiba_inuzuka_id = findViewById(R.id.kiba_inuzuka_id);
        ImageView shino_aburame_id = findViewById(R.id.shino_aburame_id);
        ImageView tenten_id = findViewById(R.id.tenten_id);
        ImageView temari_id = findViewById(R.id.temari_id);
        ImageView shizune_id = findViewById(R.id.shizune_id);
        ImageView asuma_sarutobi_id = findViewById(R.id.asuma_sarutobi_id);
        ImageView sarada_uchiha_id = findViewById(R.id.sarada_uchiha_id);
        ImageView might_guy_id = findViewById(R.id.might_guy_id);
        ImageView neji_hyuga_id = findViewById(R.id.neji_hyuga_id);
        ImageView deidara_id = findViewById(R.id.deidara_id);
        ImageView haku_id = findViewById(R.id.haku_id);
        ImageView itachi_uchiha_id = findViewById(R.id.itachi_uchiha_id);
        ImageView orochimaru_id = findViewById(R.id.orochimaru_id);
        ImageView sasori_id = findViewById(R.id.sasori_id);
        ImageView tobi_id = findViewById(R.id.tobi_id);
        ImageView shikamaru_nara_id = findViewById(R.id.shikamaru_nara_id);
        ImageView zabuza_momochi_id = findViewById(R.id.zabuza_momochi_id);
        ImageView tsunade_id = findViewById(R.id.tsunade_id);
        ImageView sai_id = findViewById(R.id.sai_id);
        ImageView minato_namikaze_id = findViewById(R.id.minato_namikaze_id);
        ImageView hidan_id = findViewById(R.id.hidan_id);
        ImageView kakuzu_id = findViewById(R.id.kakuzu_id);
        ImageView jiraiya_id = findViewById(R.id.jiraiya_id);
        ImageView mitsuki_id = findViewById(R.id.mitsuki_id);
        ImageView boruto_uzumaki__genin__id = findViewById(R.id.boruto_uzumaki__genin__id);
        ImageView yamato_id = findViewById(R.id.yamato_id);
        ImageView sarada_uchiha__genin__id = findViewById(R.id.sarada_uchiha__genin__id);
        ImageView itachi_uchiha__vs_sasuke__id = findViewById(R.id.itachi_uchiha__vs_sasuke__id);
        ImageView suigetsu_hozuki_id = findViewById(R.id.suigetsu_hozuki_id);
        ImageView jugo_id = findViewById(R.id.jugo_id);
        ImageView karin_id = findViewById(R.id.karin_id);
        ImageView sasuke_uchiha__vs_itachi__id = findViewById(R.id.sasuke_uchiha__vs_itachi__id);
        ImageView naruto_uzumaki__7th_hokage__id = findViewById(R.id.naruto_uzumaki__7th_hokage__id);
        ImageView hanabi_hyuga_id = findViewById(R.id.hanabi_hyuga_id);
        ImageView sasuke_uchiha__wandering_ninja__id = findViewById(R.id.sasuke_uchiha__wandering_ninja__id);
        ImageView pain__tendo_id = findViewById(R.id.pain__tendo_id);
        ImageView konan_id = findViewById(R.id.konan_id);
        ImageView naruto_uzumaki__sage_mode__id = findViewById(R.id.naruto_uzumaki__sage_mode__id);
        ImageView hiruzen_sarutobi_id = findViewById(R.id.hiruzen_sarutobi_id);
        ImageView tobirama_senju_id = findViewById(R.id.tobirama_senju_id);
        ImageView hashirama_senju_id = findViewById(R.id.hashirama_senju_id);
        ImageView madara_uchiha_id = findViewById(R.id.madara_uchiha_id);
        ImageView obito_uchiha_id = findViewById(R.id.obito_uchiha_id);
        ImageView kakashi_hatake__double_sharingan__id = findViewById(R.id.kakashi_hatake__double_sharingan__id);
        ImageView killer_bee_id = findViewById(R.id.killer_bee_id);
        ImageView shisui_uchiha_id = findViewById(R.id.shisui_uchiha_id);
        ImageView kabuto_yakushi__snake_cloak__id = findViewById(R.id.kabuto_yakushi__snake_cloak__id);
        ImageView sasuke_uchiha__eternal_mangekyo_sharingan__id = findViewById(R.id.sasuke_uchiha__eternal_mangekyo_sharingan__id);
        ImageView naruto_uzumaki__kurama_link_mode__id = findViewById(R.id.naruto_uzumaki__kurama_link_mode__id);
        ImageView ohnoki_id = findViewById(R.id.ohnoki_id);
        ImageView danzo_shimura_id = findViewById(R.id.danzo_shimura_id);
        ImageView darui_id = findViewById(R.id.darui_id);
        ImageView rin_nohara_id = findViewById(R.id.rin_nohara_id);
        ImageView minato_namikaze__reanimation__id = findViewById(R.id.minato_namikaze__reanimation__id);
        ImageView naruto_uzumaki__six_paths_sage_mode__id = findViewById(R.id.naruto_uzumaki__six_paths_sage_mode__id);
        ImageView sasuke_uchiha__rinne_sharingan__id = findViewById(R.id.sasuke_uchiha__rinne_sharingan__id);
        ImageView obito_uchiha__ten_tails_jinchuriki__id = findViewById(R.id.obito_uchiha__ten_tails_jinchuriki__id);
        ImageView gaara__allied_shinobi_forces_commander__id = findViewById(R.id.gaara__allied_shinobi_forces_commander__id);
        ImageView itachi_uchiha__reanimation__id = findViewById(R.id.itachi_uchiha__reanimation__id);
        ImageView naruto_uzumaki__nine_tails_chakra_mode__id = findViewById(R.id.naruto_uzumaki__nine_tails_chakra_mode__id);
        ImageView sasuke_uchiha__hebi__id = findViewById(R.id.sasuke_uchiha__hebi__id);
        ImageView nagato__reanimation__id = findViewById(R.id.nagato__reanimation__id);
        ImageView tsunade__great_ninja_war__id = findViewById(R.id.tsunade__great_ninja_war__id);
        ImageView indra_otsutsuki_id = findViewById(R.id.indra_otsutsuki_id);
        ImageView raikage_ay_id = findViewById(R.id.raikage_ay_id);
        ImageView mei_terumi_id = findViewById(R.id.mei_terumi_id);
        ImageView ashura_otsutsuki_id = findViewById(R.id.ashura_otsutsuki_id);
        ImageView kimimaro__reanimation__id = findViewById(R.id.kimimaro__reanimation__id);
        ImageView madara_uchiha__reanimation__id = findViewById(R.id.madara_uchiha__reanimation__id);
        ImageView hinata_hyuga__summer_break__id = findViewById(R.id.hinata_hyuga__summer_break__id);
        ImageView sakura_haruno__summer_break__id = findViewById(R.id.sakura_haruno__summer_break__id);
        ImageView minato_namikaze__reanimation_kurama_link_mode__id = findViewById(R.id.minato_namikaze__reanimation_kurama_link_mode__id);
        ImageView kinkaku__reanimation__id = findViewById(R.id.kinkaku__reanimation__id);
        ImageView utakata__reanimation__id = findViewById(R.id.utakata__reanimation__id);
        ImageView madara_uchiha__six_paths__id = findViewById(R.id.madara_uchiha__six_paths__id);
        ImageView madara_uchiha__white_mask__id = findViewById(R.id.madara_uchiha__white_mask__id);
        ImageView hashirama_senju__reanimation_sage_mode__id = findViewById(R.id.hashirama_senju__reanimation_sage_mode__id);
        ImageView sakura_haruno__great_ninja_war__id = findViewById(R.id.sakura_haruno__great_ninja_war__id);
        ImageView sasuke_uchiha__rinne_sharingan_shadow__id = findViewById(R.id.sasuke_uchiha__rinne_sharingan_shadow__id);
        ImageView naruto_uzumaki__six_paths_sage_mode_light__id = findViewById(R.id.naruto_uzumaki__six_paths_sage_mode_light__id);
        ImageView kabuto_yakushi__sage_mode__id = findViewById(R.id.kabuto_yakushi__sage_mode__id);
        ImageView might_guy__eight_inner_gates__id = findViewById(R.id.might_guy__eight_inner_gates__id);
        ImageView kaguya_otsutsuki_id = findViewById(R.id.kaguya_otsutsuki_id);
        ImageView sakura_uchiha__new_year_s_games__id = findViewById(R.id.sakura_uchiha__new_year_s_games__id);
        ImageView shikamaru_nara__bestowed_outfit__id = findViewById(R.id.shikamaru_nara__bestowed_outfit__id);
        ImageView naruto_uzumaki__warrior_spirit__id = findViewById(R.id.naruto_uzumaki__warrior_spirit__id);
        ImageView jiraiya__warrior_spirit__id = findViewById(R.id.jiraiya__warrior_spirit__id);
        ImageView boruto_uzumaki__warrior_spirit__id = findViewById(R.id.boruto_uzumaki__warrior_spirit__id);
        ImageView sasuke_uchiha__warrior_spirit__id = findViewById(R.id.sasuke_uchiha__warrior_spirit__id);
        ImageView konan__summer_break__id = findViewById(R.id.konan__summer_break__id);
        ImageView obito_uchiha__illusionary_world_outfit__id = findViewById(R.id.obito_uchiha__illusionary_world_outfit__id);
        ImageView sasuke_uchiha__illusionary_world_outfit__id = findViewById(R.id.sasuke_uchiha__illusionary_world_outfit__id);
        ImageView madara_uchiha__illusionary_world_outfit__thumb_id = findViewById(R.id.madara_uchiha__illusionary_world_outfit__thumb_id);
        ImageView itachi_uchiha__illusionary_world_outfit__thumb_id = findViewById(R.id.itachi_uchiha__illusionary_world_outfit__thumb_id);
        ImageView naruto_uzumaki__the_final_showdown__thumb_id = findViewById(R.id.naruto_uzumaki__the_final_showdown__thumb_id);
        ImageView sasuke_uchiha__the_final_showdown__thumb_id = findViewById(R.id.sasuke_uchiha__the_final_showdown__thumb_id);
        ImageView kakashi_hatake__sixth_hokage__thumb_id = findViewById(R.id.kakashi_hatake__sixth_hokage__thumb_id);
        ImageView boruto_uzumaki__karma__thumb_id = findViewById(R.id.boruto_uzumaki__karma__thumb_id);
        ImageView kawaki_thumb_id = findViewById(R.id.kawaki_thumb_id);
        ImageView itachi_uchiha__anbu__thumb_id = findViewById(R.id.itachi_uchiha__anbu__thumb_id);
        ImageView kushina_uzumaki_thumb_id = findViewById(R.id.kushina_uzumaki_thumb_id);
        ImageView sakura_uchiha_thumb_id = findViewById(R.id.sakura_uchiha_thumb_id);

        ViewGroup.LayoutParams params = charactersLinearLayout.getLayoutParams();
        int defaultLayoutParamHeight = params.height;

        Button btn_show_all = findViewById(R.id.btn_show_all);
        ImageButton btn_attack = findViewById(R.id.btn_attack);
        ImageButton btn_assist = findViewById(R.id.btn_assist);
        ImageButton btn_defense = findViewById(R.id.btn_defense);
        ImageButton btn_skill = findViewById(R.id.btn_skill);
        ImageButton btn_utility = findViewById(R.id.btn_utility);

        btn_show_all.setOnClickListener(view -> {
            params.height = defaultLayoutParamHeight;
            charactersLinearLayout.setLayoutParams(params);

            for (int i = 0; i < charactersLinearLayout.getChildCount(); i++) {
                charactersLinearLayout.getChildAt(i).setVisibility(ImageView.VISIBLE);
            }
            attackDefault(plus16, plus96, plus192, plus288, minus80, boruto_uzumaki_id, choji_akimichi_id, kiba_inuzuka_id, temari_id, might_guy_id, deidara_id, hidan_id, suigetsu_hozuki_id, killer_bee_id, darui_id, minato_namikaze__reanimation__id, obito_uchiha__ten_tails_jinchuriki__id, naruto_uzumaki__nine_tails_chakra_mode__id, sasuke_uchiha__hebi__id, tsunade__great_ninja_war__id, kimimaro__reanimation__id, kinkaku__reanimation__id, madara_uchiha__six_paths__id, sakura_uchiha__new_year_s_games__id, madara_uchiha__illusionary_world_outfit__thumb_id, itachi_uchiha__illusionary_world_outfit__thumb_id, sasuke_uchiha__the_final_showdown__thumb_id);
            assistDefault(plus16, plus96, plus192, plus288, minus80, sakura_haruno_Id, hinata_hyuga_id, ino_yamanaka_id, shizune_id, haku_id, tsunade_id, sarada_uchiha__genin__id, karin_id, hanabi_hyuga_id, shisui_uchiha_id, naruto_uzumaki__kurama_link_mode__id, ohnoki_id, rin_nohara_id, sasuke_uchiha__rinne_sharingan__id, ashura_otsutsuki_id, hashirama_senju__reanimation_sage_mode__id, sakura_haruno__great_ninja_war__id, kaguya_otsutsuki_id, konan__summer_break__id, kakashi_hatake__sixth_hokage__thumb_id, kushina_uzumaki_thumb_id, sakura_uchiha_thumb_id);
        });

        btn_attack.setOnClickListener(view -> {
            assistDefault(plus16, plus96, plus192, plus288, minus80, sakura_haruno_Id, hinata_hyuga_id, ino_yamanaka_id, shizune_id, haku_id, tsunade_id, sarada_uchiha__genin__id, karin_id, hanabi_hyuga_id, shisui_uchiha_id, naruto_uzumaki__kurama_link_mode__id, ohnoki_id, rin_nohara_id, sasuke_uchiha__rinne_sharingan__id, ashura_otsutsuki_id, hashirama_senju__reanimation_sage_mode__id, sakura_haruno__great_ninja_war__id, kaguya_otsutsuki_id, konan__summer_break__id, kakashi_hatake__sixth_hokage__thumb_id, kushina_uzumaki_thumb_id, sakura_uchiha_thumb_id);
            params.height = 1800;
            charactersLinearLayout.setLayoutParams(params);

            for (int i = 0; i < charactersLinearLayout.getChildCount(); i++) {
                charactersLinearLayout.getChildAt(i).setVisibility(ImageView.INVISIBLE);
            }
            naruto_uzumaki_Id.setVisibility(ImageView.VISIBLE);
            sasuke_uchiha_Id.setVisibility(ImageView.VISIBLE);

            setParams.setImageId(boruto_uzumaki_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus176, 0, 0);

            setParams.setImageId(choji_akimichi_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

            setParams.setImageId(kiba_inuzuka_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

            setParams.setImageId(temari_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

            setParams.setImageId(might_guy_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

            setParams.setImageId(deidara_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

            setParams.setImageId(hidan_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus272, 0, 0);

            setParams.setImageId(suigetsu_hozuki_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus272, 0, 0);

            setParams.setImageId(killer_bee_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus464, 0, 0);

            kabuto_yakushi__snake_cloak__id.setVisibility(ImageView.VISIBLE);

            setParams.setImageId(darui_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus80, 0, 0);

            setParams.setImageId(minato_namikaze__reanimation__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

            setParams.setImageId(obito_uchiha__ten_tails_jinchuriki__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus176, 0, 0);

            setParams.setImageId(naruto_uzumaki__nine_tails_chakra_mode__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

            setParams.setImageId(sasuke_uchiha__hebi__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

            setParams.setImageId(tsunade__great_ninja_war__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

            setParams.setImageId(kimimaro__reanimation__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus176, 0, 0);

            setParams.setImageId(kinkaku__reanimation__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus176, 0, 0);

            setParams.setImageId(madara_uchiha__six_paths__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

            setParams.setImageId(sakura_uchiha__new_year_s_games__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus272, 0, 0);

            setParams.setImageId(madara_uchiha__illusionary_world_outfit__thumb_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus272, 0, 0);

            setParams.setImageId(itachi_uchiha__illusionary_world_outfit__thumb_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

            setParams.setImageId(sasuke_uchiha__the_final_showdown__thumb_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, plus16, 0, 0);
        });

        btn_assist.setOnClickListener(view -> {
            attackDefault(plus16, plus96, plus192, plus288, minus80, boruto_uzumaki_id, choji_akimichi_id, kiba_inuzuka_id, temari_id, might_guy_id, deidara_id, hidan_id, suigetsu_hozuki_id, killer_bee_id, darui_id, minato_namikaze__reanimation__id, obito_uchiha__ten_tails_jinchuriki__id, naruto_uzumaki__nine_tails_chakra_mode__id, sasuke_uchiha__hebi__id, tsunade__great_ninja_war__id, kimimaro__reanimation__id, kinkaku__reanimation__id, madara_uchiha__six_paths__id, sakura_uchiha__new_year_s_games__id, madara_uchiha__illusionary_world_outfit__thumb_id, itachi_uchiha__illusionary_world_outfit__thumb_id, sasuke_uchiha__the_final_showdown__thumb_id);
            params.height = 1500;
            charactersLinearLayout.setLayoutParams(params);

            for (int i = 0; i < charactersLinearLayout.getChildCount(); i++) {
                charactersLinearLayout.getChildAt(i).setVisibility(ImageView.INVISIBLE);
            }
            setParams.setImageId(sakura_haruno_Id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus80, 0, 0);

            setParams.setImageId(hinata_hyuga_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

            setParams.setImageId(ino_yamanaka_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus176, 0, 0);

            setParams.setImageId(shizune_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus272, 0, 0);

            setParams.setImageId(haku_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus80, 0, 0);

            setParams.setImageId(tsunade_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus272, 0, 0);

            setParams.setImageId(sarada_uchiha__genin__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus272, 0, 0);

            setParams.setImageId(karin_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus176, 0, 0);

            setParams.setImageId(hanabi_hyuga_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus80, 0, 0);

            setParams.setImageId(shisui_uchiha_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus368, 0, 0);

            setParams.setImageId(naruto_uzumaki__kurama_link_mode__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus176, 0, 0);

            setParams.setImageId(ohnoki_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

            setParams.setImageId(rin_nohara_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus80, 0, 0);

            setParams.setImageId(sasuke_uchiha__rinne_sharingan__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

            setParams.setImageId(ashura_otsutsuki_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus272, 0, 0);

            setParams.setImageId(hashirama_senju__reanimation_sage_mode__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus368, 0, 0);

            setParams.setImageId(sakura_haruno__great_ninja_war__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

            setParams.setImageId(kaguya_otsutsuki_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus176, 0, 0);

            setParams.setImageId(konan__summer_break__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus272, 0, 0);

            setParams.setImageId(kakashi_hatake__sixth_hokage__thumb_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus272, 0, 0);

            setParams.setImageId(kushina_uzumaki_thumb_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus80, 0, 0);

            setParams.setImageId(sakura_uchiha_thumb_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);
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

    private void assistDefault(int plus16, int plus96, int plus192, int plus288, int minus80, ImageView sakura_haruno_Id, ImageView hinata_hyuga_id, ImageView ino_yamanaka_id, ImageView shizune_id, ImageView haku_id, ImageView tsunade_id, ImageView sarada_uchiha__genin__id, ImageView karin_id, ImageView hanabi_hyuga_id, ImageView shisui_uchiha_id, ImageView naruto_uzumaki__kurama_link_mode__id, ImageView ohnoki_id, ImageView rin_nohara_id, ImageView sasuke_uchiha__rinne_sharingan__id, ImageView ashura_otsutsuki_id, ImageView hashirama_senju__reanimation_sage_mode__id, ImageView sakura_haruno__great_ninja_war__id, ImageView kaguya_otsutsuki_id, ImageView konan__summer_break__id, ImageView kakashi_hatake__sixth_hokage__thumb_id, ImageView kushina_uzumaki_thumb_id, ImageView sakura_uchiha_thumb_id) {
        //assist
        sakura_haruno_Id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams sakura_haruno_Id_Params = (LinearLayout.LayoutParams) sakura_haruno_Id.getLayoutParams();
        sakura_haruno_Id_Params.setMargins(plus192, minus80, 0, 0);
        sakura_haruno_Id.setLayoutParams(sakura_haruno_Id_Params);

        hinata_hyuga_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams hinata_hyuga_id_Params = (LinearLayout.LayoutParams) hinata_hyuga_id.getLayoutParams();
        hinata_hyuga_id_Params.setMargins(0, plus16, 0, 0);
        hinata_hyuga_id.setLayoutParams(hinata_hyuga_id_Params);

        ino_yamanaka_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams ino_yamanaka_id_Params = (LinearLayout.LayoutParams) ino_yamanaka_id.getLayoutParams();
        ino_yamanaka_id_Params.setMargins(plus288, minus80, 0, 0);
        ino_yamanaka_id.setLayoutParams(ino_yamanaka_id_Params);

        shizune_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams shizune_id_Params = (LinearLayout.LayoutParams) shizune_id.getLayoutParams();
        shizune_id_Params.setMargins(plus96, minus80, 0, 0);
        shizune_id.setLayoutParams(shizune_id_Params);

        haku_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams haku_id_Params = (LinearLayout.LayoutParams) haku_id.getLayoutParams();
        haku_id_Params.setMargins(plus288, minus80, 0, 0);
        haku_id.setLayoutParams(haku_id_Params);

        tsunade_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams tsunade_id_Params = (LinearLayout.LayoutParams) tsunade_id.getLayoutParams();
        tsunade_id_Params.setMargins(plus192, minus80, 0, 0);
        tsunade_id.setLayoutParams(tsunade_id_Params);

        sarada_uchiha__genin__id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams sarada_uchiha__genin__id_Params = (LinearLayout.LayoutParams) sarada_uchiha__genin__id.getLayoutParams();
        sarada_uchiha__genin__id_Params.setMargins(plus288, minus80, 0, 0);
        sarada_uchiha__genin__id.setLayoutParams(sarada_uchiha__genin__id_Params);

        karin_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams karin_id_Params = (LinearLayout.LayoutParams) karin_id.getLayoutParams();
        karin_id_Params.setMargins(plus288, minus80, 0, 0);
        karin_id.setLayoutParams(karin_id_Params);

        hanabi_hyuga_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams hanabi_hyuga_id_Params = (LinearLayout.LayoutParams) hanabi_hyuga_id.getLayoutParams();
        hanabi_hyuga_id_Params.setMargins(plus192, minus80, 0, 0);
        hanabi_hyuga_id.setLayoutParams(hanabi_hyuga_id_Params);

        shisui_uchiha_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams shisui_uchiha_id_Params = (LinearLayout.LayoutParams) shisui_uchiha_id.getLayoutParams();
        shisui_uchiha_id_Params.setMargins(plus192, minus80, 0, 0);
        shisui_uchiha_id.setLayoutParams(shisui_uchiha_id_Params);

        naruto_uzumaki__kurama_link_mode__id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams naruto_uzumaki__kurama_link_mode__id_Params = (LinearLayout.LayoutParams) naruto_uzumaki__kurama_link_mode__id.getLayoutParams();
        naruto_uzumaki__kurama_link_mode__id_Params.setMargins(plus96, minus80, 0, 0);
        naruto_uzumaki__kurama_link_mode__id.setLayoutParams(naruto_uzumaki__kurama_link_mode__id_Params);

        ohnoki_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams ohnoki_id_Params = (LinearLayout.LayoutParams) ohnoki_id.getLayoutParams();
        ohnoki_id_Params.setMargins(plus192, minus80, 0, 0);
        ohnoki_id.setLayoutParams(ohnoki_id_Params);

        rin_nohara_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams rin_nohara_id_Params = (LinearLayout.LayoutParams) rin_nohara_id.getLayoutParams();
        rin_nohara_id_Params.setMargins(plus96, minus80, 0, 0);
        rin_nohara_id.setLayoutParams(rin_nohara_id_Params);

        sasuke_uchiha__rinne_sharingan__id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams sasuke_uchiha__rinne_sharingan__id_Params = (LinearLayout.LayoutParams) sasuke_uchiha__rinne_sharingan__id.getLayoutParams();
        sasuke_uchiha__rinne_sharingan__id_Params.setMargins(0, plus16, 0, 0);
        sasuke_uchiha__rinne_sharingan__id.setLayoutParams(sasuke_uchiha__rinne_sharingan__id_Params);

        ashura_otsutsuki_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams ashura_otsutsuki_id_Params = (LinearLayout.LayoutParams) ashura_otsutsuki_id.getLayoutParams();
        ashura_otsutsuki_id_Params.setMargins(plus288, minus80, 0, 0);
        ashura_otsutsuki_id.setLayoutParams(ashura_otsutsuki_id_Params);

        hashirama_senju__reanimation_sage_mode__id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams hashirama_senju__reanimation_sage_mode__id_Params = (LinearLayout.LayoutParams) hashirama_senju__reanimation_sage_mode__id.getLayoutParams();
        hashirama_senju__reanimation_sage_mode__id_Params.setMargins(plus96, minus80, 0, 0);
        hashirama_senju__reanimation_sage_mode__id.setLayoutParams(hashirama_senju__reanimation_sage_mode__id_Params);

        sakura_haruno__great_ninja_war__id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams sakura_haruno__great_ninja_war__id_Params = (LinearLayout.LayoutParams) sakura_haruno__great_ninja_war__id.getLayoutParams();
        sakura_haruno__great_ninja_war__id_Params.setMargins(plus192, minus80, 0, 0);
        sakura_haruno__great_ninja_war__id.setLayoutParams(sakura_haruno__great_ninja_war__id_Params);

        kaguya_otsutsuki_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams kaguya_otsutsuki_id_Params = (LinearLayout.LayoutParams) kaguya_otsutsuki_id.getLayoutParams();
        kaguya_otsutsuki_id_Params.setMargins(plus288, minus80, 0, 0);
        kaguya_otsutsuki_id.setLayoutParams(kaguya_otsutsuki_id_Params);

        konan__summer_break__id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams konan__summer_break__id_Params = (LinearLayout.LayoutParams) konan__summer_break__id.getLayoutParams();
        konan__summer_break__id_Params.setMargins(plus192, minus80, 0, 0);
        konan__summer_break__id.setLayoutParams(konan__summer_break__id_Params);

        kakashi_hatake__sixth_hokage__thumb_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams kakashi_hatake__sixth_hokage__thumb_id_Params = (LinearLayout.LayoutParams) kakashi_hatake__sixth_hokage__thumb_id.getLayoutParams();
        kakashi_hatake__sixth_hokage__thumb_id_Params.setMargins(plus96, minus80, 0, 0);
        kakashi_hatake__sixth_hokage__thumb_id.setLayoutParams(kakashi_hatake__sixth_hokage__thumb_id_Params);

        kushina_uzumaki_thumb_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams kushina_uzumaki_thumb_id_Params = (LinearLayout.LayoutParams) kushina_uzumaki_thumb_id.getLayoutParams();
        kushina_uzumaki_thumb_id_Params.setMargins(plus96, minus80, 0, 0);
        kushina_uzumaki_thumb_id.setLayoutParams(kushina_uzumaki_thumb_id_Params);

        sakura_uchiha_thumb_id.setVisibility(ImageView.VISIBLE);
        LinearLayout.LayoutParams sakura_uchiha_thumb_id_Params = (LinearLayout.LayoutParams) sakura_uchiha_thumb_id.getLayoutParams();
        sakura_uchiha_thumb_id_Params.setMargins(plus192, minus80, 0, 0);
        sakura_uchiha_thumb_id.setLayoutParams(sakura_uchiha_thumb_id_Params);
        //assist
    }

    private void attackDefault(int plus16, int plus96, int plus192, int plus288, int minus80, ImageView boruto_uzumaki_id, ImageView choji_akimichi_id, ImageView kiba_inuzuka_id, ImageView temari_id, ImageView might_guy_id, ImageView deidara_id, ImageView hidan_id, ImageView suigetsu_hozuki_id, ImageView killer_bee_id, ImageView darui_id, ImageView minato_namikaze__reanimation__id, ImageView obito_uchiha__ten_tails_jinchuriki__id, ImageView naruto_uzumaki__nine_tails_chakra_mode__id, ImageView sasuke_uchiha__hebi__id, ImageView tsunade__great_ninja_war__id, ImageView kimimaro__reanimation__id, ImageView kinkaku__reanimation__id, ImageView madara_uchiha__six_paths__id, ImageView sakura_uchiha__new_year_s_games__id, ImageView madara_uchiha__illusionary_world_outfit__thumb_id, ImageView itachi_uchiha__illusionary_world_outfit__thumb_id, ImageView sasuke_uchiha__the_final_showdown__thumb_id) {
        //attack
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
        //attack
    }

    private void openNarutoUzumaki() {
        Intent intent = new Intent(this, NarutoUzumaki.class);
        startActivity(intent);
    }
}