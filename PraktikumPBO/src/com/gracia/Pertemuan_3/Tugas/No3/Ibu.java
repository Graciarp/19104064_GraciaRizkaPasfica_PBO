package com.gracia.Pertemuan_3.Tugas.No3;

public class Ibu {
    //DEKLARASI VARIABLE
    /*
        Karena komposisi merupakan bagian dari agregasi dan
        pada agregasi menggunakan private maka deklarasi
        menggunakan private. Penjelasan ada pada bagian agregasi
     */
    private int idIbu, umurIbu;
    private String namaIbu;

    //CONSTRUCTOR
    public Ibu(int idIbu, int umurIbu, String namaIbu) {
        this.idIbu = idIbu;
        this.umurIbu = umurIbu;
        this.namaIbu = namaIbu;
    }

    //GETTER
    public int getIdIbu() {
        return idIbu;
    }

    public int getUmurIbu() {
        return umurIbu;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    //CETAK DATA IBU
    public void getData(){
        System.out.println("Nama \t\t: "+namaIbu);
        System.out.println("NIM \t\t: "+idIbu);
        System.out.println("Umur \t\t: "+umurIbu);
        System.out.println();
    }
}
