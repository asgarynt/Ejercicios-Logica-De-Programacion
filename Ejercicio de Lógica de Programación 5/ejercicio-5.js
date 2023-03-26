alert(`Adivina el número secreto`);

const numSecret = 24;
const numReg = /^([1-9][0-9]?|100)$/;

let numString;
let numPattern;
let num;
let nums = [];

do {
  numString = prompt("Ingresa un número entre el 1 - 100", "0");
  num = parseInt(numString);
  numPattern = numString.match(numReg);

  while (!numPattern || !(typeof num == "number")) {
    numString = prompt(
      "El dato introducido no es un número o no tiene el rango solicitado.\nIngresa un número entre el 1 - 100",
      "0"
    );
    numPattern = numString.match(numReg);
    num = parseInt(numString);
  }

  if (num != numSecret) {
    console.log(`Ups, el número secreto es incorrecto, vuelve a intentarlo.`);
    alert(`Ups, el número secreto es incorrecto, vuelve a intentarlo.`);
  }

  nums.push(num);
} while (num != numSecret);

console.log(
  `Felicidades, adivinaste el número secreto. \n\nSolo te tomó ${
    nums.length
  } intentos, los numeros utilizados son ${nums.join(", ")}`
);
alert(
  `Felicidades, adivinaste el número secreto. \n\nSolo te tomó ${
    nums.length
  } intentos, los numeros utilizados son ${nums.join(", ")}`
);