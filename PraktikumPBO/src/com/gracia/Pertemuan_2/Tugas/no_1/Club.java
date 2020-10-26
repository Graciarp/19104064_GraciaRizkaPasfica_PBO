package com.gracia.Pertemuan_2.Tugas.no_1;

public class Club {
    public String nama, stadion, deskripsi;
    public int tahunBerdiri, juaraUcl;

    //Constructor tanpa parameter
    public Club() {
    }

    //Constructor 1 parameter
    public Club(String nama) {
        this.nama = nama;
    }

    //Constructor 2 parameter
    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    //Constructor 3 parameter
    public Club(String nama, String stadion, int tahunBerdiri) {
        this.nama = nama;
        this.stadion = stadion;
        this.tahunBerdiri = tahunBerdiri;
    }

    //Constroctor 5 parameter
    public Club(String nama, String stadion, String deskripsi, int tahunBerdiri, int juaraUcl) {
        this.nama = nama;
        this.stadion = stadion;
        this.deskripsi = deskripsi;
        this.tahunBerdiri = tahunBerdiri;
        this.juaraUcl = juaraUcl;
    }

    //method getTeam
    public void getTeam(){
        System.out.println("Nama \t\t\t: "+nama);
        System.out.println("Tahun Berdiri \t: "+tahunBerdiri);
        System.out.println("Stadion \t\t: "+stadion);
        System.out.println("Juara UCL \t\t: "+juaraUcl);
        System.out.println("Deskripsi \t\t: "+deskripsi);
    }
}
