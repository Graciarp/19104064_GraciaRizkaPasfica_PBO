package com.gracia.Pertemuan_3.Tugas.No1;

public class DemoPerumahan {
    public static void main(String[] args) {
        //MEMANGGIL CLASS RUMAH DAN MEMBERI NILAI PADA SETIAP RUMAH
        Rumah rumah1 = new Rumah("A001","SUBUDI",4);
        Rumah rumah2 = new Rumah("B012","SUTEJO",3);
        Rumah rumah3 = new Rumah("C009","HARBUDI",5);

        //MEMANGGIL CLASS KOMPLEK DAN MEMBERI NILAI PADA SETIAP KOMPLEK
        Komplek komplek1 = new Komplek("K004","KAMBOJA");
        Komplek komplek2 = new Komplek("K007","KENANGA");

        komplek1.getIdKomplek();
        komplek2.getNamaKomplek();
        komplek1.setIdRumah(rumah1.getIdRumah());
        komplek1.setIdRumah(rumah2.getIdRumah());
        komplek2.setIdRumah(rumah3.getIdRumah());

        System.out.println("Komplek dengan ID \t\t\t: "+komplek1.getIdKomplek());
        System.out.println("Terdiri dari Rumah dengan ID \t: ");
        for (int i=0; i<komplek1.getJmlRumah(); i++) {
            System.out.println((i+1)+". "+komplek1.getIdRumah(i));
        }

        System.out.println("\nKomplek dengan ID \t\t\t: "+komplek2.getIdKomplek());
        System.out.println("Terdiri dari Rumah dengan ID \t: ");
        for (int i=0; i<komplek2.getJmlRumah(); i++) {
            System.out.println((i+1)+". "+komplek2.getIdRumah(i));
        }
    }
}
