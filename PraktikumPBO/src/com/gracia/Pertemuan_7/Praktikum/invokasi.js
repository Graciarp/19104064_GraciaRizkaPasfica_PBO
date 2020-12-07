//This code was written by Gracia Rizka Pasfica

//contoh 1
function myFunction(a, b, c){
    console.log("Hello, my name is ",a)
    console.log("I'm ",b," years old")
    console.log("I like ",c)
}

console.log("\nOutput Contoh 1")

//melakukan invokasi fungsi
myFunction("Gracia Rizka Pasfica", 20, "Sleeping")

//contoh 2
function myFunction2(arg1, arg2){
    this.firstName = arg1;
    this.lastName = arg2;
}

//membuat objek dari fungsi myFunction
var x = new myFunction2("Rizka", "Pasfica");

console.log("\nOutput contoh 2 ")

//memanggil fungsi dari properti yang ada di dalam fungsi
x.firstName;