package Clase;

public abstract class Persona {

    private int edad;
    private final int CHICO = 0;
    private final int CHICA = 0;
    private String nombre;
    private String sexo;
    private boolean asistencia;

    private final String[] NOMBRES_CHICOS = {"Pepe", "Fernando", "Alberto", "Nacho", "Eustaquio"}; //Creamos un Array para los nombres de los Alumnos que sea constante
    private final String[] NOMBRES_CHICAS = {"Pilar", "Guayarmina", "Fernanda", "Pepa", "Eustaquia"};

    /*
    public Persona(int edad, String nombre, String sexo) { //Constructor con Parámetros
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
    }
*/

    public Persona() { 

        int determinar_sexo = MetodosSueltos.generaNumeroAleatorio(0, 1); //Llamamos al método generaNumeroAleatorio

        if (determinar_sexo == 0) { //Declaramos que si sale un 0 sea chico, y si sale un 1 sale es una chica.
            nombre = NOMBRES_CHICOS[MetodosSueltos.generaNumeroAleatorio(0, 4)]; //El maximo es 4 porque hay 5 nombres y se empieza a contar desde el 0
            sexo="Hombre";
            
        } else {
            
            nombre = NOMBRES_CHICAS[MetodosSueltos.generaNumeroAleatorio(0, 4)];
            sexo="Mujer";
        }
       
    } 

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
    
    
    public abstract void disponibilidad();

}
