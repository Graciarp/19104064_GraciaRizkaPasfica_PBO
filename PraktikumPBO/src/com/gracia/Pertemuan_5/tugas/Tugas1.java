package com.gracia.Pertemuan_5.tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        //DEKLARASI VARIABLE
        int jml, indeks;
        int[] id = new int[10];
        char lihat;

        //INPUT DATA
        Scanner scanner = new Scanner(System.in);
        System.out.println("<--- PELANGGAN --->");
        System.out.print("Masukkan jumlah pengunjung \t: ");
        jml = scanner.nextInt();
        System.out.println("Masukkan data pengunjung \t: ");
        try {
            for (int i = 0; i < jml; i++) {
                System.out.print("UID \t: ");
                id[i] = scanner.nextInt();
                System.out.println("Data ke-" + i + " terdaftar !!");
            }
            //CETAK DATA
            System.out.println("\nLihat Data Pengunjung \t: ");
            do{
                System.out.print("Indeks \t: ");
                indeks = scanner.nextInt();
                System.out.println("Data ke-"+indeks+" : "+id[indeks]);
                System.out.print("Lihat lagi ? (Y/N) \t: ");
                lihat = scanner.next().toUpperCase().charAt(0);
            } while (lihat=='Y');
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Data yang dimasukkan melebihi jumlah indeks !");
        } catch (InputMismatchException e){
            System.out.println("Jangan masukkan kata !!");
        } finally {
            int[] idbaru = new int[jml];
            for (int i = id.length; i < jml; i++) {
                System.out.print("UID : ");
                idbaru[i] = scanner.nextInt();
                System.out.println("Data ke-"+i+" terdaftar !!");
            }
            //CETAK DATA
            System.out.println("\nLihat Data Pengunjung \t: ");
            do{
                System.out.print("Indeks \t: ");
                indeks = scanner.nextInt();
                if(indeks<jml){
                    System.out.println("Data ke-"+indeks+" : "+idbaru[indeks]);
                } else {
                    System.out.println("Data ke-"+indeks+" : "+id[indeks]);
                }
                System.out.print("Lihat lagi ? (Y/N) \t: ");
                lihat = scanner.next().toUpperCase().charAt(0);
            } while (lihat=='Y');
        }
    }
}
