
package Banco;


public class Banco {
    final private String nombre;
    public double capital = 5.2;  
    public String direccion = "Sin direccion"; //Por defecto

    public Banco(String nombre) { //Banco con solo el nombre
        this.nombre = nombre;
    }
    
    public Banco (String nombre, double capital, String direccion){
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }   
    
    public void mostrarDatos(){
        System.out.println("Banco: "+nombre);
        System.out.println("Capital: " + capital + " Millones de euros");
        System.out.println("Direccion: "+direccion);
        System.out.println("");
    }
    
    
    
    
  
    
}
