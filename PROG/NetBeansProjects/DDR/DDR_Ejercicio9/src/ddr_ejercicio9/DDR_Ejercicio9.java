/*
 * Contar cuantas vocales tiene una frase pasada por consola por el usuario.
 */
package ddr_ejercicio9;

import javax.swing.JOptionPane;


public class DDR_Ejercicio9 {
    public static void main(String[] args) {
      
       String texto=JOptionPane.showInputDialog(null, "Escribe una cadena" 
               + " Insercion", JOptionPane.INFORMATION_MESSAGE); 
         texto = texto.toLowerCase();
         
            char vocales[] = {'a', 'e','i', 'o', 'u'};
            
            char caracterActual;
            int contadorVocales=0;
            boolean esVocal;
            
            for (int i=0; i<texto.length(); i++){
                
                caracterActual=texto.charAt(i);
                 esVocal=false;
                 
                for(int j=0; j<vocales.length && !esVocal ;j++){
                    
                    if(vocales[j]==caracterActual){
                        contadorVocales++;
                        esVocal=true;
                    }
                }
                 
            }
            
            JOptionPane.showMessageDialog(null, "La frase tiene "+contadorVocales+" vocales", " Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
