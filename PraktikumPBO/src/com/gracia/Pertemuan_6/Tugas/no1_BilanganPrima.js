//DEKLARASI VARIABLE
var bil
console.log("Menampilkan Deret Bilangan Prima 1-100\n")

for(var i=1; i<=100; i++){
    bil = 0;
    for(var j=1; j<=i; j++){
        if(i%j==0){
            bil = bil+1;
        }
    }
    if(bil==2){
        console.log(i+" ")
    }
}