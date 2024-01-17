class Libro {
  constructor(isbn, autor, titulo, ap, genero) {
    this.isbn = isbn;
    this.autor = autor;
    this.titulo = titulo;
    this.ap = ap; //Año publicacion
    this.genero = genero;
    this.historialPrestamos = [];

    alert(
      `Creado Libro con ISBN: ${isbn}, Autor: ${autor}, Titulo: ${titulo}, Año Publicacion: ${ap}, y Genero: ${genero}`
    );
  }

  modificarIsbn() {
    if (confirm("Desea modificar el ISBN del libro?")) {
      this.isbn = prompt("Introduzca el nuevo ISBN");
      alert(`Nuevo ISBN: ${this.isbn}`);
    }
  }

  modificarAutor() {
    if (confirm("Desea modificar el Autor del libro?")) {
      this.autor = prompt("Introduzca el nuevo Autor");
      alert(`Nuevo Autor: ${this.autor}`);
    }
  }

  modificarTitulo() {
    if (confirm("Desea modificar el Titulo del libro?")) {
      this.titulo = prompt("Introduzca el nuevo Titulo");
      alert(`Nuevo Titulo: ${this.titulo}`);
    }
  }

  modificarAp() {
    //modificar año publicacion
    if (confirm("Desea modificar el Año de publicacion del libro?")) {
      this.ap = prompt("Introduzca el nuevo Año de publicacion");
      alert(`Nuevo Año de Publicacion: ${this.ap}`);
    }
  }

  modificarGenero() {
    if (confirm("Desea modificar el género del libro?")) {
      this.genero = prompt("Introduzca el nuevo genero");
      alert(`Nuevo Género: ${this.genero}`);
    }
  }

  agregarPrestamo() {
    if (confirm("Desea agregar un prestamo al historial?")) {
      let ID = prompt("Introduzca el ID del prestamo");
      let fechaPrestamo = prompt("Introduzca la fecha del prestamo");
      let fechaDevolucion = prompt(
        "Introduzca la fecha de devolucion del libro"
      );
      let lector = prompt("Introduzca el nombre del lector");
      let estadoLibro = prompt("Introduzca el estado del libro");
      this.historialPrestamos.push({
        ID: ID,
        FechaPrestamo: fechaPrestamo,
        FechaDevolucion: fechaDevolucion,
        Lector: lector,
        Estado: estado,
      });
    }
  }

  modificarPrestamo() {
    if (
      confirm("Confirme que desea modificar un Prestamo filtrando por el ID")
    ) {
      let idPrestamo = prompt("Introduzca el ID del prestamo a modificar");

      let prestamo = this.historialPrestamos.find(
        (prestamo) => prestamo.ID === idPrestamo
      );

      if (prestamo) {
        prestamo.fechaPrestamo = prompt(
          "Introduzca nueva fecha del prestamo",
          prestamo.fechaPrestamo
        );
        prestamo.fechaDevolucion = prompt(
          "Introduzca nueva fecha devolucion",
          prestamo.fechaDevolucion
        );
        prestamo.lector = prompt("Introduzca el nuevo lector", fecha.lector);
        prestamo.estado = prompt(
          "Introduzca el nuevo estado del Libro",
          fecha.estado
        );

        alert("El prestamo ha sido modificado correctamente");
      } else {
        alert("No se ha podido modificar el prestamo");
      }
    }
  }
}
