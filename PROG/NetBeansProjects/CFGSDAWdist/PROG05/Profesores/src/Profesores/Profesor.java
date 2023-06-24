
package Profesores;

public class Profesor {  
    protected String nombre; 
    protected String apellidos;
    protected int edad;
    protected boolean casado;
    protected boolean especialista;        
 

    public Profesor(String nombre,String apellidos, int edad, boolean casado,  boolean especialista) { //Primer constructor con Parámetros
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.edad = edad;
      this.casado = casado;
      this.especialista = especialista;
    }

    public Profesor() { //Segundo Constructor sin Parámetros
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isEspecialista() {
        return especialista;
    }

    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }
    
    public void mostrarDatos(){
        System.out.println("El Profesor se llama: "+nombre+" "+apellidos);
        System.out.println("Tiene: "+edad+" anios");
        System.out.println("Casado: "+casado);
        System.out.println("Es especialista: "+especialista);
        
    }      

        
    
    
    
        
         

}
