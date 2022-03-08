package com.example.myapplication.cards_tools.ultimate_jutsu;

public class UltimateJutsus {
    private String type;
    private String nature;

    private String lvlCard;
    private String lvlJutsu;

    private int hp;
    private int cp;
    private int atk;
    private int def;
    private String cri;
    private String eva;
    private int cpcost;
    private int criJutsu;
    private int pow;
    private int rt;

    public UltimateJutsus(String type, int rank, String nature, int cpcost, int criJutsu, int pow, int rt) {
        setType(type);
        setNature(nature);
        setCpcost(cpcost);
        setCriJutsu(criJutsu);
        setPow(pow);
        setRt(rt);
        switch (rank) {
            case 6:
                setCri("1.30%");
                setEva("1.30%");
                setLvlJutsu("8/8");
                setLvlCard("70/70");
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
                setCri("1.50%");
                setEva("1.50%");
                setLvlJutsu("15/15");
                setLvlCard("100/100");
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

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
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

    public String getCri() {
        return cri;
    }

    public void setCri(String cri) {
        this.cri = cri;
    }

    public String getEva() {
        return eva;
    }

    public void setEva(String eva) {
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
