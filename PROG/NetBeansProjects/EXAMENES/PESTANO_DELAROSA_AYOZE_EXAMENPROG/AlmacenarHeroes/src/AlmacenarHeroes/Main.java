package AlmacenarHeroes;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Controlador controlador = new Controlador(); //Creamos objeto Controlador
            Vista vista = new Vista(controlador); //Creamos objeto Vista para llamar al menu y que tenga en cuenta el objeto controlador
            vista.mostrarMenu(); // Llamada al método mostrarMenu() de la instancia vista
            controlador.guardarCambios(); //Guardamos los cambios en el archivo TXT
        } catch (IOException e) {
            System.out.println("Error al leer/escribir el archivo.");
        }
    }
}
        

    

