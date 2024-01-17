class Vehiculo {
  //Clase y contrcutor de vehiculo creada en el anterior ejercicio
  constructor(marca, modelo, color, anio, matricula) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.anio = anio;
    this.matricula = matricula;
    this.observaciones = [];

    console.log(
      //Se muestra por consola todos los datos del vehiculo

      `Creado Vehiculo de Marca: ${marca}, Modelo: ${modelo}, Color: ${color}, Año: ${anio} y con Matricula: ${matricula}`
    );
  }
  agregarObservaciones() {
    //Metodo para agregar una observacion
    if (confirm("¿Desea agregar alguna observacion?")) {
      let obs = prompt("Introduzca las observaciones pertinentes");
      this.observaciones.push({ Obs: obs });
    }
  }

  mostrarObservaciones() {
    console.log(`Historial del vehiculo: ${matricula}`);
    this.observaciones.forEach((i) => console.log(i));
  }

  //Metodos para modificar los parametros del vehiculo
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
    //Modificar Año
    if (confirm("¿Desea modificar el Anio del Vehiculo?")) {
      this.anio = prompt("Introduzca el nuevo año de fabricacion");
      alert(`Nuevo anio: ${this.anio}`);
    }
  }

  modificarColor() {
    if (confirm("¿Desea cambiar el color del vehiculo?")) {
      this.color = prompt("Introduzca el nuevo color");
      alert(`Nuevo color: ${color}`);
    }
  }

  modificarMatricula() {
    if (confirm("¿Desea cambiar la matricula del vehiculo?")) {
      this.matricula = prompt("Introduzca la nueva Matricula");
      alert(`Nueva matricula: ${matricula}`);
    }
  }
}

let vehiculoActual; //Creamos una variable global de vehiculo

function crearNuevo() {
  //Creamos una funcion para crear un nuevo vehiculo, en donde referenciamos todos los id necesarios del html
  try {
    //Le añadimos un try catch para controlar cualquier tipo de error
    let marca = document.getElementById("marca").value;
    let modelo = document.getElementById("modelo").value;
    let color = document.getElementById("color").value;
    let anio = document.getElementById("anho").value;
    let matricula = document.getElementById("matricula").value;

    //Validacion de la matricula--------
    if (!/^[0-9]{1,4}[BCDFGHJKLMNPRSTVWXYZ]{3}/.test(matricula)) {
      alert("La matricula no es valida");
      matricula.focus(); //Si falla, se hace focus en el label de matricula
    }

    vehiculoActual = new Vehiculo(marca, modelo, color, anio, matricula); //Si todo va correcto, instanciamos el vehiculo actual con la clase Vehiculo
    document.getElementById(
      "datosvehiculo" //Se muestra todo en el textarea datos vehiculo
    ).value = `Marca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño: ${vehiculoActual.anio}\nMatricula: ${vehiculoActual.matricula}`;
  } catch (error) {
    alert(error.message);
  }
  return false; //Para que el formulario no recarge automaticamente
}

//Funciones de los metodos creados para los parametros de Vehiculo
function modificarMarca() {
  vehiculoActual.modificarMarca();
  document.getElementById(
    "datosvehiculo"
  ).value = `Marca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño: ${vehiculoActual.anio}\nMatricula: ${vehiculoActual.matricula}`;
}

function modificarModelo() {
  vehiculoActual.modificarModelo();
  document.getElementById(
    "datosvehiculo"
  ).value = `Marca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño: ${vehiculoActual.anio}\nMatricula: ${vehiculoActual.matricula}`;
}

function modificarColor() {
  vehiculoActual.modificarColor();
  document.getElementById(
    "datosvehiculo"
  ).value = `Marca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño: ${vehiculoActual.anio}\nMatricula: ${vehiculoActual.matricula}`;
}

function modificarAnio() {
  //modificar Año
  vehiculoActual.modificarAnio();
  document.getElementById(
    "datosvehiculo"
  ).value = `Marca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño: ${vehiculoActual.anio}\nMatricula: ${vehiculoActual.matricula}`;
}

function modificarMatricula() {
  vehiculoActual.modificarMatricula();
  document.getElementById(
    "datosvehiculo"
  ).value = `Marca: ${vehiculoActual.marca}\nModelo: ${vehiculoActual.modelo}\nColor: ${vehiculoActual.color}\nAño: ${vehiculoActual.anio}\nMatricula: ${vehiculoActual.matricula}`;
}

function agregarObservaciones() {
  //Funcion para agregar observaciones en el textarea de observaciones
  vehiculoActual.agregarObservaciones();
  let texto = "";
  for (let i = 0; i < vehiculoActual.observaciones.length; i++) {
    texto += `Observaciones: ${vehiculoActual.observaciones[i].Obs}`;
  }
  document.getElementById("observaciones").value = texto;
}

function limpiarFormulario() {
  //Funcion para limpiar todos los campos del formulario
  if (confirm("¿Desea limpiar el formulario actual?")) {
    window.location.reload();
  }
}

//Referenciar todos los botones por su id correspondiente con las funciones creadas anteriormente:
document.getElementById("crearnuevo").onclick = crearNuevo;
document.getElementById("modificarMarca").onclick = modificarMarca;
document.getElementById("modificarModelo").onclick = modificarModelo;
document.getElementById("modificarColor").onclick = modificarColor;
document.getElementById("modificarAnho").onclick = modificarAnio;
document.getElementById("modificarMatricula").onclick = modificarMatricula;
document.getElementById("agregarObs").onclick = agregarObservaciones;
document.getElementById("limpiar").onclick = limpiarFormulario;
