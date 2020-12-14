//CARA MEMBUAT OBJECT BARU

var person0 = {} //deklarasi object tanpa value

var person1 = {name : "Gracia"} //deklarasi object dengan value

var person2 = new Object()
person2.name = "Rizka"

//menambahkan value pada properties
person1.age = 20
person2.age = 19

console.log('Memanggil Object 1 \t: ')
console.log(`Name \t: ${person1.name}`) //menggunakan petik 1
console.log('Age \t: '+person1.age) //menggunakan tanda +

console.log()

console.log('Memanggil Object 2 \t: ')
console.log(`Name \t: ${person1.name}`) //menggunakan petik 1
console.log('Age \t: '+person1.age) //menggunakan tanda +
