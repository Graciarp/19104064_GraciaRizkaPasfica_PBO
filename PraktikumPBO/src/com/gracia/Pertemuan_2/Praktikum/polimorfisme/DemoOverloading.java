package com.gracia.Pertemuan_2.Praktikum.polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        lagu lagu1 = new lagu("Badai telah berlalu");
        lagu lagu2 = new lagu("Halu","feby");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
