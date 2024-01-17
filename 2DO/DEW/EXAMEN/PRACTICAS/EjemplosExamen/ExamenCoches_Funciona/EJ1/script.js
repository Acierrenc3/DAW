class Vehiculo {
  constructor(niv, marca, modelo, af, color) {
    this.niv = niv; //Numero Identificacion del Vehiculo
    this.marca = marca;
    this.modelo = modelo;
    this.af = af; //Año fabricacion
    this.color = color;
    this.historial = [];

    alert(
      `Creado Vehiculo con NIV: ${niv}, Marca: ${marca}, Modelo: ${modelo}, Año Fabricacion: ${af} y color: ${color}`
    );
  }

  modificarNiv() {
    if (confirm("¿Desea modificar el NIV del vehiculo?")) {
      this.niv = prompt("Introduzca el nuevo NIV");
      alert(`Nuevo NIV: ${niv}`);
    }
  }

  modificarMarca() {
    if (confirm("¿Desea modificar la marca?")) {
      this.marca = prompt("Introduzca la nueva marca del vehiculo");
      alert(`Nueva marca: ${this.marca}`);
    }
  }

  modificarModelo() {
    if (confirm("¿Desea modificar el modelo del Vehiculo?")) {
      this.modelo = prompt("Introduzca el nuevo modelo");
      alert(`Nuevo modelo: ${this.modelo}`);
    }
  }

  modificarAf() {
    //Modificar el año de fabricacion
    if (confirm("¿Desea modificar el Año de fabricacion del Vehiculo?")) {
      this.af = prompt("Introduzca el nuevo año de fabricacion");
      alert(`Nuevo año de fabricacion: ${this.af}`);
    }
  }

  modificarColor() {
    if (confirm("¿Desea cambiar el color del vehiculo?")) {
      this.color = prompt("Introduzca el nuevo color");
      alert(`Nuevo color: ${color}`);
    }
  }

  agregarHistorial() {
    if (confirm("¿Desea agregar un episodio al historial?")) {
      let ID = prompt("Introduzca el ID del episodio");
      let fecha = prompt("Introduzca la fecha");
      let Dx = prompt("Introduzca el diagnostico"); //Dx = Diagnostico
      let Sol = prompt("Introduzca la solucion"); //Sol = Solucion
      let Mec = prompt("Introduzca Mecanico"); //Mec = Mecanico
      this.historial.push({
        ID: ID,
        Fecha: fecha,
        Diagnostico: Dx,
        Solucion: solucion,
        Mecanico: mecanico,
      });
    }
  }

  mostrarHIstorial() {
    alert(`Historial del vehiculo ${niv}`);
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
          this.historial[i].Solucion = prompt("Introduzca nueva solucion:");
          this.historial[i].Mecanico = prompt("Introduzca nuevo Mecanico:");

          alert("Episodio modificado correctamente.");
        }
      }
    }
  }
}
