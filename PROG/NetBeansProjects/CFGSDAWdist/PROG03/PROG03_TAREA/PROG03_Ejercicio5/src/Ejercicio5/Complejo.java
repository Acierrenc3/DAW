
package Ejercicio5;
import java.util.Scanner;
/**
 *
 * @author ayope
 */
//Ejercicio 5

public class Complejo { //Clase Complejo

    //Declaro las variables que serán tipo double tal y como podemos ver en los métodos constructores
    double real;
    double imag;

    //Constructor que inicializa sus atributos a 0
    public Complejo() {
        real = 0;
        imag = 0;
    }

    //Constructor que inicializa los atributos a los valores indicados por los parámetros.
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //Devuelve la parte real del objeto.
    public double consulta_Real() {
        return real;
    }

    //Devuelve la parte imaginaria del objeto.
    public double consulta_Imag() {
        return imag;
    }

    //Asigna a la parte real del objeto el valor indicado en el parámetro real
    public void cambia_Real(double real) {
        this.real = real;
    }

    //Asigna a la parte imaginaria del objeto el valor indicado en el parámetro imag.
    public void cambia_Imag(double imag) {
        this.imag = imag;
    }

    /*Convierte a String el número complejo, mediante la concatenación de sus atributos y devuelve 
     como resultado la cadena de texto 3 + 4i, si 3 es la parte real y 4 la parte imaginaria.*/
    @Override
    public String toString() { //Método predefinido por Java
        return String.format("%.0f + %.0fi", real, imag);
            
    }
        public void sumar(Complejo b) {
        double sumaReal;
        double sumaImag;
        sumaReal = b.real + this.real; //Uno es igual al valor de real del objeto pasado como parámetro + el valor de real en la clase(el introducido por teclado)
        sumaImag = b.imag + this.imag; //Dos es igual al valor de imaginario pasado como parámetro + el valor de real en la clase (el introducido por teclado)
        System.out.printf("La parte real (%.2f y %.2f) es igual a %.2f\n", this.real, b.real, sumaReal);
        System.out.printf("La parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag, b.imag, sumaImag);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Creamos el objeto numComple1 en el que los sumaImag atributos se inicializan a 0
        Complejo numComple1 = new Complejo();

        //Creamos el objeto numComple2 en el que los sumaImag atributos se inicializan a los párametros dados: 6 y 8.
        Complejo numComple2 = new Complejo(6,8);

        System.out.print("Introduzca el número la parte real del número: ");
        double realComple1 = teclado.nextDouble();
        numComple1.cambia_Real(realComple1);

        System.out.print("Introduzca la parte imaginario del número: ");
        double realComple2 = teclado.nextDouble();
        numComple1.cambia_Imag(realComple2); //

        System.out.println("\nLa parte real introducida es: " + numComple1.consulta_Real()); //Llamada al metodo para mostrar
        System.out.println("La parte imaginaria introducida es: " + numComple1.consulta_Imag());//Llamada al metodo para mostrar

        System.out.println("\nEl numero complejo introducido por teclado es: " + numComple1.toString());//Llamada al metodo toString
        System.out.println("El número complejo por parametros es: " + numComple2.toString()+"\n"); //Llamada al metodo toString

        numComple1.sumar(numComple2); //Llamada al metodo sumar
    
    }
}
