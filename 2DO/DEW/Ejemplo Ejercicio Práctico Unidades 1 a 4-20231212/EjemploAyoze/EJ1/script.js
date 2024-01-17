class Paciente {
  constructor(NHC, nombre, apellidos, fechaNac, sexo) {
    this.NHC = NHC;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fechaNac = fechaNac;
    this.sexo = sexo;
    this.historial = []; //Se crea un array para el historial (Sacado del ejercicio de gestion de edificios)

    alert(
      `Se ha creado un nuevo paciente: ${this.nombre} ${this.apellidos} con el NHC: ${this.NHC}`
    );
    this.mostrarDatosPaciente();
  }

  //Creamos un metodo para mostrar todos los datos del paciente
  mostrarDatosPaciente() {
    console.log(`
    Nombre: ${this.nombre} ${this.apellidos}
    NHC: ${this.NHC}
    Sexo: ${this.sexo}
    Fecha de Nacimiento: ${this.fechaNac}
    `);
  }

  //Metodo para modificar datos del paciente
  modificarDato(dato, nuevoValor) {
    const confirmar = confirm(`Está Ud seguro/a de querer modiciar ${dato}?`);
    if (confirmar) {
      this[dato] = nuevoValor;
      alert(`${dato} modificado con exito: ${nuevoValor}`);
      this.mostrarDatosPaciente();
    } else {
      alert(`${dato} no fue modificado`);
    }
  }

  agregarEpisodio() {
    const NHC = this.historial.length + 1;
    const fecha = prompt("Fecha del episodio");
    const diagnostico = prompt("Diagnostico:");
    const tratamiento = prompt("Tratamiento:");
    const medicoResponsable = prompt("Medico Responsable:");

    const episodio = {
      NHC,
      fecha,
      diagnostico,
      tratamiento,
      medicoResponsable,
    };

    this.historial.push(episodio);
    alert("Episodio agregado al historial con exito");
    this.mostrarHistorial();
  }

  modificarEntradaEnHistorial(NHC) {
    const entrada = this.historial.find((entry) => entry.NHC === NHC);

    if (entrada) {
      const nuevaFecha = prompt("Nueva fecha del episodio:", entrada.fecha);
      const nuevoDiagnostico = prompt(
        "Nuevo diagnóstico:",
        entrada.diagnostico
      );
      const nuevoTratamiento = prompt(
        "Nuevo tratamiento:",
        entrada.tratamiento
      );
      const nuevoMedicoResponsable = prompt(
        "Nuevo médico responsable:",
        entrada.medicoResponsable
      );

      // Modificar los valores
      entrada.fecha = nuevaFecha;
      entrada.diagnostico = nuevoDiagnostico;
      entrada.tratamiento = nuevoTratamiento;
      entrada.medicoResponsable = nuevoMedicoResponsable;

      alert("Entrada en el historial modificada con éxito.");
      this.mostrarHistorial();
    } else {
      alert("No se encontró ninguna entrada en el historial con ese ID.");
    }
  }

  mostrarHistorial() {
    console.log("Historial completo:");
    this.historial.forEach((entry) => {
      console.log(`
                NHC: ${entry.NHC}
                Fecha: ${entry.fecha}
                Diagnóstico: ${entry.diagnostico}
                Tratamiento: ${entry.tratamiento}
                Médico Responsable: ${entry.medicoResponsable}
            `);
    });
  }
}

//Instanciamos un Paciente
const paciente = new Paciente(
  "4444",
  "Ayoze",
  "Pestano",
  "06/08/1993",
  "Masculino"
);

//Modificamos Historial:
paciente.agregarEpisodio();
paciente.modificarEntradaEnHistorial(1);
