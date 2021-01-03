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
    console.log('Data sudah ditambahkan !')
    console.log()
    console.log(Menu())
  } else if(pil==2){
   console.log('<===== Penilaian =====>')
   //function untuk menginputkan nilai mahasiswa
   function nilai(nim, nilai){
     var nim 
     var nilai
     this.setNim = function(nim){
       nim = nim
     }
     this.getNim = function(){
       return nim
     }
     this.setNilai = function(nilai){
       nilai = nilai
     }
     this.getNim = function(){
       return nilai
     }
   }
   var nim = prompt('Masukkan nim\t\t: ')
   var nilaiInput = prompt('Masukkan nilai\t\t: ')
   var tambahNilai = nilai(nim, nilaiInput)
   console.log()
   console.log(Menu())
  }else if(pil==3){
    //function untuk mencetak data mahasiswa
    var person = (function(){
      var name = 'Gracia Rizka Pasfica'
      var ttl = '06 Desember 2000'
      var age = 20
      var nim = 19104064
      var prodi = 'S1 SE'
      var grade = 'A'
      return {
        name : name,
        ttl : ttl,
        age : age,
        nim : nim,
        prodi : prodi,
        grade : grade
      }
    }())
    console.log(`Nama \t\t\t\t: ${person.name}`)
    console.log(`Tanggal Lahir \t\t: ${person.ttl}`)
    console.log(`Umur \t\t\t\t: ${person.age}`)
    console.log(`NIM \t\t\t\t: ${person.nim}`)
    console.log(`Prodi \t\t\t\t: ${person.prodi}`)
    console.log(`Grade \t\t\t\t: ${person.grade}`)
    console.log
    console.log(Menu())
  } else if (pil==4){
    console.log('Bye !')
  }
}