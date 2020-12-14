package com.gracia.Pertemuan_3.Praktikum.Komposisi;

public class Cpu {
    //DEKLARASI VARIABLE
    private String processor;
    private String gpu;
    private String ram;

    //CONSTRUCTOR
    public Cpu(String processor, String gpu, String ram) {
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }

    //CETAK DATA CPU
    public void PrintSpec(){
        System.out.println("- Processor\t: "+processor);
        System.out.println("- GPU\t\t: "+gpu);
        System.out.println("- RAM\t\t: "+ram+" Gb");
        System.out.println();
    }
}
