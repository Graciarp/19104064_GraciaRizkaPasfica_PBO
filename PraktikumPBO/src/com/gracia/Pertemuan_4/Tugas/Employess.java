package com.gracia.Pertemuan_4.Tugas;

/*
 * This code was written by Gracia Rizka Pasfica
 */

public abstract class Employess {
    private String jenis;

    Employess(String jenis){
        this.jenis = jenis;
    }

    protected abstract void cetakInformasi();

    protected abstract void cetakInformasi(int i);

    public String toString(){
        return "Jenis "+jenis;
    }
}
