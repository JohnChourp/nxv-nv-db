package com.example.myapplication.cards_tools.ultimate_jutsu;

import android.annotation.SuppressLint;

import com.example.myapplication.R;

public class JutsuCards {
    private String type;
    private int typeImage;
    private int rank;
    private String nature;
    private int natureImage;

    private String lvlCard;
    private String lvlJutsu;

    private int hp;
    private int cp;
    private int atk;
    private int def;
    private double cri;
    private double eva;
    private int cpcost;
    private int criJutsu;
    private int pow;
    private int rt;

    @SuppressLint("UseCompatLoadingForDrawables")
    public JutsuCards(String type, int rank, String nature, int cpcost, int criJutsu, int pow, int rt) {
        setType(type);
        setNature(nature);
        setCpcost(cpcost);
        setCriJutsu(criJutsu);
        setPow(pow);
        setRt(rt);

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
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public void setNature(String nature) {
        this.nature = nature;
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

    public void setCpcost(int cpcost) {
        this.cpcost = cpcost;
    }

    public int getCriJutsu() {
        return criJutsu;
    }

    public void setCriJutsu(int criJutsu) {
        this.criJutsu = criJutsu;
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }
}
