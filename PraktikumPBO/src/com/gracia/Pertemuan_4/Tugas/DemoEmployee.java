package com.gracia.Pertemuan_4.Tugas;

public class DemoEmployee {
    public static void main(String[] args) {
        Employess[] employess = {
                new SalariedEmployee("Salaried",1000000),
                new CommissionEmployee("Commision",3000000,0.005,25000000),
                new ProjectPlanner("Project",5000000,0.15,12000000)
        };

        Employess cetakInformasi;
        for (int i = 0; i < employess.length; i++) {
            cetakInformasi = employess[i];
            System.out.println(employess[i]);
            cetakInformasi.cetakInformasi();
            System.out.println();
        }
    }
}
