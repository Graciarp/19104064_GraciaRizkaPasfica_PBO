var person = new Biodata('Graciar','Rizka','Pasfica',2000)

console.log('Object dari persont \t: ')
//memanggil method
console.log(`Name \t: ${person.fullname()}`)
console.log(`Tahun \t: ${person.year}`)
console.log(`Umur \t: ${person.age()}`)

function Biodata(firstName, secondName, lastName, year){
  this.firstName = firstName
  this.secondName = secondName
  this.lastName = lastName
  this.year = year
  this.fullname = function(){
    return(this.firstName+' '+this.lastName)
  }
  this.age = function(){
    return 2020 - this.year
  }
}