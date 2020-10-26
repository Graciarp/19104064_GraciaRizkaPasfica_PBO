package com.gracia.Pertemuan_2.Tugas.no_3;

public class Mahasiswa {
    public String nama;
    public String status;
    public int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public void getStatus(){
        System.out.println("Nama \t\t: "+nama);
        System.out.println("Status \t\t: "+status);
        System.out.println("Semester \t: "+semester);
        System.out.println();
    }
}
