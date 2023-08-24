
package ejercicio;

import java.util.Objects;

public class Cliente implements Comparable {
 private String nombre;
 private String DNI;
 private int edad;
 private double saldo;

    public Cliente(String nombre, String DNI, int edad, double saldo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.saldo = saldo;
    }

    public Cliente() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }


    public double getSaldo() {
        return saldo;
    }
       

    @Override
    public String toString() {
         String mensaje = ("El cliente se llama: " + nombre +
                 ", Su DNI es : " + DNI + ", Y tiene " + edad 
                 + " años");
         return mensaje;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.DNI, other.DNI);
    }  

    @Override
    public int compareTo(Object t) {
        return DNI.compareTo(((Cliente) t).DNI);
    }

}
 

