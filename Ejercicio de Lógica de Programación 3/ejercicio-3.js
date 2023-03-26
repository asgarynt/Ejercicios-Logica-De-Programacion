const numReg = /^[0-9]+$/;

let numString = prompt(
  "Ingresa un número mayor a 0 para obtener el factorial de n: ",
  ""
);
let num = parseInt(numString);
let numPattern = numString.match(numReg);

while (!numPattern || num == 0 || !(typeof num == "number")) {
  numString = prompt(
    "El dato introducido no es un número o debe ser mayor a 0.\nIngresa un número mayor a 0 para obtener el factorial de n: ",
    ""
  );
  numPattern = numString.match(numReg);
  num = parseInt(numString);
}

const calcularFactorial = (num) => {
  return num == 0 ? 1 : num * calcularFactorial(num - 1);
};

console.log(calcularFactorial(num));
alert(calcularFactorial(num));
