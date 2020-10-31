package com.gracia.Pertemuan_4.Praktikum.Abstrak;

public class Anjing extends Binatang{
    private String nama;

    public Anjing(String nama){
        super("Anjing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.print(" menggonggong");
    }

    @Override
    public String toString() {
        return super.toString()+" "+nama;
    }
}
