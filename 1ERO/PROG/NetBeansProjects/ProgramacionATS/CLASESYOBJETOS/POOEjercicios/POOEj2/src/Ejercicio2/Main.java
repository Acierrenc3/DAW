
package Ejercicio2;
import java.util.Scanner;

public class Main {
      public static void main(String []args){
        Scanner lector = new Scanner(System.in);
        Movimiento coord;
        int x,y;
        char tecla;
        System.out.println("Digita las coordenadas de inicio\nDigita X: ");
        x=lector.nextInt();
        System.out.println("Digita Y: ");
        y=lector.nextInt();
        coord=new Movimiento(x,y);
        do{
            System.out.println("ARRIBA = W\nABAJO = S\nDERECHA = D\nIZQUIERDA = A\nPOSICION ACTUAL = V\nSALIR = X\n\nDigita hacia donde quieres moverte: ");
            tecla=lector.next().charAt(0);
            switch(tecla){
                case 'W':
                case 'w':
                    coord.arriba();
                    System.out.println("ARRIBA");
                    System.out.println("x= "+coord.getX()+" y= "+coord.getY()+"\n");
                break;
                
                case 'S':
                case 's':
                    coord.abajo();
                    System.out.println("ABAJO");
                    System.out.println("x= "+coord.getX()+" y= "+coord.getY()+"\n");
                break;
                
                case 'A':
                case 'a':
                    coord.derecha();
                    System.out.println("IZQUIERDA");
                    System.out.println("x= "+coord.getX()+" y= "+coord.getY()+"\n");
                break;
                
                case 'D':
                case 'd':
                    coord.izquierda();
                    System.out.println("DERECHA");
                    System.out.println("x= "+coord.getX()+" y= "+coord.getY()+"\n");
                break;
                
                case 'V':
                case 'v':
                    System.out.println("POSICION ACTUAL");
                    System.out.println("x= "+coord.getX()+" y= "+coord.getY()+"\n");
                break;
                
                default:
                    System.out.println("Error: Accion no valida.\n\n");
            }
        }while(tecla!='x');
    } 
}
