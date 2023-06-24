/*
    Vamos a realizar una clase Llamada Raices, donde representaremos los valores
de una ecuacion de 2º grado.
Tendremos los 3 coeficientes como atributos, a, b y c
Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podran hacer son las siguientes:
-obtenerRaices(): Imprime 2 posibles soluciones
-obtenerRaiz():Imprime una unica raiz, que sera cuando tenga 1 sola solucion posible
-getDiscrminante(): devuelve el valor discriminante(double), el discriminante tiene la siguiente fórmula: b^2-4ac (^ significa al cuadrado)
-tieneRaices(): Devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual a  0
-tieneRaiz(): Lo mismo pero 1 sola.
calcular(): Mostrara por consola las posibles soluciones que tiene nuestra ecuacion, en caso de no existir solucion mostrarlo tambien.

Formula ecuacion 2do grado=   (-b(+-)(Math.sqrt(b,2)-(4*a*c)))/(2*a)
 */
package RaizCuadrada;

public class Main {
    public static void main(String[] args) {
       Raices r1 = new Raices(1, 9, 1);
       r1.calcular();
    }
}
