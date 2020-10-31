package com.gracia.Pertemuan_3.Tugas.No1;

import java.util.Collections;
import java.util.List;

public class Komplek {
    /*
        tanda (-) bersifat private
        tanda (+) bersifat public
     */
    //DEKLARASI VARIABLE PADA CLASS KOMPLEK
    public String idKomplek;
    public String namaKomplek;
    public int jmlRumah;
    public List<String> idRumah[] = new List[10]; //array karena ada banyak rumah dalam 1 komplek

    //CONSTRUCTOR DENGAN PARAMETER IDKOMPLEK DAN NAMAKOMPLEK
    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }

    //METHOD UNTUK MENAMBAHKAN DATA RUMAH
    public String addRumah(String idRumah){
        return idRumah;
    }
    
    //GETTER AND SETTER UNTUK IDKOMPLEK,NAMAKOMPLEK,JMLRUMAH,IDRUMAH
    public String getIdKomplek() {
        return idKomplek;
    }

    public void setIdKomplek(String idKomplek) {
        this.idKomplek = idKomplek;
    }

    public String getNamaKomplek() {
        return namaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {
        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {
        return jmlRumah;
    }

    public List<String> getIdRumah(int indeks) {
        return (idRumah[indeks]);
    }

    public void setIdRumah(String id) {
        idRumah[jmlRumah]= Collections.singletonList(id);
        jmlRumah++;
    }

    //METHOD UNTUK MENGUMPULKAN DATAKOMPLEK
    public List<String> getDataKomplek(List<String> idRumah){
        return idRumah;
    }
}
