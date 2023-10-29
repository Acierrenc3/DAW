//Una de las funcionalidades interesantes en javascript es que los objetos de tipo String pueden ser interpretados. Para ello, basta con añadir la cadena de texto dentro del objeto eval():

let x = 10;
let y = 20;
let operacion = "x + y";
let resultado = eval(operacion); // Esto evaluará el valor de x + y y lo almacenará en resultado
console.log(resultado); // Muestra 30 en la consola

/*No obstante, algunas consideraciones que se deben tener en cuenta durante su uso son:
Riesgos de Seguridad: el uso imprudente de eval() puede exponer a tu aplicación a vulnerabilidades de seguridad, como ataques de inyección de código.
Pérdida de Rendimiento: la utilización de eval() puede afectar negativamente al rendimiento de tu aplicación, ya que el código evaluado no se puede optimizar previamente.
Legibilidad y Mantenibilidad: el código que utiliza eval() puede ser difícil de entender y mantener, ya que introduce la complejidad de ejecutar dinámicamente el código.
Existen alternativas más seguras: en la mayoría de los casos, es preferible evitar eval() y buscar alternativas más seguras,
como funciones de alto orden (por ejemplo, setTimeout() y setInterval()) o el uso de estructuras de datos apropiadas.
En resumen, eval() es una función muy útil y con múltiples aplicaciones. No obstante, se debe utilizar con precaución y sólo en situaciones donde sea realmente necesaria. 
En la mayoría de los casos, es preferible evitar su uso y buscar soluciones más seguras y legibles. */
