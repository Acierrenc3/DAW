/*
    Vamos a realizar una clase Llamada Raices, donde representaremos los valores
de una ecuacion de 2º grado.
1. Tendremos los 3 coeficientes como atributos, a, b y c
2.  Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podran hacer son las siguientes:
3. -obtenerRaices(): Imprime 2 posibles soluciones
4. -obtenerRaiz():Imprime una unica raiz, que sera cuando tenga 1 sola solucion posible
5. -getDiscrminante(): devuelve el valor discriminante(double), el discriminante tiene la siguiente fórmula: b^2-4ac (^ significa al cuadrado)
6. -tieneRaices(): Devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual a  0
7. -tieneRaiz(): Lo mismo pero 1 sola.
8. -calcular(): Mostrara por consola las posibles soluciones que tiene nuestra ecuacion, en caso de no existir solucion mostrarlo tambien.

Formula ecuacion 2do grado=   (-b(+-)(Math.sqrt(b,2)-(4*a*c)))/(2*a)
 */
package RaizCuadrada;

public class Raices {
     //---------1---------
    private double a,b,c;
    
    //---------2---------
//---------Constructor---------   
    public Raices(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //---------3---------
    private void getRaices(){
        
        double x1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        double x2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
        
        System.out.println("Solucion X1");
        System.out.println(x1);
        System.out.println("Solucion X2");
        System.out.println(x2);
    }
    
    //---------4---------
    private void getRaiz(){
        
        double x=(-b)/(2*a);
        
        System.out.println("Unica Solucion");
        System.out.println(x);
    }
    //---------5---------    
    private double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }
    
    //---------6---------
    private boolean tieneRaices(){    
        return getDiscriminante()>0;
    }
    
    //---------7---------
    private boolean tieneRaiz(){   
        return getDiscriminante()==0;
    }
    
    //---------8---------
    public void calcular(){
        
        if(tieneRaices()){
            getRaices();
            
        }else if(tieneRaiz()){
            getRaiz();
        }else{
            System.out.println("No tiene Raices");
        }
        
    }
}
