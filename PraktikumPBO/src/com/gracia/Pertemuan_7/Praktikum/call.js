//This code was written by Gracia Rizka Pasfica

//membuat method person
var person = {
    fullName: function(){
        return this.firstName+" "+this.secondName+" "+this.lastName
    }
}

var person1 = {
    firstName : "Gracia",
    secondName : "Rizka",
    lastName : "Pasfica"
}

var person2 = {
    firstName : "Subudi",
    secondName : "Anbudi",
    lastName : "Onbodi"
}

console.log("Menggunakan method call untuk menampilkan objek person 1: ")

//memanggil method menggunakan method call()
person.fullName.call(person1);