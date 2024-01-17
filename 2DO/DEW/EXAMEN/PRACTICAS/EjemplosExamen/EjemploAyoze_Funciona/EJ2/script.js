class Paciente {
  constructor(nhc, nombre, apellidos, fn, sexo) {
    this.nhc = nhc; //Numero de historia clinica
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fn = fn; //Fecha nacimiento
    this.sexo = sexo;
    this.historial = [];

    alert(
      `Creado Paciente: ${nombre} ${apellidos}, con Numero historia clinica ${nhc}, ${sexo} y fecha nacimiento: ${fn}`
    );
  }

  modificarNhc() {
    if (
      confirm("¿Desea modificar el Numero de historia clinica del paciente?")
    ) {
      this.nhc = prompt("Introduzca nuevo NHC");
      alert(`Nuevo NHC: ${nhc}`);
    }
  }
  modificarNombre() {
    if (confirm("¿Desea modificar el Nombre del paciente?")) {
      this.nombre = prompt("Introduzca nuevo nombre");
      alert(`Nuevo Nombre: ${nombre}`);
    }
  }
  modificarApellidos() {
    if (confirm("¿Desea modificar los apellidos del paciente?")) {
      this.apellidos = prompt("Introduzca nuevos Apellidos");
      alert(`Nuevos Apellidos: ${apellidos}`);
    }
  }
  modificarFn() {
    if (confirm("¿Desea modificar la fecha de nacimiento del paciente?")) {
      this.fn = prompt("Introduzca nueva Fecha de nacimiento");
      alert(`Nueva Fecha de Nacimiento: ${fn}`);
    }
  }
  modificarSexo() {
    if (confirm("¿Desea modificar el sexo del paciente?")) {
      this.sexo = prompt("Introduzca nuevo sexo");
      alert(`Nuevo Sexo: ${sexo}`);
    }
  }

  agregarHistorial() {
    if (confirm("¿Desea agregar episodio al historial?")) {
      let ID = prompt("Introduzca n.º de episodio:");
      let fecha = prompt("Introduzca fecha:");
      let Dx = prompt("Introduzca diagnóstico:");
      let Tto = prompt("Introduzca tratamiento:");
      let Doc = prompt("Introduzca responsable:");
      this.historial.push({
        ID: ID,
        Fecha: fecha,
        Diagnóstico: Dx,
        Tratamiento: Tto,
        Responsable: Doc,
      });
    }
  }

  mostrarHistorial() {
    alert(`Historial del paciente ${this.nhc}`);
    this.historial.forEach((entry) => {
      alert(entry);
    });
  }

  modificarEpisodioPorID() {
    if (confirm("¿Desea modificar un episodio en el historial por ID?")) {
      let idEpisodio = prompt("Introduzca el ID del episodio a modificar:");
      for (let i = 0; i < this.historial.length; i++) {
        if (this.historial[i].ID === idEpisodio) {
          this.historial[i].Fecha = prompt("Introduzca nueva fecha:");
          this.historial[i].Diagnóstico = prompt(
            "Introduzca nuevo diagnóstico:"
          );
          this.historial[i].Tratamiento = prompt(
            "Introduzca nuevo tratamiento:"
          );
          this.historial[i].Responsable = prompt(
            "Introduzca nuevo responsable:"
          );

          alert("Episodio modificado correctamente.");
        }
      }
    }
  }
}

//Manejo del Formulario (Ejercicio 2)----------------------------------------------------

let pacienteActual;

function crearNuevo() {
  let nhc = document.getElementById("nhc").value;
  let nombre = document.getElementById("nombre").value;
  let apellidos = document.getElementById("apellidos").value;
  let fn = document.getElementById("fechaNacimiento").value;
  let sexo = document.getElementById("sexo").value;

  pacienteActual = new Paciente(nhc, nombre, apellidos, sexo, fn);
  document.getElementById(
    "datospaciente"
  ).value = `NHC: ${nhc}\nNombre Completo: ${nombre} ${apellidos}\nSexo: ${sexo}\nFecha Nacimiento: ${fn}`;

  return false;
}

function modificarNhc() {
  pacienteActual.modificarNhc();
  document.getElementById(
    "datospaciente"
  ).value = `NHC: ${pacienteActual.nhc}\nNombre Completo: ${pacienteActual.nombre} ${pacienteActual.apellidos}\nSexo: ${pacienteActual.sexo}\nFecha Nacimiento: ${pacienteActual.fn}`;
}

function modificarNombreCompleto() {
  pacienteActual.modificarNombre();
  pacienteActual.modificarApellidos();
  document.getElementById(
    "datospaciente"
  ).value = `NHC: ${pacienteActual.nhc}\nNombre Completo: ${pacienteActual.nombre} ${pacienteActual.apellidos}\nSexo: ${pacienteActual.sexo}\nFecha Nacimiento: ${pacienteActual.fn}`;
}

function modificarFn() {
  //Modificar Fecha de Nacimiento
  pacienteActual.modificarFn();
  document.getElementById(
    "datospaciente"
  ).value = `NHC: ${pacienteActual.nhc}\nNombre Completo: ${pacienteActual.nombre} ${pacienteActual.apellidos}\nSexo: ${pacienteActual.sexo}\nFecha Nacimiento: ${pacienteActual.fn}`;
}

function modificarSexo() {
  pacienteActual.modificarSexo();
  document.getElementById(
    "datospaciente"
  ).value = `NHC: ${pacienteActual.nhc}\nNombre Completo: ${pacienteActual.nombre} ${pacienteActual.apellidos}\nSexo: ${pacienteActual.sexo}\nFecha Nacimiento: ${pacienteActual.fn}`;
}

function agregarHistorial() {
  pacienteActual.agregarHistorial();
  let texto = "";
  for (let i = 0; i < pacienteActual.historial.length; i++) {
    texto += `ID episodio: ${pacienteActual.historial[i].ID}\nFecha episodio: ${pacienteActual.historial[i].Fecha}\nDiagnostico: ${pacienteActual.historial[i].Diagnóstico}\nTratamiento: ${pacienteActual.historial[i].Tratamiento}\nResponsable: ${pacienteActual.historial[i].Responsable}\n----------------\n`;
  }
  document.getElementById("historial").value = texto;
}

function modificarEpisodio() {
  if (pacienteActual) {
    pacienteActual.modificarEpisodioPorID();
    let text = "";
    for (let i = 0; i < pacienteActual.historial.length; i++) {
      text += `ID episodio: ${pacienteActual.historial[i].ID}\nFecha episodio: ${pacienteActual.historial[i].Fecha}\nDiagnóstico: ${pacienteActual.historial[i].Diagnóstico}\nTratamiento: ${pacienteActual.historial[i].Tratamiento}\nResponsable: ${pacienteActual.historial[i].Responsable}\n----------------\n`;
    }
    document.getElementById("historial").value = text;
  }
}
function limpiar() {
  if (confirm("¿Desea limpiar la ventana actual?")) {
    window.location.reload();
  }
}

document.getElementById("crearnuevo").onclick = crearNuevo;
document.getElementById("modificarNHC").onclick = modificarNHC;
document.getElementById("modificarNombre").onclick = modificarNombre;
document.getElementById("modificarApellidos").onclick = modificarApellidos;
document.getElementById("modificarFecha").onclick = modificarFecha;
document.getElementById("modificarSexo").onclick = modificarSexo;
document.getElementById("agregarDxyTto").onclick = agregarHistorial;
document.getElementById("modificarEpisodio").onclick = modificarEpisodio;
document.getElementById("limpiar").onclick = limpiar;
