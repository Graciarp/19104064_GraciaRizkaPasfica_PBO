package com.gracia.Pertemuan_2.Praktikum.polimorfisme;

public class lagu {
    public String judul;
    public String pencipta;

    //Overloading (method dengan nama yang sama dan isi yang berbeda)
    public lagu(String judul) {
        this.judul = judul;
    }

    //Overloading
    public lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu(){
        System.out.println("Judul \t\t: "+judul);
        System.out.println("Pencipta\t: "+pencipta);
        System.out.println();
    }
}
