package com.gracia.Pertemuan_3.Praktikum.Asosiasi;

public class Mahasiswa {
    /*
        tanda (-) pada diagram bersifat private
        tanda (+) pada diagram bersifat publik
     */
    //DEKLARASI VARIABLE UNTUK CLASS MAHASISWA
    private int nim;
    private String nama;

    //CONSTRUCTOR TANPA PARAMETER UNTUK DIHUBUNGKAN DENGAN CLASS DEMOKULIAH
    public Mahasiswa(){
    }

    //CONSTRUCTOR DENGAN PARAMETER UNTUK DIHUBUNGKAN DENGAN CLASS DOSEN
    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    //METHOD UNTUK MENSETTING NIM
    public void setNim(int nim) {
        this.nim = nim;
    }

    //METHOD UNTUK MENDAPATKAN NILAI DARI VARIABLE NIM YANG SUDAH DI SET
    public int getNim() {
        return nim;
    }

    //METHOD UNTUK MENSETTING NAMA
    public void setNama(String nama) {
        this.nama = nama;
    }

    //METHOD UNTUK MENDAPATKAN NILAI DARI VARIABLE NAMA YANG SUDAH DI SET
    public String getNama() {
        return nama;
    }
}
