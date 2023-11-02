/*Las funciones flecha, también conocidas como arrow functions, son una característica importante de JavaScript 
introducida en el estándar ECMAScript 6 (ES6). Estas funciones proporcionan una sintaxis más concisa y clara para definir funciones 
en comparación con las funciones tradicionales. Para definir una función flecha, utilizamos la siguiente sintaxis:

*/

const miFuncionFlecha = (parametro1, parametro2) => {
  // Código de la función
  return resultado;
};

//Ejemplo 1.

const saludar = (nombre) => {
  return `Hola, ${nombre}!`;
};
console.log(saludar("Juan")); // Imprimirá "Hola, Juan!"

//La declaración de este tipo de funciones se puede simplificar mucho más cuando la misma sólo tiene una expresión de retorno.
//En dicho caso, se pueden omitir los corchetes y la palabra reservada return.

//Ejemplo 2.

const duplicar = (numero) => numero * 2;
console.log(duplicar(5)); // Imprimirá 10
