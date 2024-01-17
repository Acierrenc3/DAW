let superheroeActual;

//Al cargar la página rellenamos los datos con el primer superheroe que haya en el local storage en caso de que haya alguno
//En caso de no haber ninguno lo mostramos en el text area correspondiente
document.addEventListener("DOMContentLoaded", function () {
  const datosSuperheroe = document.getElementById("datosSuperheroe");
  const superheroes = cargarSuperheroesDesdeLocalStorage();
  const primeraCarga = localStorage.getItem("primerCarga");

  if (superheroes.length > 0 && !primeraCarga) {
    // Obtener el primer superhéroe en la lista
    const primerSuperheroe = superheroes[0];

    superheroeActual = primerSuperheroe;

    // Mostrar los datos del primer superhéroe en el textarea "datosSuperheroe"
    datosSuperheroe.value = `ID: ${primerSuperheroe.nis}\nNombre: ${primerSuperheroe.nombre}\nPoder: ${primerSuperheroe.poder}\nAño de Debut: ${primerSuperheroe.anioDebut}\nColor del Traje: ${primerSuperheroe.colorTraje}`;

    // Marcar la primera carga en localStorage
    localStorage.setItem("primerCarga", "true");
  } else {
    datosSuperheroe.value = "No hay superhéroes disponibles.";
  }
});


function crearNuevo() {
  try {
    let nis = document.getElementById("id").value.trim();
    let nombre = document.getElementById("nombre").value.trim();
    let poder = document.getElementById("poder").value.trim();
    let anioDebut = document.getElementById("anioDebut").value.trim();
    let colorTraje = document.getElementById("colorTraje").value.trim();

    //Validacion de que todos los campos estén rellenos
    validarCamposRellenos({ nis, nombre, poder, anioDebut, colorTraje });

    //Validaciones Individuales
    validarAnioDebut(anioDebut);

    //Creacion del SuperHéroe
    let superheroeActual = new Superheroe(
      nis,
      nombre,
      poder,
      anioDebut,
      colorTraje
    );

    guardarSuperheroe(superheroeActual);

    //Se muestra la info en el text area
    document.getElementById(
      "datosSuperheroe"
    ).value = `NIS: ${nis}\nNombre: ${nombre}\nPoder: ${poder}\nAño de Debut: ${anioDebut}\nColor del traje: ${colorTraje}`;
  } catch (error) {
    alert(error.message);
  }
  return false; //Evitar la recarga automática de la página
}
//Funcion para modificar el nis del registro y guardarlo en el registro además de actualizar el text area
function modificarNis(newNis) {
  try {
    // Obtener la lista de superhéroes desde localStorage
    const superheroes = cargarSuperheroesDesdeLocalStorage();

    // Encontrar el superhéroe específico que deseas modificar
    const superheroeIndex = superheroes.findIndex(
      (superheroe) => superheroe.nis === superheroeActual.nis
    );

    if (superheroeIndex !== -1) {
      // Modificar el NIS del superhéroe actual
      superheroeActual.nis = newNis;

      // Modificar el NIS del superhéroe en la lista de superhéroes
      superheroes[superheroeIndex].nis = newNis;

      // Actualizar la información en la interfaz de usuario
      document.getElementById(
        "datosSuperheroe"
      ).value = `NIS: ${superheroeActual.nis}\nNombre: ${superheroeActual.nombre}\nPoder: ${superheroeActual.poder}\nAño de Debut: ${superheroeActual.anioDebut}\nColor del traje: ${superheroeActual.colorTraje}`;

      // Guardar la lista actualizada en localStorage
      localStorage.setItem("superheroes", JSON.stringify(superheroes));
    } else {
      alert("Superhéroe no encontrado en la lista.");
    }
  } catch (error) {
    alert(error.message);
  }
}
//Funcion para modificar el nombre del registro y guardarlo en el registro además de actualizar el text area
function modificarNombre(newNombre) {
  try {
    const superheroes = cargarSuperheroesDesdeLocalStorage();
    const superheroeIndex = superheroes.findIndex(
      (superheroe) => superheroe.nis === superheroeActual.nis
    );

    if (superheroeIndex !== -1) {
      superheroeActual.nombre = newNombre;
      superheroes[superheroeIndex].nombre = newNombre;

      document.getElementById(
        "datosSuperheroe"
      ).value = `NIS: ${superheroeActual.nis}\nNombre: ${superheroeActual.nombre}\nPoder: ${superheroeActual.poder}\nAño de Debut: ${superheroeActual.anioDebut}\nColor del traje: ${superheroeActual.colorTraje}`;

      localStorage.setItem("superheroes", JSON.stringify(superheroes));
    } else {
      alert("Superhéroe no encontrado en la lista.");
    }
  } catch (error) {
    alert(error.message);
  }
}
//Funcion para modificar el poder del registro y guardarlo en el registro además de actualizar el text area
function modificarPoder(newPoder) {
  try {
    const superheroes = cargarSuperheroesDesdeLocalStorage();
    const superheroeIndex = superheroes.findIndex(
      (superheroe) => superheroe.nis === superheroeActual.nis
    );

    if (superheroeIndex !== -1) {
      superheroeActual.poder = newPoder;
      superheroes[superheroeIndex].poder = newPoder;

      document.getElementById(
        "datosSuperheroe"
      ).value = `NIS: ${superheroeActual.nis}\nNombre: ${superheroeActual.nombre}\nPoder: ${superheroeActual.poder}\nAño de Debut: ${superheroeActual.anioDebut}\nColor del traje: ${superheroeActual.colorTraje}`;

      localStorage.setItem("superheroes", JSON.stringify(superheroes));
    } else {
      alert("Superhéroe no encontrado en la lista.");
    }
  } catch (error) {
    alert(error.message);
  }
}
//Funcion para modificar el año de debut del registro y guardarlo en el registro además de actualizar el text area
function modificarAnioDebut(newAnioDebut) {
  try {
    const superheroes = cargarSuperheroesDesdeLocalStorage();
    const superheroeIndex = superheroes.findIndex(
      (superheroe) => superheroe.nis === superheroeActual.nis
    );

    if (superheroeIndex !== -1) {
      superheroeActual.anioDebut = newAnioDebut;
      superheroes[superheroeIndex].anioDebut = newAnioDebut;

      document.getElementById(
        "datosSuperheroe"
      ).value = `NIS: ${superheroeActual.nis}\nNombre: ${superheroeActual.nombre}\nPoder: ${superheroeActual.poder}\nAño de Debut: ${superheroeActual.anioDebut}\nColor del traje: ${superheroeActual.colorTraje}`;

      localStorage.setItem("superheroes", JSON.stringify(superheroes));
    } else {
      alert("Superhéroe no encontrado en la lista.");
    }
  } catch (error) {
    alert(error.message);
  }
}
//Funcion para modificar el color del traje del registro y guardarlo en el registro además de actualizar el text area
function modificarColorTraje(newColorTraje) {
  try {
    const superheroes = cargarSuperheroesDesdeLocalStorage();
    const superheroeIndex = superheroes.findIndex(
      (superheroe) => superheroe.nis === superheroeActual.nis
    );

    if (superheroeIndex !== -1) {
      superheroeActual.colorTraje = newColorTraje;
      superheroes[superheroeIndex].colorTraje = newColorTraje;

      document.getElementById(
        "datosSuperheroe"
      ).value = `NIS: ${superheroeActual.nis}\nNombre: ${superheroeActual.nombre}\nPoder: ${superheroeActual.poder}\nAño de Debut: ${superheroeActual.anioDebut}\nColor del traje: ${superheroeActual.colorTraje}`;

      localStorage.setItem("superheroes", JSON.stringify(superheroes));
    } else {
      alert("Superhéroe no encontrado en la lista.");
    }
  } catch (error) {
    alert(error.message);
  }
}

