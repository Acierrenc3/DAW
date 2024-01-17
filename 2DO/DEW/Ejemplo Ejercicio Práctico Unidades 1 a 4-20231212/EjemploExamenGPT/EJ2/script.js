// Clase Paciente
class Paciente {
  constructor(NHC, nombre, apellidos, fechaNacimiento, sexo) {
    this.NHC = NHC;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fechaNacimiento = fechaNacimiento;
    this.sexo = sexo;
    this.historial = [];

    this.mostrarDatosPaciente();
  }

  mostrarDatosPaciente() {
    const datosPaciente = `Nombre: ${this.nombre} ${this.apellidos}\nNHC: ${this.NHC}\nSexo: ${this.sexo}\nFecha de Nacimiento: ${this.fechaNacimiento}`;
    document.getElementById("datospaciente").innerText = datosPaciente;
  }

  modificarDato(dato, nuevoValor) {
    const confirmacion = confirm(`¿Estás seguro de modificar ${dato}?`);
    if (confirmacion) {
      this[dato] = nuevoValor;
      alert(`${dato} modificado/a con éxito: ${nuevoValor}`);
      this.mostrarDatosPaciente();
    }
  }

  agregarEpisodio() {
    const ID = this.historial.length + 1;
    const fecha = prompt("Fecha del episodio:");
    const diagnostico = prompt("Diagnóstico:");
    const tratamiento = prompt("Tratamiento:");
    const medicoResponsable = prompt("Médico Responsable:");

    const episodio = {
      ID,
      fecha,
      diagnostico,
      tratamiento,
      medicoResponsable,
    };

    this.historial.push(episodio);
    alert("Episodio agregado al historial con éxito.");
  }

  modificarEpisodio(ID) {
    const episodio = this.historial.find((entry) => entry.ID === ID);

    if (episodio) {
      episodio.fecha = prompt("Nueva fecha del episodio:", episodio.fecha);
      episodio.diagnostico = prompt("Nuevo diagnóstico:", episodio.diagnostico);
      episodio.tratamiento = prompt("Nuevo tratamiento:", episodio.tratamiento);
      episodio.medicoResponsable = prompt(
        "Nuevo médico responsable:",
        episodio.medicoResponsable
      );

      alert("Episodio modificado con éxito.");
    } else {
      alert("No se encontró ningún episodio con ese ID.");
    }
  }

  mostrarHistorial() {
    let historialText = "";

    this.historial.forEach((entry) => {
      historialText += `ID: ${entry.ID}\nFecha: ${entry.fecha}\nDiagnóstico: ${entry.diagnostico}\nTratamiento: ${entry.tratamiento}\nMédico Responsable: ${entry.medicoResponsable}\n\n`;
    });

    document.getElementById("historial").innerText = historialText;
  }
}

// Función para crear un nuevo paciente desde el formulario
function crearNuevoPaciente() {
  const nhc = document.getElementById("nhc").value;
  const nombre = document.getElementById("nombre").value;
  const apellidos = document.getElementById("apellidos").value;
  const sexo = document.getElementById("sexo").value;
  const fechaNacimiento = document.getElementById("fechaNacimiento").value;

  // Crear una variable global para el paciente actual
  pacienteActual = new Paciente(nhc, nombre, apellidos, fechaNacimiento, sexo);

  // Evitar el comportamiento por defecto del formulario
  return false;
}

// Event listeners para los botones y formulario
document
  .getElementById("crearnuevo")
  .addEventListener("click", crearNuevoPaciente);

document.getElementById("modificarNHC").addEventListener("click", function () {
  const nuevoNHC = prompt("Nuevo NHC:");
  pacienteActual.modificarDato("NHC", nuevoNHC);
});

document
  .getElementById("modificarNombre")
  .addEventListener("click", function () {
    const nuevoNombre = prompt("Nuevo nombre:");
    pacienteActual.modificarDato("nombre", nuevoNombre);
  });

document
  .getElementById("modificarApellidos")
  .addEventListener("click", function () {
    const nuevosApellidos = prompt("Nuevos apellidos:");
    pacienteActual.modificarDato("apellidos", nuevosApellidos);
  });

document.getElementById("modificarSexo").addEventListener("click", function () {
  const nuevoSexo = prompt("Nuevo sexo:");
  pacienteActual.modificarDato("sexo", nuevoSexo);
});

document
  .getElementById("modificarFecha")
  .addEventListener("click", function () {
    const nuevaFecha = prompt("Nueva fecha de nacimiento:");
    pacienteActual.modificarDato("fechaNacimiento", nuevaFecha);
  });

document.getElementById("agregarDxyTto").addEventListener("click", function () {
  pacienteActual.agregarEpisodio();
  pacienteActual.mostrarHistorial();
});

document
  .getElementById("modificarEpisodio")
  .addEventListener("click", function () {
    const idEpisodio = prompt("Ingrese el ID del episodio a modificar:");
    pacienteActual.modificarEpisodio(parseInt(idEpisodio));
    pacienteActual.mostrarHistorial();
  });

document.getElementById("limpiar").addEventListener("click", function () {
  // Recargar la página
  location.reload();
});
