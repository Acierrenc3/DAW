package exampro2ejercicio;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
 /*@author Brian*/
 
public class Cilindro extends ExamPRO2Ejercicio{
    double radio;
    double altura;
    double precio;

    public Cilindro(double radio, double altura, double precio) {
        this.radio = radio;
        this.altura = altura;
        this.precio = precio;
    }

    public double getVolumen() {
        return Math.PI * radio * radio * altura;
    }

    public double getPrecioPorCentilitro() {
        double volumenEnCentimetrosCubicos = getVolumen() * 1000;
        double precioPorCentilitro = precio / (volumenEnCentimetrosCubicos / 100);
        return precioPorCentilitro;
    }

    @Override
    public String toString() {
        return "Cilindro con radio " + radio + " y altura " + altura + " - Precio: " + precio + " EUR";
    }
}



