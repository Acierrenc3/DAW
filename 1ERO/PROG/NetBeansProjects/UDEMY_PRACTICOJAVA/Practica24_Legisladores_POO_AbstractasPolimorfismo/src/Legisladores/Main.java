
package Legisladores;

public class Main {
    public static void main(String[] args) {
        
        Legislador l1 = new Diputado("Santa Cruz de Tenerife", "Canarias Libre", 22.7f, "Ayoze", "Pestano de la Rosa", 29, false);
        Legislador l2 = new Senador("Madrid", "PZOE", 1.4f, "Paco", "Panchez", 47, true);
        Legislador  l3 = new Senador();
        
        System.out.println("===DATOS DE LOS LEGISLADORES===");
        System.out.println(l1.getCamaraEnQueTrabaja()+ l1.toString());
        System.out.println(l2.getCamaraEnQueTrabaja()+l2.toString());
        System.out.println(l3.getCamaraEnQueTrabaja()+l3.toString());

        
        System.out.println("===AGREGADO PROFE DEL CURSO===");
        
        Senador s1 = new Senador("Sevilla", "Partido illo - Sevilla", 3.0f, "Illo", "ErJuan", 38, true);
        Diputado d1 = new Diputado("Malaga", "Partido illo - Malaga", 4.0f, "Illo", "ErArberto", 51, true);
        
        Legislador[] legisladores = {s1, d1, l1, l2, l3};
        
        for (int i = 0; i < legisladores.length; i++) {
            System.out.println(legisladores[i].getCamaraEnQueTrabaja());
        }
    }
    
}
