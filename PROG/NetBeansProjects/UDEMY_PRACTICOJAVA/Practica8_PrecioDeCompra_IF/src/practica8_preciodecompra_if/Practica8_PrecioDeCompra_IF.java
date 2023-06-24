
package practica8_preciodecompra_if;

import java.util.Scanner;

/*
Escribir un programa que pregunte por el precio de un producto y el numero de unidades que se desea
comprar. A partir de esos datos, es necesario calcular el precio final, sabiendo que se aplica un descuento segun los siguientes condicionantes:
-Si el coste de la compra es menor de 100, el cliente no tiene derecho a descuento
-Si el coste de la compra sobrepasa los 200, se le aplicará un 15% de descuento
-En cualquier otro caso, el descuento será del 10%
*/

public class Practica8_PrecioDeCompra_IF {

    public static void main(String[] args) {
        double compra;
        double descuento;
        int unidades;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto que desea comprar: ");
        compra = entrada.nextDouble();
        System.out.println("Introduzca las unidades de dicho producto que desea: ");
        unidades = entrada.nextInt();
        
        double precioCompra = compra*unidades;
        
        if (precioCompra < 100) {
            System.out.println("No tiene descuento");
            descuento = 0;
        }else if( precioCompra > 200){
            System.out.println("Descuento del 15%");
            descuento = (15*precioCompra)/100;
            
        }else{
            System.out.println("Descuento del 10%");
            descuento = (10*precioCompra)/100;
            
        }
        double precioFinal = precioCompra - descuento;
        System.out.println("Precio Final: " + precioFinal);
        
    }
    
}