//Guarda el superheroe en el localStorage
function guardarSuperheroe(superheroe) {
  let superheroes = JSON.parse(localStorage.getItem("superheroes")) || [];
  superheroes.push(superheroe);
  localStorage.setItem("superheroes", JSON.stringify(superheroes));
}

// Cargar la lista de superhéroes desde localStorage
function cargarSuperheroesDesdeLocalStorage() {
  let superheroes = JSON.parse(localStorage.getItem("superheroes")) || [];
  return superheroes;
}

// Función para mostrar la lista de superhéroes en el ul
function mostrarSuperheroesEnLista() {
  const listaSuperheroes = document.getElementById("listaSuperheroes");
  const superheroes = cargarSuperheroesDesdeLocalStorage();

  // Limpiar la lista actual
  listaSuperheroes.innerHTML = "";

  // Crear encabezados de la lista
  const encabezados = document.createElement("li");
  encabezados.innerHTML =
    "<strong>ID</strong> - <strong>Nombre</strong> - <strong>Poder</strong>";
  listaSuperheroes.appendChild(encabezados);

  // Llenar la lista con los superhéroes
  superheroes.forEach((superheroe) => {
    const li = document.createElement("li");
    li.textContent = `${superheroe.nis} - ${superheroe.nombre} - ${superheroe.poder}`;
    listaSuperheroes.appendChild(li);
  });
}

// Llamada para mostrar la lista de superhéroes al cargar la página
mostrarSuperheroesEnLista();

