
package personayfecha;

public class Main {
    public static void main(String[] args) {
        
        Fecha f1 = new Fecha(6,8,1993);
        Fecha f2 = new Fecha(12,6,2002);
        Fecha f3 = new Fecha(11,11,1964);
        
        Persona p1 = new Persona("Ayoze", "Pestano de la Rosa", f1);
        Persona p2 = new Persona("Brian", "Pestano de la Rosa", f2);
        Persona p3 = new Persona("Rosa", "De la Rosa Hernandez", f3);
        
        Persona[] personas = {p1, p2, p3};
        
        System.out.println("TODAS LAS PERSONAS");
        System.out.println("");
        System.out.println(p1.toString());
        System.out.println("==========================");
        System.out.println(p2.toString());
       System.out.println("==========================");
        System.out.println(p3.toString());

        System.out.println("");
        System.out.println("====FECHAS UNICAMENTE====");
        for (Persona p : personas) {
            System.out.println(p.getFechaDeNacimiento().toString());
            
        }
    }
}
