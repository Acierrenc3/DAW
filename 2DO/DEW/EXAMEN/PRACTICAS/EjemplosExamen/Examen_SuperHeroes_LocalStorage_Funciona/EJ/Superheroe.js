document.getElementById("nombre").addEventListener("blur", function () {
  convertirAMayusculas(this);
});

document.getElementById("poder").addEventListener("blur", function () {
  convertirAMayusculas(this);
});
document.getElementById("colorTraje").addEventListener("blur", function () {
  convertirAMayusculas(this);
});

class SuperHeroe {
  constructor(nis, nombre, poder, ad, colorTraje) {
    this.nis = nis; //Numero Identificacion superHeroe
    this.nombre = nombre;
    this.poder = poder;
    this.ad = ad; //Año debut
    this.colorTraje = colorTraje;
    this.historial = [];

    alert(
      `Creado SuperHeroe con NIS: ${nis}, Nombre: ${nombre}, Poder: ${poder}, Año debut: ${ad} y Color de Traje: ${colorTraje}`
    );
  }

  modificarNis() {
    if (confirm("¿Desea modificar el NIS del Heroe?")) {
      this.nis = prompt("Introduzca el nuevo NIS");
      alert(`Nuevo NIS: ${this.nis}`);
    }
  }

  modificarNombre() {
    if (confirm("¿Desea modificar el nombre del Heroe?")) {
      this.nombre = prompt("Introduzca el nuevo nombre del heroe");
      alert(`Nuevo nombre: ${this.nombre}`);
    }
  }

  modificarPoder() {
    if (confirm("¿Desea modificar el poder del Heroe?")) {
      this.poder = prompt("Introduzca el nuevo poder");
      alert(`Nuevo Poder: ${this.poder}`);
    }
  }

  modificarAd() {
    //Modificar el año de debut
    if (confirm("¿Desea modificar el Año de debut del Heroe?")) {
      this.ad = prompt("Introduzca el nuevo año de debut");
      alert(`Nuevo año de debut: ${this.ad}`);
    }
  }

  modificarColorTraje() {
    if (confirm("¿Desea cambiar el color del traje?")) {
      this.colorTraje = prompt("Introduzca el nuevo color");
      alert(`Nuevo color: ${this.colorTraje}`);
    }
  }

  agregarHistorial() {
    if (confirm("¿Desea agregar un episodio al historial?")) {
      let ID = prompt("Introduzca el ID del episodio");
      let fecha = prompt("Introduzca la fecha");
      let villano = prompt("Introduzca el villano");
      let compañero = prompt("Introduzca el compañero");
      this.historial.push({
        ID: ID,
        Fecha: fecha,
        Villano: villano,
        Compañero: compañero,
      });
    }
  }
  modificarHistorial() {
    let texto = "";
    this.historial.forEach((entry) => {
      texto += `ID episodio: ${entry.ID}\nFecha episodio: ${entry.Fecha}\nDiagnostico: ${entry.Diagnostico}\nSolucion: ${entry.Solucion}\nResponsable: ${entry.Mecanico}\n----------------\n`;
    });
    alert(texto);
  }

  modificarEpisodioPorID() {
    if (confirm("¿Desea modificar un episodio en el historial por ID?")) {
      let idEpisodio = prompt("Introduzca el ID del episodio a modificar:");
      for (let i = 0; i < this.historial.length; i++) {
        if (this.historial[i].ID === idEpisodio) {
          this.historial[i].Fecha = prompt("Introduzca nueva fecha:");
          this.historial[i].Villano = prompt("Introduzca nuevo villano:");
          this.historial[i].Compañero = prompt("Introduzca nuevo Compañero:");

          alert("Episodio modificado correctamente.");
        }
      }
    }
  }

  serializar() {
    return JSON.stringify(this);
  }

  static deserializar(serializado) {
    const datos = JSON.parse(serializado);
    const heroe = new SuperHeroe(
      datos.nis,
      datos.nombre,
      datos.poder,
      datos.ad,
      datos.colorTraje
    );
    heroe.historial = datos.historial; // Asegúrate de que el historial también se recupere
    return heroe;
  }
}
