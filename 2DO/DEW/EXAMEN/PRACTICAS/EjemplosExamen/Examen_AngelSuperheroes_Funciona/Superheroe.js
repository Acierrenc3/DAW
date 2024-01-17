class Superheroe {
  constructor(nis, nombre, poder, anioDebut, colorTraje) {
    this.nis = nis;
    this.nombre = nombre;
    this.poder = poder;
    this.anioDebut = anioDebut;
    this.colorTraje = colorTraje;
    this.historialEventos = [];

    console.log(
      `Se ha creado un nuevo Super Heroe con la siguiente información: \n${this.toString()}`
    );
  }

  //Metodo para mostrar la información
  toString() {
    return `NIS: ${this.nis}, Nombre: ${this.nombre}, Poder: ${this.poder}, Año Debut: ${this.anioDebut}, Color de Traje: ${this.colorTraje}`;
  }

  //Diferentes metodos para el trato de la información
  modificarNis() {
    if (confirm("Confirme que desea modificar el NIS del SuperHéroe.")) {
      this.nis = prompt("Introduca el NIS que desea: ");
      alert(`El NIS ha sido modificado por: ${this.nis}`);
    }
  }

  modificarNombre() {
    if (confirm("Confirme que desea modificar el Nombre del SuperHéroe.")) {
      this.nombre = prompt("Introduca el Autor que desea: ");
      alert(`El Nombre ha sido modificado por: ${this.nombre}`);
    }
  }

  modificarPoder() {
    if (confirm("Confirme que desea modificar el Poder del SuperHéroe.")) {
      this.poder = prompt("Introduca el Poder que desea: ");
      alert(`El Poder ha sido modificado por: ${this.poder}`);
    }
  }

  modificarAnioDebut() {
    if (
      confirm("Confirme que desea modificar el Año de Debut del SuperHéroe.")
    ) {
      this.anioDebut = prompt("Introduca el Año que desea: ");
      alert(`El Año de Debut ha sido modificado por: ${this.anioDebut}`);
    }
  }

  modificaColorTraje() {
    if (confirm("Confirme que desea modificar el Color del Traje.")) {
      this.colorTraje = prompt("Introduca el Color que desea: ");
      alert(`El Color ha sido modificado por: ${this.colorTraje}`);
    }
  }

  //Metodo para agregar un evento al hitorial
  agregarEvento() {
    if (confirm("Confirme que desea agregar un evento al historial.")) {
      const evento = {
        ID: prompt("Introduzca el Identificador el evento: "),
        fechaEvento: prompt("Introduzca la fecha del evento: "),
        evento: prompt("Introduzca la evento: "),
        villano: prompt("Introduzca el nombre del villano: "),
        companiero: prompt("Introduzca el nombre del compañero: "),
      };
      this.historialEventos.push(evento);
      alert("El evento se ha introducido correctamente");
    }
  }

  modificarEvento() {
    if (
      confirm(
        "Confirme que desea modificar un Evento ya introducido filtrando por el Identificador."
      )
    ) {
      let idEvento = prompt(
        "Introduzca el Identificador que desea modificar: "
      );

      let evento = this.historialEventos.find(
        (evento) => evento.ID === idEvento
      );

      if (evento) {
        evento.fechaEvento = prompt(
          "Introduzca la nueva fecha del evento: ",
          evento.fechaEvento
        );
        evento.evento = prompt(
          "Introduzca la evento que se produjo: ",
          evento.evento
        );
        evento.villano = prompt(
          "Introduzca el nuevo villano del evento: ",
          evento.villano
        );
        evento.companiero = prompt(
          "Introduzca el nuevo compeñero del evento: ",
          evento.companiero
        );

        alert("El evento ha sido modificado satisfactoriamente.");
      } else {
        alert(
          `No se ha encontrado el evento con el Identificador -> ${idEvento}`
        );
      }
    }
  }

  mostrarEventos() {
    console.log("Historial de eventos del libro: ");
    this.historialEventos.forEach((entrada) => {
      console.log(`
        ID: ${entrada.ID}
        Fecha Evento: ${entrada.fechaEvento}
        Evento: ${entrada.evento}
        Villano: ${entrada.villano}
        Compañero: ${entrada.companiero}
        `);
    });
  }

  serializar() {
    return JSON.stringify(this);
  }

  static deserializar(serializado) {
    const datos = JSON.parse(serializado);
    const superheroe = new Superheroe(
      datos.nis,
      datos.nombre,
      datos.poder,
      datos.anioDebut,
      datos.colorTraje
    );
    superheroe.historial = datos.historial; // Asegúrate de que el historial también se recupere
    return superheroe;
  }
}
