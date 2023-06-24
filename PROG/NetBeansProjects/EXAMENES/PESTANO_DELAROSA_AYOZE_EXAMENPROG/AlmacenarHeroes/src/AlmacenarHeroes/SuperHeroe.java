
package AlmacenarHeroes;

public class SuperHeroe {
    private String nombre;
    private String poder;

    public SuperHeroe(String nombre, String poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPoder() {
        return poder;
    }

    @Override
    public String toString() {
        return nombre + ";" + poder;
    }
}
