
package Vehiculo;

public class MainVehiculo {
    public static void main(String[] args) {

    Vehiculo ford = new Vehiculo("Ford", "F-150",  3.0, 150, 120);        
    Vehiculo mazda = new Vehiculo("Mazda", "BT-50",  2.0, 100, 120);
    Vehiculo subaru = new Vehiculo("Subaru", "Impreza",  2.0, 98, 120);
    Vehiculo toyota = new Vehiculo("Toyota", "ProAce Verso",  3.0, 150, 120);
    Vehiculo audi = new Vehiculo("Audi", "A4", 3.0, 100, 120);
    
    mazda.setColor(TipoColor.BLANCO);
    ford.setColor(TipoColor.ROJO);
    subaru.setColor(TipoColor.AMARILLO);
    toyota.setColor(TipoColor.GRIS);
    audi.setColor(TipoColor.NEGRO);
    
    mazda.setTipo(TipoVehiculo.HATCHBACK);
    ford.setTipo(TipoVehiculo.PICKUP);
    subaru.setTipo(TipoVehiculo.HATCHBACK);
    toyota.setTipo(TipoVehiculo.FURGON);
    audi.setTipo(TipoVehiculo.CONVERTIBLE);
        
        System.out.println(ford.toString());
        System.out.println("==============");
        System.out.println(mazda.toString());  
        System.out.println("==============");
        System.out.println(subaru.toString());
        System.out.println("==============");
        System.out.println(toyota.toString());
        System.out.println("==============");
        System.out.println(audi.toString());
        
        switch (subaru.getTipo()) {
            case CONVERTIBLE:
                    System.out.println("Es un vehiculo deportivo descapotable de dos puertas");
                break;
            case COUPE:
                    System.out.println("Es un vehículo pequeño de dos puertas");
                break;
            case FURGON:
                System.out.println("Es un Vehiculo de uso para transportar");
                break;
            case HATCHBACK:
                System.out.println("Es un vehiculo mediano compacto con aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un vehiculo de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un vehículo mediano común y corriente");
                break;
            case STATION_WAGON:
                System.out.println("Es un vehículo más grande, con maletero grande");
                break;                
                
            default:
                throw new AssertionError();
        }
        
        System.out.println("=============MISMO CASO CON FOR=============");
        
        TipoVehiculo [] tipos = TipoVehiculo.values();
        
        for (TipoVehiculo ta: tipos) {
            System.out.print(ta + " => " + ta.name() + " , " + 
                    ta.getNombre() + " , " + 
                    ta.getDescripcion() + " , " + 
                    ta.getNumPuertas()  );
            System.out.println();
            
        }
        
    
    }
  
}
