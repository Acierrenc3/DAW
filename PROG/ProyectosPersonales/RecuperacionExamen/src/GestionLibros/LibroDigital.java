
package GestionLibros;

public class LibroDigital extends Libro {
    private double tamanioMb;
    
    public LibroDigital(String id, String titulo, String autor, double tamanioMb) {
        super(id, titulo, autor);
        this.tamanioMb = tamanioMb;
    }

    public double getTamanioMb() {
        return tamanioMb;
    }

    public void setTamanioMb(double tamanioMb) {
        this.tamanioMb = tamanioMb;
    }

    @Override
    public String toString() {
        return super.toString() +  "LibroDigital{" + "tamanioMb=" + tamanioMb + '}';
    }
    
    
    
}
