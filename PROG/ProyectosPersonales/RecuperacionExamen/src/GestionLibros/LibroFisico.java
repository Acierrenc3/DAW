
package GestionLibros;

public class LibroFisico extends Libro {
    private int numPaginas;
    
    public LibroFisico(String id, String titulo, String autor, int numPaginas) {
        super(id, titulo, autor);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + "LibroFisico{" + "numPaginas=" + numPaginas + '}';
    }
    
    
    
}
