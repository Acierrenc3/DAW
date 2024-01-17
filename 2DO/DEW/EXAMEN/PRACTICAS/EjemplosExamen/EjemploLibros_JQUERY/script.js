$(document).ready(function () {
  class Libro {
    constructor(isbn, autor, titulo, anioPublicacion, genero) {
      this.isbn = isbn;
      this.autor = autor;
      this.titulo = titulo;
      this.anioPublicacion = anioPublicacion;
      this.genero = genero;
      this.historialPrestamos = [];

      console.log(
        `Se ha creado un nuevo libro con la siguiente información: \n${this.toString()}`
      );
    }

    // Método para mostrar la información
    toString() {
      return `ISBN: ${this.isbn}, Autor: ${this.autor}, Titulo: ${this.titulo}, AñoPublicación: ${this.anioPublicacion}, Genero: ${this.genero}`;
    }

    // Diferentes métodos para el trato de la información
    modificarIsbn() {
      if (confirm("Confirme que desea modificar el ISBN del libro.")) {
        this.isbn = prompt("Introduzca el ISBN que desea: ");
        alert(`El ISBN ha sido modificado por: ${this.isbn}`);
      }
    }

    modificarAutor() {
      if (confirm("Confirme que desea modificar el Autor del libro.")) {
        this.autor = prompt("Introduzca el Autor que desea: ");
        alert(`El Autor ha sido modificado por: ${this.autor}`);
      }
    }

    modificarTitulo() {
      if (confirm("Confirme que desea modificar el Título del libro.")) {
        this.titulo = prompt("Introduzca el Título que desea: ");
        alert(`El Título ha sido modificado por: ${this.titulo}`);
      }
    }

    modificarAnioPublicacion() {
      if (
        confirm("Confirme que desea modificar el Año de Publicación del libro.")
      ) {
        this.anioPublicacion = prompt("Introduzca el Año que desea: ");
        alert(
          `El Año de Publicación ha sido modificado por: ${this.anioPublicacion}`
        );
      }
    }

    modificarGenero() {
      if (confirm("Confirme que desea modificar el Género del libro.")) {
        this.genero = prompt("Introduzca el Género que desea: ");
        alert(`El Género ha sido modificado por: ${this.genero}`);
      }
    }

    // Método para agregar un préstamo al historial
    agregarPrestamo() {
      if (confirm("Confirme que desea agregar un préstamo al libro.")) {
        const prestamo = {
          ID: prompt("Introduzca el Identificador el préstamo: "),
          fechaPrestamo: prompt("Introduzca la fecha del préstamo: "),
          fechaDevolucion: prompt("Introduzca la fecha de devolución: "),
          lectorLibro: prompt("Introduzca el nombre del lector: "),
          estadoLibro: prompt("Introduzca el estado del libro: "),
        };
        this.historialPrestamos.push(prestamo);
        alert("El préstamo se ha introducido correctamente");
      }
    }

    modificarPrestamo() {
      if (
        confirm(
          "Confirme que desea modificar un Préstamo ya introducido filtrando por el Identificador."
        )
      ) {
        let idPrestamo = prompt(
          "Introduzca el Identificador que desea modificar: "
        );

        let prestamo = this.historialPrestamos.find(
          (prestamo) => prestamo.ID === idPrestamo
        );

        if (prestamo) {
          prestamo.fechaPrestamo = prompt(
            "Introduzca la nueva fecha de préstamo: ",
            prestamo.fechaPrestamo
          );
          prestamo.fechaDevolucion = prompt(
            "Introduzca la nueva fecha de devolución: ",
            prestamo.fechaDevolucion
          );
          prestamo.lectorLibro = prompt(
            "Introduzca el nuevo lector del libro: ",
            prestamo.lectorLibro
          );
          prestamo.estadoLibro = prompt(
            "Introduzca el nuevo estao del libro: ",
            prestamo.estadoLibro
          );

          alert("El préstamo ha sido modificado satisfactoriamente.");
        } else {
          alert(
            `No se ha encontrado el préstamo con el Identificador -> ${idPrestamo}`
          );
        }
      }
    }

    mostrarPrestamos() {
      console.log("Historial de préstamos del libro: ");
      this.historialPrestamos.forEach((entrada) => {
        console.log(`
        ID: ${entrada.ID}
        Fecha Préstamo: ${entrada.fechaPrestamo}
        Fecha Devolución: ${entrada.fechaDevolucion}
        Lector: ${entrada.lectorLibro}
        Estado: ${entrada.estadoLibro}
        `);
      });
    }
  }

  let libroActual = null;

  function validarCamposRellenos(campos) {
    for (const [campo, valor] of Object.entries(campos)) {
      if (!valor) {
        throw new Error(`El campo '${campo}' no puede estar vacío.`);
      }
    }
  }

  function validarAnioPublicacion(anio) {
    // Expresión regular para verificar si la cadena contiene solo números
    const esNumero = /^\d+$/;

    if (!esNumero.test(anio) || anio > new Date().getFullYear()) {
      throw new Error(
        "El año de publicación debe ser numérico y no superior al actual."
      );
    }
  }

  function convertirAMayusculas(campo) {
    let valor = campo.value;
    campo.value = valor.toUpperCase();
  }

  $("#crearLibro").click(function () {
    let isbn = $("#isbn").val().trim();
    let autor = $("#autor").val().trim();
    let titulo = $("#titulo").val().trim();
    let anioPublicacion = $("#anioPublicacion").val().trim();
    let genero = $("#genero").val().trim();

    try {
      validarCamposRellenos({ isbn, autor, titulo, anioPublicacion, genero });
      validarAnioPublicacion(anioPublicacion);

      libroActual = new Libro(isbn, autor, titulo, anioPublicacion, genero);

      $("#datoslibro").val(
        `ISBN: ${isbn}\nAutor: ${autor}\nTitulo: ${titulo}\nAño de Publicación: ${anioPublicacion}\nGenero: ${genero}`
      );
    } catch (error) {
      alert(error.message);
    }
    return false; //Evitar la recarga automática de la página
  });

  // Resto de las funciones (modificarIsbn, modificarAutor, etc.)...

  $("#autor, #titulo, #genero").blur(function () {
    convertirAMayusculas(this);
  });

  // Resto de las funciones (modificarIsbn, modificarAutor, etc.)...

  $("#modificarISBN").click(function () {
    libroActual.modificarIsbn();
    $("#datoslibro").val(
      `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nAño de Publicación: ${libroActual.anioPublicacion}\nGenero: ${libroActual.genero}`
    );
  });

  $("#modificarAutor").click(function () {
    libroActual.modificarAutor();
    $("#datoslibro").val(
      `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nAño de Publicación: ${libroActual.anioPublicacion}\nGenero: ${libroActual.genero}`
    );
  });

  $("#modificarTitulo").click(function () {
    libroActual.modificarTitulo();
    $("#datoslibro").val(
      `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nAño de Publicación: ${libroActual.anioPublicacion}\nGenero: ${libroActual.genero}`
    );
  });

  $("#modificarAnioPub").click(function () {
    libroActual.modificarAnioPublicacion();
    $("#datoslibro").val(
      `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nAño de Publicación: ${libroActual.anioPublicacion}\nGenero: ${libroActual.genero}`
    );
  });

  $("#modificarGenero").click(function () {
    libroActual.modificarGenero();
    $("#datoslibro").val(
      `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nAño de Publicación: ${libroActual.anioPublicacion}\nGenero: ${libroActual.genero}`
    );
  });

  $("#agregarPrestamo").click(function () {
    libroActual.agregarPrestamo();
    let contenidoHistorial = "";
    for (let entrada of libroActual.historialPrestamos) {
      contenidoHistorial += `ID Prestamo: ${entrada.ID}
Fecha Prestamo: ${entrada.fechaPrestamo}
Fecha Devolución: ${entrada.fechaDevolucion}
Lector del libro: ${entrada.lectorLibro}
Estado del libro: ${entrada.estadoLibro}
--------------------`;
    }
    $("#historialPrestamos").val(contenidoHistorial);
  });

  $("#modificarPrestamo").click(function () {
    if (libroActual) {
      libroActual.modificarPrestamo();
      let contenidoHistorial = "";
      for (let entrada of libroActual.historialPrestamos) {
        contenidoHistorial += `ID Prestamo: ${entrada.ID}
Fecha Prestamo: ${entrada.fechaPrestamo}
Fecha Devolución: ${entrada.fechaDevolucion}
Lector del libro: ${entrada.lectorLibro}
Estado del libro: ${entrada.estadoLibro}
--------------------`;
      }
      $("#historialPrestamos").val(contenidoHistorial);
    }
  });

  $("#limpiar").click(function () {
    if (confirm("Confirme que desea limpiar el formulario.")) {
      window.location.reload();
    }
  });
});
