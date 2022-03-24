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
            attackDefault(setParams, plus16, plus96, plus192, plus288, minus80, naruto_uzumaki_Id, sasuke_uchiha_Id, boruto_uzumaki_id, choji_akimichi_id, kiba_inuzuka_id, temari_id, might_guy_id, deidara_id, hidan_id, suigetsu_hozuki_id, killer_bee_id, kabuto_yakushi__snake_cloak__id, darui_id, minato_namikaze__reanimation__id, obito_uchiha__ten_tails_jinchuriki__id, naruto_uzumaki__nine_tails_chakra_mode__id, sasuke_uchiha__hebi__id, tsunade__great_ninja_war__id, kimimaro__reanimation__id, kinkaku__reanimation__id, madara_uchiha__six_paths__id, sakura_uchiha__new_year_s_games__id, madara_uchiha__illusionary_world_outfit__thumb_id, itachi_uchiha__illusionary_world_outfit__thumb_id, sasuke_uchiha__the_final_showdown__thumb_id);
            assistDefault(setParams, plus16, plus96, plus192, plus288, minus80, sakura_haruno_Id, hinata_hyuga_id, ino_yamanaka_id, shizune_id, haku_id, tsunade_id, sarada_uchiha__genin__id, karin_id, hanabi_hyuga_id, shisui_uchiha_id, naruto_uzumaki__kurama_link_mode__id, ohnoki_id, rin_nohara_id, sasuke_uchiha__rinne_sharingan__id, ashura_otsutsuki_id, hashirama_senju__reanimation_sage_mode__id, sakura_haruno__great_ninja_war__id, kaguya_otsutsuki_id, konan__summer_break__id, kakashi_hatake__sixth_hokage__thumb_id, kushina_uzumaki_thumb_id, sakura_uchiha_thumb_id);
            defenseDefault(setParams, plus16, plus96, plus192, plus288, minus80, gaara_id, kisame_hoshigaki_id, rock_lee_id, asuma_sarutobi_id, zabuza_momochi_id, kakuzu_id, jiraiya_id, itachi_uchiha__vs_sasuke__id, jugo_id, naruto_uzumaki__7th_hokage__id, tobirama_senju_id, hashirama_senju_id, sasuke_uchiha__eternal_mangekyo_sharingan__id, gaara__allied_shinobi_forces_commander__id, nagato__reanimation__id, sasuke_uchiha__rinne_sharingan_shadow__id, naruto_uzumaki__warrior_spirit__id, boruto_uzumaki__warrior_spirit__id, naruto_uzumaki__the_final_showdown__thumb_id, boruto_uzumaki__karma__thumb_id);

            params.height = defaultLayoutParamHeight;
            charactersLinearLayout.setLayoutParams(params);

            for (int i = 0; i < charactersLinearLayout.getChildCount(); i++) {
                charactersLinearLayout.getChildAt(i).setVisibility(ImageView.VISIBLE);
            }
        });

        btn_attack.setOnClickListener(view -> {
            assistDefault(setParams, plus16, plus96, plus192, plus288, minus80, sakura_haruno_Id, hinata_hyuga_id, ino_yamanaka_id, shizune_id, haku_id, tsunade_id, sarada_uchiha__genin__id, karin_id, hanabi_hyuga_id, shisui_uchiha_id, naruto_uzumaki__kurama_link_mode__id, ohnoki_id, rin_nohara_id, sasuke_uchiha__rinne_sharingan__id, ashura_otsutsuki_id, hashirama_senju__reanimation_sage_mode__id, sakura_haruno__great_ninja_war__id, kaguya_otsutsuki_id, konan__summer_break__id, kakashi_hatake__sixth_hokage__thumb_id, kushina_uzumaki_thumb_id, sakura_uchiha_thumb_id);
            defenseDefault(setParams, plus16, plus96, plus192, plus288, minus80, gaara_id, kisame_hoshigaki_id, rock_lee_id, asuma_sarutobi_id, zabuza_momochi_id, kakuzu_id, jiraiya_id, itachi_uchiha__vs_sasuke__id, jugo_id, naruto_uzumaki__7th_hokage__id, tobirama_senju_id, hashirama_senju_id, sasuke_uchiha__eternal_mangekyo_sharingan__id, gaara__allied_shinobi_forces_commander__id, nagato__reanimation__id, sasuke_uchiha__rinne_sharingan_shadow__id, naruto_uzumaki__warrior_spirit__id, boruto_uzumaki__warrior_spirit__id, naruto_uzumaki__the_final_showdown__thumb_id, boruto_uzumaki__karma__thumb_id);

            params.height = 1800;
            charactersLinearLayout.setLayoutParams(params);

            for (int i = 0; i < charactersLinearLayout.getChildCount(); i++) {
                charactersLinearLayout.getChildAt(i).setVisibility(ImageView.INVISIBLE);
            }

            setParams.setImageId(naruto_uzumaki_Id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, 0, 0, 0);

            setParams.setImageId(sasuke_uchiha_Id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

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

            setParams.setImageId(kabuto_yakushi__snake_cloak__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

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
            attackDefault(setParams, plus16, plus96, plus192, plus288, minus80, naruto_uzumaki_Id, sasuke_uchiha_Id, boruto_uzumaki_id, choji_akimichi_id, kiba_inuzuka_id, temari_id, might_guy_id, deidara_id, hidan_id, suigetsu_hozuki_id, killer_bee_id, kabuto_yakushi__snake_cloak__id, darui_id, minato_namikaze__reanimation__id, obito_uchiha__ten_tails_jinchuriki__id, naruto_uzumaki__nine_tails_chakra_mode__id, sasuke_uchiha__hebi__id, tsunade__great_ninja_war__id, kimimaro__reanimation__id, kinkaku__reanimation__id, madara_uchiha__six_paths__id, sakura_uchiha__new_year_s_games__id, madara_uchiha__illusionary_world_outfit__thumb_id, itachi_uchiha__illusionary_world_outfit__thumb_id, sasuke_uchiha__the_final_showdown__thumb_id);
            defenseDefault(setParams, plus16, plus96, plus192, plus288, minus80, gaara_id, kisame_hoshigaki_id, rock_lee_id, asuma_sarutobi_id, zabuza_momochi_id, kakuzu_id, jiraiya_id, itachi_uchiha__vs_sasuke__id, jugo_id, naruto_uzumaki__7th_hokage__id, tobirama_senju_id, hashirama_senju_id, sasuke_uchiha__eternal_mangekyo_sharingan__id, gaara__allied_shinobi_forces_commander__id, nagato__reanimation__id, sasuke_uchiha__rinne_sharingan_shadow__id, naruto_uzumaki__warrior_spirit__id, boruto_uzumaki__warrior_spirit__id, naruto_uzumaki__the_final_showdown__thumb_id, boruto_uzumaki__karma__thumb_id);

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

        btn_defense.setOnClickListener(view -> {
            attackDefault(setParams, plus16, plus96, plus192, plus288, minus80, naruto_uzumaki_Id, sasuke_uchiha_Id, boruto_uzumaki_id, choji_akimichi_id, kiba_inuzuka_id, temari_id, might_guy_id, deidara_id, hidan_id, suigetsu_hozuki_id, killer_bee_id, kabuto_yakushi__snake_cloak__id, darui_id, minato_namikaze__reanimation__id, obito_uchiha__ten_tails_jinchuriki__id, naruto_uzumaki__nine_tails_chakra_mode__id, sasuke_uchiha__hebi__id, tsunade__great_ninja_war__id, kimimaro__reanimation__id, kinkaku__reanimation__id, madara_uchiha__six_paths__id, sakura_uchiha__new_year_s_games__id, madara_uchiha__illusionary_world_outfit__thumb_id, itachi_uchiha__illusionary_world_outfit__thumb_id, sasuke_uchiha__the_final_showdown__thumb_id);
            assistDefault(setParams, plus16, plus96, plus192, plus288, minus80, sakura_haruno_Id, hinata_hyuga_id, ino_yamanaka_id, shizune_id, haku_id, tsunade_id, sarada_uchiha__genin__id, karin_id, hanabi_hyuga_id, shisui_uchiha_id, naruto_uzumaki__kurama_link_mode__id, ohnoki_id, rin_nohara_id, sasuke_uchiha__rinne_sharingan__id, ashura_otsutsuki_id, hashirama_senju__reanimation_sage_mode__id, sakura_haruno__great_ninja_war__id, kaguya_otsutsuki_id, konan__summer_break__id, kakashi_hatake__sixth_hokage__thumb_id, kushina_uzumaki_thumb_id, sakura_uchiha_thumb_id);

            params.height = 1300;
            charactersLinearLayout.setLayoutParams(params);

            for (int i = 0; i < charactersLinearLayout.getChildCount(); i++) {
                charactersLinearLayout.getChildAt(i).setVisibility(ImageView.INVISIBLE);
            }

            setParams.setImageId(gaara_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus176, 0, 0);

            setParams.setImageId(kisame_hoshigaki_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

            setParams.setImageId(rock_lee_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

            setParams.setImageId(asuma_sarutobi_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus368, 0, 0);

            setParams.setImageId(zabuza_momochi_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus272, 0, 0);

            setParams.setImageId(kakuzu_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus176, 0, 0);

            setParams.setImageId(jiraiya_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

            setParams.setImageId(itachi_uchiha__vs_sasuke__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus176, 0, 0);

            setParams.setImageId(jugo_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

            setParams.setImageId(naruto_uzumaki__7th_hokage__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus176, 0, 0);

            setParams.setImageId(tobirama_senju_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus176, 0, 0);

            setParams.setImageId(hashirama_senju_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

            setParams.setImageId(sasuke_uchiha__eternal_mangekyo_sharingan__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus80, 0, 0);

            setParams.setImageId(gaara__allied_shinobi_forces_commander__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus272, 0, 0);

            setParams.setImageId(nagato__reanimation__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus176, 0, 0);

            setParams.setImageId(sasuke_uchiha__rinne_sharingan_shadow__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus464, 0, 0);

            setParams.setImageId(naruto_uzumaki__warrior_spirit__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(0, minus176, 0, 0);

            setParams.setImageId(boruto_uzumaki__warrior_spirit__id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

            setParams.setImageId(naruto_uzumaki__the_final_showdown__thumb_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus192, minus176, 0, 0);

            setParams.setImageId(boruto_uzumaki__karma__thumb_id);
            setParams.setImageIdVisible();
            setParams.setImageId_Params().setMargins(plus288, minus176, 0, 0);
        });

        //Setup anim
//        AlphaAnimation alphaAnimation = new AlphaAnimation(1, (float) 0.5);
//
//        //Setup anim with desired properties
//        alphaAnimation.setInterpolator(new LinearInterpolator());
//        alphaAnimation.setRepeatCount(Animation.INFINITE); //Repeat animation indefinitely
//        alphaAnimation.setDuration(1000); //Put desired duration per anim cycle here, in milliseconds
//
//        //Start animation
//        naruto_uzumaki.startAnimation(alphaAnimation);
        //Later on, use view.setAnimation(null) to stop it.

        naruto_uzumaki_Id.setOnClickListener(v -> openNarutoUzumaki());
    }

    private void attackDefault(SetParamsForCharThumb setParams, int plus16, int plus96, int plus192, int plus288, int minus80, ImageView naruto_uzumaki_Id, ImageView sasuke_uchiha_Id, ImageView boruto_uzumaki_id, ImageView choji_akimichi_id, ImageView kiba_inuzuka_id, ImageView temari_id, ImageView might_guy_id, ImageView deidara_id, ImageView hidan_id, ImageView suigetsu_hozuki_id, ImageView killer_bee_id, ImageView kabuto_yakushi__snake_cloak__id, ImageView darui_id, ImageView minato_namikaze__reanimation__id, ImageView obito_uchiha__ten_tails_jinchuriki__id, ImageView naruto_uzumaki__nine_tails_chakra_mode__id, ImageView sasuke_uchiha__hebi__id, ImageView tsunade__great_ninja_war__id, ImageView kimimaro__reanimation__id, ImageView kinkaku__reanimation__id, ImageView madara_uchiha__six_paths__id, ImageView sakura_uchiha__new_year_s_games__id, ImageView madara_uchiha__illusionary_world_outfit__thumb_id, ImageView itachi_uchiha__illusionary_world_outfit__thumb_id, ImageView sasuke_uchiha__the_final_showdown__thumb_id) {
        setParams.setImageId(naruto_uzumaki_Id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, 0, 0, 0);

        setParams.setImageId(sasuke_uchiha_Id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(boruto_uzumaki_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(choji_akimichi_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(kiba_inuzuka_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(temari_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(might_guy_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(deidara_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(hidan_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(suigetsu_hozuki_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(killer_bee_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(kabuto_yakushi__snake_cloak__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(darui_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(minato_namikaze__reanimation__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(obito_uchiha__ten_tails_jinchuriki__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(naruto_uzumaki__nine_tails_chakra_mode__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(sasuke_uchiha__hebi__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(tsunade__great_ninja_war__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(kimimaro__reanimation__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(kinkaku__reanimation__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(madara_uchiha__six_paths__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(sakura_uchiha__new_year_s_games__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(madara_uchiha__illusionary_world_outfit__thumb_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(itachi_uchiha__illusionary_world_outfit__thumb_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(sasuke_uchiha__the_final_showdown__thumb_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);
    }

    private void assistDefault(SetParamsForCharThumb setParams, int plus16, int plus96, int plus192, int plus288, int minus80, ImageView sakura_haruno_Id, ImageView hinata_hyuga_id, ImageView ino_yamanaka_id, ImageView shizune_id, ImageView haku_id, ImageView tsunade_id, ImageView sarada_uchiha__genin__id, ImageView karin_id, ImageView hanabi_hyuga_id, ImageView shisui_uchiha_id, ImageView naruto_uzumaki__kurama_link_mode__id, ImageView ohnoki_id, ImageView rin_nohara_id, ImageView sasuke_uchiha__rinne_sharingan__id, ImageView ashura_otsutsuki_id, ImageView hashirama_senju__reanimation_sage_mode__id, ImageView sakura_haruno__great_ninja_war__id, ImageView kaguya_otsutsuki_id, ImageView konan__summer_break__id, ImageView kakashi_hatake__sixth_hokage__thumb_id, ImageView kushina_uzumaki_thumb_id, ImageView sakura_uchiha_thumb_id) {
        //assist
        setParams.setImageId(sakura_haruno_Id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(hinata_hyuga_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(ino_yamanaka_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(shizune_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(haku_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(tsunade_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(sarada_uchiha__genin__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(karin_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(hanabi_hyuga_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(shisui_uchiha_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(naruto_uzumaki__kurama_link_mode__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(ohnoki_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(rin_nohara_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(sasuke_uchiha__rinne_sharingan__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(ashura_otsutsuki_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(hashirama_senju__reanimation_sage_mode__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(sakura_haruno__great_ninja_war__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(kaguya_otsutsuki_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(konan__summer_break__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(kakashi_hatake__sixth_hokage__thumb_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(kushina_uzumaki_thumb_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(sakura_uchiha_thumb_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);
        //assist
    }

    private void defenseDefault(SetParamsForCharThumb setParams, int plus16, int plus96, int plus192, int plus288, int minus80, ImageView gaara_id, ImageView kisame_hoshigaki_id, ImageView rock_lee_id, ImageView asuma_sarutobi_id, ImageView zabuza_momochi_id, ImageView kakuzu_id, ImageView jiraiya_id, ImageView itachi_uchiha__vs_sasuke__id, ImageView jugo_id, ImageView naruto_uzumaki__7th_hokage__id, ImageView tobirama_senju_id, ImageView hashirama_senju_id, ImageView sasuke_uchiha__eternal_mangekyo_sharingan__id, ImageView gaara__allied_shinobi_forces_commander__id, ImageView nagato__reanimation__id, ImageView sasuke_uchiha__rinne_sharingan_shadow__id, ImageView naruto_uzumaki__warrior_spirit__id, ImageView boruto_uzumaki__warrior_spirit__id, ImageView naruto_uzumaki__the_final_showdown__thumb_id, ImageView boruto_uzumaki__karma__thumb_id) {
        //defense
        setParams.setImageId(gaara_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(kisame_hoshigaki_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(rock_lee_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(asuma_sarutobi_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(zabuza_momochi_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(kakuzu_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(jiraiya_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(itachi_uchiha__vs_sasuke__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(jugo_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(naruto_uzumaki__7th_hokage__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(tobirama_senju_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(hashirama_senju_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus96, minus80, 0, 0);

        setParams.setImageId(sasuke_uchiha__eternal_mangekyo_sharingan__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(gaara__allied_shinobi_forces_commander__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(nagato__reanimation__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(sasuke_uchiha__rinne_sharingan_shadow__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(naruto_uzumaki__warrior_spirit__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);

        setParams.setImageId(boruto_uzumaki__warrior_spirit__id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(0, plus16, 0, 0);

        setParams.setImageId(naruto_uzumaki__the_final_showdown__thumb_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus288, minus80, 0, 0);

        setParams.setImageId(boruto_uzumaki__karma__thumb_id);
        setParams.setImageIdVisible();
        setParams.setImageId_Params().setMargins(plus192, minus80, 0, 0);
        //defense
    }

    private void openNarutoUzumaki() {
        Intent intent = new Intent(this, NarutoUzumaki.class);
        startActivity(intent);
    }
}