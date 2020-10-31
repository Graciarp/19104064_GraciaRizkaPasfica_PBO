package com.gracia.Pertemuan_3.Tugas.No3;

import java.util.ArrayList;
import java.util.List;

public class DemoKeluarga {
    public static void main(String[] args) {
        Keluarga keluarga = new Keluarga("Cemara","Kota Azkaban");

        //INPUT DATA
        Ayah ayah = new Ayah(3303051,80,"Prof. Dumbledore");
        Ibu ibu = new Ibu(3303054,46,"Madam Poppy Pomfre");
        Anak anak1 = new Anak(33040121,15,"Toni Sultoni","Kandung");
        Anak anak2 = new Anak(33040122,12,"Anjayani","Haram");
        Anak anak3 = new Anak(33040123,8,"Huleleha","Tiri");
        List<Anak> anakList = new ArrayList<>();
        anakList.add(anak1);
        anakList.add(anak2);
        anakList.add(anak3);

        //TAMBAH DATA KE CLASS KELUARGA
        keluarga.addAnggotaKeluarga(ayah,ibu,anakList);

        //CETAK DATA
        System.out.println("Nama Keluarga \t: "+keluarga.getNamaKeluarga());
        System.out.println("Asal Keluarga \t: "+keluarga.getKotaAsal());
        System.out.println("Ayah \t\t: ");
        keluarga.getAyah().getData();
        System.out.println("Ibu \t\t: ");
        keluarga.getIbu().getData();
        System.out.println("Daftar anak \t:");
        keluarga.getData();
    }
}
