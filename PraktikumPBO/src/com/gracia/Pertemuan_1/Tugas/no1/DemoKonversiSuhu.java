package com.gracia.Pertemuan_1.Tugas.no1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        double c;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        KonversiSuhu convert = new KonversiSuhu();

        System.out.print("Masukkan derajat celcius : ");
        c = scanner.nextDouble();
        System.out.println();
        convert.c = c;

        convert.konversi(convert);
        System.out.println("Konversi suhu Celcius ke Fahrenheit : "+df.format(convert.f));
        System.out.println("Konversi suhu Fahrenheit ke Kelvin \t: "+df.format(convert.k));
        System.out.println("Konversi suhu Kelvin ke Reamur \t\t: "+df.format(convert.r));
        System.out.println("Konversi suhu Reamur ke Celcius \t: "+df.format(convert.c));
    }
}
