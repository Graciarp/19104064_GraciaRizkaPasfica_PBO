package com.gracia.Pertemuan_4.Praktikum.Abstrak;

import java.util.Random;

public class DemoAbstrak {
    public static void main(String[] args) {
        //Array Object
        Binatang[] peliharaan = {
                new Burung("Beo"),
                new Kambing("Etawa"),
                new Kucing("Persia"),
                new Anjing("Cihuahua")
        };

        Binatang kesayangan;
        Random pilihan = new Random();

        kesayangan = peliharaan[pilihan.nextInt(peliharaan.length)];

        System.out.println("Binatang kesayangan anda\t: "+kesayangan);
        System.out.print("Suaranya\t: ");
        kesayangan.suara();
    }
}
