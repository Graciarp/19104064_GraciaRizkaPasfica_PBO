package com.gracia.Pertemuan_3.Praktikum.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        //MEMANGGIL CLASS MAHASISWA UNTUK MAHASISWA PERTAMA
        Mahasiswa mahasiswa1  = new Mahasiswa();
        //MEMBERI NILAI BERUPA NAMA DAN NIM UNTUK MAHASISWA PERTAMA
        mahasiswa1.setNama("Paimon");
        mahasiswa1.setNim(21104001);

        //MEMANGGIL CLASS MAHASISWA UNTUK MAHASISWA KEDUA
        /*
            KARENA MEMANGGIL MENGGUNAKAN CONSTRUCTOR DENGAN PARAMETER, MAKA NILAINYA
            DAPAT LANGSUNG DIMASUKKAN DALAM PARAMETER OBJECT MAHASISWA KEDUA
         */
        Mahasiswa mahasiswa2 = new Mahasiswa(21103002,"Budi Sanjaya");

        Dosen dosen = new Dosen();
        //MEMBERI KODE DOSEN
        dosen.setKodeDosen("ACW");
        /*
            NIM MAHASISWA PADA CLASS DOSEN DIDAPATKAN DENGAN CARA MENGAMBIL DARI
            NILAI NIM PADA MAHASISWA PERTAMA DAN KEDUA
         */
        dosen.setNimMhs(mahasiswa1.getNim());
        dosen.setNimMhs(mahasiswa2.getNim());

        //MENCETAK KODE DOSEN
        System.out.println("Kode Dosen \t: "+dosen.getKodeDosen());
        //MENCETAK NIM YANG SUDAH TERSIMPAN PADA METHOD GETNIMMHS DI CLASS DOSEN
        System.out.println("Mengajar Mahasiswa \t: ");
        for (int i=0; i<dosen.getJmlMahasiswa(); i++) {
            System.out.println("- "+dosen.getNimMhs(i));
        }
    }
}
