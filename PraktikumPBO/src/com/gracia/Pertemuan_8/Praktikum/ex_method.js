/*
  pada variable person terdapat 3 properties dan 2 method
*/
var person = {
  firstName : 'Gracia',
  secondName : 'Rizka',
  lastName : 'Pasfica',
  year : 2000,
  //function untuk method
  fullName : function(){ 
    return (this.firstName+' '+this.secondName+' '+this.lastName)
  },
  age : function(){
    return 2020 - this.year
  }
}

//memanggil 
console.log('Object dari person \t: ')
console.log(`Name \t: ${person.fullName()}`)
console.log(`Tahun \t: ${person.year}`)
console.log(`Umur \t: ${person.age()}`)