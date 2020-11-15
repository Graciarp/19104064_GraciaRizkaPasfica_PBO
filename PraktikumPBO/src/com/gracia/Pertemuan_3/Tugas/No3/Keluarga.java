package com.gracia.Pertemuan_3.Tugas.No3;

import java.util.ArrayList;
import java.util.List;

public class Keluarga {
    //DEKLARASI VARIABLE
    private String namaKeluarga;
    private String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;
    private List<Anak> anakList = new ArrayList<>();

    //CONSTRUCTOR
    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    //METHOD UNTUK MENAMBAHKAN DATA
    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, List<Anak> anak){
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anak;
    }

    //GETTER
    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public List<Anak> getAnakList() {
        return anakList;
    }

    public void setNamaKeluarga(String namaKeluarga) {
        this.namaKeluarga = namaKeluarga;
    }

    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public void setAyah(Ayah ayah) {
        this.ayah = ayah;
    }

    public void setIbu(Ibu ibu) {
        this.ibu = ibu;
    }

    public void setAnakList(List<Anak> anakList) {
        this.anakList = anakList;
    }

    //CETAK DATA ANAK
    public void getData(){
        for (Anak anak: anakList) {
            System.out.println("NIK \t\t: "+anak.getIdAnak());
            System.out.println("Nama \t\t: "+anak.getNamaAnak());
            System.out.println("Umur \t\t: "+anak.getUmurAnak());
            System.out.println("Status \t\t: "+anak.getStatusAnak());
            System.out.println();
        }
    }
}
