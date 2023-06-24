
package AlmacenarHeroes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Controlador {
    private List<SuperHeroe> superheroes;

    public Controlador() throws IOException {
        this.superheroes = Archivo.leer();
    }

    public void agregarSuperheroe(String nombre, String poder) {
        superheroes.add(new SuperHeroe(nombre, poder));
    }

    public List<SuperHeroe> buscarSuperheroes(String filtro) {
        List<SuperHeroe> resultado = new ArrayList<>();
        for (SuperHeroe s : superheroes) {
            if (s.getNombre().toLowerCase().contains(filtro.toLowerCase()) ||
                    s.getPoder().toLowerCase().contains(filtro.toLowerCase())) {
                resultado.add(s);
            }
        }
        return resultado;
    }

    public void eliminarSuperheroes(String filtro) {
        superheroes.removeIf(s ->
                s.getNombre().toLowerCase().contains(filtro.toLowerCase()) ||
                s.getPoder().toLowerCase().contains(filtro.toLowerCase()));
    }

    public void guardarCambios() throws IOException {
        Archivo.escribir(superheroes);
    }
}
