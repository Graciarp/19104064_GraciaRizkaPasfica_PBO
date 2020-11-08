package com.gracia.Pertemuan_3.Tugas.No3;

public class Ayah {
    //DEKLARASI VARIABLE
    /*
        Karena komposisi merupakan bagian dari agregasi dan
        pada agregasi menggunakan private maka deklarasi
        menggunakan private. Penjelasan ada pada bagian agregasi
     */
    private int idAyah, umurAyah;
    private String namaAyah;

    //CONSTRUCTOR
    public Ayah(int idAyah, int umurAyah, String namaAyah) {
        this.idAyah = idAyah;
        this.umurAyah = umurAyah;
        this.namaAyah = namaAyah;
    }

    //GETTER
    public int getIdAyah() {
        return idAyah;
    }

    public int getUmurAyah() {
        return umurAyah;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    //CETAK DATA AYAH
    public void getData(){
        System.out.println("Nama \t\t: "+namaAyah);
        System.out.println("NIM \t\t: "+idAyah);
        System.out.println("Umur \t\t: "+umurAyah);
        System.out.println();
    }
}
