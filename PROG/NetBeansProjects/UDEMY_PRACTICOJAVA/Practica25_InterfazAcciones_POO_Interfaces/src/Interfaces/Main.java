
package Interfaces;

public class Main {
    public static void main(String[] args) {
      
    Canario c1 = new Canario();
    Gallo g1 = new Gallo();
    Persona p1 = new Persona();
    
    p1.cantar();
    p1.andar();
    g1.cantar();
    g1.andar();
    c1.cantar();
    c1.andar();
    }
}
