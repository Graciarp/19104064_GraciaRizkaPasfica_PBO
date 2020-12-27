//save as pegawai.js

//inheritance pada javascript
//parent object
var Pegawai = {
  inputData : function(nip, nama, alamat, gajiPokok){
    this.nip = prompt('Masukkan NIP \t\t: '),
    this.nama = prompt('Masukkan nama \t\t: '),
    this.alamat = prompt('Masukkan alamat \t: '),
    this.gajiPokok = prompt('Masukkan gaji pokok : ')
  },

  inputTunjangan : function(tunjangan){
    this.tunjangan = prompt('Masukkan tunjangan : ')
  },

  //attribut untuk mencetak data
  print : function(){
    console.log('NIP : ', this.nip)
    console.log('Nama : ', this.nama)
    console.log('Alamat : ', this.alamat)
    console.log('Gaji Pokok : ', this.gajiPokok)
    console.log('Tunjangan : ', this.tunjangan)
    console.log('Total Gaji : ', ((this.gajiPokok*1)+(this.tunjangan)))
  }
}

//child object(inheritance dari object pegawai)
var Satpam = Object.create(Pegawai)
//meredefinisi method inputTunjangan yang ada di object pegawai
Satpam.inputTunjangan = function(tunjangan){
  jam = prompt('Masukkan jumlah jam lembur : ')
  this.tunjangan = jam*10000
}

//child object(inheritance dari object Pegawai)
var Sales = Object.create(Pegawai)
Sales.inputTunjangan = function(tunjangan){
  jmlPelanggan = prompt('Masukkan jumlah pelanggan yang di rekrut : ')
  this.tunjangan = jmlPelanggan*50000
}

//child object(inheritance dari object Pegawai)
var Manager = Object.create(Pegawai)
Manager.inputTunjangan = function(tunjangan){
  thMasuk = prompt('Masukkan Tahun Masuk : ')
  lamaKerja = 2020 - thMasuk
  if(lamaKerja>=3){
    this.tunjangan = 5/100
  } else {
    this.tunjangan = 10/100*this.gajiPokok
  }
}

//const prompt = require('prompt - sync')()
console.log('Data Pegawai PT ABC \n1. Satpam')
Satpam.inputData()
Satpam.inputTunjangan()

console.log('\n2. Sales')
Sales.inputData()
Sales.inputTunjangan()

console.log('\n3. Manager')
Manager.inputData()
Manager.inputTunjangan()

console.log('\n-----Hasil Input Pegawai------\n')
console.log('1. Data Satpam')
Satpam.print()

console.log('\n2. Data Sales')
Sales.print()

console.log('\n3. Data Manager')
Manager.print()
