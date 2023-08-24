package LOTR;

import java.util.Random;

public class Personajes {

    private int vitalidad, fisico, fuerza, resistencia, nivel;
    private String nombre;
    
    private Random rand = new Random(System.nanoTime());

    public Personajes(int vitalidad, int fisico, int fuerza, int resistencia, int nivel, String nombre) { //Constructor con los Atributos por si en vez de usar los Getters y Setters se quiere hacer directamente en los objetos
        this.vitalidad = vitalidad;
        this.fisico = fisico;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.nivel = nivel;
        this.nombre = nombre;
    }
    
    public Personajes() { //Constructor Vacío
    }
             
    // Ataques
    public int ataqueFisico() {
        if (vitalidad <= 0) {
            vitalidad = 0;
        }
        int aleatorio = rand.nextInt(2);
        return nivel * fisico * aleatorio;
    }

    public int ataqueFuerza() {
        if (resistencia > 0) {
            resistencia--;
            return nivel * fuerza;
        } else {
            return 0;
        }
    }

    public void danio(int vitalidad) {
        this.vitalidad -= vitalidad;
    }

    //Punto 1 - Faltaban los Getters y Setters
    
    public int getVitalidad() {
        if (vitalidad <= 0) {
            vitalidad = 0;
     
        }
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }
    
    
    
    
    
}
