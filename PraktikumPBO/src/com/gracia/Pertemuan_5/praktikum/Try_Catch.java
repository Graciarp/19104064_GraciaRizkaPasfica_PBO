package com.gracia.Pertemuan_5.praktikum;

/* Code was written by GRACIA RIZKA PASFICA */

import java.io.File;
import java.io.FileReader;

public class Try_Catch {
    public static void main(String[] args) {
        try {
            //Mencoba membaca berkas latihan.txt
            File file = new File("F:\\Kuliah\\Perkuliahan\\Semester 3\\PBO\\Praktikum\\Pertemuan 5\\FolderTryCatch");
            FileReader fileReader = new FileReader(file);
            //Jika berhasil maka menampilkan pesan
            System.out.println("Read File berhasil !!");
        } catch (Exception e){
            //Jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }
    }
}
