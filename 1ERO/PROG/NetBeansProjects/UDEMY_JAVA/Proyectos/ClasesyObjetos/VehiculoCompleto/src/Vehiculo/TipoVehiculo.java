
package Vehiculo;

public enum TipoVehiculo {
    SEDAN("Sedan", "Vehiculo normal", 4),
    STATION_WAGON("Station Wagon", "Vehiculo Grande", 5),
    HATCHBACK("Hatchback", "Vehiculo Compacto", 5),
    PICKUP("Pick Up","Camioneta", 4),
    COUPE("Coupe", "Vehiculo Pequeño", 2),
    CONVERTIBLE("Convertible", "Vehiculo Sport", 2),
    FURGON("Furgon", "Vehiculo utilitario", 9);
      
    private final String nombre;
    private final String descripcion;
    private final int numPuertas; 

    private TipoVehiculo(String nombre, String descripcion, int numPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numPuertas = numPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumPuertas() {
        return numPuertas;
    }    
}
