/*
package pooherencia12;

import pooherencia1.Alumno;
import pooherencia1.Profesor;
import pooherencia1.Persona;
import pooherencia1.AlumnoIntercambio;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("===== Creando la Instancia de Alumno =====");
        Alumno alu1 = new Alumno();
        alu1.setNombre("Ramiro");
        alu1.setApellido("Maetzu");
        alu1.setUniversidad("Universidad de La Laguna");
        alu1.setNotaAlgoritmica(8.75);
        alu1.setNotaMatematicas(6.13);
        alu1.setNotaEstadistica(9);
        
        System.out.println("===== Creando la Instancia de AlumnoIntercambio =====");
        
        AlumnoIntercambio aluint1 = new AlumnoIntercambio();
        aluint1.setNombre("Pier");
        aluint1.setApellido("Bleu");
        aluint1.setNacionalidad("Francesa");
        aluint1.setEdad(27);
        aluint1.setNotaIdiomas(6.8);
        aluint1.setNotaAlgoritmica(4.75);
        aluint1.setNotaMatematicas(8.13);
        aluint1.setNotaEstadistica(5.0); 
        
        
        System.out.println("===== Creando la Instancia de Profesor =====");        
        Profesor p1 = new Profesor();
        p1.setNombre("Lucia");
        p1.setApellido("Garcia");
        p1.setAsignatura("Matematicas");
        
        
        System.out.println("===== - =====");
        
        System.out.println("Alumno: " + alu1.getNombre() + " " + alu1.getApellido() + ", " 
                + " Universidad: " + alu1.getUniversidad());
        
        System.out.println("Profesora: " + p1.getNombre() + " " + p1.getApellido() + ", Asignatura: " 
                            + p1.getAsignatura());
        
        System.out.println("Nombre Alumno Internacional: " + aluint1.getNombre() + " " + aluint1.getApellido() + " " + aluint1.getEdad() + " años");
        
        System.out.println("===== - =====");
        
        Class claseAluInt1 = aluint1.getClass();
        while (claseAluInt1.getSuperclass() != null) {
            String hija = claseAluInt1.getName();
            String padre = claseAluInt1.getSuperclass().getName();
            System.out.println("hija: " + hija +  ", es una clase hija de la clase padre: " + padre);
            claseAluInt1 = claseAluInt1.getSuperclass();
        }
        
    }
}
*/