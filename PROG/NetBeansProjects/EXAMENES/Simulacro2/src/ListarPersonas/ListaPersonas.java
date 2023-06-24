package ListarPersonas;

import java.io.*;
import java.util.*;

// Clase ListaPersonas para manejar la lista y las operaciones relacionadas con el archivo de texto
public class ListaPersonas {

    private ArrayList<Persona> personas;
    private File archivo;

    // Constructor que recibe el nombre del archivo e inicializa la lista y carga los datos del archivo
    public ListaPersonas(String archivo) {
        this.personas = new ArrayList<>();
        this.archivo = new File(archivo);
        cargarPersonas();
    }

    // Método para cargar los datos de las personas desde el archivo de texto
    private void cargarPersonas() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[2].equals("Hombre")) {
                    personas.add(new Hombre(datos[0], Integer.parseInt(datos[1])));
                } else if (datos[2].equals("Mujer")) {
                    personas.add(new Mujer(datos[0], Integer.parseInt(datos[1])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para agregar una persona a la lista y guardarla en el archivo
    public void agregarPersona(Persona persona) {
        personas.add(persona);
        guardarPersonas();
    }

    //Metodo para eliminar una persona de la lista y sacarla del archivo
    public void eliminarPersona(String nombre) {
        personas.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
        guardarPersonas();
    }

    // Método para buscar una persona en la lista por su nombre
    public Persona buscarPersona(String nombre) {
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }
        }
        return null;
    }

    // Método para listar todas las personas en la lista
    public void listarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ", " + persona.getEdad() + ", " + (persona instanceof Hombre ? "Hombre" : "Mujer"));
        }
    }

    // Método para guardar las personas en el archivo de texto
    private void guardarPersonas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Persona persona : personas) {
                bw.write(persona.getNombre() + "," + persona.getEdad() + "," + (persona instanceof Hombre ? "Hombre" : "Mujer"));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
