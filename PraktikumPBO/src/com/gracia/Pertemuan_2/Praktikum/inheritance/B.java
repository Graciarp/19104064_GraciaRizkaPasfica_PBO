package com.gracia.Pertemuan_2.Praktikum.inheritance;

//class untuk inheritance
/*
    Class A akan diturunkan kepada class B
    menggunakan fungsi extend
 */

public class B extends A{
    public int z;
    //method yang akan digunakan untuk mengkalkulasikan
    public void sumValue(){
        System.out.println("Jumlah\t: "+(x+y+z));
    }
}
