
package ejercicio;

import java.util.Objects;

public class Cliente {
  private String DNI; 
  private String nombre;
  private int edad;
  private double saldo;

    public Cliente(String DNI, String nombre, int edad, double saldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSaldo() {
        return saldo;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI 
                + ", nombre=" + nombre 
                + ", edad=" + edad 
                + ", saldo=" + saldo + '}';
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
    
    
  
  
}
