
package PROG05_Ejerc1;

import java.time.LocalDate;
import java.time.Period;


public class Vehiculo {
    private String marca;
    private String matricula;
    private int numKilometros;
    private LocalDate fechaMatricula;
    private String descripcion;
    private double precio;
    private String nombreDueño;
    private String dniDueño;

    public Vehiculo(String marca, String matricula, int numKilometros, LocalDate fechaMatricula, String descripcion, double precio, String nombreDueño, String dniDueño) {
        this.marca = marca;
        this.matricula = matricula;
        this.numKilometros = numKilometros;
        this.fechaMatricula = fechaMatricula;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombreDueño = nombreDueño;
        this.dniDueño = dniDueño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumKilometros() {
        return numKilometros;
    }

    public void setNumKilometros(int numKilometros) {
        this.numKilometros = numKilometros;
    }

    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getDniDueño() {
        return dniDueño;
    }

    public void setDniDueño(String dniDueño) {
        this.dniDueño = dniDueño;
    }

    public int get_Tiempo(){
        
        LocalDate f1 = this.fechaMatricula;
        LocalDate f2 = LocalDate.now();
        
        Period p = Period.between(f1,f2);
        
        return p.getYears();
    }

    @Override
    public String toString() {
        return "VEHICULO{" + "marca=" + marca + ", matricula=" + matricula +
                ", numKilometros=" + numKilometros + ", fechaMatricula=" + fechaMatricula + ", descripcion="
                + descripcion + ", precio=" + precio + ", nombreDue\u00f1o=" + nombreDueño + ", dniDue\u00f1o="
                + dniDueño + '}';
    }
    
    
    
    
    
    
     
    
}