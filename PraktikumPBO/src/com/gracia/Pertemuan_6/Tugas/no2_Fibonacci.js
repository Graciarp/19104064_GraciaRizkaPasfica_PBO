//Misalkan batas deret fibonnaci 10
var f = 0
var f2 = 1
var fib = 1
for(var i=1; i<=10; i++){
    console.log(f)
    fib = f + f2
    f = f2
    f2 = fib
}