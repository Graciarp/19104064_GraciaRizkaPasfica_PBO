//This code was written by Gracia Rizka Pasfica

var person = {
    fullName : function(birth, city){
        return this.firstName + " "+this.secondName+" "+this.lastName+","+birth+" , "+city;
    }
};

var person1 = {
    firstName : "Gracia",
    secondName : "Rizka",
    lastName : "Pasfica"
};

//menggunakan apply
person.fullName.apply(person1, ["Desember","Purbalingga"]);


/*
    jika menggunakan call maka :
    person.fullName.call(person1, Desember, "Purbalingga")
*/