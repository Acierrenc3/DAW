/* 
Crear una función que genere un array aleatorio, 
usando 3 parámetros: número de elementos (por defecto 10), valor mínimo del elemento (por defecto 100), valor máximo (por defecto 200).
*/

//Creamos la funcion para generar un Array Aleatorio
function generarArrayAleatorio( //Establecemos los 3 parametros del enunciado, igualandolos de la siguiente forma:
  cantidadElementos = 10,
  valorMinimo = 100,
  valorMaximo = 200
) {
  const arrayAleatorio = []; //Declaramos el Array aleatorio vacío.

  for (let i = 0; i < cantidadElementos; i++) {
    //Ayudandonos del bucle for decimos que el iterador siempre sea menor a la cantidad de elementos (En este caso < a 10)
    const numAleatorio = Math.floor(
      Math.random() * (valorMaximo - valorMinimo - 1) + valorMaximo
    ); //Declaramos otra variable para hacer el calculo ayudandonos del metodo Math.floor y el Random (El primero redondea a la baja y el segundo randomiza).

    arrayAleatorio.push(numAleatorio); //Usamos el metodo push para que añada numeros aleatorios al final del array.
  }
  return arrayAleatorio;
}

const miArray = generarArrayAleatorio(); //Declaramos una ultima variable en donde llamamos a la funcion y finalmente la mostramos por consola
console.log(miArray);
