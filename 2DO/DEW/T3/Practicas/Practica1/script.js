document.addEventListener("DOMContentLoaded", function () {
  const formulario = document.getElementById("formulario");
  const resultado = document.getElementById("resultado");

  formulario.addEventListener("submit", function (evento) {
    evento.preventDefault();

    const nombre = document.getElementById("nombre").value;
    const email = document.getElementById("email").value;
    const calle = document.getElementById("direccion").value;
    const cpostal = document.getElementById("cpostal").value;
    const localidad = document.getElementById("localidad").value;
    const municipio = document.getElementById("municipio").value;
    const telefono = document.getElementById("telefono").value;

    function nuevaVentana() {
      if (
        !nombre ||
        !email ||
        !calle ||
        !cpostal ||
        !localidad ||
        !municipio ||
        !telefono
      ) {
        resultado.innerHTML = "Por favor, ha de completar todos los campos";
      } else {
        resultado.innerHTML = `
      ¡Hola! ${nombre} estos son tus datos: <br/>
        Nombre: ${nombre}<br/>
        Email: ${email}<br/>
        Calle: ${calle}<br/>
        Cpostal: ${cpostal}<br/>
        Localidad: ${localidad}<br/>
        Municipio: ${municipio}<br/>
        Telefono: ${telefono}`;

        const nuevaVentana = window.open(
          "",
          "Resultado del formulario",
          "width=400,height=400"
        );

        nuevaVentana.document.open();
        nuevaVentana.document.write(resultado.innerHTML);
        nuevaVentana.document.close();
      }
    }

    nuevaVentana();
  });
});
