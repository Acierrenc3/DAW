/*Tal y como has visto, en javaScript se pueden definir funciones anidadas. Un tipo particular de esas funciones son las funciones recursivas,
 las cuales se llaman a sí mismas para resolver un problema. Este enfoque es común en programación y se utiliza cuando un problema 
 se puede dividir en subproblemas similares más pequeños.

Ejemplo. Cálculo del factorial de un número
*/

function factorial(n) {
  if (n === 0) {
    return 1;
  } else {
    return n * factorial(n - 1);
  }
}
console.log(factorial(5)); // Imprimirá 120 (5! = 5 * 4 * 3 * 2 * 1)
