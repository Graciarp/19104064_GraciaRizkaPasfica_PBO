//This code was written by Gracia Rizka Pasfica

var person1 = {
    firstName : "Gracia",
    secondName : "Rizka",
    lastName : "Pasfica"
};

var nilai = [100,90.3,95.7,80.5,85.2];

function rerata() {    
    var jml = 0
    for(var i=0; i<nilai.length; i++){
        jml = jml + nilai[i]
    }
    var rata2 = jml/nilai.length
    return rata2
}


console.log("Nama \t\t\t: "+person1.firstName+" "+person1.secondName+" "+person1.lastName)
console.log("Rata2 Nilai \t: "+rerata())