
package ClasesYObjetos;

import static javax.management.Query.in;



public class Operacion {
       
    //Métodos

    //Métodos para sumar, restar, multiplicar y dividir ambos numeros
    public int sumar(int numero1, int numero2){
       int suma = numero1 + numero2;
       return suma;
    }
    public int restar(int numero1, int numero2){
      int  resta = numero1 - numero2;
      return resta;
        }
    public int multiplicar(int numero1, int numero2){
      int  multiplicacion = numero1 * numero2;
      return multiplicacion;
    }
    
    public int dividir(int numero1, int numero2){
      int division = numero1 / numero2;
      return division;
    }
    
    public int resto(int numero1, int numero2){
      int resto = numero1 % numero2;
      return resto;
    }
    
    //Metodo para mostrar los resultados de las operaciones
    public void mostrarResultados(int suma, int resta, int multiplicacion, int division, int resto){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es:: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El resto es: "+resto);
    }
}
