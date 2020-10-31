package com.gracia.Pertemuan_4.Praktikum.Interface;

/*
    Class childCD merupakan turunan dari class cd dan interfaceCD
 */
public class ChildCD extends CD implements InterfaceCD{
    public ChildCD(String ukuran, long hargaCD) {
        super(ukuran, hargaCD);
    }
}
