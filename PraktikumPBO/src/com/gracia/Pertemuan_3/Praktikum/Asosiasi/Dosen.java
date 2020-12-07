package com.gracia.Pertemuan_3.Praktikum.Asosiasi;

public class Dosen {
    //DEKLARASI VARIABLE PADA CLASS DOSEN
    private String kodeDosen;
    private int nimMhs[] = new int[10];
    private int jmlMahasiswa;
    /*
        Bentuk nimMhs array supaya dapat mempengaruhi lebih dari 1 mahasiswa
        jml indeks 10 karena jmlMahasiswa belum diketahui batasan sebenarnya
        jadi 10 hanya perumpamaan
     */

    //CONSTRUCTOR TANPA PARAMETER UNTUK DIAKSES DI CLASS DEMOKULIAH
    public Dosen() {
    }

    //method ini berfungsi supaya kodeDosen dapat di set
    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    //Method ini berfungsi untuk mendapatkan nilai kodeDosen yang sudah di set
    public String getKodeDosen() {
        return kodeDosen;
    }

    /*
        method ini akan mendapatkan jumlah mahasiswa nya dari class mahasiswa yang ada di DemoKuliah
        berapa mahasiswa yang akan diinputkan pada class mahasiswa
     */
    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    /*
        METHOD INI UNTUK MENDAPATKAN NIM DARI CLASS MAHASISWA SESUAI INDEKS
        misalkan pada mahasiswa1 diinputkan 21104001 maka nim pada indeks ke-0 adalah 21104001
     */
    public int getNimMhs(int indeks){
        return (nimMhs[indeks]);
    }

    /*
        Method ini untuk menset nim dari class mahasiswa sesuai dengan jumlah mahasiswa yang
        diinputkan pada class mahasiswa. Bisa dengan cara mengubah nilai atau mendapatkannya
        dari class mahasiswa
     */
    public void setNimMhs(int nim){
        nimMhs[jmlMahasiswa] = nim;
        jmlMahasiswa++;
    }
}
