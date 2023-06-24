
package Libreria;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("ISBN-3400", "Como no Programar en Java", "Pilar Montañes", 10);
         Libro l2 = new Libro("ISBN-3401", "POO en Java", "Nostradamus", 1078);
          Libro l3 = new Libro("ISBN-3402", "Herencias en Java", "Desconocido", 50);
          
        Libro libros[] = new Libro[3];  
        
        libros[0] = l1;
        libros[1] = l2;
        libros[2] = l3;
        
        Libro masPaginas;
        
        masPaginas = l1;
        
        for (Libro l : libros) {
            System.out.println(l.toString()); 
            if (l.getNumPaginas() > masPaginas.getNumPaginas()) {
                masPaginas = l;
            }
        }
        System.out.println("El libro con mas paginas es: " + masPaginas.getTitulo());
        
    }
}

