
package Logica;

public abstract class Personaje {
    protected String nombre;
    protected int ki = 100;      //1.Crea 1 clase Abstracta llamada "Personaje" con los siguientes atributos:
    protected int vida = 100;    

    public Personaje(String nombre, int ki, int vida) {
        this.nombre = nombre;
        this.ki = ki;
        this.vida = vida;
    }

    
    
    protected abstract void atacar(Personaje goku);
    
                                        //3. Añade dos metodos abstractos "atacar" y "defender"
    protected abstract void defender(Personaje vegeta);

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }
    
}
