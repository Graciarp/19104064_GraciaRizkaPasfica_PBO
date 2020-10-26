package com.gracia.Pertemuan_1.Praktikum.pass;

public class TestPass {
    int nomer1;
    int nomer2;

    //Constructor
    public TestPass(int nomer1, int nomer2){
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    //Method pass by value
    public void calculate(int m, int n){
        m = m*10;
        n = n/2;
    }

    //Method pass by reference
    //membuat object pada class sendiri (digunakan jika membutuhkan variable dalam class sendiri)
    public void calculate(TestPass pass){
        pass.nomer1 = pass.nomer1*10;
        pass.nomer2 = pass.nomer2/2;
    }

    /*
        method pass by value, parameternya identik dengan tipe data primitif
        method pass by reference, parameternya identik dengan tipe data buatan.
        => Contoh : Testpass pass (tipedatanya nama class & pass sebagai nama variable)
     */
}
