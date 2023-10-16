//Actividad 5. Observa el siguiente código:

var arr = [1, 2, 3, 4];
for (i of arr) {
    console.log(i);
}

for (i in arr) {
    console.log(i);
}

//a) ¿Muestran la misma información el primer y el segundo bucle? ---> No, el primero empieza a contar desde 1 y el segundo desde 0.
//b) ¿Cuál es la diferencia entre los mismos? ---> Explicado en la pregunta 1
//c) ¿Qué muestra el siguiente código: "arr.forEach(function(i){console.log(i)});"? //Muestra el contenido del array.

arr.forEach(function(i){console.log(i)}); 