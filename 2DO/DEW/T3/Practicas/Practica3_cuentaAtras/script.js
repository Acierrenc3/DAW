let intervalId;

function comenzarCuentaAtras() {
  const fechaInput = document.getElementById("fecha").value;
  const horaInput = document.getElementById("hora").value;

  if (fechaInput && horaInput) {
    const fechaHoraSeleccionada = new Date(fechaInput + "T" + horaInput);
    const ahora = new Date();

    if (fechaHoraSeleccionada > ahora) {
      clearInterval(intervalId); // Limpiar el intervalo anterior si este existe
      const tiempoRestante = fechaHoraSeleccionada - ahora;
      actualizarCuentaAtras(tiempoRestante);
      intervalId = setInterval(function () {
        const tiempoRestanteActualizado = fechaHoraSeleccionada - new Date();
        if (tiempoRestanteActualizado <= 0) {
          clearInterval(intervalId);
          document.getElementById("countdown").textContent =
            "¡Tiempo finalizado!";
        } else {
          actualizarCuentaAtras(tiempoRestanteActualizado);
        }
      }, 1000);
    } else {
      alert("Selecciona una fecha y hora en el futuro.");
    }
  } else {
    alert("Por favor, completa ambos campos de fecha y hora.");
  }
}

function actualizarCuentaAtras(tiempoRestante) {
  const dias = Math.floor(tiempoRestante / (1000 * 60 * 60 * 24));
  const horas = Math.floor(
    (tiempoRestante % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60)
  );
  const minutos = Math.floor((tiempoRestante % (1000 * 60 * 60)) / (1000 * 60));
  const segundos = Math.floor((tiempoRestante % (1000 * 60)) / 1000);
  const cuentaAtras = `${dias}d ${horas}h ${minutos}m ${segundos}s`;
  document.getElementById("countdown").textContent = cuentaAtras;
}
