
package Vehiculo;

import java.util.Scanner;
import java.util.regex.Pattern;
import Vehiculo.Deposito;
import Vehiculo.Color;
import Vehiculo.TipoColor;

class Concesionario {
    private Vehiculo[] vehiculos;
    private int numVehiculos;
        
public Concesionario(){
    vehiculos = new Vehiculo[50];
    numVehiculos = 0;  
    }   
    public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
            
     Vehiculo v1 = new Vehiculo();
     TipoMotor tm; //v
     Deposito dp; //?
     TipoColor cl;
     Persona ps;
     Rueda[] rds;
     
    System.out.println("¿De que tipo es el Motor del Vehiculo?  -->  DIESEL/GASOLINA/ELECTRICO/DESCONOCIDO");
    String tipoMotor = entrada.nextLine();
     
    switch (tipoMotor) {
    case "DIESEL":
       tm = TipoMotor.DIESEL;
       break;
    case "GASOLINA":
        tm = TipoMotor.GASOLINA;
        break;
    case "ELECTRICO":
        tm = TipoMotor.ELECTRICO;
        break;
    case "DESCONOCIDO":
        tm = TipoMotor.DESCONOCIDO;
        break;
                
            default:
                throw new AssertionError();
        }
        
        v1.setMotor(new Motor(3.0,tm));
        
        System.out.println("El tipo de motor es: " + tm);
      
    System.out.println("\n¿Qué capacidad tiene el Depósito?"); 
    int capacidadDeposito = entrada.nextInt();
    
     v1.setDeposito(new Deposito(capacidadDeposito));
      
        System.out.println("La capacidad del Depósito es de: " + capacidadDeposito);
        
    entrada.nextLine();
    
     System.out.println("\n¿De qué color es el vehiculo?  => AMARILLO/AZUL/NEGRO/BLANCO/GRIS/VERDE/ROJO/NARANJA");
     String tipoColor = entrada.nextLine();
     
        switch (tipoColor) {
         case "AMARILLO":
           cl = TipoColor.AMARILLO;
           break;
         case "AZUL":
           cl = TipoColor.AZUL;
           break;
         case "NEGRO":
           cl = TipoColor.NEGRO;
           break;
         case "BLANCO":
           cl = TipoColor.BLANCO;
           break;
         case "GRIS":
           cl = TipoColor.GRIS;
           break;
         case "VERDE":
           cl = TipoColor.VERDE;
           break;
         case "ROJO":
           cl = TipoColor.ROJO;
           break;
         case "NARANJA":
           cl = TipoColor.NARANJA;
           break;
                
            default:
                throw new AssertionError();
        }
        
      //v1.setColor(new Color("", cl));
        System.out.println("\nEl color del vehículo es: " + cl);
      
      
      
      
      v1.setPropietario(new Persona("Ayoze", "Pestano", 29));
      
      
    }



}
