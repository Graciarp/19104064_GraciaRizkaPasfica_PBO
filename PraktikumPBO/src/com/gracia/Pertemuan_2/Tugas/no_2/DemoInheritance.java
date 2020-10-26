package com.gracia.Pertemuan_2.Tugas.no_2;

public class DemoInheritance {
    public static void main(String[] args) {
        InheritanceBinatang superclass = new InheritanceBinatang();
        Burung subclass1 = new Burung();
        Ikan subclass2 = new Ikan();
        Kucing subclass3 = new Kucing();

        System.out.println("Masukkan data ke subclass : \n");
        subclass1.nama = "Burung";
        subclass1.terbang();
        subclass1.makan();
        subclass1.tidur();
        System.out.println();

        subclass2.nama = "Ikan";
        subclass2.berenang();
        subclass2.makan();
        subclass2.tidur();
        System.out.println();

        subclass3.nama = "Kucing";
        subclass3.meong();
        subclass3.makan();
        subclass3.tidur();
    }
}
