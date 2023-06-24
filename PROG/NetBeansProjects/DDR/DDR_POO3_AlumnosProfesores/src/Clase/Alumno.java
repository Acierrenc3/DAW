
package Clase;

public class Alumno extends Persona{
    
    private double calificacion;
    
    public Alumno() {
        super();
        
        calificacion = MetodosSueltos.generaNumeroAleatorio(0, 10);
        
        super.setEdad(MetodosSueltos.generaNumeroAleatorio(12, 15));
     
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", -- calificacion=" + calificacion + '}';
    }

    @Override
    public void disponibilidad() {
        
        int prob = MetodosSueltos.generaNumeroAleatorio(0, 100);
        if (prob < 30) {
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
        
    }
    
    

 
    
    
    
}
