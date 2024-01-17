class Paciente {
  constructor(NHC, nombre, apellidos, fechaNacimiento, sexo) {
    this.NHC = NHC;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fechaNacimiento = fechaNacimiento;
    this.sexo = sexo;
    this.historial = [];

    this.mostrarMensajeCreacion();
  }

  mostrarMensajeCreacion() {
    console.log(
      `Se ha creado un nuevo paciente: ${this.nombre} ${this.apellidos}`
    );
    this.mostrarDatosPaciente();
  }

  mostrarDatosPaciente() {
    console.log(`
            Nombre: ${this.nombre} ${this.apellidos}
            NHC: ${this.NHC}
            Sexo: ${this.sexo}
            Fecha de Nacimiento: ${this.fechaNacimiento}
        `);
  }

  modificarDato(dato, nuevoValor) {
    const confirmacion = confirm(`¿Estás seguro de modificar ${dato}?`);
    if (confirmacion) {
      this[dato] = nuevoValor;
      console.log(`${dato} modificado/a con éxito: ${nuevoValor}`);
      this.mostrarDatosPaciente();
    } else {
      console.log(`${dato} no fue modificado.`);
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
    console.log("Episodio agregado al historial con éxito.");
    this.mostrarHistorial();
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

      console.log("Episodio modificado con éxito.");
      this.mostrarHistorial();
    } else {
      console.log("No se encontró ningún episodio con ese ID.");
    }
  }

  mostrarHistorial() {
    console.log("Historial completo:");
    this.historial.forEach((entry) => {
      console.log(`
                ID: ${entry.ID}
                Fecha: ${entry.fecha}
                Diagnóstico: ${entry.diagnostico}
                Tratamiento: ${entry.tratamiento}
                Médico Responsable: ${entry.medicoResponsable}
            `);
    });
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

// Ejemplos de uso de los métodos
paciente.modificarDato("nombre", "Pedro");
paciente.agregarEpisodio();
paciente.modificarEpisodio(1);
