package com.gracia.Pertemuan_2.Praktikum.polimorfisme;

public class Y extends X{
    @Override
    public void getValue(String value){
        super.getValue(value);
        System.out.println("Value class Y : "+value);
    }
}
