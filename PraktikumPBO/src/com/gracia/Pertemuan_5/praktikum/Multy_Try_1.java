package com.gracia.Pertemuan_5.praktikum;

/* Code was written by GRACIA RIZKA PASFICA */

public class Multy_Try_1 {
    public static void main(String[] args) {
        //Mencoba multiple try dengan 1 catch

        //Deklarasi array
        int[] array = new int[5];

        //Multi Try Catch
        try {
            array[5] = 15/0;
            System.out.println(array[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic Exception");
            System.out.println("ArrayIndexOutOfBounds");
        }
    }
}
