package com.gracia.Pertemuan_1.Tugas.no3;

public class DemoKelasKaryawan {
    public static void main(String[] args) {
        KelasKaryawan karyawan = new KelasKaryawan();
        karyawan.setNip(330312345);
        karyawan.setNama("Gracia Rizka Pasfica");
        karyawan.setTempat_lhr("Purbalingga");
        karyawan.setTgl_lhr("06 Desember 2000");
        karyawan.setJk("Perempuan");
        karyawan.setAlmt("Purbalingga");
        karyawan.setTgl_masuk("06 Maret 2013");
        karyawan.setGaji("Rp 15.000.000,-");
        karyawan.setJabatan("Direktur");

        System.out.println("Isi Detail Karyawan : ");
        System.out.println("NIP : "+karyawan.getNip());
        System.out.println("Nama Pegawai \t: "+karyawan.getNama());
        System.out.println("Tempat Lahir \t: "+karyawan.getTempat_lhr());
        System.out.println("Tanggal Lahir \t: "+karyawan.getTgl_lhr());
        System.out.println("Jenis Kelamin \t: "+karyawan.getJk());
        System.out.println("Alamat \t\t\t: "+karyawan.getAlmt());
        System.out.println("Tanggal Masuk \t: "+karyawan.getTgl_masuk());
        System.out.println("Gaji Pokok \t\t: "+karyawan.getGaji());
        System.out.println("Jabatan \t\t: "+karyawan.getJabatan());
    }
}
