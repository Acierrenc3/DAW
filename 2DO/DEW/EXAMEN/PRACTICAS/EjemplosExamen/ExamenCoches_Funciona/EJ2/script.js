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
      alert(`Nuevo NIV: ${this.niv}`);
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
      555555;
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
        Solucion: Sol,
        Mecanico: Mec,
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

//Manejo del Formulario (Ejercicio 2)--------------------------------------------

let vehiculoActual;

function crearNuevo() {
  try {
    let niv = document.getElementById("niv").value;
    let marca = document.getElementById("marca").value;
    let modelo = document.getElementById("modelo").value;
    let color = document.getElementById("color").value;
    let af = document.getElementById("anoFabricacion").value;

    //Validaciones----------------------------------------------------
    //Validacion todos los campos rellenos
    if (!niv || !marca || !modelo || !color || !af) {
      throw new Error("Todos los campos han de ser cumplimentados");
    }
    if (niv.length !== 5) {
      throw new Error("El NIV debe tener EXACTAMENTE 5 caracteres");
    }
    if (!/^[a-zA-Z0-9\s]+$/.test(marca)) {
      throw new Error("La marca debe contener solamente letras y numeros");
    }
    if (!/^[a-zA-Z0-9\s]+$/.test(modelo)) {
      throw new Error("El modelo debe contener solamente letras y numeros");
    }
    if (!/^[a-zA-Z]+$/.test(color)) {
      throw new Error("El color solo puede contener letras.");
    }
    if (
      isNaN(parseInt(af)) ||
      parseInt(af) < 1900 ||
      parseInt(af) > new Date().getFullYear()
    ) {
      throw new Error(
        "El año de fabricación debe ser un valor numérico y estar en un rango válido."
      );
    }

    vehiculoActual = new Vehiculo(niv, marca, modelo, af, color);
    document.getElementById(
      "datoscoche"
    ).value = `NIV: ${vehiculoActual.niv}\nMarca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño Fabricacion: ${vehiculoActual.af}`;
  } catch (error) {
    alert(error.message);
  }

  return false;
}

function modificarNiv() {
  vehiculoActual.modificarNiv();
  document.getElementById(
    "datoscoche"
  ).value = `NIV: ${vehiculoActual.niv}\nMarca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño Fabricacion: ${vehiculoActual.af}`;
}

function modificarMarca() {
  vehiculoActual.modificarMarca();
  document.getElementById(
    "datoscoche"
  ).value = `NIV: ${vehiculoActual.niv}\nMarca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño Fabricacion: ${vehiculoActual.af}`;
}

function modificarModelo() {
  vehiculoActual.modificarModelo();
  document.getElementById(
    "datoscoche"
  ).value = `NIV: ${vehiculoActual.niv}\nMarca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño Fabricacion: ${vehiculoActual.af}`;
}

function modificarColor() {
  vehiculoActual.modificarColor();
  document.getElementById(
    "datoscoche"
  ).value = `NIV: ${vehiculoActual.niv}\nMarca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño Fabricacion: ${vehiculoActual.af}`;
}

function modificarAf() {
  //modificarAñoFabricacion
  vehiculoActual.modificarAf();
  document.getElementById(
    "datoscoche"
  ).value = `NIV: ${vehiculoActual.niv}\nMarca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño Fabricacion: ${vehiculoActual.af}`;
}

function agregarHistorial() {
  vehiculoActual.agregarHistorial();
  let texto = "";
  for (let i = 0; i < vehiculoActual.historial.length; i++) {
    texto += `ID episodio: ${vehiculoActual.historial[i].ID}\nFecha episodio: ${vehiculoActual.historial[i].Fecha}\nDiagnostico: ${vehiculoActual.historial[i].Diagnostico}\nSolucion: ${vehiculoActual.historial[i].Solucion}\nResponsable: ${vehiculoActual.historial[i].Mecanico}\n----------------\n`;
  }
  document.getElementById("historialMantenimiento").value = texto;
}

function modificarEpisodio() {
  if (vehiculoActual) {
    vehiculoActual.modificarEpisodioPorID();
    let texto = "";
    for (let i = 0; i < vehiculoActual.historial.length; i++) {
      texto += `ID episodio: ${vehiculoActual.historial[i].ID}\nFecha episodio: ${vehiculoActual.historial[i].Fecha}\nDiagnostico: ${vehiculoActual.historial[i].Diagnóstico}\nSolucion: ${vehiculoActual.historial[i].Solucion}\nResponsable: ${vehiculoActual.historial[i].Mecanico}\n----------------\n`;
    }
    document.getElementById("historialMantenimiento").value = texto;
  }
}
function limpiar() {
  if (confirm("¿Desea limpiar la ventana actual?")) {
    window.location.reload();
  }
}

document.getElementById("crearnuevo").onclick = crearNuevo;
document.getElementById("modificarNiv").onclick = modificarNiv;
document.getElementById("modificarMarca").onclick = modificarMarca;
document.getElementById("modificarModelo").onclick = modificarModelo;
document.getElementById("modificarColor").onclick = modificarColor;
document.getElementById("modificarAnoFabricacion").onclick = modificarAf;
document.getElementById("realizarMantenimiento").onclick = agregarHistorial;
document.getElementById("modificarHistorial").onclick = modificarEpisodio;
document.getElementById("limpiarVentana").onclick = limpiar;
