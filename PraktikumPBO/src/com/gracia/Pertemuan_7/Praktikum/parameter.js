//This code was written by Gracia Rizka Pasfica

//membuat function dengan 1 parameter
function reflect(value){
    return value;
}

//menampilkan fungsi
console.log(reflect("Halo"));
console.log(reflect("Hari ini hari ke- ",2));
console.log("Panjang argumen : ",reflect.length);

//meredefinisi function reflect
reflect = function(){
    return arguments[1];
};

console.log(reflect("Halo"));
console.log(reflect("Hari ini hari ke ",2));
console.log("Panjang argumen : ",reflect.length);