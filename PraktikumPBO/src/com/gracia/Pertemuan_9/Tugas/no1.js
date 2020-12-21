//constructor
function Hewan(nama, jenis, umur, makanan, riwayatPenyakit){
  this.nama = nama
  this.jenis = jenis
  this.umur = umur
  this.makanan = makanan
  this.riwayatPenyakit = riwayatPenyakit

  //function di dalam konstruktor
  this.tampil = function(){
    console.log('Nama hewan \t\t\t: ',this.nama)
    console.log('Jenis hewan \t\t: ',this.jenis)
    console.log('Umur hewan \t\t\t: ',this.umur)
    console.log('Makanan hewan \t: ',this.makanan)
    console.log('Riwayat penyakit : ',this.riwayatPenyakit)
  }
}

//deklarasi prompt (input)
const prompt = require('prompt-sync')()
/* 
  Format pemanggilan library
  require('nama_library')
*/

//input data
let jmlHewan = prompt('Jumlah hewan yang akan diinput : ')

//deklarasi arrayBuku
var arrayHewan = []

//deklarasi object
var hewan = {}

//perulangan untuk membuat objekkelin
for(let i=1; i<=jmlHewan; i++){
  console.log('\n')
  //membuat object dengan konstruktor
  console.log(`Masukkan hewan ke-${i} \t: `)
  hewan = new Hewan(
    prompt(`Masukkan nama hewan \t\t: `),
    prompt(`Masukkan jenis hewan \t\t: `),
    prompt(`Masukkan umur hewan \t\t: `),
    prompt(`Masukkan makanan hewan \t\t: `),
    prompt(`Masukkan riwayat penyakit \t: `)
  )
  //menyimpan data array yang diinputkan
  arrayHewan.push(hewan)
}

//ubah data
console.log('\n')
var editData = prompt('\nIngin mengubah data ?[ya/tidak] : ')

if(editData == 'ya'){
  var noHewan = prompt('Masukkan urutan hewan yang ingin diubah : ')
  var namaData = prompt('Masukkan data yang ingin diubah [nama/jenis/umur/makanan/riwayatPenyakit] : ')

  let index = noHewan-1 //-1 karena noBuku dimulai dari 1 sedangkan index = array
  if(namaData=='nama'){
    arrayHewan[index].nama = prompt('Masukkan nama hewan baru : ')
  } else if(namaData=='jenis') {
    arrayHewan[index].jenis = prompt('Masukkan jenis hewan baru : ')
  } else if(namaData=='umur'){
    arrayHewan[index].umur = prompt('Masukkan umur hewan baru : ')
  } else if(namaData=='makanan'){
    arrayHewan[index].makanan = prompt('Masukkan makanan baru : ')
  } else if(namaData=='riwayatPenyakit'){
    arrayHewan[index].riwayatPenyakit = prompt('Masukkan riwayat penyakit : ')
  } else {
    console.log('Pilihan tidak sesuai')
  }

  console.log('\nData hewan yang berhasil disimpan')
  index = 1
  for(let i in arrayHewan){
    console.log(`\nHewan ke-${index}`)
    index++
    arrayHewan[i].tampil()
  }
} else if(editData == 'tidak'){
  console.log('\nData hewan yang berhasil disimpan')
  index = 1
  for(let i in arrayHewan){
    console.log(`\nHewan ke-${index}`)
    index++
    arrayHewan[i].tampil()
  }
} else {
  console.log('Pilihan tidak sesuai')
}