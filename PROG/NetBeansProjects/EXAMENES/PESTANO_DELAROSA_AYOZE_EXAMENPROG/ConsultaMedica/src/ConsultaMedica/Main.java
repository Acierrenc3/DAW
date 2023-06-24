package ConsultaMedica;
public class Main {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Paco", 30, "hombre", 130, 1.80, "10/03/2022", "Dra. Rodriguez");
        Medico medico1 = new Medico("Dra. Rodriguez", 40, "hombre", 80, 1.55, 100.0, "Cardiología");

        System.out.println(paciente1.getInfo());
        System.out.println("Fecha primera consulta: " + paciente1.getFechaPrimeraConsulta());
        System.out.println("Médico asignado: " + paciente1.getMedicoAsignado());
        System.out.println("IMC: " + paciente1.calcularIMC());
        if (paciente1.calcularIMC() == -1) {
            System.out.println("El paciente está por debajo de su peso ideal");
        } else if (paciente1.calcularIMC() == 0) {
            System.out.println("El paciente se encuentra en su peso ideal");
        } else {
            System.out.println("El paciente tiene sobrepeso");
        }
        System.out.println("Es mayor de edad: " + paciente1.esMayorDeEdad());

        System.out.println(medico1.getInfo());
        System.out.println("Precio consulta: " + medico1.getPrecioConsulta());
        System.out.println("Especialidad: " + medico1.getEspecialidad());
        System.out.println("IMC: " + medico1.calcularIMC());
        if (medico1.calcularIMC() == -1) {
            System.out.println("El médico está por debajo de su peso ideal");
        } else if (medico1.calcularIMC() == 0) {
            System.out.println("El médico se encuentra en su peso ideal");
        } else {
            System.out.println("El médico tiene sobrepeso");
        }
        System.out.println("Es mayor de edad: " + medico1.esMayorDeEdad());
    }
}
