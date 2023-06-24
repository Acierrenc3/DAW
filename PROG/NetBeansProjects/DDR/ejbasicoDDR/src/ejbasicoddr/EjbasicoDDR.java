//Pedir al usuario que nos escriba de forma infinita hasta que insertemos una cadena vacia.
package ejbasicoddr;

import javax.swing.JOptionPane;

public class EjbasicoDDR {
    public static void main(String[] args) {
       
        String texto = JOptionPane.showInputDialog(null, "Introduce un texto",
                                                                         "Introducir Texto",
                                                                         JOptionPane.INFORMATION_MESSAGE);
        String cadenaResultante="";
        
        while (!texto.isEmpty()) {
            
        cadenaResultante+=texto;
            
        JOptionPane.showInputDialog(null, "Introduce un texto, cadena vacia para salir",
                                  "Introducir Texto",
                                  JOptionPane.INFORMATION_MESSAGE);
           
        JOptionPane.showMessageDialog(null, cadenaResultante, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
    
}
