
package Persona;

//CFGSDAW

public class Persona {
  //Atributos
  String nombre;  
  int edad;
  double altura;
  
  //Metodos
  
    public Persona(String nombre,int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    
    public void mostrarDatos(){
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu estatura es: "+altura);
    }
    
}
