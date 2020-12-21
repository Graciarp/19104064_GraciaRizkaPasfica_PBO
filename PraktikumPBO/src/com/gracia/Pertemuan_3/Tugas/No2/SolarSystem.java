package com.gracia.Pertemuan_3.Tugas.No2;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    //DEKLARASI VARIABLE
    public String id, nama;
    public List<Planet> planets = new ArrayList<>();

    //CONSTRUCTOR
    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    //SETTER PLANET
    /*
        yang mengatur jenis - jenis planet adalah class SolarSystem
        dengan isi variable dari class planet
        kemudian Class planet mendapatkan data planet dari class SolarSystem
     */
    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    //GETTER
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    //METHOD UNTUK MENCETAK DATA PLANET
    public void getData(){
        System.out.println("Solar System ID \t\t: "+id);
        System.out.println("Jenis Solar System \t\t: "+nama);
        System.out.println("\nList Planet \t\t\t: ");
        for (Planet planet : planets) {
            System.out.println("Urutan planet ke-"+planet.urutanPlanet);
            System.out.println("ID Planet \t\t: "+planet.idPlanet);
            System.out.println("Nama Planet \t: "+planet.namaPlanet);
            System.out.println();
        }
    }
}
