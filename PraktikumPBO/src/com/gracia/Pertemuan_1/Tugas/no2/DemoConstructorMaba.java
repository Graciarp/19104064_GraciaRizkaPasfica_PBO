package com.gracia.Pertemuan_1.Tugas.no2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoConstructorMaba {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa yang akan di data : ");
        int jml = scanner.nextInt();
        String nama[] = new String[jml];
        int nim[]= new int[jml];
        ConstructorMaba arrayMaba[] = new ConstructorMaba[jml];
        ConstructorMaba dataMaba = new ConstructorMaba();

        //isi data
        for (int i = 0; i < jml; i++) {
            System.out.print("Nama maba ke-"+(i+1)+" \t: ");
            nama[i] = bf.readLine();
            dataMaba.setNama(nama[i]);
            System.out.print("NIM maba ke-"+(i+1)+" \t: ");
            nim[i] = scanner.nextInt();
            dataMaba.setNim(nim[i]);
            arrayMaba[i] = dataMaba;
            System.out.println("Nama \t\t\t: "+dataMaba.getNama());
            System.out.println("NIM \t\t\t: "+dataMaba.getNim());
        }
    }
}