function agregarHazaña() {
  try {
    // Obtén la información de la hazaña del usuario
    const idHazaña = prompt("Introduce el ID de la hazaña:");
    const fechaEvento = prompt("Introduce la fecha del evento:");
    const evento = prompt("Introduce el nombre del evento:");
    const villano = prompt("Introduce el nombre del villano:");
    const compañero = prompt("Introduce el nombre del compañero:");

    // Crea una cadena con la información de la hazaña
    const nuevaHazaña = `${idHazaña}, ${fechaEvento}, ${evento}, ${villano}, ${compañero}`;

    // Obtén el historial de hazañas actual del superhéroe
    const historialHazañas = superheroeActual.historialHazañas || [];

    // Agrega la nueva hazaña al historial
    historialHazañas.push(nuevaHazaña);

    // Actualiza el historial de hazañas en el objeto del superhéroe
    superheroeActual.historialHazañas = historialHazañas;

    // Actualiza el textarea "historialHazañas" con el historial actualizado
    actualizarHistorialHazañas();

  } catch (error) {
    alert(error.message);
  }
}
function actualizarHistorialHazañas() {
  const historialHazañasTextarea = document.getElementById("historialHazañas");

  // Obtén el historial de hazañas del superhéroe actual
  const historialHazañas = superheroeActual.historialHazañas || [];

  // Crear una cadena formateada para cada hazaña
  const hazañasFormateadas = historialHazañas.map((hazaña) => {
    const [id, fechaEvento, evento, villano, compañero] = hazaña.split(", ");
    return `ID: ${id}\nFecha Evento: ${fechaEvento}\nEvento: ${evento}\nVillano: ${villano}\nCompañero: ${compañero}`;
  });

  // Unir todas las hazañas formateadas con líneas en blanco
  const historialFormateado = hazañasFormateadas.join("\n\n");

  // Actualiza el contenido del textarea
  historialHazañasTextarea.value = historialFormateado;
}
function modificarHazañaPorId(idHazaña) {
  try {
    // Obtén el historial de hazañas actual del superhéroe
    const historialHazañas = superheroeActual.historialHazañas || [];

    // Encuentra la hazaña que coincida con el ID proporcionado
    const hazañaIndex = historialHazañas.findIndex((hazaña) => {
      const hazañaId = hazaña.split(",")[0].trim(); // Obtiene el ID de la hazaña
      return hazañaId === idHazaña;
    });

    if (hazañaIndex !== -1) {
      // Obtén la información de la hazaña existente
      const hazañaExistente = historialHazañas[hazañaIndex].split(",");

      // Solicita al usuario la nueva información de la hazaña
      const nuevaFechaEvento = prompt("Introduce la nueva fecha del evento:", hazañaExistente[1].trim());
      const nuevoEvento = prompt("Introduce el nuevo nombre del evento:", hazañaExistente[2].trim());
      const nuevoVillano = prompt("Introduce el nuevo nombre del villano:", hazañaExistente[3].trim());
      const nuevoCompañero = prompt("Introduce el nuevo nombre del compañero:", hazañaExistente[4].trim());

      // Construye la nueva hazaña con la información actualizada
      const hazañaActualizada = `${idHazaña}, ${nuevaFechaEvento}, ${nuevoEvento}, ${nuevoVillano}, ${nuevoCompañero}`;

      // Reemplaza la hazaña existente con la actualizada en el historial
      historialHazañas[hazañaIndex] = hazañaActualizada;

      // Actualiza el historial de hazañas en el objeto del superhéroe
      superheroeActual.historialHazañas = historialHazañas;

      // Actualiza el textarea "historialHazañas" con el historial actualizado
      actualizarHistorialHazañas();

      alert("Hazaña modificada exitosamente.");
    } else {
      alert("Hazaña no encontrada en el historial.");
    }
  } catch (error) {
    alert(error.message);
  }
}





function validarCamposRellenos(campos) {
  for (const [campo, valor] of Object.entries(campos)) {
    if (!valor) {
      throw new Error(`El campo '${campo}' no puede estar vacio.`);
    }
  }
}

function validarAnioDebut(anio) {
  // Expresión regular para verificar si la cadena contiene solo números
  const esNumero = /^\d+$/;

  if (!esNumero.test(anio) || anio > new Date().getFullYear()) {
    throw new Error(
      "El año de debut debe ser numérico y no superior al actual."
    );
  }
}

function convertirAMayusculas(campo) {
  let valor = campo.value;
  campo.value = valor.toUpperCase();
}

//FUNCIONES DE DIRECCIÓN ENTRE REGISTROS
// Función para ir al primer superhéroe en la lista
function irAlPrimero() {
  const superheroes = cargarSuperheroesDesdeLocalStorage();

  if (superheroes.length > 0) {
    superheroeActual = superheroes[0];
    mostrarSuperheroeActual();
    actualizarHistorialHazañas();
  } else {
    alert("No hay superhéroes disponibles.");
  }
}

