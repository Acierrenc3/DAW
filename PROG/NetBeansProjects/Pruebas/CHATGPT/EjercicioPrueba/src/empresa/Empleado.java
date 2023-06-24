
package empresa;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private int horas = 40;

    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double getSalarioSemanal(){
        double salario;
        
        if (horasTrabajadas <= horas) {
            salario = horasTrabajadas * 10;
            
        }else{
            salario = horas * 10 + (horasTrabajadas - horas) * 15; 
        }
        return salario;
    }
    
}
