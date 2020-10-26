package com.gracia.Pertemuan_1.Praktikum.manusia;

public class DemoManusia {
    public static void main(String[] args) {
        //Array of Object
        /*
            Bedanya dengan array biasa yakni pada array of object awalnya
            menggunakan class
         */
        manusia arrayManusia[] = new manusia[3];

        //deklarasi menggunakan constructor tipe 1
        manusia manusia1 = new manusia(); //digunakan untuk memasukkan ke dalam array of object
        manusia1.setNama("Gracia");
        manusia1.setUmur(19);

        //deklarasi menggunakan constructor tipe 2
        manusia manusia2 = new manusia("Rizka");

        //deklarasi menggunakan constructor tipe 3
        manusia manusia3 = new manusia("Pasfica",19);

        //memasukan nilai ke array of object
        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;
        for(manusia x : arrayManusia) {
            System.out.println("Character");
            System.out.println("Nama \t: " + x.getNama());
            System.out.println("Umur \t: " + x.getUmur());
            System.out.println();
        }
    }
}
