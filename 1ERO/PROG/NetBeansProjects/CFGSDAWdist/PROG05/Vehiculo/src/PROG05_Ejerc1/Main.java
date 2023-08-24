
package PROG05_Ejerc1;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import PROG05_Ejerc1_util.Validador;

public class Main {
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
        
        boolean finalizar = true;
        
        Vehiculo coche = null;
        
        String marca, matricula, descripcion, dueño, dniDueño;
        double precio;
        LocalDate fechaMat;
        int numKilometros, antiguedad, dia, mes, anio;
        
        
        entrada.useDelimiter("\n");
        entrada.useLocale(Locale.US);
        
        
            do{
                try{
                
            System.out.println("1. Nuevo Vehiculo ");
            System.out.println("2. Ver Matricula ");
            System.out.println("3. Ver Num Km ");
            System.out.println("4. Actualizar Km ");
            System.out.println("5. Ver Antigüedad ");
            System.out.println("6. Mostrar Dueño ");
            System.out.println("7. Mostrar Descripcion ");
            System.out.println("8. Mostrar Precio ");
            System.out.println("9. Salir del Menu ");   
            
            int opcion = entrada.nextInt();
            
         switch(opcion){
             case 1:                  
               
                 
                 System.out.println("Introduce la marca");
                 marca = entrada.next();
                 
                 //------------------------------------------------------------
                 
                 System.out.println("Introduce la Matricula");
                 matricula = entrada.next();
                 
                 //------------------------------------------------------------
                 
                 System.out.println("Introduce el numero de Km");
                 numKilometros = entrada.nextInt();
                 entrada.nextLine();
                 
                //------------------------------------------------------------
                
                System.out.println("Introduce el dia de la fecha de matriculacion");
                dia = entrada.nextInt();

                System.out.println("Introduce el mes de la fecha de matriculacion");
                mes = entrada.nextInt();

                System.out.println("Introduce el año de la fecha de matriculacion");
                anio = entrada.nextInt();

                fechaMat = LocalDate.of(anio, mes, dia);

                if (Validador.fechaMasHoy(fechaMat)) {
                 throw new Exception("fecha matriculacion es mayor que hoy");
                 }
                
                //------------------------------------------------------------
                
                 System.out.println("Introduce una Descripcion del vehiculo");
                 descripcion = entrada.next();
                
                //------------------------------------------------------------
                
                 System.out.println("Introduce el nombre del Dueño");
                 dueño = entrada.next();
                 
                 //------------------------------------------------------------
                 
                 System.out.println("Introduce el DNI del Dueño");
                 dniDueño = entrada.next();
                 
                   if (!Validador.DNIvalido(dniDueño)) {
                        throw new Exception("DNI no valido");
                        }
                 
                 //------------------------------------------------------------
                   
                 System.out.println("Introduce el Precio");
                 precio = entrada.nextDouble();
                 entrada.nextDouble();
                 
                 //------------------------------------------------------------
                
                 System.out.println("Vehiculo creado");
                 
                 coche = new Vehiculo(marca, matricula, numKilometros, fechaMat, descripcion, precio, dueño, dniDueño);
                                     
               break;
               
             case 2:
                if (coche != null) {
                System.out.println("Matricula: " + coche.getMatricula());
            } else {
                System.out.println("Antes debes crear un vehiculo");
             }
                break;
                
            case 3:

                if (coche != null) {
                    System.out.println("KM: " + coche.getNumKilometros());
            } else {
                            System.out.println("Antes debes crear un vehiculo");
             }
               break;
            
            case 4:

            if (coche != null) {

            System.out.println("Introduce el numero de km del vehiculo");
            numKilometros = entrada.nextInt();
                            
            coche.setNumKilometros(numKilometros);
            System.out.println("KM actualizados");

           } else {
             System.out.println("Antes debes crear un vehiculo");
            }
                break;
                        
            case 5:
                        
            if (coche != null) {
                System.out.println("Antiguedad: " + coche.get_Tiempo() + " años");
            } else {
                System.out.println("Antes debes crear un vehiculo");
            }
                    break;
                    
            case 6:

            if (coche != null) {
              System.out.println("Propietario: " + coche.getDniDueño()+ " " + coche.getNombreDueño());
            } else {
              System.out.println("Antes debes crear un vehiculo");
            }
             break;

            case 7:
              if (coche != null) {
           System.out.println("Descripcion: " + coche.getDescripcion());
           System.out.println("Matricula: " + coche.getMatricula());
           System.out.println("KM: " + coche.getNumKilometros());
            } else {
               System.out.println("Antes debes crear un vehiculo");
            }
            break;

           case 8:
                if (coche != null) {
                System.out.println("Precio: " + coche.getPrecio());
                   } else {
                          System.out.println("Antes debes crear un vehiculo");
                 }
               break;
                 
                case 9:
                    finalizar = true;
                    break;
                    
                default: System.out.println("Opcion incorrecta; Elige un numero entre 1 y 9");
            }
               
            }catch(Exception e){
                System.out.println(e.getMessage());
                }      
   
        }while(finalizar);
    }
    
}
    

