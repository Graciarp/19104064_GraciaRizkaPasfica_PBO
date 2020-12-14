const prompt = require('prompt-sync')() //perintah untuk input

//Deklarasi object untuk menginputkan
let object = {} //object null
object.name = prompt('Input Name \t: ') //deklarasi input
object.age = prompt('Input Age \t: ')
object.nim = prompt('Input NIM \t: ')
object.prodi = prompt('Input Prodi : ')

console.log('')

//melihat isi dari object
console.log('Memanggil object dengan cara biasa : ')
console.log(object)

console.log('')
//foreach untuk menampilkan isi dari object
console.log('Memanggil object menggunakan foreach : ')
for(var property in object){
  console.log(property+` \t: ${object[property]}`)
}

/*
  Catatan tambahan :
  ==> cara pemanggilan object
      1. object.name 
      2. object['name']
*/