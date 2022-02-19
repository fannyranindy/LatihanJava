package com.funny.bangunDatar;

public class HitungBangunDatar {

    public static void main (String[] args){

        Persegi persegi = new Persegi();
        persegi.setSisi(6);

        System.out.println("Luas : "+ persegi.getLuas());
        System.out.println("Sisi : "+ persegi.getSisi());
        System.out.println("Keliling : "+ persegi.getKeliling());
    }
}
