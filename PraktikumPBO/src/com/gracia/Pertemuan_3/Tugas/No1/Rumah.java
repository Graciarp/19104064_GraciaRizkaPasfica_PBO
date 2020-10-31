package com.gracia.Pertemuan_3.Tugas.No1;

public class Rumah {
    /*
        tanda (-) bersifat private
        tanda (+) bersifat public
     */
    public String idRumah;
    public String pemilikRumah;
    public int jumlahOrang;

    //CONSTRUCTOR DENGAN PARAMETER
    public Rumah(String idRumah, String pemilikRumah, int jumlahOrang) {
        this.idRumah = idRumah;
        this.pemilikRumah = pemilikRumah;
        this.jumlahOrang = jumlahOrang;
    }

    //RUMAH HANYA BISA MENDAPAT ID RUMAH,PEMILIK RUMAH, DAN JUMLAH ORANG TIDAK BISA MENGATURNYA
    public String getIdRumah() {
        return idRumah;
    }

    public String getPemilikRumah() {
        return pemilikRumah;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }
}
