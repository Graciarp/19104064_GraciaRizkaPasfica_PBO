package com.gracia.Pertemuan_4.Praktikum.Abstrak;

public abstract class Binatang {
    private String jenis;

    public Binatang(String jenis){
        this.jenis = jenis;
    }

    //Method abstract
    protected abstract void suara();

    public String toString(){
        return "Seekor "+jenis;
    }
}
