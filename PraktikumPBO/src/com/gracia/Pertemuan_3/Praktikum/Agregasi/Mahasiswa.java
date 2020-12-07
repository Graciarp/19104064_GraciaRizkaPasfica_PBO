package com.gracia.Pertemuan_3.Praktikum.Agregasi;

public class Mahasiswa {
    /*
        karena setiap class dapat berdiri sendiri,
        maka untuk deklarasi variable lebih baik
        menggunakan hak akses private
     */
    //DEKLARASI VARIABLE DARI CLASS MAHASISWA
    private String nama;
    private int nim;

    //CONSTRUCTOR SUPAYA DAPAT DIPANGGIL DI DEMOJURUSAN
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //GETTER NAMA & NIM
    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }
}
