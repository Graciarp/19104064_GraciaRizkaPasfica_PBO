package com.gracia.Pertemuan_1.Praktikum;

public class kelas {
    //ini merupakan identifier di luar main
    private static String nama = "Paiman";

    //ini merupakan sebuah function
    private static int setMinute(){
        int minute = 10;
        return minute;
    }

    //ini adalah program utama
    public static void main(String[] args) {
        System.out.println("Nama \t\t: "+nama);
        System.out.println("Set Minute \t:"+setMinute());
    }
}
