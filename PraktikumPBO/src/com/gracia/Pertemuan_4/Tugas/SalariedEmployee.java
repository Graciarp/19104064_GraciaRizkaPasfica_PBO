package com.gracia.Pertemuan_4.Tugas;
/*
 * This code was written by Gracia Rizka Pasfica
 */

public class SalariedEmployee extends Employess{
    private String nama;
    private int upahMinimum;

    SalariedEmployee(String nama, int upahMinimum) {
        super("Employee");
        this.nama = nama;
        this.upahMinimum = upahMinimum;
    }

    @Override
    protected void cetakInformasi() {
        System.out.println("Nama \t: Bambang Hartono");
        System.out.println("NIP \t: "+3303001);
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
        return (int)(upahMinimum);
    }
}
