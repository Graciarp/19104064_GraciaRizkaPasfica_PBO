package com.gracia.Pertemuan_2.Praktikum.polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X supperClass = new X();
        Y subClass = new Y();

        supperClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
