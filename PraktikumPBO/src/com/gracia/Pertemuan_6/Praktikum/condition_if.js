//DEKLARASI VARIABLE
var bilangan = 10

if(bilangan == 10)
    console.log('variable bilangan memiliki nilai \t: '+bilangan)

//BUAT NILAI BARU
bilangan = 15
//IF UNTUK MENGECEK GANJIL GENAP (2 KONDISI)
if(bilangan%2 == 0){
    console.log(bilangan+" adalah bilangan genap")
} else {
    console.log(bilangan+" adalah bilangan ganjil")
}

//IF 3 KONDISI
bilangan = -30
if(bilangan>0){
    console.log(bilangan+" adalah bilangan positif")
} else if(bilangan<0){
    console.log(bilangan+" adalah bilangan negatif")
} else {
    console.log(bilangan+" adalah bilangan netral")
}