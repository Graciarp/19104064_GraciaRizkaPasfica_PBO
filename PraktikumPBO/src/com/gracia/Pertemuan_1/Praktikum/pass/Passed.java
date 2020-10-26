package com.gracia.Pertemuan_1.Praktikum.pass;

public class Passed {
    public static void main(String[] args) {
        int nomer1, nomer2;
        //deklarasi object
        TestPass pass = new TestPass(50,100);
        nomer1 = 10;
        nomer2 = 20;

        //Passed by Value
        System.out.println("Nilai sebelum passed by value \t: ");
        System.out.println("nomer 1 = "+nomer1);
        System.out.println("nomer 2 = "+nomer2);

        pass.calculate(nomer1,nomer2); //memanggil method calculate
        System.out.println("Nilai sesudah passed by value : ");
        System.out.println("nomer1 = "+nomer1);
        System.out.println("nomer2 = "+nomer2);

        //Passed by reference
        System.out.println();
        System.out.println("Nilai sebelum passed by reference : ");
        System.out.println("nomer1 = "+pass.nomer1);
        System.out.println("nomer2 = "+pass.nomer2);

        pass.calculate(pass); //variable pass berisi 50 dan 100
        System.out.println("Nilai sesudah passed by reference : ");
        System.out.println("nomer1 = "+pass.nomer1);
        System.out.println("nomer2 = "+pass.nomer2);

        /*
            pada pass by value, yang terpakai adalah variabel yang dipanggil.
            Walaupun object memerintahkan untuk mengeksekusi method calculate,
            tetap saja tidak ada perubahan pada outputnya.
            Kecuali jika pass by value menggunakan return

            Pada pass by reference, outputnya berbeda karena pemanggilannya
            menggunakan nama_object
         */
    }
}
