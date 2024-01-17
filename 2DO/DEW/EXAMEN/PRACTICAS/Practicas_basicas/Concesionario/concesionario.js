// Definición de una variable llamada "coche" que almacenará nuestros coches.
const coche = JSON.parse(localStorage.getItem("coche")) || [];

// Esta función guarda los coches en el almacenamiento local
function guardarCochesEnLocalStorage() {
  localStorage.setItem("coche", JSON.stringify(coche));
}

// Esta función agrega un coche a la lista de coches.
function agregarCoche(modelo, color, matricula, anio) {
  // Creamos un nuevo objeto coche con información, como modelo, color, matrícula y año.
  coche.push({ modelo, color, matricula, anio });
  // Luego guardamos la lista actualizada de coches en el almacenamiento local.
  guardarCochesEnLocalStorage();
}

// Esta función elimina un coche de la lista de coches según su matrícula.
function eliminarCoche(matricula) {
  // Buscamos el coche que coincida con la matrícula y lo eliminamos de la lista.
  const i = coche.findIndex((coche) => coche.matricula === matricula);

  if (i !== -1) {
    coche.splice(i, 1);
    // Luego guardamos la lista actualizada de coches en el almacenamiento local.
    guardarCochesEnLocalStorage();
    console.log(`Coche con matricula ${matricula}, eliminado.`);
  } else {
    console.log(`Coche con matricula ${matricula} no encontrado.`);
  }
}

// Esta función muestra la lista de coches en la consola.
function mostrarCoches() {
  // Seleccionamos el elemento HTML donde mostraremos la lista de coches.
  const cochesList = document.getElementById("coches-list");
  cochesList.innerHTML = ""; // Limpiamos la lista antes de mostrarla nuevamente.

  // Recorremos la lista de coches y creamos una tarjeta para cada uno con su información.
  coche.forEach((coche) => {
    const cocheCard = document.createElement("div");
    cocheCard.classList.add("coche-card");
    cocheCard.innerHTML = `
      <p>Modelo: ${coche.modelo}</p>
      <p>Color: ${coche.color}</p>
      <p>Matrícula: ${coche.matricula}</p>
      <p>Año: ${coche.anio}</p>
    `;
    cochesList.appendChild(cocheCard);
  });
}

// Esperamos a que la página se cargue completamente.
document.addEventListener("DOMContentLoaded", function () {
  // Seleccionamos elementos HTML relevantes.
  const agregarBtn = document.getElementById("agregar-btn");
  const eliminarCocheForm = document.getElementById("eliminar-coche-form");
  const eliminarBtn = document.getElementById("eliminar-btn");
  const mostrarCochesBtn = document.getElementById("mostrar-coches-btn");

  // Agregar evento clic al botón "Agregar Coche".
  agregarBtn.addEventListener("click", () => {
    const modelo = document.getElementById("modelo").value;
    const color = document.getElementById("color").value;
    const matricula = document.getElementById("matricula").value;
    const anio = parseInt(document.getElementById("anio").value);

    agregarCoche(modelo, color, matricula, anio);
    mostrarCoches();
  });

  // Agregar evento clic al botón "Eliminar Coche".
  eliminarBtn.addEventListener("click", () => {
    const matricula = document.getElementById("eliminar-matricula").value;
    eliminarCoche(matricula);
    mostrarCoches();
  });

  // Agregar evento clic al botón "Mostrar Coches en Nueva Ventana".
  mostrarCochesBtn.addEventListener("click", () => {
    // Abre una nueva ventana con la lista de coches.
    const cochesWindow = window.open("", "Coches", "width=600,height=400");
    const cochesListInNewWindow = cochesWindow.document.createElement("div");
    cochesListInNewWindow.innerHTML = "<h2>Lista de Coches</h2>";

    coche.forEach((coche) => {
      const cocheInfo = cochesWindow.document.createElement("p");
      cocheInfo.innerHTML = `
        Modelo: ${coche.modelo}<br>
        Color: ${coche.color}<br>
        Matrícula: ${coche.matricula}<br>
        Año: ${coche.anio}<br><br>
      `;
      cochesListInNewWindow.appendChild(cocheInfo);
    });

    cochesWindow.document.body.appendChild(cochesListInNewWindow);
  });

  mostrarCoches(); // Muestra los coches cuando la página
});

/*
Actividad 2. Vamos a crear un programa en JavaScript para gestionar una base de datos de coches en un concesionario. 
Cada coche estará representado por su modelo, color, matrícula y año. Deberás crear una serie de funciones para 
agregar coches, eliminar coches y mostrar información sobre los coches en la base de datos.

Instrucciones:

Crea una función constructora llamada Coche que acepte los siguientes parámetros: modelo, color, matricula y ano.
 Esta función deberá crear objetos coche con estas propiedades.
Crea una base de datos de coches utilizando un objeto JavaScript llamado coches. Este objeto será un almacén de coches, 
donde la clave será la matrícula del coche y el valor será un objeto coche.
Crea una función llamada agregarCoche que permita agregar un coche a la base de datos.
Crea una función llamada eliminarCoche que permita eliminar un coche de la base de datos.
Crea una función llamada mostrarTodosLosCoches que muestre en la consola la información de todos los coches en la base de datos, 
incluyendo modelo, color, matrícula y año.
*/
