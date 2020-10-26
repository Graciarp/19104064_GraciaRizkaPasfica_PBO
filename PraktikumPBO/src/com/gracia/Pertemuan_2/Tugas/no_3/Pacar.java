package com.gracia.Pertemuan_2.Tugas.no_3;

public class Pacar extends Mahasiswa{
    public String namaPacar;
    public String lamaHub;

    public Pacar(String nama, String status, int smt, String namaPacar, String lamaHub) {
        super(nama,status,smt);
        this.namaPacar = namaPacar;
        this.lamaHub = lamaHub;
    }
}
