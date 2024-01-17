// Esperamos a que la página esté completamente cargada, incluidas las imágenes
window.addEventListener("load", function () {
  // Variable para comprobar si se está pintando o no
  let painting = false;

  // Almacenamos la fila que contiene los colores
  const colorRow = document.getElementById("paleta").querySelector("tr");

  // Creamos un array para almacenar todos los colores
  const colors = Array.from(colorRow.children).map((colorCell) =>
    colorCell.className.replace(" seleccionado", "")
  );

  // Por defecto, cogemos el primer color
  let currentColor = colors[0];

  // Creación del tablero de dibujo
  const drawingTable = document.createElement("div");
  drawingTable.id = "miTabla";
  drawingTable.style.display = "grid";
  drawingTable.style.gridTemplateColumns = `repeat(30, 10px)`;
  drawingTable.style.gridTemplateRows = `repeat(30, 10px)`;

  for (let i = 0; i < 30; i++) {
    for (let j = 0; j < 30; j++) {
      const cell = document.createElement("div");
      const cellId = `box_${i + 1}_${j + 1}`;
      cell.id = cellId;
      cell.style.width = "10px";
      cell.style.height = "10px";
      cell.style.border = "1px solid grey";
      cell.style.margin = "0";
      cell.addEventListener("mouseover", pintar);
      drawingTable.appendChild(cell);
    }
  }

  // Añadimos la tabla de dibujo al elemento con id "zonadibujo"
  const zoneDibujo = document.getElementById("zonadibujo");
  zoneDibujo.innerHTML = ""; // Limpiamos el contenido actual
  zoneDibujo.appendChild(drawingTable);

  // Mostramos un mensaje explicativo
  document.querySelector("p:nth-of-type(2)").textContent =
    "Haga CLICK en cualquier celda para activar/desactivar el Pincel";

  // Evento al hacer clic en la zona de dibujo
  drawingTable.addEventListener("mousedown", togglePainting);

  // Asignamos el evento de clic a cada color en la paleta
  colorRow.addEventListener("mousedown", changeColor);

  // Seleccionamos el primer color por defecto
  colorRow.children[0].classList.add("seleccionado");

  // Función para cambiar el color actual al hacer clic en un color de la paleta
  function changeColor(event) {
    const clickedColor = event.target.className.replace(" seleccionado", "");
    if (colors.includes(clickedColor)) {
      currentColor = clickedColor;
      for (const colorCell of colorRow.children) {
        colorCell.classList.remove("seleccionado");
      }
      event.target.classList.add("seleccionado");
    }
  }

  // Función para activar/desactivar el pincel
  function togglePainting() {
    painting = !painting;
    const pincelStatus = document.getElementById("pincel");
    pincelStatus.textContent = painting
      ? "PINCEL ACTIVADO"
      : "PINCEL DESACTIVADO";

    const action = painting ? addPaintEvent : removePaintEvent;

    for (let i = 1; i <= 30; i++) {
      for (let j = 1; j <= 30; j++) {
        const cell = document.getElementById(`box_${i}_${j}`);
        action(cell);
      }
    }
  }

  // Función para añadir evento de pintura a una celda
  function addPaintEvent(cell) {
    cell.addEventListener("mouseover", pintar);
  }

  // Función para quitar evento de pintura a una celda
  function removePaintEvent(cell) {
    cell.removeEventListener("mouseover", pintar);
  }

  // Función para pintar una celda con el color actual
  function pintar() {
    this.className = currentColor;
  }
});
