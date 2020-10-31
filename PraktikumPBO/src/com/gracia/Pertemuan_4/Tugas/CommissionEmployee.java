package com.gracia.Pertemuan_4.Tugas;

/*
 * This code was written by Gracia Rizka Pasfica
 */

public class CommissionEmployee extends Employess{
    private String nama;
    private double komisi, gajiPokok, total;

    CommissionEmployee(String nama, int gajiPokok, double komisi, int total){
        super("Employee");
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.total = total;
    }

    @Override
    protected void cetakInformasi() {
        System.out.println("Nama \t: Si Buta dari Gua Hijau");
        System.out.println("NIP \t: "+3303002);
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
        return (int) (gajiPokok + (komisi*total));
    }
}
