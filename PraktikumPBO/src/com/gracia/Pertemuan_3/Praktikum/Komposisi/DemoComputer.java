package com.gracia.Pertemuan_3.Praktikum.Komposisi;

public class DemoComputer {
    public static void main(String[] args) {
        //OBJECT COMPUTER DENGAN DATA TIPE COMPUTER GAMING
        Computer computer = new Computer("Gaming");

        //MENAMBAHKAN DATA PADA SETIAP CLASS
        Keyboard keyboard = new Keyboard("Sades", "Mechanical");
        Mouse mouse = new Mouse("Razer", "800");
        Monitor monitor = new Monitor("Armageddon", "24", "144");
        Cpu cpu = new Cpu("Intel i7", "Nvidia", "16");

        //MENAMBAHKAN DATA PADA DATA YANG SUDAH DIINPUTKAN
        computer.addComponent(keyboard, mouse, monitor, cpu);

        //MENCETAK DATA
        System.out.println("Type Computer\t: "+computer.getType());
        System.out.println();
        System.out.println("Keyboard\t: ");
        computer.getKeyboard().PrintSpec();

        System.out.println("Mouse\t: ");
        computer.getMouse().PrintSpec();

        System.out.println("Monitor\t: ");
        computer.getMonitor().PrintSpec();

        System.out.println("CPU \t: ");
        computer.getCpu().PrintSpec();
    }
}
