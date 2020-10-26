package com.gracia.Pertemuan_1.Praktikum;

public class mahasiswa {
    String nama;
    int nim;

    /*
        Constructor digunakan untuk menciptakan sebuah object
        Nama constructor = nama class
        Bedanya dengan method lain yaitu dalam pemanggilannya.
     */
    //ini adalah constructor
    public mahasiswa(){}

    //ini constructor dengan variable
    public mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }
    /*
        Pada java, constructur sudah ada secara default
        Cara : Alt + Insert kemudian pilih constructor
        => Deklarasikan variable di luar method supaya dapat di deteksi pada constructor
     */

    //setter : mengatur variable yang ada pada class lain
    //getter : memanggil variable yang sudah diubah
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public int getNim(){
        return nim;
    }
    public void setNim(int nim){
        this.nim = nim;
    }
}
