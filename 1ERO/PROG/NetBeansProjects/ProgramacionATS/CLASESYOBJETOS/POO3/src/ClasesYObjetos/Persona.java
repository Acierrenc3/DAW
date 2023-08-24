
package ClasesYObjetos;


public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    
    //Métodos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+" Tengo "+edad+" anios y estoy corriendo una maraton");
    }
    
    public void correr(int km){
            System.out.println("He corrido "+km+" kilometros");
    }
    
    
    
    
    
}
