package com.gracia.Pertemuan_4.Praktikum.Interface;

//Class CD sebagai kelas induk
public class CD {
    //DEKLARASI VARIABLE
    String ukuran;
    long hargaCD;

    //CONSTRUCTOR
    public CD(String ukuran, long hargaCD) {
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
    }

    //GETTER
    public long getHargaCD() {
        return hargaCD;
    }

    //method untuk mencetak CD
    public void cetakCD(){
        System.out.println("Ukuran CD \t: "+ukuran);
        System.out.println("Harga CD \t: "+hargaCD);
    }
}
