
calcularCircunferencia();

function calcularCircunferencia() {
    // Obtener el valor del radio introducido por el usuario
    const radio = parseFloat(document.getElementById("radioInput").value);

    if (isNaN(radio)) {
        alert("Por favor, introduce un valor numérico válido para el radio.");
        return;
    }

    // Cálculo del área y el perímetro
    const area = Math.PI * Math.pow(radio, 2);
    const perimetro = 2 * Math.PI * radio;

    // Mostrar resultados en la página utilizando .innerHTML y .toFixed()
    document.getElementById("area").innerHTML = area.toFixed(2);
    document.getElementById("perimetro").innerHTML = perimetro.toFixed(2);
}