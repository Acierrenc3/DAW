class Paciente {
  constructor(NHC, nombre, apellidos, fechaNacimiento, sexo) {
    this.NHC = NHC;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fechaNacimiento = fechaNacimiento;
    this.sexo = sexo;
    this.historial = [];

    console.log(
      `Se ha creado un nuevo paciente: ${this.nombre} ${this.apellidos}`
    );
    this.mostrarDatosPaciente();
  }

  mostrarDatosPaciente() {
    const datosPaciente = `Nombre: ${this.nombre} ${this.apellidos}\nNHC: ${this.NHC}\nSexo: ${this.sexo}\nFecha de Nacimiento: ${this.fechaNacimiento}`;
    document.getElementById("datospaciente").value = datosPaciente;
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

    document.getElementById("historial").value = historialText;
  }
}

// Crear instancia de Paciente
const paciente = new Paciente(
  "123",
  "Juan",
  "Pérez",
  "01/01/1990",
  "Masculino"
);

// Event listeners para los botones
document.getElementById("crearnuevo").addEventListener("click", function () {
  const nhc = document.getElementById("nhc").value;
  const nombre = document.getElementById("nombre").value;
  const apellidos = document.getElementById("apellidos").value;
  const sexo = document.getElementById("sexo").value;
  const fechaNacimiento = document.getElementById("fechaNacimiento").value;

  const nuevoPaciente = new Paciente(
    nhc,
    nombre,
    apellidos,
    fechaNacimiento,
    sexo
  );
});

document.getElementById("modificarNHC").addEventListener("click", function () {
  const nuevoNHC = prompt("Nuevo NHC:");
  paciente.modificarDato("NHC", nuevoNHC);
});

document
  .getElementById("modificarNombre")
  .addEventListener("click", function () {
    const nuevoNombre = prompt("Nuevo nombre:");
    paciente.modificarDato("nombre", nuevoNombre);
  });

document
  .getElementById("modificarApellidos")
  .addEventListener("click", function () {
    const nuevosApellidos = prompt("Nuevos apellidos:");
    paciente.modificarDato("apellidos", nuevosApellidos);
  });

document.getElementById("modificarSexo").addEventListener("click", function () {
  const nuevoSexo = prompt("Nuevo sexo:");
  paciente.modificarDato("sexo", nuevoSexo);
});

document
  .getElementById("modificarFecha")
  .addEventListener("click", function () {
    const nuevaFecha = prompt("Nueva fecha de nacimiento:");
    paciente.modificarDato("fechaNacimiento", nuevaFecha);
  });

document.getElementById("agregarDxyTto").addEventListener("click", function () {
  paciente.agregarEpisodio();
  paciente.mostrarHistorial();
});

document
  .getElementById("modificarEpisodio")
  .addEventListener("click", function () {
    const idEpisodio = prompt("Ingrese el ID del episodio a modificar:");
    paciente.modificarEpisodio(parseInt(idEpisodio));
    paciente.mostrarHistorial();
  });

document.getElementById("limpiar").addEventListener("click", function () {
  document.getElementById("historial").value = "";
});
