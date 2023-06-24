
package estructuracontrol_switch;

public class EstructuraControl_SWITCH {

    public static void main(String[] args) {
        int numero = -8;
        
        switch (numero) {
            case 1:{
                System.out.println("El numero es 1");
                break;
            }
            case 2:{
                System.out.println("El numero es 2");
                break;
            }
            case 3:{
                System.out.println("El numero es 3");
            }
                
                break;
            default:
                System.out.println("El numero no es ni 1, ni 2, ni 3");
        }

    }
    
}
