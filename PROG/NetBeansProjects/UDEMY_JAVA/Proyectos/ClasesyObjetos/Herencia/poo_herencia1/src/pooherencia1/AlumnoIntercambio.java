
package pooherencia1;


public class AlumnoIntercambio extends Alumno {
    private String nacionalidad;
    private double notaIdiomas;

    public AlumnoIntercambio() {
        System.out.println("Alumno Intercambio:  Inicializando constructor..");
    }

    public AlumnoIntercambio(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoIntercambio(String nacionalidad, String nombre, String apellido) {
        super(nombre, apellido);
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
    
    
}
