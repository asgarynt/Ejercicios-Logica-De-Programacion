

const numReg = /^[0-9]+$/;


let numString = prompt("Ingresa un número para obtener n numeros de la serie fibonacci", "0");
let num = parseInt(numString);
let numPattern = numString.match(numReg);

while (!(numPattern) || !(typeof num == "number")) {
numString = prompt(
    "El dato introducido no es un número.\nIngresa un número para obtener n numeros de la serie fibonacci",
    "0"
  );
  numPattern = numString.match(numReg);
  num = parseInt(numString);
}

function fibonacci(n) {
let a = 0, b = 1, temp;
let sequence = [];

if(n === 0){
    console.log(n);
    alert(`${n}`)
} else if(n === 1){
    console.log(0 + " " + 1);
    alert(0 + " " + 1)
} else {

for (let i = 0; i < n; i++) {
  sequence.push(a);
  temp = a + b;
  a = b;
  b = temp;
}
}
alert(sequence.join(" "));
console.log(sequence.join(" "));

}

fibonacci(num);


