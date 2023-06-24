
package ConsultaMedica;

public class Medico extends Persona {
    private double precioConsulta;
    private String especialidad;

    public Medico(String nombre, int edad, String sexo, double peso, double altura, double precioConsulta, String especialidad) {
        super(nombre, edad, sexo, peso, altura);
        this.precioConsulta = precioConsulta;
        this.especialidad = especialidad;
    }

    public double getPrecioConsulta() {
        return precioConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
