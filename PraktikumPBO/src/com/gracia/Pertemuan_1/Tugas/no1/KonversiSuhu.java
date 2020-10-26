package com.gracia.Pertemuan_1.Tugas.no1;

public class KonversiSuhu {
    double c,f,k,r;
    /*
        Constructor adalah method yang namanya sama persis dengan nama classnya.
        Berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut
        dibuat dalam bentuk object pada class lain.
        Constructor bisa memiliki parameter bisa juga tidak
     */
    //Constructor
    public KonversiSuhu() {
    }

    //Method pass by reference
    public void konversi(KonversiSuhu suhu){
        suhu.f = (1.8*suhu.c)+32;
        suhu.k = (0.56)*(suhu.f-32)+273;
        suhu.r = (0.8)*(suhu.k-273);
        suhu.c = (1.25)*suhu.r;
    }
}
