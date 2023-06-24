
package Logica;

public class Main {
    public static void main(String[] args) {
        // Abstracta a1 = new Abstracta(); Punto 7, no se puede crear el objeto ya que Abstracta es 1 clase Abstracta xd
        
        ComplejoDeportivo cd1 = new ComplejoDeportivo(); //Punto 8, se crea el objeto.. y punto 10
        
        cd1.abrirGimnasio();
        
        cd1.cuidarAlumbrado();
        
        cd1.filtradoAgua();
        
        cd1.limpiarPiscina();
        
        cd1.cerrarGimnasio();
    }
}
