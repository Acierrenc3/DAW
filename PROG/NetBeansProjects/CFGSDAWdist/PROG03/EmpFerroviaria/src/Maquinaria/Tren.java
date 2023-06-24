
package Maquinaria;
import Personal.Maquinista;

public class Tren {
    Locomotora locomotora;
    Vagon vagones[];
    Maquinista responsable;
    private int numVagones;
    
    public Tren (Locomotora locomotora, Maquinista responsable){
        this.locomotora = locomotora;
        this.responsable = responsable;
        
        vagones = new Vagon [5];
        numVagones = 0;
        
            if (numVagones < 5){
            System.out.println("El tren no admite más vagones");
}else{
    Vagon v = new Vagon (150000, 100000, "Hierro");
    vagones[numVagones] = v;
    numVagones++;
    
        }
    }
}
