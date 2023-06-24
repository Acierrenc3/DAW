
package AlmacenarHeroes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Archivo {
    private static final String ARCHIVO = "superheroes.txt";
    

    public static List<SuperHeroe> leer() throws IOException {
        List<SuperHeroe> superheroes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                superheroes.add(new SuperHeroe(partes[0], partes[1]));
            }
        }
        return superheroes;
    }

    public static void escribir(List<SuperHeroe> superheroes) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO))) {
            for (SuperHeroe s : superheroes) {
                writer.println(s);
            }
        }
    }
}
