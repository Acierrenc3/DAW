// Definimos una clase llamada "Edificio"
class Edificio {
  // El constructor se ejecuta cuando creamos un nuevo edificio
  constructor(calle, numero, codigoPostal) {
    // Guardamos la información sobre el edificio
    this.calle = calle;
    this.numero = numero;
    this.codigoPostal = codigoPostal;
    this.plantas = new Array(); // Guardaremos información sobre las plantas y puertas en este edificio
  }

  // Agregamos plantas y puertas al edificio
  agregarPlantasYPuertas(numplantasAñadir, numpuertasAñadir) {
    let totalplantas = this.plantas.length; // Sabemos cuántas plantas hay en el edificio
    let inicio;
    if (totalplantas <= 0) inicio = 0;
    else inicio = totalplantas;

    // Creamos nuevas plantas y puertas en el edificio
    for (let i = inicio; i < totalplantas + numplantasAñadir; i++) {
      this.plantas[i] = new Array(numpuertasAñadir);
      for (let j = 0; j < numpuertasAñadir; j++) this.plantas[i][j] = "";
    }
  }

  // Modificamos la información del edificio
  modificarNumero(numero) {
    this.numero = numero;
  }
  modificarCalle(calle) {
    this.calle = calle;
  }
  modificarCodigoPostal(codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  // Devolvemos información sobre el edificio
  imprimeCalle() {
    return this.calle;
  }
  imprimeNumero() {
    return this.numero;
  }
  imprimeCodigoPostal() {
    return this.codigoPostal;
  }

  // Agregamos propietarios a las puertas del edificio
  agregarPropietario(nombre, planta, puerta) {
    this.plantas[planta][puerta] = nombre; // Asignamos un nombre al propietario de una puerta
  }

  // Mostramos la información de los propietarios del edificio
  imprimePlantas() {
    document.write(
      "Listado de propietarios del edificio: " +
        this.calle +
        " número " +
        this.numero +
        ":<br><br>"
    );

    // Recorremos todas las plantas y puertas del edificio
    for (
      let plantaRecorrer = 0;
      plantaRecorrer < this.plantas.length;
      plantaRecorrer++
    ) {
      for (
        let puertaRecorrer = 0;
        puertaRecorrer < this.plantas[plantaRecorrer].length;
        puertaRecorrer++
      ) {
        // Mostramos el propietario de una puerta en una planta
        document.write(
          "Propietario del piso: " +
            (puertaRecorrer + 1) +
            " ,de la planta: " +
            (plantaRecorrer + 1) +
            " ,es: " +
            this.plantas[plantaRecorrer][puertaRecorrer] +
            "<br>"
        );
      }
    }

    // Agregamos espacios para que se vea mejor
    document.write("<br>");
  }
}

// Creamos tres edificios
let edificioA = new Edificio("Genil", "1", "38008");
let edificioB = new Edificio("Castillo", "2", "38002");
let edificioC = new Edificio("Castillo", "23", "38002");

// Mostramos información sobre los edificios
document.write(
  "Creado edificio en la calle " +
    edificioA.calle +
    " numero: " +
    edificioA.numero +
    " y CP: " +
    edificioA.codigoPostal +
    "<br>"
);
document.write(
  "Creado edificio en la calle " +
    edificioB.calle +
    " numero: " +
    edificioB.numero +
    " y CP: " +
    edificioB.codigoPostal +
    "<br>"
);
document.write(
  "Creado edificio en la calle " +
    edificioC.calle +
    " numero: " +
    edificioC.numero +
    " y CP: " +
    edificioC.codigoPostal +
    "<br><br><br>"
);

// Mostramos información sobre los edificios
document.write(
  "El codigo postal del edificio A es: " +
    edificioA.imprimeCodigoPostal() +
    "<br>"
);
document.write(
  "La calle del edificio C se llama: " + edificioC.imprimeCalle() + "<br>"
);
document.write(
  "El edificio B está situado en la calle: " +
    edificioB.imprimeCalle() +
    " número: " +
    edificioC.imprimeNumero() +
    "<br><br><br>"
);

// Agregamos plantas y propietarios al edificio A
edificioA.agregarPlantasYPuertas(2, 3);
edificioA.agregarPropietario("Jose Antonio Lopez", 0, 0);
edificioA.agregarPropietario("Luisa Martinez", 0, 1);
edificioA.agregarPropietario("Marta Castellón", 0, 2);
edificioA.agregarPropietario("Antonio Pereria", 1, 1);
edificioA.imprimePlantas();

// Agregamos más plantas y propietarios al edificio A
edificioA.agregarPlantasYPuertas(1, 3);
edificioA.agregarPropietario("Pedro Meijide", 2, 1);
edificioA.imprimePlantas();
