
package ConsultaMedica;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            return -1;
        } else if (imc >= 18.5 && imc <= 24.9) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", Peso: " + peso + "kg, Altura: " + altura + "m";
    }
}

    
    
    

