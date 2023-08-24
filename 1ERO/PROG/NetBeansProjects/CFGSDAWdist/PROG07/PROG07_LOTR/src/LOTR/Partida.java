package LOTR;

import java.util.Random;

public class Partida {

    public static void main(String[] args) {
        int aleatorio, Vitalidad;
        int contador = 0;
        boolean buenos = true, malos = true;
        Random rand = new Random(System.currentTimeMillis());
        //Random rand = new Random();
        // Creamos Personajes: enenos, elfos, orcos

        Personajes enanos = new Personajes();
        Personajes elfos = new Personajes();
        Personajes orcos = new Personajes();

        enanos.setFisico(10); 
        enanos.setFuerza(10); 
        enanos.setNivel(2); 
        enanos.setNombre("enanos"); 
        enanos.setResistencia(2); 
        enanos.setVitalidad(50); 

        elfos.setFisico(10);
        elfos.setFuerza(5);
        elfos.setNivel(2);
        elfos.setNombre("elfos");
        elfos.setResistencia(2);
        elfos.setVitalidad(100);

        orcos.setFisico(10);
        orcos.setFuerza(50);
        orcos.setNivel(4);
        orcos.setNombre("orcos");
        orcos.setResistencia(2);
        orcos.setVitalidad(300);

        // mostramos la vida que tiene cada uno
        System.out.println(" EMPEZAMOS ... ");

        System.out.println("Los " + enanos.getNombre() + " tienen una vida de:  " + enanos.getVitalidad());
        System.out.println("Los " + elfos.getNombre() + " tienen una vida de:  " + elfos.getVitalidad());
        System.out.println("Los " + orcos.getNombre() + " tienen una vida de:  " + orcos.getVitalidad());
        System.out.println();
        System.out.println();

        // batalla: la batalla continua mientras los Enanos y los Elfos estén vivos
        do {
            contador++;
            System.out.println("COMIENZA LA BATALLA " + contador);
            System.out.println();
            System.out.println();

            if (enanos.getVitalidad() <= 0) { //Se le agrega 1 nuevo IF para que cuando mueran, no ataquen más. == PUNTO 2 ==
                System.out.println("La raza de los Enanos ha sido derrotada"); // ==PUNTO 3 ==

            } else {

                aleatorio = rand.nextInt(1); //Enanos
                if (aleatorio == 0) {
                    Vitalidad = enanos.ataqueFisico();
                } else {
                    Vitalidad = enanos.ataqueFuerza();
                }
                System.out.println("Los " + enanos.getNombre() + " han realizado un ataque de: " + Vitalidad);
                orcos.danio(Vitalidad);
            }

            if (elfos.getVitalidad() <= 0) {
                System.out.println("La raza de los Elfos ha sido derrotada"); // ==PUNTO 3 ==
            } else {

                aleatorio = rand.nextInt(1); //Elfos
                if (aleatorio == 0) {
                    Vitalidad = elfos.ataqueFisico();
                } else {
                    Vitalidad = elfos.ataqueFuerza();
                }
                System.out.println("Los " + elfos.getNombre() + " han realizado un ataque de: " + Vitalidad);
                orcos.danio(Vitalidad);
            }

            if (orcos.getVitalidad() > 0) { //Orcos
                aleatorio = rand.nextInt(1);
                if (aleatorio == 0) {
                    Vitalidad = orcos.ataqueFisico();
                } else {
                    Vitalidad = orcos.ataqueFuerza();
                }
                System.out.println("Los " + orcos.getNombre() + " han realizado un ataque de: " + Vitalidad);

                aleatorio = rand.nextInt(1);
                if (aleatorio == 0) {
                    if (enanos.getVitalidad() <= 0) {
                        enanos.danio(0);
                    } else {
                        enanos.danio(Vitalidad);
                    }
                    if (elfos.getVitalidad() <= 0) { 
                        elfos.danio(0);
                    } else {
                        elfos.danio(Vitalidad);
                    }
                }

                if (enanos.getVitalidad() <= 0 && elfos.getVitalidad() <= 0) {
                    buenos = false;
                    System.out.println();
                    System.out.println(" *** GANAN LOS MALOS  **** ");
                    System.out.println();
                }
                System.out.println();
                System.out.println();

            } else {
                malos = false;
                System.out.println();
                System.out.println(" **** GANAN LOS BUENOS *** ");
                System.out.println();
            }

            System.out.println("Los " + enanos.getNombre() + " tienen una vida de:  " + enanos.getVitalidad());
            System.out.println("Los " + elfos.getNombre() + " tienen una vida de:  " + elfos.getVitalidad());
            System.out.println("Los " + orcos.getNombre() + " tienen una vida de:  " + orcos.getVitalidad());
            System.out.println();
            System.out.println("ENTER PARA LA SIGUIENTE BATALLA");

            try {
                System.in.read();
            } catch (Exception e) {
            }

        } while (buenos && malos);
    }
}
