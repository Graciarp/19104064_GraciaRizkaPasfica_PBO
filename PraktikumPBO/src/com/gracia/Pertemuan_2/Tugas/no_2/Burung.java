package com.gracia.Pertemuan_2.Tugas.no_2;

public class Burung extends InheritanceBinatang{
    public String getNama(){
        return nama;
    }

    public void terbang(){
        System.out.println(getNama()+" bergerak dengan cara terbang");
    }
}
