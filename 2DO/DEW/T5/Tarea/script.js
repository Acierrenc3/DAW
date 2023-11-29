document.addEventListener("DOMContentLoaded", function () {
  document
    .getElementById("formulario")
    .addEventListener("submit", function (event) {
      event.preventDefault();
      validarFormulario();
    });

  document.getElementById("nombre").addEventListener("blur", function () {
    this.value = this.value.toUpperCase();
  });

  document.getElementById("apellidos").addEventListener("blur", function () {
    this.value = this.value.toUpperCase();
  });

  function validarFormulario() {
    // Lógica de validación aquí
    var nombre = document.getElementById("nombre").value;
    var apellidos = document.getElementById("apellidos").value;
    var edad = document.getElementById("edad").value;
    var nif = document.getElementById("nif").value;
    var email = document.getElementById("email").value;
    var provincia = document.getElementById("provincia").value;
    var fecha = document.getElementById("fecha").value;
    var telefono = document.getElementById("telefono").value;
    var hora = document.getElementById("hora").value;

    // Validar nombre y apellidos
    if (!nombre || !apellidos) {
      document.getElementById("errores").innerHTML =
        "Por favor, complete los campos de nombre y apellidos.";
      if (!nombre) {
        document.getElementById("nombre").focus();
      } else {
        document.getElementById("apellidos").focus();
      }
      return;
    }

    // Validar edad
    if (isNaN(edad) || edad < 0 || edad > 105) {
      document.getElementById("errores").innerHTML =
        "La edad debe ser un número entre 0 y 105.";
      document.getElementById("edad").focus();
      return;
    }

    // Validar NIF
    var nifRegex = /^\d{8}-[a-zA-Z]$/;
    if (!nifRegex.test(nif)) {
      document.getElementById("errores").innerHTML =
        "Formato de NIF inválido. Debe tener 8 números, un guión y una letra.";
      document.getElementById("nif").focus();
      return;
    }

    // Validar email
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
      document.getElementById("errores").innerHTML =
        "Formato de correo electrónico inválido.";
      document.getElementById("email").focus();
      return;
    }

    // Validar provincia
    if (provincia === "0") {
      document.getElementById("errores").innerHTML =
        "Por favor, seleccione una provincia.";
      document.getElementById("provincia").focus();
      return;
    }

    // Validar fecha
    var fechaRegex = /^(\d{2}\/\d{2}\/\d{4})|(\d{2}-\d{2}-\d{4})$/;
    if (!fechaRegex.test(fecha)) {
      document.getElementById("errores").innerHTML =
        "Formato de fecha inválido. Use dd/mm/aaaa o dd-mm-aaaa.";
      document.getElementById("fecha").focus();
      return;
    }

    // Validar teléfono
    var telefonoRegex = /^\d{9}$/;
    if (!telefonoRegex.test(telefono)) {
      document.getElementById("errores").innerHTML =
        "El número de teléfono debe tener 9 dígitos.";
      document.getElementById("telefono").focus();
      return;
    }

    // Validar hora
    var horaRegex = /^([01]\d|2[0-3]):[0-5]\d$/;
    if (!horaRegex.test(hora)) {
      document.getElementById("errores").innerHTML =
        "Formato de hora inválido. Use hh:mm.";
      document.getElementById("hora").focus();
      return;
    }

    // Confirmación de envío
    var confirmacion = confirm(
      "¿Está seguro de que desea enviar el formulario?"
    );
    if (confirmacion) {
      // Aquí realizarías el envío de datos (puedes agregar esa lógica aquí)
      alert("Formulario enviado correctamente");
    } else {
      alert("Envío de formulario cancelado");
    }
  }

  // Obtener y mostrar el número de intentos desde la cookie
  var intentosCookie = obtenerIntentosCookie();
  document.getElementById("intentos").innerHTML =
    "Intento de Envíos del formulario: " + intentosCookie;

  function obtenerIntentosCookie() {
    var intentosCookie = document.cookie.replace(
      /(?:(?:^|.*;\s*)intentos\s*=\s*([^;]*).*$)|^.*$/,
      "$1"
    );
    return parseInt(intentosCookie) || 0;
  }

  function guardarIntentosCookie(intentos) {
    document.cookie = "intentos=" + intentos;
  }
});
