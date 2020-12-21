/*
  penulisan constructor pada javascript != constructor pada java karena javascript tidak mengenal kelas.
  Penulisannya menggunakan function 
    function nama_Constructor(parameter){
      this.parameter = nama_parameter
    }
  Pada constructor javascript dapat menambahkan function di dalam JavaScript
*/

//constructor
function Buku(judul, pengarang, penerbit, thTerbit){
  this.judul = judul
  this.pengarang = pengarang
  this.penerbit = penerbit
  this.thTerbit = thTerbit

  //function di dalam konstruktor
  this.tampil = function(){
    console.log('Judul Buku \t\t\t: ',this.judul)
    console.log('Nama Pengarang \t\t: ',this.pengarang)
    console.log('Penerbit \t\t\t: ',this.penerbit)
    console.log('Tahun Terbit \t\t: ',this.thTerbit)
  }
}

//deklarasi prompt (input)
const prompt = require('prompt-sync')()
/* 
  Format pemanggilan library
  require('nama_library')
*/

//input data
let jmlBuku = prompt('Jumlah buku yang akan diinput : ')

//deklarasi arrayBuku
var arrayBuku = []

//deklarasi object
var buku = {}

//perulangan untuk membuat objek
for(let i=1; i<=jmlBuku; i++){
  console.log('\n')
  //membuat object dengan konstruktor
  buku = new Buku(
    prompt(`Masukkan judul buku ke-${i} \t: `),
    prompt(`Masukkan nama pengarang \t: `),
    prompt(`Masukkan nama penerbit \t\t: `),
    prompt(`Masukkan tahun terbit \t\t: `)
  )
  //menyimpan data array yang diinputkan
  arrayBuku.push(buku)
}

//ubah data
console.log('\n')
var editData = prompt('\nIngin mengubah data ?[ya/tidak] : ')

if(editData == 'ya'){
  var noBuku = prompt('Masukkan urutan buku yang ingin diubah : ')
  var namaData = prompt('Masukkan data yang ingin diubah [Judul/Pengarang/Penerbit/Tahun Terbit] : ')

  let index = noBuku-1 //-1 karena noBuku dimulai dari 1 sedangkan index = array
  if(namaData=='Judul'){
    arrayBuku[index].judul = prompt('Masukkan judul buku baru : ')
  } else if(namaData=='Pengarang') {
    arrayBuku[index].pengarang = prompt('Masukkan nama pengarang baru : ')
  } else if(namaData=='Penerbit'){
    arrayBuku[index].penerbit = prompt('Masukkan nama penerbit baru : ')
  } else if(namaData=='Tahun Terbit'){
    arrayBuku[index].thTerbit = prompt('Masukkan tahun terbit baru : ')
  } else {
    console.log('Pilihan tidak sesuai')
  }

  console.log('\nData buku yang berhasil disimpan')
  index = 1
  for(let i in arrayBuku){
    console.log(`\nBuku ke-${index}`)
    index++
    arrayBuku[i].tampil()
  }
} else if(editData == 'tidak'){
  console.log('\nData buku yang berhasil disimpan')
  index = 1
  for(let i in arrayBuku){
    console.log(`\nBuku ke-${index}`)
    index++
    arrayBuku[i].tampil()
  }
} else {
  console.log('Pilihan tidak sesuai')
}