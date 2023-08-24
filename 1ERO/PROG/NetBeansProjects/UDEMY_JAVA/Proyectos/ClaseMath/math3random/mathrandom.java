package math3random;

public class mathrandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "rojo", "rosado", "violeta",  "verde", "marron", "amarillo"};  
        double random = Math.random(); //Imprime un numero aleatorio entre 0 y 1

        System.out.println("Numero aleatorio = " + random);
        random *= colores.length; //Imprimirá un color del Array de encima, y un numero entre 0  y 7 (por la cantidad de los colores)


        System.out.println("Numero aleatorio = " + random);

        System.out.println("Colores = " + colores[(int) random]);
        
    
    }
    
}