const numReg = /^[-+]?[0-9]+$/;


let numString = prompt("Ingresa la temperatura en grados Celcius a convertir en Farenheit y Kelvin: ", "");
let num = parseInt(numString);
let numPattern = numString.match(numReg);

while (!(numPattern) || !(typeof num == "number")) {
numString = prompt(
    "El dato introducido no es un número.\nIngresa la temperatura en grados Celcius a convertir en Farenheit y Kelvin: ",""
  );
  numPattern = numString.match(numReg);
  num = parseInt(numString);
}

const convertCtoFandK=(c)=>{

    let farenheit=(c * 1.8) + 32;
    let kelvin= c + 273.15;
    
    console.log("Grados Fahrenheit: " + farenheit + "\nGrados Kelvin: " + kelvin);
    alert("Grados Fahrenheit: " + farenheit + "\nGrados Kelvin: " + kelvin);
}

convertCtoFandK(num);