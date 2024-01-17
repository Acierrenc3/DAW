let trabajadorActual;

function crearNuevo() {
  try {
    let id = document.getElementById("id").value;
    let dni = document.getElementById("dni").value;
    let nombre = document.getElementById("nombre").value;
    let apellidos = document.getElementById("apellidos").value;
    let ai = document.getElementById("anoIngreso").value;
    let cargo = document.getElementById("cargo").value;

    //Validaciones-------------------------------------------------
    //Validacion todos los campos rellenos
    validarCamposRellenos({ id, dni, nombre, apellidos, ai, cargo });
    //Validacion ID
    if (!/^[0-9\s]+$/.test(id)) {
      throw new Error("EL ID debe contener solamente numeros");
    }
    //Validacion DNI
    if (!/^[XYZ]?\d{5,8}[A-Z]$/.test(dni)) {
      throw new Error("EL DNI es incorrecto");
    } else {
      dni.toUpperCase(); //Lo ponemos en mayusculas
    }
    //Validar nombre y apellidos
    if (!/^[a-zA-Z]+$/.test(nombre)) {
      throw new Error("El nombre solo puede contener letras.");
    }
    if (!/^[a-zA-Z]+$/.test(apellidos)) {
      throw new Error("Los apellidos solo pueden contener letras.");
    }
    //Validar año ingreso
    if (
      isNaN(parseInt(ai)) ||
      parseInt(ai) < 1900 ||
      parseInt(ai) > new Date().getFullYear()
    ) {
      throw new Error(
        "El año de ingreso debe ser un valor numérico y estar en un rango válido."
      );
    }
    //Validar cargo
    if (!/^[a-zA-Z0-9\s]+$/.test(cargo)) {
      throw new Error("El cargo solo puede contener letras y numeros.");
    }

    trabajadorActual = new Trabajador(id, dni, nombre, apellidos, ai, cargo);
    document.getElementById(
      "datosTrabajador"
    ).value = `ID: ${trabajadorActual.id}\nDNI: ${trabajadorActual.dni}\nNombre: ${trabajadorActual.nombre}\nApellidos: ${trabajadorActual.apellidos}\nAño Ingreso: ${trabajadorActual.ai}\nCargo: ${trabajadorActual.cargo}`;
  } catch (error) {
    alert(error.message);
  }
  return false;
}
//Funcion para validar los campos rellenos en las validaciones de arriba
function validarCamposRellenos(campos) {
  for (const [campo, valor] of Object.entries(campos)) {
    if (!valor) {
      throw new Error(`El campo '${campo}' no puede estar vacio.`);
    }
  }
}

function modificarId() {
  trabajadorActual.modificarId();
  document.getElementById(
    "datosTrabajador"
  ).value = `ID: ${trabajadorActual.id}\nDNI: ${trabajadorActual.dni}\nNombre: ${trabajadorActual.nombre}\nApellidos: ${trabajadorActual.apellidos}\nAño Ingreso: ${trabajadorActual.ai}\nCargo: ${trabajadorActual.cargo}`;
}

function modificarDni() {
  trabajadorActual.modificarDni();
  document.getElementById(
    "datosTrabajador"
  ).value = `ID: ${trabajadorActual.id}\nDNI: ${trabajadorActual.dni}\nNombre: ${trabajadorActual.nombre}\nApellidos: ${trabajadorActual.apellidos}\nAño Ingreso: ${trabajadorActual.ai}\nCargo: ${trabajadorActual.cargo}`;
}

function modificarNombre() {
  trabajadorActual.modificarNombre();
  document.getElementById(
    "datosTrabajador"
  ).value = `ID: ${trabajadorActual.id}\nDNI: ${trabajadorActual.dni}\nNombre: ${trabajadorActual.nombre}\nApellidos: ${trabajadorActual.apellidos}\nAño Ingreso: ${trabajadorActual.ai}\nCargo: ${trabajadorActual.cargo}`;
}

function modificarApellidos() {
  trabajadorActual.modificarApellidos();
  document.getElementById(
    "datosTrabajador"
  ).value = `ID: ${trabajadorActual.id}\nDNI: ${trabajadorActual.dni}\nNombre: ${trabajadorActual.nombre}\nApellidos: ${trabajadorActual.apellidos}\nAño Ingreso: ${trabajadorActual.ai}\nCargo: ${trabajadorActual.cargo}`;
}

function modificarAi() {
  trabajadorActual.modificarAi();
  document.getElementById(
    "datosTrabajador"
  ).value = `ID: ${trabajadorActual.id}\nDNI: ${trabajadorActual.dni}\nNombre: ${trabajadorActual.nombre}\nApellidos: ${trabajadorActual.apellidos}\nAño Ingreso: ${trabajadorActual.ai}\nCargo: ${trabajadorActual.cargo}`;
}

function modificarCargo() {
  trabajadorActual.modificarCargo();
  document.getElementById(
    "datosTrabajador"
  ).value = `ID: ${trabajadorActual.id}\nDNI: ${trabajadorActual.dni}\nNombre: ${trabajadorActual.nombre}\nApellidos: ${trabajadorActual.apellidos}\nAño Ingreso: ${trabajadorActual.ai}\nCargo: ${trabajadorActual.cargo}`;
}

function asignarTarea() {
  trabajadorActual.asignarTarea();
  let texto = "";
  for (let i = 0; i < trabajadorActual.historialTareas.length; i++) {
    texto += `ID tarea: ${trabajadorActual.historialTareas[i].ID}\nDescripcion: ${trabajadorActual.historialTareas[i].descripcion}\nFecha Inicio: ${trabajadorActual.historialTareas[i].finicio}\nFecha Finalizacion: ${trabajadorActual.historialTareas[i].ffinalizacion}\n----------------\n`;
  }
  document.getElementById("historialTareas").value = texto;
}

function modificarTarea() {
  if (trabajadorActual) {
    trabajadorActual.modificarTarea();
    let texto = "";
    for (let i = 0; i < trabajadorActual.historialTareas.length; i++) {
      texto += `ID tarea: ${trabajadorActual.historialTareas[i].ID}\nDescripcion: ${trabajadorActual.historialTareas[i].d}\nFecha Inicio: ${trabajadorActual.historialTareas[i].finicio}\nFecha Finalizacion: ${trabajadorActual.historialTareas[i].ffinalizacion}\n----------------\n`;
    }
    document.getElementById("historialTareas").value = texto;
  }
}

function convertirAMayusculas(campo) {
  let valor = campo.value;
  campo.value = valor.toUpperCase();
}

function limpiar() {
  if (confirm("¿Desea limpiar la ventana actual?")) {
    window.location.reload();
  }
}

document.getElementById("crearNuevoTrabajador").onclick = crearNuevo;
document.getElementById("modificarID").onclick = modificarId;
document.getElementById("modificarDNI").onclick = modificarDni;
document.getElementById("modificarNombre").onclick = modificarNombre;
document.getElementById("modificarApellidos").onclick = modificarApellidos;
document.getElementById("modificarAnoIngreso").onclick = modificarAi;
document.getElementById("modificarCargo").onclick = modificarCargo;
document.getElementById("asignarTarea").onclick = asignarTarea;
document.getElementById("modificarTarea").onclick = modificarTarea;
document.getElementById("limpiarVentana").onclick = limpiar;
