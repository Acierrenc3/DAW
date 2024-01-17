class Vehiculo {
  //Se crea una clase Vehiculo con un constructor que incluya las variables pedidas en el enunciado del ejercicio 1
  constructor(marca, modelo, color, anio, matricula) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.anio = anio;
    this.matricula = matricula;
    this.observaciones = []; //Array observaciones

    console.log(
      //Se muestra por consola todos los datos del vehiculo
      `Creado Vehiculo de Marca: ${marca}, Modelo: ${modelo}, Color: ${color}, Año: ${anio} y con Matricula: ${matricula}`
    );
  }

  agregarObservaciones() {
    //Metodo para agregar una observacion
    if (confirm("¿Desea agregar alguna observacion?")) {
      let ID = prompt("Introduzca el ID de la observacion");
      let obs = prompt("Introduzca las observaciones pertinentes");
      this.observaciones.push({ ID: ID, Obs: obs });
    }
  }

  mostrarObservaciones() {
    //Metodo para mostar las observaciones del vehiculo
    console.log(`Historial del vehiculo: ${matricula}`);
    this.observaciones.forEach((i) => console.log(i));
  }
}
