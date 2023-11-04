const coche = JSON.parse(localStorage.getItem("coche")) || [];

function guardarCochesEnLocalStorage() {
  localStorage.setItem("coche", JSON.stringify(coche));
}

function agregarCoche(modelo, color, matricula, anio) {
  coche.push({ modelo, color, matricula, anio });
  guardarCochesEnLocalStorage();
}

function eliminarCoche(matricula) {
  const i = coche.findIndex((coche) => coche.matricula === matricula);

  if (i !== -1) {
    coche.splice(i, 1);
    guardarCochesEnLocalStorage();
    console.log(`Coche con matricula ${matricula}, eliminado.`);
  } else {
    console.log(`Coche con matricula ${matricula} no encontrado.`);
  }
}

function mostrarCoches() {
  const cochesList = document.getElementById("coches-list");
  cochesList.innerHTML = ""; // Limpiar la lista antes de mostrarla nuevamente

  coche.forEach((coche) => {
    const cocheCard = document.createElement("div");
    cocheCard.classList.add("coche-card");
    cocheCard.innerHTML = `
      <p>Modelo: ${coche.modelo}</p>
      <p>Color: ${coche.color}</p>
      <p>Matrícula: ${coche.matricula}</p>
      <p>Año: ${coche.anio}</p>
    `;
    cochesList.appendChild(cocheCard);
  });
}

document.addEventListener("DOMContentLoaded", function () {
  const agregarBtn = document.getElementById("agregar-btn");
  const eliminarCocheForm = document.getElementById("eliminar-coche-form");
  const eliminarBtn = document.getElementById("eliminar-btn");
  const mostrarCochesBtn = document.getElementById("mostrar-coches-btn");

  agregarBtn.addEventListener("click", () => {
    const modelo = document.getElementById("modelo").value;
    const color = document.getElementById("color").value;
    const matricula = document.getElementById("matricula").value;
    const anio = parseInt(document.getElementById("anio").value);

    agregarCoche(modelo, color, matricula, anio);
    mostrarCoches();
  });

  eliminarBtn.addEventListener("click", () => {
    const matricula = document.getElementById("eliminar-matricula").value;
    eliminarCoche(matricula);
    mostrarCoches();
  });

  mostrarCochesBtn.addEventListener("click", () => {
    // Abre una nueva ventana con la lista de coches
    const cochesWindow = window.open("", "Coches", "width=600,height=400");
    const cochesListInNewWindow = cochesWindow.document.createElement("div");
    cochesListInNewWindow.innerHTML = "<h2>Lista de Coches</h2>";

    coche.forEach((coche) => {
      const cocheInfo = cochesWindow.document.createElement("p");
      cocheInfo.innerHTML = `
        Modelo: ${coche.modelo}<br>
        Color: ${coche.color}<br>
        Matrícula: ${coche.matricula}<br>
        Año: ${coche.anio}<br><br>
      `;
      cochesListInNewWindow.appendChild(cocheInfo);
    });

    cochesWindow.document.body.appendChild(cochesListInNewWindow);
  });

  mostrarCoches();
});
