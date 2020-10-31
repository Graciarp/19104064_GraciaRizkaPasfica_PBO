package com.gracia.Pertemuan_3.Tugas.No3;

public class Anak {
    //DEKLARASI VARIABLE
    /*
        Karena komposisi merupakan bagian dari agregasi dan
        pada agregasi menggunakan private maka deklarasi
        menggunakan private. Penjelasan ada pada bagian agregasi
     */
    private int idAnak, umurAnak;
    private String namaAnak, statusAnak;

    //CONSTRUCTOR
    public Anak(int idAnak, int umurAnak, String namaAnak, String statusAnak) {
        this.idAnak = idAnak;
        this.umurAnak = umurAnak;
        this.namaAnak = namaAnak;
        this.statusAnak = statusAnak;
    }


    //GETTER
    public int getIdAnak() {
        return idAnak;
    }

    public int getUmurAnak() {
        return umurAnak;
    }

    public String getNamaAnak() {
        return namaAnak;
    }

    public String getStatusAnak() {
        return statusAnak;
    }

    //CETAK DATA ANAK
    public void getData(){
        System.out.println("Nama \t\t: "+namaAnak);
        System.out.println("NIM \t\t: "+idAnak);
        System.out.println("Umur \t\t: "+umurAnak);
        System.out.println("Status \t: "+statusAnak);
        System.out.println();
    }
}
