document.getElementById("nombre").addEventListener("blur", function () {
  convertirAMayusculas(this);
});

document.getElementById("apellidos").addEventListener("blur", function () {
  convertirAMayusculas(this);
});
document.getElementById("cargo").addEventListener("blur", function () {
  convertirAMayusculas(this);
});

class Trabajador {
  constructor(id, dni, nombre, apellidos, ai, cargo) {
    this.id = id;
    this.dni = dni;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.ai = ai; //Año ingreso
    this.cargo = cargo;
    this.historialTareas = [];

    alert(
      `Se ha creado un nuevo Trabajador con la siguiente información: \n${this.toString()}`
    );
  }

  //Metodo para mostrar la informacion
  toString() {
    return `ID: ${this.id}, DNI: ${this.dni}, Nombre Completo: ${this.nombre} ${this.apellidos}, Año Ingreso: ${this.ai}, Cargo: ${this.cargo}`;
  }

  modificarId() {
    if (confirm("Confirme que desea modificar el ID"))
      this.id = prompt("Introduzca el nuevo ID");
    alert(`El ID ha sido modificado por: ${this.id}`);
  }
  modificarDni() {
    if (confirm("Confirme que desea modificar el DNI"))
      this.dni = prompt("Introduzca el nuevo DNI");
    alert(`El DNI ha sido modificado por: ${this.dni}`);
  }
  modificarNombre() {
    if (confirm("Confirme que desea modificar el Nombre"))
      this.nombre = prompt("Introduzca el nuevo Nombre");
    alert(`El Nombre ha sido modificado por: ${this.nombre}`);
  }
  modificarApellidos() {
    if (confirm("Confirme que desea modificar los Apellidos"))
      this.apellidos = prompt("Introduzca los nuevos Apellidos");
    alert(`Los apellidos han sido modificados por: ${this.apellidos}`);
  }
  modificarAi() {
    //Modificar año ingreso
    if (confirm("Confirme que desea modificar el Año de ingreso"))
      this.ai = prompt("Introduzca el nuevo Año de ingreso");
    alert(`El AÑo ingreso ha sido modificado por: ${this.ai}`);
  }
  modificarCargo() {
    if (confirm("Confirme que desea modificar el Cargo"))
      this.cargo = prompt("Introduzca el nuevo Cargo");
    alert(`El Cargo ha sido modificado por: ${this.cargo}`);
  }

  asignarTarea() {
    if (confirm("Confirme que desea agregar un evento al historial.")) {
      const tarea = {
        ID: prompt("Introduzca el Identificador de la tarea: "),
        descripcion: prompt("Introduzca la descripcion: "),
        finicio: prompt("Introduzca la Fecha de inicio: "),
        ffinalizacion: prompt("Introduzca la Fecha de finalizacion: "),
      };
      // Validación: Si el usuario cancela, asignar un valor predeterminado a los campos.
      if (tarea.ID === null || tarea.ID.trim() === "")
        tarea.ID = "No especificado";
      if (tarea.descripcion === null || tarea.descripcion.trim() === "")
        tarea.descripcion = "No especificada";
      if (tarea.finicio === null || tarea.finicio.trim() === "")
        tarea.finicio = "No especificada";
      if (tarea.ffinalizacion === null || tarea.ffinalizacion.trim() === "")
        tarea.ffinalizacion = "No especificada";

      this.historialTareas.push(tarea);
      alert("La tarea se ha introducido correctamente");
    }
  }

  modificarTarea() {
    if (
      confirm(
        "Confirme que desea modificar una Tarea ya introducida filtrando por el Identificador."
      )
    ) {
      let idTarea = prompt("Introduzca el Identificador que desea modificar: ");

      let tarea = this.historialTareas.find((tarea) => tarea.ID === idTarea);

      if (tarea) {
        tarea.descripcion = prompt(
          "Introduzca la nueva descripcion de la tarea: ",
          tarea.descripcion
        );
        tarea.finicio = prompt(
          "Introduzca la Fecha de Inicio de la tarea: ",
          tarea.finicio
        );
        tarea.ffinalizacion = prompt(
          "Introduzca La fecha de finalizacion de la tarea: ",
          tarea.ffinalizacion
        );

        alert("La tarea modificada satisfactoriamente.");
      } else {
        alert(
          `No se ha encontrado la tarea con el Identificador -> ${idTarea}`
        );
      }
    }
  }

  mostrarTarea() {
    console.log("Historial de tareas del Trabajador: ");
    this.historialTareas.forEach((entrada) => {
      console.log(`
        ID: ${entrada.ID}
        Descripcion: ${entrada.descripcion}
        FInicio: ${entrada.finicio}
        FFinalizacion: ${entrada.ffinalizacion}
        `);
    });
  }
}
