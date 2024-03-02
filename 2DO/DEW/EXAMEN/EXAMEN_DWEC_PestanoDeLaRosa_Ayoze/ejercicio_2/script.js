class Vehiculo {
  //Clase Vehiculo con su constructor y sus correspondientes parametros
  constructor(marca, modelo, color, anio, matricula) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.anio = anio;
    this.matricula = matricula;
    this.observaciones = [];

    alert(
      //Generamos una alert cuando creamos el vehiculo
      `Creado Vehiculo de Marca: ${marca}, Modelo: ${modelo}, Color: ${color}, Año: ${anio} y con Matricula: ${matricula}`
    );
  }

  obtenerInformacion() {
    //Metodo para mostrar la informacion del vehiculo
    return `Marca: ${this.marca}\nModelo: ${this.modelo}\nColor: ${this.color}\nAño: ${this.anio}\nMatricula: ${this.matricula}`;
  }

  agregarObservaciones() {
    //Metodo para agregar observaciones
    if (confirm("¿Desea agregar alguna observación?")) {
      let obs = prompt("Introduzca las observaciones pertinentes");
      this.observaciones.push({ Obs: obs });
    }
  }

  mostrarObservaciones() {
    //Metodo para mostrar las observaciones introducidas
    console.log(`Historial del vehiculo: ${this.matricula}`);
    this.observaciones.forEach((i) => console.log(i));
  }

  //Metodos para modificar los parametros del objeto Vehiculo (marca, modelo, color año y matricula)
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

  modificarAnio() {
    if (confirm("¿Desea modificar el Año del Vehiculo?")) {
      this.anio = prompt("Introduzca el nuevo año de fabricación");
      alert(`Nuevo año: ${this.anio}`);
    }
  }

  modificarColor() {
    if (confirm("¿Desea cambiar el color del vehiculo?")) {
      this.color = prompt("Introduzca el nuevo color");
      alert(`Nuevo color: ${this.color}`);
    }

    alert(`Error al modificar el Color: ${error.message}`);
  }

  modificarMatricula() {
    if (confirm("¿Desea cambiar la matricula del vehiculo?")) {
      this.matricula = prompt("Introduzca la nueva Matricula");
      alert(`Nueva matricula: ${this.matricula}`);
    }
    alert(`Error al modificar la Matricula: ${error.message}`);
  }
}

let vehiculoActual; //Variable para el vehiculo generado en el momento

function crearNuevo() {
  //Funcion crearNuevo que nos permite crear un vehiculo nuevo con sus parametros
  try {
    //Try catch para controlar errores --- Mencionamos los parametros con sus respectivos ids del html
    let marca = document.getElementById("marca").value;
    let modelo = document.getElementById("modelo").value;
    let color = document.getElementById("color").value;
    let anio = document.getElementById("anho").value;
    let matricula = document.getElementById("matricula").value;

    //Variable para la expresion regular de la matricula junto con la funcion test() para confirmarla
    let rgxMat = /^[0-9]{1,4}[BCDFGHJKLMNPRSTVWXYZ]{3}/.test(matricula);
    if (!rgxMat) {
      alert("La matricula no es valida");
    }

    //Instanciamos la variable vehiculoActual con el objeto Vehiculo
    vehiculoActual = new Vehiculo(marca, modelo, color, anio, matricula);
    document.getElementById("datosvehiculo").textContent =
      vehiculoActual.obtenerInformacion();
  } catch (error) {
    alert(`Error al crear el vehiculo: ${error.message}`);
  }
  return false; //Para controlar el envio automatico del formulario
}

/*Funciones para modificar los parametros, en donde se agrupa todo en try catch 
para controlar los errores y se llama a los metodos de más arriba para acortar codigo*/
function modificarMarca() {
  try {
    if (confirm("¿Desea modificar la marca?")) {
      vehiculoActual.modificarMarca();
      document.getElementById("datosvehiculo").textContent =
        vehiculoActual.obtenerInformacion();
    }
  } catch (error) {
    alert(`Error al modificar la marca: ${error.message}`);
  }
}

function modificarModelo() {
  try {
    if (confirm("¿Desea modificar el modelo del Vehiculo?")) {
      vehiculoActual.modificarModelo();
      document.getElementById("datosvehiculo").textContent =
        vehiculoActual.obtenerInformacion();
    }
  } catch (error) {
    alert(`Error al modificar el modelo: ${error.message}`);
  }
}

function modificarColor() {
  try {
    if (confirm("¿Desea cambiar el color del vehiculo?")) {
      vehiculoActual.modificarColor();
      document.getElementById("datosvehiculo").textContent =
        vehiculoActual.obtenerInformacion();
    }
  } catch (error) {
    alert(`Error al cambiar el color: ${error.message}`);
  }
}

function modificarAnio() {
  try {
    if (confirm("¿Desea modificar el Año del Vehiculo?")) {
      vehiculoActual.modificarAnio();
      document.getElementById("datosvehiculo").textContent =
        vehiculoActual.obtenerInformacion();
    }
  } catch (error) {
    alert(`Error al modificar el año: ${error.message}`);
  }
}

function modificarMatricula() {
  try {
    if (confirm("¿Desea cambiar la matricula del vehiculo?")) {
      vehiculoActual.modificarMatricula();
      document.getElementById("datosvehiculo").textContent =
        vehiculoActual.obtenerInformacion();
    }
  } catch (error) {
    alert(`Error al cambiar la matrícula: ${error.message}`);
  }
}

function agregarObservaciones() {
  try {
    vehiculoActual.agregarObservaciones();
    let texto = "";
    for (let i = 0; i < vehiculoActual.observaciones.length; i++) {
      texto += `Observaciones: ${vehiculoActual.observaciones[i].Obs}\n`;
    }
    document.getElementById("observaciones").textContent = texto;
  } catch (error) {
    alert(`Error al agregar observaciones: ${error.message}`);
  }
}

function limpiarFormulario() {
  if (confirm("¿Desea limpiar el formulario actual?")) {
    window.location.reload();
  }
}

//Conectamos los ids de los botones con las funciones creadas anteriormente
document.getElementById("crearnuevo").onclick = crearNuevo;
document.getElementById("modificarMarca").onclick = modificarMarca;
document.getElementById("modificarModelo").onclick = modificarModelo;
document.getElementById("modificarColor").onclick = modificarColor;
document.getElementById("modificarAnho").onclick = modificarAnio;
document.getElementById("modificarMatricula").onclick = modificarMatricula;
document.getElementById("agregarObs").onclick = agregarObservaciones;
document.getElementById("limpiar").onclick = limpiarFormulario;
