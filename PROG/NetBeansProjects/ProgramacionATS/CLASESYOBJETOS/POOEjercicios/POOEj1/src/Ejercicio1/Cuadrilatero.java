/*
Ejercicio1: Construir un programa que calcule el area y el perimetro de un Cuadrilatero dada la longitud de sus dos lados.
Los valores de la longitud deberan introducirse por linea de ordenes. Si es un cuadrado, solo se proporcionará la
longitud de uno de los lados al metodo constructor.
*/
package Ejercicio1;

public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;
    
    //Metodos
    //Metodo Constructor 1 (Cuadrilatero  sin ser Cuadrado)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Metodo Constructor 2 (Para los Cuadrados)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }
    
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
    
    
}
