package com.gracia.Pertemuan_3.Tugas.No2;

import java.util.ArrayList;
import java.util.List;

public class DemoTataSurya {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem("Z305A","PLANET");

        //INPUT PLANET
        Planet planet1 = new Planet(101,1,"MERKURIUS");
        Planet planet2 = new Planet(102,2,"VENUS");
        Planet planet3 = new Planet(103,3,"BUMI");
        Planet planet4 = new Planet(103,4,"MARS");
        Planet planet5 = new Planet(104,5,"JUPITER");
        Planet planet6 = new Planet(105,6,"SATURNUS");
        Planet planet7 = new Planet(106,7,"URANUS");

        //LIST PLANET
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet1);
        planetList.add(planet2);
        planetList.add(planet3);
        planetList.add(planet4);
        planetList.add(planet5);
        planetList.add(planet6);
        planetList.add(planet7);
        planetList.add(new Planet(107,8,"NEPTUNUS")); //INPUT DATA MELALUI ARRAYLIST

        //MENGAMBIL DATA PLANET YANG ADA DI DEMOTATASURYA KE SOLARSYSTEM
        solarSystem.setPlanets(planetList);

        //MENCETAK DATA PLANET YANG ADA DI CLASS SOLARSYSTEM
        solarSystem.getData();
    }
}
