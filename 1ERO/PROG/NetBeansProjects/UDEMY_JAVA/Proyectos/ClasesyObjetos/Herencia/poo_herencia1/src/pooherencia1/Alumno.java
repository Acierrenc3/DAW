
package pooherencia1;


public class Alumno extends Persona {
        private String universidad;
        private double notaMatematicas;
        private double notaEstadistica;
        private double notaAlgoritmica;

    public Alumno() {
        System.out.println("Alumno: Inicializando constructor..");
    }
    
    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }
    
    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    
    public Alumno(String nombre,  String apellido, int edad, String universidad){
        super(nombre, apellido, edad);
        this.universidad = universidad;
    }

    public Alumno(String universidad, double notaMatematicas, double notaEstadistica, 
                  double notaAlgoritmica, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.universidad = universidad;
        this.notaMatematicas = notaMatematicas;
        this.notaEstadistica = notaEstadistica;
        this.notaAlgoritmica = notaAlgoritmica;
    }
    
    
        

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaEstadistica() {
        return notaEstadistica;
    }

    public void setNotaEstadistica(double notaEstadistica) {
        this.notaEstadistica = notaEstadistica;
    }

    public double getNotaAlgoritmica() {
        return notaAlgoritmica;
    }

    public void setNotaAlgoritmica(double notaAlgoritmia) {
        this.notaAlgoritmica = notaAlgoritmia;
    }
        
        
}
