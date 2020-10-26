package com.gracia.Pertemuan_1.Praktikum.manusia;

public class manusia {
    private String nama;
    private int umur;
    /*
        Pada OOP biasakan untuk menggunakan modifier private
        untuk constructor. Jika menggunakan modifier public
        maka class lain dapat memanggil vairable tersebut
     */

    //Constructor Pertama (tanpa parameter)
    public manusia(){}

    //Constructor dengan parameter
    public manusia(String nama){
        this.nama = nama;
        //this merujuk pada class
        //memperjelas bahwa nama ada di class manusia
    }

    //Constructor dengan parameter
    public manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    //Getter & Setter
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
}
