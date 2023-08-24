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

   //---------1---------
public class Libro {
   private String isbn, titulo, autor; 
   private int numPaginas;
   
   //---------1.1 ---------
//---------Constructor---------     
   public Libro(String isbn, String titulo, String autor, int numPaginas) {
     this.autor = autor;
     this.isbn = isbn;
     this.numPaginas = numPaginas;
     this.titulo = titulo;   
}
//---------Get y Set del ISBN---------
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getIsbn() {
        return isbn;
  }  
//---------Get y Set del Título---------
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    } 
//---------Get y Set de Autor---------   
    public void setAutor(String autor) {
        this.autor = autor;
    }
        public String getAutor() {
        return autor;
    }
//---------Get y Set de numPaginas---------        
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

        public int getNumPaginas() {
        return numPaginas;
    }
        
     //---------1.2--------- 
//---------Metodo toString---------       
  public String toString(){
      String mensaje="El Libro "+titulo+" con ISBN: "+isbn+" Creado por el autor: " 
              +autor+" tiene "+numPaginas+" paginas\n";
      return mensaje;
  }             
 }




        
   


    

