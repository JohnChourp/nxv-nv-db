package com.example.myapplication.cards_tools.cards;

public class CheckByLvlCards {
    private final int rt_lvl_1;
    private final int cpcost_lvl_1;
    private final int cri_lvl_1;
    private final int pow_lvl_1;

    private final int rt_lvl_2;
    private final int cpcost_lvl_2;
    private final int cri_lvl_2;
    private final int pow_lvl_2;

    private int rt_lvl_3;
    private int cpcost_lvl_3;
    private int cri_lvl_3;
    private int pow_lvl_3;

    private int rt_lvl_4;
    private int cpcost_lvl_4;
    private int cri_lvl_4;
    private int pow_lvl_4;

    private int rt_lvl_5;
    private int cpcost_lvl_5;
    private int cri_lvl_5;
    private int pow_lvl_5;

    private int rt_lvl_6;
    private int cpcost_lvl_6;
    private int cri_lvl_6;
    private int pow_lvl_6;

    private int rt_lvl_7;
    private int cpcost_lvl_7;
    private int cri_lvl_7;
    private int pow_lvl_7;

    private int rt_lvl_8;
    private int cpcost_lvl_8;
    private int cri_lvl_8;
    private int pow_lvl_8;

    public CheckByLvlCards(int rank, int rt_lvl_1, int cpcost_lvl_1, int cri_lvl_1, int pow_lvl_1, int rt_lvl_2, int cpcost_lvl_2, int cri_lvl_2, int pow_lvl_2) {
        this.rt_lvl_1 = rt_lvl_1;
        this.cpcost_lvl_1 = cpcost_lvl_1;
        this.cri_lvl_1 = cri_lvl_1;
        this.pow_lvl_1 = pow_lvl_1;

        this.rt_lvl_2 = rt_lvl_2;
        this.cpcost_lvl_2 = cpcost_lvl_2;
        this.cri_lvl_2 = cri_lvl_2;
        this.pow_lvl_2 = pow_lvl_2;

        switch (rank){
            case 6:
                this.rt_lvl_3 = rt_lvl_2 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_3 = cpcost_lvl_2 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_3 = cri_lvl_2 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_3 = pow_lvl_2 + (pow_lvl_2 - pow_lvl_1);

                this.rt_lvl_4 = this.rt_lvl_3 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_4 = this.cpcost_lvl_3 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_4 = this.cri_lvl_3 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_4 = this.pow_lvl_3 + (pow_lvl_2 - pow_lvl_1);

                this.rt_lvl_5 = this.rt_lvl_4 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_5 = this.cpcost_lvl_4 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_5 = this.cri_lvl_4 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_5 = this.pow_lvl_4 + (pow_lvl_2 - pow_lvl_1);

                this.rt_lvl_6 = this.rt_lvl_5 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_6 = this.cpcost_lvl_5 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_6 = this.cri_lvl_5 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_6 = this.pow_lvl_5 + (pow_lvl_2 - pow_lvl_1);

                this.rt_lvl_7 = this.rt_lvl_6 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_7 = this.cpcost_lvl_6 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_7 = this.cri_lvl_6 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_7 = this.pow_lvl_6 + (pow_lvl_2 - pow_lvl_1);

                this.rt_lvl_8 = this.rt_lvl_7 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_8 = this.cpcost_lvl_7 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_8 = this.cri_lvl_7 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_8 = this.pow_lvl_7 + (pow_lvl_2 - pow_lvl_1);
                break;
            case 5:
                this.rt_lvl_3 = rt_lvl_2 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_3 = cpcost_lvl_2 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_3 = cri_lvl_2 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_3 = pow_lvl_2 + (pow_lvl_2 - pow_lvl_1);

                this.rt_lvl_4 = this.rt_lvl_3 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_4 = this.cpcost_lvl_3 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_4 = this.cri_lvl_3 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_4 = this.pow_lvl_3 + (pow_lvl_2 - pow_lvl_1);

                this.rt_lvl_5 = this.rt_lvl_4 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_5 = this.cpcost_lvl_4 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_5 = this.cri_lvl_4 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_5 = this.pow_lvl_4 + (pow_lvl_2 - pow_lvl_1);

                this.rt_lvl_6 = this.rt_lvl_5 + (rt_lvl_2 - rt_lvl_1);
                this.cpcost_lvl_6 = this.cpcost_lvl_5 + (cpcost_lvl_2 - cpcost_lvl_1);
                this.cri_lvl_6 = this.cri_lvl_5 + (cri_lvl_2 - cri_lvl_1);
                this.pow_lvl_6 = this.pow_lvl_5 + (pow_lvl_2 - pow_lvl_1);
                break;
        }
    }

    public int getRt_lvl_1() {
        return rt_lvl_1;
    }

    public int getCpcost_lvl_1() {
        return cpcost_lvl_1;
    }

    public int getCri_lvl_1() {
        return cri_lvl_1;
    }

    public int getPow_lvl_1() {
        return pow_lvl_1;
    }

    public int getRt_lvl_2() {
        return rt_lvl_2;
    }

    public int getCpcost_lvl_2() {
        return cpcost_lvl_2;
    }

    public int getCri_lvl_2() {
        return cri_lvl_2;
    }

    public int getPow_lvl_2() {
        return pow_lvl_2;
    }

    public int getRt_lvl_3() {
        return rt_lvl_3;
    }

    public int getCpcost_lvl_3() {
        return cpcost_lvl_3;
    }

    public int getCri_lvl_3() {
        return cri_lvl_3;
    }

    public int getPow_lvl_3() {
        return pow_lvl_3;
    }

    public int getRt_lvl_4() {
        return rt_lvl_4;
    }

    public int getCpcost_lvl_4() {
        return cpcost_lvl_4;
    }

    public int getCri_lvl_4() {
        return cri_lvl_4;
    }

    public int getPow_lvl_4() {
        return pow_lvl_4;
    }

    public int getRt_lvl_5() {
        return rt_lvl_5;
    }

    public int getCpcost_lvl_5() {
        return cpcost_lvl_5;
    }

    public int getCri_lvl_5() {
        return cri_lvl_5;
    }

    public int getPow_lvl_5() {
        return pow_lvl_5;
    }

    public int getRt_lvl_6() {
        return rt_lvl_6;
    }

    public int getCpcost_lvl_6() {
        return cpcost_lvl_6;
    }

    public int getCri_lvl_6() {
        return cri_lvl_6;
    }

    public int getPow_lvl_6() {
        return pow_lvl_6;
    }

    public int getRt_lvl_7() {
        return rt_lvl_7;
    }

    public int getCpcost_lvl_7() {
        return cpcost_lvl_7;
    }

    public int getCri_lvl_7() {
        return cri_lvl_7;
    }

    public int getPow_lvl_7() {
        return pow_lvl_7;
    }

    public int getRt_lvl_8() {
        return rt_lvl_8;
    }

    public int getCpcost_lvl_8() {
        return cpcost_lvl_8;
    }

    public int getCri_lvl_8() {
        return cri_lvl_8;
    }

    public int getPow_lvl_8() {
        return pow_lvl_8;
    }
}
