
package ConsultaMedica;

public class Paciente extends Persona {
    private String fechaPrimeraConsulta;
    private String medicoAsignado;

    public Paciente(String nombre, int edad, String sexo, double peso, double altura, String fechaPrimeraConsulta, String medicoAsignado) {
        super(nombre, edad, sexo, peso, altura);
        this.fechaPrimeraConsulta = fechaPrimeraConsulta;
        this.medicoAsignado = medicoAsignado;
    }

    public String getFechaPrimeraConsulta() {
        return fechaPrimeraConsulta;
    }

    public String getMedicoAsignado() {
        return medicoAsignado;
    }
}