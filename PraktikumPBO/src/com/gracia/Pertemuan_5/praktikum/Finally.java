package com.gracia.Pertemuan_5.praktikum;

/* Code was written by GRACIA RIZKA PASFICA */

public class Finally {
    public static void main(String[] args) {
        //Membuat try catch dengan menambahkan finnaly
        //deklarasi array
        int[] array = new int[5];
        //try catch finally
        try{
            System.out.println("Akses Elemen ke-5 \t: "+array[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown \t: "+e);
        } finally {
            array[array.length - 1] = 10;
            System.out.println("Nilai elemen terakhir \t: "+array[array.length-1]);
        }
    }
}
