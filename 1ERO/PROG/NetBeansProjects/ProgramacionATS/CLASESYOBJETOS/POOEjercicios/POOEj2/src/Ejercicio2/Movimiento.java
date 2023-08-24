/*
Ejercicio2: Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posicion
dentro del mismo. los movimientos posibles son ARRIBA, ABAJO DERECHA e IZQUIERDA. Tras cada movimiento el programa mostrara
la nueva direccion elegida y las coordenadas de situacion del objeto dentro del tablero.
*/
package Ejercicio2;


public class Movimiento {
     //Atributos
    private int x;
    private int y;
    
    //Metodos
    //Constructor
    public Movimiento(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    //Movimiento
    public void arriba(){
        if(y != 0){
            y -= 1;
        }
    }
    
    public void abajo(){
        if(y != 10){
            y += 1;
        }
    }
    
    public void derecha(){
        if(x != 10){
            x += 1;
        }
    }
    
    public void izquierda(){
        if(x != 0){
            x -= 1;
        }
    }
    
    //Getters
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}   

