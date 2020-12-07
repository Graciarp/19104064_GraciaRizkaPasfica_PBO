//This code was written by Gracia Rizka Pasfica

var nilai = new Array()
nilai.push(5, 6, 2, 3, 7)

function minimum() {
    var min = nilai[0]
    for(var i=1; i<nilai.length+1; i++){
        if(nilai[i]<min){
            min = nilai[i]
        }
    }
    return min
}

function maksimum(){
    var max = nilai[0]
    for(var i=0; i<nilai.length; i++){
        if(nilai[i]>max){
            max = nilai[i]
        }
    }
    return max
}

console.log("Nilai : "+nilai)
console.log("Nilai minimum  : "+minimum())
console.log("Nilai maksimum : "+maksimum())