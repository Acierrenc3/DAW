//Actividad 4. ¿Qué valor se obtendrá al ejecutar estas expresiones?

console.log(16 << 2) //64
console.log(8 > 10 ? v1 = 'sí' : v1 = 'no') //no
//var n=7; alert('n vale ' + (n++)); La unica forma de que esto funcione es hacerlo con un console log ya que las alertas solo se visualizaran bien en un navegador.
var n=7; console.log('n vale: ' + (n++));
// var m=17; alert("m vale " + (m++)); alert(m); //La unica forma de que esto funcione es hacerlo con un console log
var m=17; console.log('m vale: ' + (m++));
var y=17; console.log(y%=5); //2