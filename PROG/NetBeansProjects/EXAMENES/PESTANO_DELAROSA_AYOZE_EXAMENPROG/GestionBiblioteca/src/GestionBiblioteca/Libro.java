
package GestionBiblioteca;


public class Libro {
    
    private String identificador;
    private String nombre;
    private String autor;
    private String genero;
    private double precio;
    private boolean disponible; //Variable para saber si el Libro está disponible o no.

    
    
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public Libro(String identificador, String nombre, String autor, String genero, double precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
