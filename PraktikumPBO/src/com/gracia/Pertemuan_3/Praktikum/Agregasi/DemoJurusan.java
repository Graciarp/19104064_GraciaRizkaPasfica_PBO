package com.gracia.Pertemuan_3.Praktikum.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("2110","Software Engineering");

        Mahasiswa mahasiswa1 = new Mahasiswa("Paimon", 21104001);
        Mahasiswa mahasiswa2 = new Mahasiswa("Paimin", 21104002);
        Mahasiswa mahasiswa3 = new Mahasiswa("Paimun", 21104003);

        //list mahasiswa dar class demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Paiman",21104004));

        //copas data dari list mahasiswa class "demoJurusan" ke class "Jurusan"
        jurusan.setMahasiswaList(mahasiswaList);

        jurusan.addMahasiswa(mahasiswa3);
        jurusan.printDataJurusan();
    }
}
