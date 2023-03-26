function orderNum() {
    alert(`Ingresa tres numeros que se ordenarán de mayor a menor y de menor a mayor`)

  let a = parseInt(prompt("Ingresa el primer numero", ""));
  let b = parseInt(prompt("Ingresa el segundo numero", ""));
  let c = parseInt(prompt("Ingresa el tercer numero", ""));


if (isNaN(a) || isNaN(b) || isNaN(c)){
    console.log(`No son numeros algunos o todos los datos ingresados`);
    alert(`No son numeros algunos o todos los datos ingresados`);
} else if (a == b && b == c){
    console.log(`Los numeros son iguales: ${a}, ${b}, ${c}`);
    alert(`Los numeros son iguales: ${a}, ${b}, ${c}`);
}

  const order = [a, b, c];

  console.log(`Numeros de menor a mayor: ${order.sort((a, b) => a - b
  )} \n Numeros de mayor a menor: ${order.sort((a, b) => b - a)}`);
  alert(`Numeros de menor a mayor: ${order.sort((a, b) => a - b
    )} \n Numeros de mayor a menor: ${order.sort((a, b) => b - a)}`);
}

orderNum();
