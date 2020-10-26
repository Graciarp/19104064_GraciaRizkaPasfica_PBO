package com.gracia.Pertemuan_2.Tugas.no_1;

public class DemoClub {
    public static void main(String[] args) {
        Club club = new Club("Gracia Rizka Pasfica");
        Club club1 = new Club("Aremania","Merupakan sebuah klub sepak bola");
        Club club2 = new Club("Persiba","Bandung",1950);
        Club club3 = new Club("Persija","Jawa Timur", "Merupakan sebuah klub sepak bola",1950,2);

        club.getTeam();
        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
    }
}
