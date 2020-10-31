package com.gracia.Pertemuan_4.Praktikum.Interface;

public class Buku {
    //DEKLARASI VARIABLE
    String judul, pengarang;
    long hargaBuku;

    //CONSTRUCTOR
    public Buku(String judul, String pengarang, long hargaBuku) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;
    }

    //CETAK DATA
    public void cetakBuku(){
        System.out.println("\nJudul \t: "+judul);
        System.out.println("Pengarang \t: "+pengarang);
        System.out.println("Harga buku \t: "+hargaBuku);
    }
}
