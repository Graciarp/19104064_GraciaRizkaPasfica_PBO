//This code was written by Gracia Rizka Pasfica

function cek(nama, nilai) {
    this.nama = nama
    this.nilai = nilai
}

function grade(nilai) {
    if(nilai>=85 && nilai<=100){
        return 'A'
    } else if(nilai>=75){
        return 'B'
    } else if(nilai>=65){
        return 'BC'
    } else if(nilai>=55){
        return 'C'
    } else if(nilai>=45){
        return 'D'
    } else {
        return 'E'
    }
}

var input = new cek("Gracia Rizka Pasfica", 100)
var hasil = grade(input.nilai)

console.log("Masukkan nama \t: "+input.nama)
console.log("Masukkan nilai \t: "+input.nilai)
console.log(input.nama+" , kamu mendapat predikat "+grade(input.nilai))