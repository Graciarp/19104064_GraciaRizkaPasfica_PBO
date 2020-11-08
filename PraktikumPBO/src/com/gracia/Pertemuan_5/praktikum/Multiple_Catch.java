package com.gracia.Pertemuan_5.praktikum;

/* Code was written by GRACIA RIZKA PASFICA */

public class Multiple_Catch {
    public static void main(String[] args) {
        //Mengecek kesalahan pada array
        //Deklarasi array
        int[] array = new int[5];
        //Multi try catch
        try {
            //try dijalankan jika statement benar
            array[5] = 30/0; //misalkan mencoba membuat kesalahan || tidak ada array ke-5
            System.out.println(array[5]);
        } catch (ArithmeticException e){
            //Jika salah pada hasil aritmatika
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e){
            //Jika salah pada indeks array
            System.out.println("ArrayIndexOutOfBound");
        }
    }
}
