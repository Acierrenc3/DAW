const coche = JSON.parse(localStorage.getItem("coche")) || [];

//Funcion que guarda los coches añadidos en el localStorage del navegador del usuario
function guardarCochesEnLocalStorage() {
  localStorage.setItem("coche", JSON.stringify(coche));
}

//Funcion que agrega coches
function agregarCoche(modelo, color, matricula, anio) {
  coche.push({ modelo, color, matricula, anio });
  guardarCochesEnLocalStorage();
}

//Funcion que elimina los coches
function eliminarCoche(matricula) {
  const i = coche.findIndex((coche) => coche.matricula === matricula);

  if (i !== -1) {
    coche.splice(i, 1);
    guardarCochesEnLocalStorage();
    console.log(`Coche con matricula ${matricula}, eliminado.`);
  } else {
    console.log(`Coche con matricula ${matricula} no encontrado.`);
  }
}

function mostrarCoches() {
  const cochesList = document.getElementById("coches-list");
  cochesList.innerHTML = ""; // Limpiar la lista antes de mostrarla nuevamente

  //Creamos un nuevo card por medio de un forEach por cada coche agregado a la UI
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

//EventListeners necesarios para la UI
document.addEventListener("DOMContentLoaded", function () {
  const agregarBtn = document.getElementById("agregar-btn");
  const eliminarCocheForm = document.getElementById("eliminar-coche-form");
  const eliminarBtn = document.getElementById("eliminar-btn");
  const mostrarCochesBtn = document.getElementById("mostrar-coches-btn");

  agregarBtn.addEventListener("click", () => {
    const modelo = document.getElementById("modelo").value;
    const color = document.getElementById("color").value;
    const matricula = document.getElementById("matricula").value;
    const anio = parseInt(document.getElementById("anio").value);

    agregarCoche(modelo, color, matricula, anio);
    mostrarCoches();
  });

  eliminarBtn.addEventListener("click", () => {
    const matricula = document.getElementById("eliminar-matricula").value;
    eliminarCoche(matricula);
    mostrarCoches();
  });

  mostrarCochesBtn.addEventListener("click", () => {
    // Abre una nueva ventana con la lista de coches
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

  mostrarCoches();
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
