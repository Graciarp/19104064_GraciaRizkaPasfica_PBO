//Object atau Constructor kendaraan
var kendaraan = {
  //method untuk input atribut kendaraan
  inputAtribut : function(noPlat, merk, pajakKendaraan){
    this.noPlat = prompt ('Masukkan Plat Nomor\t\t\t\t: '),
    this.merk = prompt ('Masukkan Merk Kendaraan\t\t\t: '),
    this.pajakKendaraan = prompt ('Masukkan Pajak Kendaraan \t\t: ')
  },
  fasTambahan : function(){}, //method untuk input fasilitas tambahan
  printFasTambahan : function(){}, //method untuk cetak fasilitas tambahan
  hitungPajak : function(hitungPajakKendaraan){}, //method untuk menghitung pajak kendaraan
  //method untuk mencetak data
  print : function(){
    console.log('---Info Kendaraan---')
    console.log('Nomor Kendaraan \t\t:',this.noPlat)
    console.log('Merk \t\t\t\t\t:',this.merk)
    this.printFasTambahan()
    console.log('Pajak Kendaraan\t\t\t:',this.pajakKendaraan)
    this.hitungPajak()
    console.log('Total Pembayaran Pajak\t:',this.hitungPajakKendaraan)
  }
}
//sedan turunan dari kendaraan
var sedan = Object.create(kendaraan)
sedan.fasTambahan = function(keamanan, kapasitas, kenyamanan){
    this.keamanan = prompt('Masukkan fasilitas keamanan \t: ')
    this.kapasitas = prompt('Masukkan fasilitas kapasistas \t: ')
    this.kenyamanan = prompt('Masukkan fasilitas kenyamanan \t: ')
}
sedan.printFasTambahan = function(keamanan, kapasitas, kenyamanan){
    console.log(`Keamanan \t\t\t\t: ${this.keamanan}`)
    console.log(`Kapasitas \t\t\t\t: ${this.kapasitas} CC`)
    console.log(`Kenyamanan \t\t\t\t: ${this.kenyamanan}`)
}
sedan.hitungPajak = function(hitungPajakKendaraan){
  this.hitungPajakKendaraan = ((this.pajakKendaraan*1)+(this.pajakKendaraan*this.kapasitas*0.00005))
}
console.log('Input Data Sedan')
sedan.inputAtribut() //memanggil method inputAtribut
sedan.fasTambahan() //memanggil method fasTambahan
sedan.hitungPajak() //memanggil method hitungPajak
//bus turunan dari kendaraan
var bus = Object.create(kendaraan)
bus.fasTambahan = function(kapPenumpang, kapBagasi){
  this.kapPenumpang = prompt('Masukkan kapasitas penumpang \t: ')
  this.kapBagasi = prompt('Masukkan kapasitas bagasi \t\t: ')
}
bus.printFasTambahan = function(kapPenumpang, kapBagasi){
  console.log('Kapasitas Penumpang \t:', this.kapPenumpang)
  console.log('Kapasitas Bagasi \t\t:', this.kapBagasi,' Kg')
}
bus.hitungPajak = function(hitungPajakKendaraan){
  this.hitungPajakKendaraan = ((this.pajakKendaraan*1) + (this.pajakKendaraan*this.kapPenumpang*this.kapBagasi*0.00005))
}
console.log('Input Data Bus')
bus.inputAtribut() //memanggil method inputAtribut
bus.fasTambahan() //memanggil method fasTambahan
bus.hitungPajak() //memanggil method hitungPajak
//cetak data
console.log('1. Sedan')
sedan.print() //memanggil method print
//bus turunan dari kendaraan
console.log('2. Bus')
bus.print() //memanggil method print