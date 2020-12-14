//perintah input
const prompt = require('prompt-sync')() 

//function tampilan menu
function Menu(){ 
    console.log('<===== Menu Penilaian =====>')
    console.log('1. Tambah Mahasiswa')
    console.log('2. Penilaian')
    console.log('3. Lihat Seluruh Mahasiswa')
    console.log('4. Keluar')
    let pil = prompt('Masukkan pilihan \t: ') //input pilihan
    console.log(pilihan(pil))
}

console.log(Menu()) //menampilkan menu

//function pilihan menu
function pilihan(pil){
  if(pil==1){
    console.log(Menu1())
    console.log(Menu())
  } else if(pil==2){
    console.log(Menu2())
    console.log(Menu())
  }else if(pil==3){
    console.log(Menu3())
    console.log(Menu())
  } else if (pil==4){
    console.log('Bye !')
  }
}

//function menu tambah mahasiswa
function Menu1(){
  var arrayMahasiswa = [] //menyimpan array
  var mahasiswa = {} //object
  var prodiMahasiswa = []
  var prodiinput = {}
  console.log('<===== Tambah Mahasiswa =====>')
  let jmlMhs = prompt('Berapa Mahasiswa \t: ')
  for (let i=0; i<jmlMhs; i++){
    console.log(`Mahasiswa ke-${i}`)
    mahasiswa = {
      nama : prompt('Input Nama \t\t\t: '),
      ttl : prompt('Input Tanggal Lahir : '),
      nim : prompt('Input NIM \t\t\t: ')
    }
    arrayMahasiswa.push(mahasiswa)
    console.log('<===== Pilih Prodi =====>')
      console.log('1. S1 SE')
      console.log('2. S1 IF')
      console.log('3. S1 SI')
    mahasiswa = {
      prodi : prompt('Input angka prodi \t: ')
    }
    prodiMahasiswa.push(prodiinput)
    console.log('')
  }
}

//function menu input nilai
function Menu2(){
  let nim = prompt('Masukkan Nim: ')
  let nilai = prompt('Masukkan Nilai : ')
}

//function menu Penilaian
function Menu3(){
  let index = 0
  for(let x in Menu1.arrayMahasiswa){
    console.log('<===== Data Mahasiswa =====>')
    console.log(`Mahasiswa ke-${index}`)
    index++ 
    console.log(`Nama \t\t\t: ${Menu1.arrayMahasiswa[x].nama}`)
    console.log(`Tanggal Lahir : ${Menu1.arrayMahasiswa[x].ttl}`)
    console.log(`NIM \t\t\t: ${Menu1.arrayMahasiswa[x].nim}`)
    console.log('')
  }
  for(let x in Menu1.prodiMahasiswa){
      console.log(`Prodi \t\t\t: ${Menu1.prodiMahasiswa[x].prodi}`)
  }
}