package com.gracia.Pertemuan_3.Tugas.No2;

public class Planet {
    //DEKLARASI VARIABLE PADA CLASS PLANET
    public int idPlanet, urutanPlanet;
    public String namaPlanet;

    //CONSTRUCTOR
    public Planet(int idPlanet, int urutanPlanet, String namaPlanet) {
        this.idPlanet = idPlanet;
        this.urutanPlanet = urutanPlanet;
        this.namaPlanet = namaPlanet;
    }

    //GETTER AND SETTER
    public int getIdPlanet() {
        return idPlanet;
    }

    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    public int getUrutanPlanet() {
        return urutanPlanet;
    }

    public void setUrutanPlanet(int urutanPlanet) {
        this.urutanPlanet = urutanPlanet;
    }

    public String getNamaPlanet() {
        return namaPlanet;
    }

    public void setNamaPlanet(String namaPlanet) {
        this.namaPlanet = namaPlanet;
    }
}
