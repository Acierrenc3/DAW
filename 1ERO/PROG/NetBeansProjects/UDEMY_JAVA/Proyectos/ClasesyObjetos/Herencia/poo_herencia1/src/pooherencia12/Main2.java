
package pooherencia12;

import pooherencia1.*;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("===== Creando la Instancia de Alumno =====");
        Alumno alu1 = new Alumno("Ramiro", "Maetzu", 23,  "Universidad de La Laguna");
        alu1.setNotaAlgoritmica(8.75);
        alu1.setNotaMatematicas(6.13);
        alu1.setNotaEstadistica(9);
        alu1.setEmail("Ramiro@xmail.com");
        
        System.out.println("===== Creando la Instancia de AlumnoIntercambio =====");
        
        AlumnoIntercambio aluint1 = new AlumnoIntercambio("Francesa", "Pier", "Bleu");
        aluint1.setEdad(27);
        aluint1.setNotaIdiomas(6.8);
        aluint1.setNotaAlgoritmica(4.75);
        aluint1.setNotaMatematicas(8.13);
        aluint1.setNotaEstadistica(5.0); 
        aluint1.setEmail("Pier@xmail.com");
        
        System.out.println("===== Creando la Instancia de Profesor =====");        
        Profesor p1 = new Profesor("Matematicas", "Lucia", "Garcia");
        p1.setEdad(41);
        p1.setEmail("lucia@xmail.com");
        
        imprimir(alu1);
        imprimir(aluint1);
        imprimir(p1);
         
        
    }
    
    public static void imprimir(Persona persona){
        System.out.println("==Imprimiendo datos en comun del tipo Persona==");
        System.out.println("Alumno: " + persona.getNombre() + " " + persona.getApellido() + ", " 
                + " Edad: " + persona.getEdad()  + ", Email:" + persona.getEmail());
        
        if (persona instanceof Alumno) {
            System.out.println("==Imprimiendo los datos del tipo Alumno==");
            System.out.println("Universidad: " + ((Alumno) persona).getUniversidad());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Algoritmica: " + ((Alumno) persona).getNotaAlgoritmica());
            System.out.println("Nota Estadistica: " + ((Alumno) persona).getNotaEstadistica());
            
            if (persona instanceof AlumnoIntercambio) {
                System.out.println("==Imprimiendo los datos del Tipo Alumno de Intercambio==");
                System.out.println("Nacionalidad: " + ((AlumnoIntercambio) persona).getNacionalidad());
                System.out.println("Nota Idiomas: " + ((AlumnoIntercambio) persona).getNotaIdiomas());
                
            }
    
        }
        
        if(persona instanceof Profesor){
            System.out.println("==Imprimiendo los datos del tipo Profesor==");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("==============================");
    }
 
}


