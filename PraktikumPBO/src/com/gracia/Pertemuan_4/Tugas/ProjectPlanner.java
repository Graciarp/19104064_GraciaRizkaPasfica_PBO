package com.gracia.Pertemuan_4.Tugas;

/*
 * This code was written by Gracia Rizka Pasfica
 */

public class ProjectPlanner extends Employess{
    private String nama;
    private double komisi, gajiPokok, total;

    ProjectPlanner(String nama, int gajiPokok, double komisi, int total){
        super("Planner");
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.total = total;
    }

    @Override
    protected void cetakInformasi() {
        System.out.println("Nama \t: Andika Kangen Band");
        System.out.println("NIP \t: "+3303003);
        System.out.println("Gaji \t: Rp "+hitungGaji()+",-");
    }

    @Override
    protected void cetakInformasi(int i) {

    }

    @Override
    public String toString() {
        return super.toString()+" "+nama;
    }

    protected int hitungGaji(){
        return (int) (gajiPokok+(komisi*total)-(0.005*gajiPokok));
    }
}
