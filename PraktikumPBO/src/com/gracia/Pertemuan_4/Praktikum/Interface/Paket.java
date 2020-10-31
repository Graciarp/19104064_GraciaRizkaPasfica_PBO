package com.gracia.Pertemuan_4.Praktikum.Interface;

public class Paket extends Buku implements InterfaceCD{
    long hargaPaket;
    InterfaceCD interfaceCD;

    public Paket(String judul, String pengarang, long hargaBuku, String ukurang, long hargaCD){
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukurang, hargaCD);
    }

    public void hitungHargaPake(){
        hargaPaket = super.hargaBuku + getHargaCD();
    }

    @Override
    public long getHargaCD() {
        return (interfaceCD.getHargaCD());
    }

    @Override
    public void cetakCD() {
        interfaceCD.cetakCD();
    }

    public void cetakPaket(){
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga Paket buku dan CD : Rp "+hargaPaket+"\n");
    }
}
