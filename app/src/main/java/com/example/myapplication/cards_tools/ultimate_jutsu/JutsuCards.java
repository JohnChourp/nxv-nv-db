package com.example.myapplication.cards_tools.ultimate_jutsu;

import android.annotation.SuppressLint;

import com.example.myapplication.R;

public class JutsuCards {
    private final String category;
    private final String type;
    private int typeImage;
    private int rank;
    private final String nature;
    private int natureImage;

    private String lvlCard;
    private String lvlJutsu;

    private int hp;
    private int cp;
    private int atk;
    private int def;
    private double cri;
    private double eva;
    private final int cpcost;
    private final int criJutsu;
    private final int pow;
    private final int rt;

    @SuppressLint("UseCompatLoadingForDrawables")
    public JutsuCards(String category, String type, int rank, String nature, int cpcost, int criJutsu, int pow, int rt) {
        this.category = category;
        this.type = type;
        this.nature = nature;
        this.cpcost = cpcost;
        this.criJutsu = criJutsu;
        this.pow = pow;
        this.rt = rt;

        switch (type) {
            case "Assist":
                setTypeImage(R.drawable.assist);
                break;
            case "Attack":
                setTypeImage(R.drawable.attack);
                break;
            case "Defense":
                setTypeImage(R.drawable.defense);
                break;
            case "Skill":
                setTypeImage(R.drawable.skill);
                break;
            case "Utility":
                setTypeImage(R.drawable.utility);
                break;
        }

        switch (nature) {
            case "Annihilation":
                setNatureImage(R.drawable.annihilation);
                break;
            case "EX Annihilation":
                setNatureImage(R.drawable.ex_annihilation);
                break;
            case "Lunge":
                setNatureImage(R.drawable.lunge);
                break;
            case "EX Lunge":
                setNatureImage(R.drawable.ex_lunge);
                break;
            case "Manipulate":
                setNatureImage(R.drawable.manipulate);
                break;
            case "EX Manipulate":
                setNatureImage(R.drawable.ex_manipulate);
                break;
            case "Normal":
                setNatureImage(R.drawable.normal);
                break;
            case "Impact":
                setNatureImage(R.drawable.impact);
                break;
            case "EX Impact":
                setNatureImage(R.drawable.ex_impact);
                break;
            case "Release":
                setNatureImage(R.drawable.release);
                break;
            case "EX Release":
                setNatureImage(R.drawable.ex_release);
                break;
        }
        switch (category){
            case "Ultimate Jutsu":
                switch (rank) {
                    case 6:
                        setCri(1.3);
                        setEva(1.3);
                        setLvlJutsu("8/8");
                        setLvlCard("70/70");
                        setRank(R.drawable.icon6star);
                        switch (type) {
                            case "Assist":
                                setHp(1128);
                                setCp(143);
                                setAtk(480);
                                setDef(607);
                                break;
                            case "Attack":
                                setHp(1128);
                                setCp(102);
                                setAtk(829);
                                setDef(534);
                                break;
                            case "Defense":
                                setHp(1296);
                                setCp(85);
                                setAtk(571);
                                setDef(742);
                                break;
                            case "Skill":
                                setHp(1029);
                                setCp(165);
                                setAtk(627);
                                setDef(436);
                                break;
                            case "Utility":
                                setHp(1218);
                                setCp(112);
                                setAtk(607);
                                setDef(574);
                                break;
                        }
                        break;
                    case 7:
                        setCri(1.5);
                        setEva(1.5);
                        setLvlJutsu("15/15");
                        setLvlCard("100/100");
                        setRank(R.drawable.icon7star);
                        switch (type) {
                            case "Assist":
                                setHp(1128);
                                setCp(143);
                                setAtk(480);
                                setDef(607);
                                break;
                            case "Attack":
                                setHp(1128);
                                setCp(102);
                                setAtk(829);
                                setDef(534);
                                break;
                            case "Defense":
                                setHp(1296);
                                setCp(85);
                                setAtk(571);
                                setDef(742);
                                break;
                            case "Skill":
                                setHp(1029);
                                setCp(165);
                                setAtk(627);
                                setDef(436);
                                break;
                            case "Utility":
                                setHp(1218);
                                setCp(112);
                                setAtk(607);
                                setDef(574);
                                break;
                        }
                        break;
                }
                break;
            case "Ninjutsu":
                switch (rank) {
                    case 6:
                        setCri(1.1);
                        setEva(1.1);
                        setLvlJutsu("8/8");
                        setLvlCard("70/70");
                        setRank(R.drawable.icon6star);
                        switch (type) {
                            case "Assist":
                                setHp(936);
                                setCp(119);
                                setAtk(393);
                                setDef(499);
                                break;
                            case "Attack":
                                setHp(936);
                                setCp(84);
                                setAtk(682);
                                setDef(432);
                                break;
                            case "Defense":
                                setHp(1083);
                                setCp(64);
                                setAtk(472);
                                setDef(622);
                                break;
                            case "Skill":
                                setHp(837);
                                setCp(135);
                                setAtk(525);
                                setDef(349);
                                break;
                            case "Utility":
                                setHp(999);
                                setCp(94);
                                setAtk(499);
                                setDef(475);
                                break;
                        }
                        break;
                    case 5:
                        setCri(0.9);
                        setEva(0.9);
                        setLvlJutsu("6/6");
                        setLvlCard("60/60");
                        setRank(R.drawable.icon5star);
                        switch (type) {
                            case "Assist":
                                setHp(695);
                                setCp(87);
                                setAtk(290);
                                setDef(367);
                                break;
                            case "Attack":
                                setHp(695);
                                setCp(61);
                                setAtk(504);
                                setDef(313);
                                break;
                            case "Defense":
                                setHp(809);
                                setCp(44);
                                setAtk(350);
                                setDef(466);
                                break;
                            case "Skill":
                                setHp(611);
                                setCp(98);
                                setAtk(394);
                                setDef(251);
                                break;
                            case "Utility":
                                setHp(735);
                                setCp(69);
                                setAtk(367);
                                setDef(352);
                                break;
                        }
                        break;
                    case 3:
                        setCri(0.5);
                        setEva(0.5);
                        setLvlJutsu("2/2");
                        setLvlCard("40/40");
                        setRank(R.drawable.icon3star);
                        switch (type) {
                            case "Assist":
                                setHp(408);
                                setCp(50);
                                setAtk(169);
                                setDef(213);
                                break;
                            case "Attack":
                                setHp(408);
                                setCp(35);
                                setAtk(294);
                                setDef(181);
                                break;
                            case "Defense":
                                setHp(477);
                                setCp(24);
                                setAtk(205);
                                setDef(274);
                                break;
                            case "Skill":
                                setHp(354);
                                setCp(58);
                                setAtk(234);
                                setDef(144);
                                break;
                            case "Utility":
                                setHp(427);
                                setCp(40);
                                setAtk(213);
                                setDef(205);
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public int getTypeImage() {
        return typeImage;
    }

    public void setTypeImage(int typeImage) {
        this.typeImage = typeImage;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getNature() {
        return nature;
    }

    public int getNatureImage() {
        return natureImage;
    }

    public void setNatureImage(int natureImage) {
        this.natureImage = natureImage;
    }

    public String getLvlCard() {
        return lvlCard;
    }

    public void setLvlCard(String lvlCard) {
        this.lvlCard = lvlCard;
    }

    public String getLvlJutsu() {
        return lvlJutsu;
    }

    public void setLvlJutsu(String lvlJutsu) {
        this.lvlJutsu = lvlJutsu;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public double getCri() {
        return cri;
    }

    public void setCri(double cri) {
        this.cri = cri;
    }

    public double getEva() {
        return eva;
    }

    public void setEva(double eva) {
        this.eva = eva;
    }

    public int getCpcost() {
        return cpcost;
    }

    public int getCriJutsu() {
        return criJutsu;
    }

    public int getPow() {
        return pow;
    }

    public int getRt() {
        return rt;
    }
}
