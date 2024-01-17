let heroeActual;

function crearNuevo() {
  try {
    // Obtener los valores de los campos del formulario
    let nis = document.getElementById("id").value;
    let nombre = document.getElementById("nombre").value;
    let poder = document.getElementById("poder").value;
    let ad = document.getElementById("anoDebut").value;
    let colorTraje = document.getElementById("colorTraje").value;

    // Realizar validaciones
    if (!nis || !nombre || !poder || !ad || !colorTraje) {
      throw new Error("Todos los campos han de ser cumplimentados");
    }
    if (nis.length !== 5) {
      throw new Error("El NIS debe tener EXACTAMENTE 5 caracteres");
    }
    if (!/^[a-zA-Z\s]+$/.test(nombre)) {
      throw new Error("El nombre solo puede contener letras");
    }
    if (!/^[a-zA-Z\s]+$/.test(poder)) {
      throw new Error("El poder solo puede contener letras");
    }
    if (
      isNaN(parseInt(ad)) ||
      parseInt(ad) < 1900 ||
      parseInt(ad) > new Date().getFullYear()
    ) {
      throw new Error(
        "El año de debut debe ser un valor numérico y estar en un rango válido."
      );
    }
    if (!/^[a-zA-Z\s]+$/.test(colorTraje)) {
      throw new Error("El Color del Traje solo puede contener letras");
    }

    // Crear el objeto SuperHeroe
    heroeActual = new SuperHeroe(nis, nombre, poder, ad, colorTraje);

    // Mostrar la información en el textarea
    document.getElementById(
      "datosSuperheroe"
    ).value = `NIS: ${heroeActual.nis}\nNombre: ${heroeActual.nombre}\nPoder: ${heroeActual.poder}\nAño debut: ${heroeActual.ad}\nColor Traje: ${heroeActual.colorTraje}`;

    // Guardar en el almacenamiento local
    localStorage.setItem("heroeActual", heroeActual.serializar());
  } catch (error) {
    alert(error.message);
  }
}

function cargarHeroeDesdeLocalStorage() {
  const heroeSerializado = localStorage.getItem("heroeActual");
  if (heroeSerializado) {
    heroeActual = SuperHeroe.deserializar(heroeSerializado);
    document.getElementById(
      "datosSuperheroe"
    ).value = `NIS: ${heroeActual.nis}\nNombre: ${heroeActual.nombre}\nPoder: ${heroeActual.poder}\nAño debut: ${heroeActual.ad}\nColor Traje: ${heroeActual.colorTraje}`;
  }
}

function modificarNis() {
  heroeActual.modificarNis();
  document.getElementById(
    "datosSuperheroe"
  ).value = `NIS: ${heroeActual.nis}\nNombre: ${heroeActual.nombre}\nPoder: ${heroeActual.poder}\nAño debut: ${heroeActual.ad}\nColor Traje: ${heroeActual.colorTraje}`;
}

function modificarNombre() {
  heroeActual.modificarNombre();
  document.getElementById(
    "datosSuperheroe"
  ).value = `NIS: ${heroeActual.nis}\nNombre: ${heroeActual.nombre}\nPoder: ${heroeActual.poder}\nAño debut: ${heroeActual.ad}\nColor Traje: ${heroeActual.colorTraje}`;
}

function modificarPoder() {
  heroeActual.modificarPoder();
  document.getElementById(
    "datosSuperheroe"
  ).value = `NIS: ${heroeActual.nis}\nNombre: ${heroeActual.nombre}\nPoder: ${heroeActual.poder}\nAño debut: ${heroeActual.ad}\nColor Traje: ${heroeActual.colorTraje}`;
}

function modificarAñoDebut() {
  heroeActual.modificarAd();
  document.getElementById(
    "datosSuperheroe"
  ).value = `NIS: ${heroeActual.nis}\nNombre: ${heroeActual.nombre}\nPoder: ${heroeActual.poder}\nAño debut: ${heroeActual.ad}\nColor Traje: ${heroeActual.colorTraje}`;
}

function modificarColorTraje() {
  heroeActual.modificarColorTraje();
  document.getElementById(
    "datosSuperheroe"
  ).value = `NIS: ${heroeActual.nis}\nNombre: ${heroeActual.nombre}\nPoder: ${heroeActual.poder}\nAño debut: ${heroeActual.ad}\nColor Traje: ${heroeActual.colorTraje}`;
}

function agregarHistorial() {
  heroeActual.agregarHistorial();
  let texto = "";
  for (let i = 0; i < heroeActual.historial.length; i++) {
    texto += `ID episodio: ${heroeActual.historial[i].ID}\nFecha episodio: ${heroeActual.historial[i].Fecha}\nVillano: ${heroeActual.historial[i].Villano}\nCompañero: ${heroeActual.historial[i].Compañero}\n----------------\n`;
  }
  document.getElementById("historialHazañas").value = texto;
}

function modificarEpisodio() {
  if (heroeActual) {
    heroeActual.modificarEpisodioPorID();
    let texto = "";
    for (let i = 0; i < vehiculoActual.historial.length; i++) {
      texto += `ID episodio: ${heroeActual.historial[i].ID}\nFecha episodio: ${heroeActual.historial[i].Fecha}\nVillano: ${heroeActual.historial[i].Villano}\nCompañero: ${heroeActual.historial[i].Compañero}\n----------------\n`;
    }
    document.getElementById("historialHazañas").value = texto;
  }
}
function limpiar() {
  if (confirm("¿Desea limpiar la ventana actual?")) {
    localStorage.removeItem("heroeActual");
    window.location.reload();
  }
}

function convertirAMayusculas(campo) {
  let valor = campo.value;
  campo.value = valor.toUpperCase();
}

window.addEventListener("load", cargarHeroeDesdeLocalStorage);

document.getElementById("crearNuevoHeroe").onclick = crearNuevo;
document.getElementById("modificarID").onclick = modificarNis;
document.getElementById("modificarNombre").onclick = modificarNombre;
document.getElementById("modificarPoder").onclick = modificarPoder;
document.getElementById("modificarAnoDebut").onclick = modificarAñoDebut;
document.getElementById("modificarColorTraje").onclick = modificarColorTraje;
document.getElementById("agregarHazaña").onclick = agregarHistorial;
document.getElementById("modificarHazaña").onclick = modificarEpisodio;
document.getElementById("limpiarVentana").onclick = limpiar;
