const prompt = require('prompt-sync')() //perintah input

let total = prompt('Berapa mahasiswa \t: ')//deklarasi input

var arrayMahasiswa = [] //array
var mahasiswa = {} //object

for(let i=0; i<total; i++){
  console.log(`\nMahasiswa ke-${i}`)

  //input dengan object
  let name = prompt('Masukkan nama \t\t\t: ')
  let birth = prompt('Masukkan tanggal lahir \t: ')
  let nim = prompt('Masukkan NIM \t\t\t: ')
  mahasiswa = new Mahasiswa(name,birth,nim)
  /*
    mahasiswa = new Mahasiswa(
      prompt('Masukkan nama \t\t\t: '),
      prompt('Masukkan tanggal lahir \t: '),
      prompt('Masukkan NIM \t\t\t: ')
    )
  */
  //menyimpan hasil inputan
  arrayMahasiswa.push(mahasiswa)
}

let index = 0
for(let x in arrayMahasiswa){
  console.log(`\nMahasiswa ${index}`)
  index++
  //memanggil value object
  console.log(`Name \t\t\t: ${arrayMahasiswa[x].name}`)
  console.log(`Tanggal Lahir \t: ${arrayMahasiswa[x].birth}`)
  console.log(`NIM \t\t\t: ${arrayMahasiswa[x].nim}`)
  console.log(`Umur \t\t\t: ${arrayMahasiswa[x].age()}`)
}

function Mahasiswa(name, birth, nim){
    this.name = name
    this.birth = birth
    this.nim = nim
    this.age = function(){
      let year = this.birth.slice(this.birth.length - 4)
      return 2020 - year
    }
}