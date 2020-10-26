package com.gracia.Pertemuan_2.Tugas.no_2;

public class Ikan extends InheritanceBinatang{
    public String getNama(){
        return nama;
    }

    public void berenang(){
        System.out.println(getNama()+" Bergerak dengan cara berenang");
    }
}
