/* 1- Crear una clase libro  que contenga los siguientes atributos:
-ISBN
-TÍTULO
-AUTOR
-NUMERO DE PAGINAS
1.1- Crear sus respectivos metodos get y set para cada atributo
1.2- Crear el metodo toString() para mostrar la informacion relativa al libro con el siguiente formato:
"El libro <su_titulo> con ISBN <su_ISBN> con autor <su_autor> tiene <num_paginas>  páginas"
1.3- En el fichero main crear 2 objetos Libros (Con los valores que se quieran) y mostrarlos por pantalla
1.4- Por ultimo indicar cual de los 2 tiene más paginas
*/

package Libreria;

public class Main {
    public static void main(String[] args) {
        
        //---------1.3---------
        Libro lib1= new Libro ("P-84576-44F", "Psicologia Clinica", "Sigmund Freud", 245);
        Libro lib2= new Libro ("Z-876-24A", "Programacion", "Alfonso Jimenez Marin", 435);
        
        System.out.println(lib1.toString());
        System.out.println("");
        System.out.println(lib2.toString());
        
        //---------1.4---------
        if(lib1.getNumPaginas()>lib2.getNumPaginas()){
            System.out.println(lib1.getTitulo()+" tiene mas paginas");
        }else{
            System.out.println(lib2.getTitulo()+" tiene mas paginas");
            
        }
    }
}
