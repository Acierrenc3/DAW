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
      const prestamo = {
        ID: prompt("Introduzca el ID del prestamo"),
        fechaPrestamo: prompt("Introduzca la fecha del prestamo"),
        fechaDevolucion: prompt("Introduzca la fecha de devolucion del libro"),
        lector: prompt("Introduzca el nombre del lector"),
        estado: prompt("Introduzca el estado del libro"),
      };
      this.historialPrestamos.push(prestamo);
      alert("El Prestamo se ha introducido correctamente");
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
        prestamo.FechaPrestamo = prompt(
          "Introduzca nueva fecha del prestamo",
          prestamo.FechaPrestamo
        );
        prestamo.FechaDevolucion = prompt(
          "Introduzca nueva fecha devolucion",
          prestamo.FechaDevolucion
        );
        prestamo.Lector = prompt("Introduzca el nuevo lector", fecha.lector);
        prestamo.Estado = prompt(
          "Introduzca el nuevo estado del Libro",
          fecha.Estado
        );

        alert("El prestamo ha sido modificado correctamente");
      } else {
        alert("No se ha podido modificar el prestamo");
      }
    }
  }
}

//Manejo del Formulario (Ejercicio 2)--------------------------------------------------------

let libroActual;

function crearNuevo() {
  let isbn = document.getElementById("isbn").value;
  let autor = document.getElementById("autor").value;
  let titulo = document.getElementById("titulo").value;
  let ap = document.getElementById("anioPublicacion").value;
  let genero = document.getElementById("genero").value;
  try {
    //Validaciones-------------------------------------------------------
    //Validacion todos los campos rellenos
    if (!isbn || !autor || !titulo || !ap || !genero) {
      throw new Error("Todos los campos han de ser cumplimentados");
    }
    //Validacion ISBN
    if (isbn.length !== 10) {
      throw new Error("El ISBN ha de tener Exactamente 10 caracteres");
    }
    //Validacion Autor
    if (!/^[a-zA-Z\s]+$/.test(autor)) {
      throw new Error("El Autor solo puede tener letras");
    }
    //Validacion Titulo
    if (!/^[a-zA-Z0-9\s]+$/.test(titulo)) {
      throw new Error("El titulo debe contener solamente letras y numeros");
    }
    //Validacion Año Publicacion
    if (isNaN(parseInt(ap)) || parseInt(ap) > new Date().getFullYear()) {
      throw new Error(
        "El año de publicacion debe ser un valor numérico y estar en un rango válido."
      );
    }

    libroActual = new Libro(isbn, autor, titulo, ap, genero);
    document.getElementById(
      "datoslibro"
    ).value = `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nGenero: ${libroActual.genero}`;
  } catch (error) {
    alert(error.message);
  }

  return false;
}

function modificarIsbn() {
  libroActual.modificarIsbn();
  document.getElementById(
    "datoslibro"
  ).value = `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nGenero: ${libroActual.genero}`;
}

function modificarAutor() {
  libroActual.modificarAutor();
  document.getElementById(
    "datoslibro"
  ).value = `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nGenero: ${libroActual.genero}`;
}

function modificarTitulo() {
  libroActual.modificarTitulo();
  document.getElementById(
    "datoslibro"
  ).value = `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nGenero: ${libroActual.genero}`;
}

function modificarAp() {
  libroActual.modificarAp();
  document.getElementById(
    "datoslibro"
  ).value = `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nGenero: ${libroActual.genero}`;
}

function modificarGenero() {
  libroActual.modificarGenero();
  document.getElementById(
    "datoslibro"
  ).value = `ISBN: ${libroActual.isbn}\nAutor: ${libroActual.autor}\nTitulo: ${libroActual.titulo}\nGenero: ${libroActual.genero}`;
}

function agregarPrestamo() {
  libroActual.agregarPrestamo();
  let contenido = "";
  for (let entrada of libroActual.historialPrestamos) {
    contenido += `ID Prestamo: ${entrada.ID}
    Fecha Prestamo: ${entrada.fechaPrestamo}
    Fecha Devolucion: ${entrada.fechaDevolucion}
    Lector del libro: ${entrada.lector}
    Estado del libro: ${entrada.estado} `;
  }
  document.getElementById("historialPrestamos").value = contenido;
}

function modificarPrestamo() {
  if (libroActual) {
    libroActual.modificarPrestamo();
    let contenido = "";
    for (let entrada of libroActual.historialPrestamos) {
      contenido += `ID Prestamo: ${entrada.ID}
    Fecha Prestamo: ${entrada.fechaPrestamo}
    Fecha Devolucion: ${entrada.fechaDevolucion}
    Lector del libro: ${entrada.lector}
    Estado del libro: ${entrada.estado} `;
    }
    document.getElementById("historialPrestamos").value = contenido;
  }
}

function limpiar() {
  if (confirm("¿Desea limpiar la ventana actual?")) {
    window.location.reload();
  }
}

document.getElementById("crearLibro").onclick = crearNuevo;
document.getElementById("modificarISBN").onclick = modificarIsbn;
document.getElementById("modificarAutor").onclick = modificarAutor;
document.getElementById("modificarTitulo").onclick = modificarTitulo;
document.getElementById("modificarAnioPub").onclick = modificarAp;
document.getElementById("modificarGenero").onclick = modificarGenero;
document.getElementById("agregarPrestamo").onclick = agregarPrestamo;
document.getElementById("modificarPrestamo").onclick = modificarPrestamo;
document.getElementById("limpiar").onclick = limpiar;
