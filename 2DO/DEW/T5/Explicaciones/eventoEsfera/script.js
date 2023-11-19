class Sphere {
  constructor(x, y, radius, color) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = color;
  }

  draw(context) {
    context.beginPath();
    context.arc(this.x, this.y, this.radius, 0, 2 * Math.PI);
    context.fillStyle = this.color;
    context.fill();
    context.closePath();
  }

  move(direction) {
    switch (direction) {
      case "left": // Verificar que la esfera no se salga del borde izquierdo
        if (this.x - this.radius > 0) {
          this.x -= 5;
        }
        break;
      case "right": // Verificar que la esfera no se salga del borde derecho
        if (this.x + this.radius < canvas.width) {
          this.x += 5;
        }
        break;
      case "up": // Verificar que la esfera no se salga del borde superior
        if (this.y - this.radius > 0) {
          this.y -= 5;
        }
        break;
      case "down": // Verificar que la esfera no se salga del borde inferior
        if (this.y + this.radius < canvas.height) {
          this.y += 5;
        }
        break;
    }
  }

  move(direction) {
    switch (direction) {
      case "left": // Verificar que la esfera no se salga del borde izquierdo
        if (this.x - this.radius > 0) {
          this.x -= 5;
        }
        break;
      case "right": // Verificar que la esfera no se salga del borde derecho
        if (this.x + this.radius < canvas.width) {
          this.x += 5;
        }
        break;
      case "up": // Verificar que la esfera no se salga del borde superior
        if (this.y - this.radius > 0) {
          this.y -= 5;
        }
        break;
      case "down": // Verificar que la esfera no se salga del borde inferior
        if (this.y + this.radius < canvas.height) {
          this.y += 5;
        }
        break;
    }
  }
}

// Preparar canvas (ventana completa) y context
const canvas = document.getElementById("myCanvas");
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;
const context = canvas.getContext("2d");
// Instanciar una esfera
const sphere = new Sphere(50, 50, 30, "blue");
// Representar la esfera en su posición inicial
sphere.draw(context);

// Manejador de eventos
window.addEventListener("keydown", (event) => {
  switch (event.key) {
    case "ArrowLeft":
      sphere.move("left");
      break;
    case "ArrowRight":
      sphere.move("right");
      break;
    case "ArrowUp":
      sphere.move("up");
      break;
    case "ArrowDown":
      sphere.move("down");
      break;
  }
  // Limpiar el canvas y pintar la esfera en su nueva posición
  context.clearRect(0, 0, canvas.width, canvas.height);
  sphere.draw(context);
});
