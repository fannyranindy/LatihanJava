package com.funny.bangunDatar;

public class Persegi {

    private int sisi;
    private int luas;
    private int keliling;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getLuas() {
        luas = sisi * sisi;
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getKeliling() {
        keliling = 4 * sisi;
        return keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }
}
