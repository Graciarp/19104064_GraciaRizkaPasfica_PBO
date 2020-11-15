//FOR LOOP
for(var i=0; i<5; i++){
    console.log(i+'. Berfikir')
}
console.log('\n')

//bentuk object
var nama = [{fName : 'Gracia', lName : 'Rizka', age : 19},
{fName : 'Pasfica', lName : 'Cantik', age : '20'}]

//FOR IN OBJECT
for(var x in nama){
    console.log('Nama \t: ')
    console.log(nama[x].fName+" "+nama[x].lName)
    console.log(nama[x].age)
    console.log("\n")
}

//FOR OF ARRAY
var buah = ['apel', 'anggur','jeruk']
for(var x of buah){
    console.log('ini buah '+x)
}