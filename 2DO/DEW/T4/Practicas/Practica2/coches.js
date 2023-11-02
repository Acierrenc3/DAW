/*
Vamos a crear un programa en JavaScript para gestionar una base de datos de coches en un concesionario. 
Cada coche estará representado por su modelo, color, matrícula y año. Deberás crear una serie de funciones para agregar coches, 
eliminar coches y mostrar información sobre los coches en la base de datos.

Instrucciones:

Crea una función constructora llamada Coche que acepte los siguientes parámetros: modelo, color, matricula y año. 
Esta función deberá crear objetos coche con estas propiedades.
Crea una base de datos de coches utilizando un objeto JavaScript llamado coches. Este objeto será un almacén de coches, 
donde la clave será la matrícula del coche y el valor será un objeto coche.
Crea una función llamada agregarCoche que permita agregar un coche a la base de datos.
Crea una función llamada eliminarCoche que permita eliminar un coche de la base de datos.
Crea una función llamada mostrarTodosLosCoches que muestre en la consola la información de todos los coches en la base de datos, incluyendo modelo, color, matrícula y año.
*/

// Base de datos de coches como un array de objetos
const coches = [];

// Función para agregar un coche a la base de datos
function agregarCoche(modelo, color, matricula, ano) {
  coches.push({ modelo, color, matricula, ano });
}

// Función para eliminar un coche de la base de datos por matrícula
function eliminarCoche(matricula) {
  const indice = coches.findIndex((coche) => coche.matricula === matricula);
  if (indice !== -1) {
    coches.splice(indice, 1);
    console.log(`Coche con matrícula ${matricula} eliminado.`);
  } else {
    console.log(`Coche con matrícula ${matricula} no encontrado.`);
  }
}

// Función para mostrar la información de todos los coches en la base de datos
function mostrarTodosLosCoches() {
  console.log("Lista de coches en la base de datos:");
  coches.forEach((coche) => {
    console.log(`Matrícula: ${coche.matricula}`);
    console.log(`Modelo: ${coche.modelo}`);
    console.log(`Color: ${coche.color}`);
    console.log(`Año: ${coche.ano}`);
    console.log("--------");
  });
}

// Ejemplos de uso
agregarCoche("Toyota", "Azul", "ABC123", 2022);
agregarCoche("Honda", "Rojo", "XYZ789", 2021);

mostrarTodosLosCoches();

eliminarCoche("XYZ789");

mostrarTodosLosCoches();
