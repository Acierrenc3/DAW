document.addEventListener("DOMContentLoaded", function () {
  let xhr = new XMLHttpRequest();

  xhr.open("GET", "datos.json", true);
  xhr.onreadystatechange = function () {
    if (xhr.readyState == 4 && xhr.status == 200) {
      // Utiliza JSON.parse() para convertir la cadena JSON en un objeto:
      let resultados = JSON.parse(xhr.responseText);

      texto =
        "<table border=1><tr><th>Nombre Centro</th><th>Localidad</th><th>Provincia</th><th>Telefono</th><th>Fecha Visita</th><th>Numero Visitantes</th></tr>";

      // Hacemos un bucle para recorrer todos los objetos literales recibidos en el array resultados y mostrar su contenido:
      for (var i = 0; i < resultados.length; i++) {
        let objeto = resultados[i];
        texto +=
          "<tr><td>" +
          objeto.nombrecentro +
          "</td><td>" +
          objeto.localidad +
          "</td><td>" +
          objeto.provincia +
          "</td><td>" +
          objeto.telefono +
          "</td><td>" +
          objeto.fechavisita +
          "</td><td>" +
          objeto.numvisitantes +
          "</td></tr>";
      }
      document.getElementById("resultados").innerHTML = texto;
    }
  };
  xhr.send();
});