// Función para ir al superhéroe anterior en la lista
function irAlAnterior() {
  const superheroes = cargarSuperheroesDesdeLocalStorage();

  if (superheroes.length > 0) {
    const superheroeIndex = superheroes.findIndex(
      (superheroe) => superheroe.nis === superheroeActual.nis
    );

    if (superheroeIndex > 0) {
      superheroeActual = superheroes[superheroeIndex - 1];
      mostrarSuperheroeActual();
      actualizarHistorialHazañas();
    } else {
      alert("No hay superhéroes anteriores en la lista.");
    }
  } else {
    alert("No hay superhéroes disponibles.");
  }
}

// Función para ir al superhéroe siguiente en la lista
function irAlSiguiente() {
  const superheroes = cargarSuperheroesDesdeLocalStorage();

  if (superheroes.length > 0) {
    const superheroeIndex = superheroes.findIndex(
      (superheroe) => superheroe.nis === superheroeActual.nis
    );

    if (superheroeIndex < superheroes.length - 1) {
      superheroeActual = superheroes[superheroeIndex + 1];
      mostrarSuperheroeActual();
      actualizarHistorialHazañas();
    } else {
      alert("No hay superhéroes siguientes en la lista.");
    }
  } else {
    alert("No hay superhéroes disponibles.");
  }
}

// Función para ir al último superhéroe en la lista
function irAlUltimo() {
  const superheroes = cargarSuperheroesDesdeLocalStorage();

  if (superheroes.length > 0) {
    superheroeActual = superheroes[superheroes.length - 1];
    mostrarSuperheroeActual();
    actualizarHistorialHazañas();
  } else {
    alert("No hay superhéroes disponibles.");
  }
}

// Función para mostrar el superhéroe actual en el textarea
function mostrarSuperheroeActual() {
  const datosSuperheroe = document.getElementById("datosSuperheroe");

  datosSuperheroe.value = `ID: ${superheroeActual.nis}\nNombre: ${superheroeActual.nombre}\nPoder: ${superheroeActual.poder}\nAño de Debut: ${superheroeActual.anioDebut}\nColor del Traje: ${superheroeActual.colorTraje}`;
}

function borrarLocalStorageYRecargar() {
  // Borra el local storage
  localStorage.clear();

  // Borra el historial de hazañas del superhéroe actual
  if (superheroeActual && superheroeActual.historialHazañas) {
    superheroeActual.historialHazañas = [];
  }

  // Actualiza el textarea del historial de hazañas para reflejar los cambios
  actualizarHistorialHazañas();

  // Recarga la página
  alert("Local Storage y el historial de hazañas han sido borrados.");
  location.reload();
}



document.getElementById("crearNuevoHeroe").addEventListener ("click", crearNuevo);

document.getElementById("modificarID").addEventListener("click", function () {
  const nuevoNis = prompt("Introduce el nuevo NIS:");
  if (nuevoNis !== null) {
    modificarNis(nuevoNis);
  }
});

document.getElementById("modificarNombre").addEventListener("click", function () {
  const nuevoNombre = prompt("Introduce el nuevo Nombre:");
  if (nuevoNombre !== null) {
    modificarNombre(nuevoNombre);
  }
});

document.getElementById("modificarPoder").addEventListener("click", function () {
  const nuevoPoder = prompt("Introduce el nuevo Poder:");
  if (nuevoPoder !== null) {
    modificarPoder(nuevoPoder);
  }
});

document.getElementById("modificarAnoDebut").addEventListener("click", function () {
  const nuevoAnioDebut = prompt("Introduce el nuevo Año de Debut:");
  if (nuevoAnioDebut !== null) {
    modificarAnioDebut(nuevoAnioDebut);
  }
});

document.getElementById("modificarColorTraje").addEventListener("click", function () {
  const nuevoColorTraje = prompt("Introduce el nuevo Color del Traje:");
  if (nuevoColorTraje !== null) {
    modificarColorTraje(nuevoColorTraje);
  }
});

document.getElementById("primero").addEventListener ("click", irAlPrimero);
document.getElementById("anterior").addEventListener("click", irAlAnterior);
document.getElementById("siguiente").addEventListener("click", irAlSiguiente);
document.getElementById("ultimo").addEventListener("click", irAlUltimo);
document.getElementById("agregarHazaña").addEventListener("click", agregarHazaña);
document.getElementById("modificarHistorial").addEventListener("click", function () {
  const idHazaña = prompt("Introduce el ID de la hazaña a modificar:");
  if (idHazaña !== null) {
    modificarHazañaPorId(idHazaña);
  }
});

document.getElementById("botonBorrarLocalStorage").addEventListener("click", borrarLocalStorageYRecargar);
