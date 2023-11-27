//Cuando todos los elementos del formulario estén cargados se llamará a la función iniciar

window.onload = iniciar;

function iniciar() {
  // Función para obtener el valor de una cookie
  function getCookie(nombre) {
    const valor = `; ${document.cookie}`;
    const partes = valor.split(`; ${nombre}=`);
    if (partes.length === 2) return partes.pop().split(";").shift();
  }

  // Función para establecer el valor de una cookie
  function setCookie(nombre, valor) {
    document.cookie = `${nombre}=${valor}; path=/`;
  }

  // Función para convertir a mayúsculas los campos NOMBRE y APELLIDOS al perder el foco
  function convertirMayusculas(elemento) {
    elemento.value = elemento.value.toUpperCase();
  }

  // Función para validar los campos NOMBRE y APELLIDOS
  function validarNombreYApellidos() {
    const nombre = document.getElementById("nombre");
    const apellidos = document.getElementById("apellidos");
    const erroresContainer = document.getElementById("errores");

    //Usamos el .trim para limpiar los Espacios al principio y final de los campos:
    if (nombre.value.trim() === "" || apellidos.value.trim() === "") {
      erroresContainer.innerHTML =
        "Nombre y apellidos son campos obligatorios.";
      if (nombre.value.trim() === "") {
        nombre.classList.add("error");
        nombre.focus();
      } else {
        nombre.classList.remove("error");
      }

      if (apellidos.value.trim() === "") {
        apellidos.classList.add("error");
        apellidos.focus();
      } else {
        apellidos.classList.remove("error");
      }

      return false;
    }

    // Limpiar errores y estilos si no hay problemas
    erroresContainer.innerHTML = "";
    nombre.classList.remove("error");
    apellidos.classList.remove("error");

    return true;
  }

  // Función para validar la EDAD
  function validarEdad() {
    const edad = document.getElementById("edad");
    const erroresContainer = document.getElementById("errores");

    if (isNaN(edad.value) || edad.value < 0 || edad.value > 105) {
      erroresContainer.innerHTML = "La edad debe ser un número entre 0 y 105.";
      edad.classList.add("error");
      edad.focus();
      return false;
    }

    // Limpiar errores y estilos si no hay problemas
    erroresContainer.innerHTML = "";
    edad.classList.remove("error");

    return true;
  }

  // Función para validar el NIF con expresión regular
  function validarNIF() {
    const nif = document.getElementById("nif");
    const erroresContainer = document.getElementById("errores");

    // Expresión regular para el NIF
    const expresion = /^\d{8}-[a-zA-Z]$/;

    if (!expresion.test(nif.value)) {
      erroresContainer.innerHTML = "El NIF no es válido.";
      nif.classList.add("error");
      nif.focus();
      return false;
    }

    // Limpiar errores y estilos si no hay problemas
    erroresContainer.innerHTML = "";
    nif.classList.remove("error");

    return true;
  }

  // Función para validar el E-MAIL con expresión regular
  function validarEmail() {
    const email = document.getElementById("email");
    const erroresContainer = document.getElementById("errores");

    // Expresión regular para el E-MAIL
    const expresion = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!expresion.test(email.value)) {
      erroresContainer.innerHTML = "El E-mail no es válido.";
      email.classList.add("error");
      email.focus();
      return false;
    }

    // Limpiar errores y estilos si no hay problemas
    erroresContainer.innerHTML = "";
    email.classList.remove("error");

    return true;
  }

  // Función para validar la selección de PROVINCIA
  function validarProvincia() {
    const provincia = document.getElementById("provincia");
    const erroresContainer = document.getElementById("errores");

    if (provincia.value === "0") {
      erroresContainer.innerHTML = "Seleccione una provincia.";
      provincia.classList.add("error");
      provincia.focus();
      return false;
    }

    // Limpiar errores y estilos si no hay problemas
    erroresContainer.innerHTML = "";
    provincia.classList.remove("error");

    return true;
  }

  // Función para validar la FECHA con expresión regular
  function validarFecha() {
    const fecha = document.getElementById("fecha");
    const erroresContainer = document.getElementById("errores");

    // Expresión regular para la FECHA
    const expresion =
      /^(0[1-9]|1[0-9]|2[0-9]|3[0-1])[-/](0[1-9]|1[0-2])[-/]\d{4}$/;

    if (!expresion.test(fecha.value)) {
      erroresContainer.innerHTML =
        "La fecha no es válida. Utilice el formato dd/mm/aaaa o dd-mm-aaaa.";
      fecha.classList.add("error");
      fecha.focus();
      return false;
    }

    // Limpiar errores y estilos si no hay problemas
    erroresContainer.innerHTML = "";
    fecha.classList.remove("error");

    return true;
  }

  // Función para validar el TELEFONO con expresión regular
  function validarTelefono() {
    const telefono = document.getElementById("telefono");
    const erroresContainer = document.getElementById("errores");

    // Expresión regular para el TELEFONO
    const expresion = /^\d{9}$/;

    if (!expresion.test(telefono.value)) {
      erroresContainer.innerHTML =
        "El teléfono no es válido. Debe contener 9 dígitos.";
      telefono.classList.add("error");
      telefono.focus();
      return false;
    }

    // Limpiar errores y estilos si no hay problemas
    erroresContainer.innerHTML = "";
    telefono.classList.remove("error");

    return true;
  }

  // Función para validar la HORA con expresión regular
  function validarHora() {
    const hora = document.getElementById("hora");
    const erroresContainer = document.getElementById("errores");

    // Expresión regular para la HORA
    const expresion = /^([01]\d|2[0-3]):([0-5]\d)$/;

    if (!expresion.test(hora.value)) {
      erroresContainer.innerHTML =
        "La hora no es válida. Utilice el formato hh:mm.";
      hora.classList.add("error");
      hora.focus();
      return false;
    }

    // Limpiar errores y estilos si no hay problemas
    erroresContainer.innerHTML = "";
    hora.classList.remove("error");

    return true;
  }

  // Función para manejar la confirmación de envío del formulario
  function confirmarEnvio() {
    const confirmacion = confirm("¿Está seguro de enviar el formulario?");
    if (confirmacion) {
      // Incrementar el contador de intentos en la cookie
      const intentos = parseInt(getCookie("intentos")) || 0;
      setCookie("intentos", intentos + 1);

      // Actualizar el contenido del contenedor "intentos"
      document.getElementById(
        "intentos"
      ).innerHTML = `Intento de Envíos del formulario: ${intentos + 1}`;

      // Envío del formulario
      document.getElementById("formulario").submit();
    }
  }

  // Asociar funciones a eventos
  document.getElementById("nombre").addEventListener("blur", function () {
    convertirMayusculas(this);
  });

  document.getElementById("apellidos").addEventListener("blur", function () {
    convertirMayusculas(this);
  });

  document
    .getElementById("formulario")
    .addEventListener("submit", function (event) {
      // Validar campos antes del envío
      if (
        !validarNombreYApellidos() ||
        !validarEdad() ||
        !validarNIF() ||
        !validarEmail() ||
        !validarProvincia() ||
        !validarFecha() ||
        !validarTelefono() ||
        !validarHora()
      ) {
        event.preventDefault(); // Cancelar el envío si hay errores
      } else {
        confirmarEnvio(); // Pedir confirmación antes de enviar
      }
    });
}
