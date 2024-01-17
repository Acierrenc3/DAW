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

  agregarEpisodio() {
    if (confirm("¿Desea agregar un episodio al historial?")) {
      let ID = prompt("Introduzca el ID del episodio");
      let fecha = prompt("Introduzca la fecha del episodio");
      let diagnostico = prompt("Introduzca el diagnostico del episodio");
      let tratamiento = prompt("Introduzca el tratamiento aplicado");
      let mr = prompt("Introduzca el Medico responsable"); //mr = Medico Responsable
    }
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

  mostrarHistorial() {
    alert(`Historial del paciente ${this.nhc}`);
    this.historial.forEach((entry) => {
      alert(entry);
    });
  }
}
