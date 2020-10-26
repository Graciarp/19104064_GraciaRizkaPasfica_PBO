package com.gracia.Pertemuan_1.Praktikum;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi objek tanpa parameter
        /*
            Penulisan object :
            nama_class nama_object = new namaclass();
            apabila di dalam tanda kurung kosong maka memanggil construct yang kosong
            jika menggunakan constructor yang ada parameter maka object juga harus ada parameternya
         */
        mahasiswa mahasiswaTanpa = new mahasiswa();

        //mengatur isi dari variable
        mahasiswaTanpa.setNama("Gracia");
        mahasiswaTanpa.setNim(19104064);

        System.out.println("Nama \t: "+mahasiswaTanpa.getNama());
        System.out.println("NIM \t: "+mahasiswaTanpa.getNim());

        //deklarasi object dengan parameter , untuk ini bisa tanpa menggunakan setter
        mahasiswa mahasiswa = new mahasiswa("Rizka",19104064);
        //memanggil isi dari variable pada class mahasiswa
        System.out.println("Nama \t: "+mahasiswa.getNama());
        System.out.println("NIM \t: "+mahasiswa.getNim());
    }
}
