package math2trigonometria;

public class math2 {
    public static void main(String[] args) {

        double exp = Math.exp(2); //es la exponencial de Math elevada a 2
        System.out.println("exponencial = " + exp);

        double log = Math.log(10); //Logaritmo natural de 10
        System.out.println("logaritmo = " + log);

        double pot = Math.pow(10, 3); //Diez elevado a 3
        System.out.println("potencia = " + pot);

        double raiz = Math.sqrt(25); //Raiz cuadrada de 25
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados); //Redondeamos a 90.
        System.out.println("Convertir Radianes a Grados = " + grados);

        double radianes = Math.toRadians(90d); //Si nos fijamos, los 90  grados corresponden a los 1.57 radianes de arriba
        System.out.println("Convertir Grados a Radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));
        System.out.println("tan(90): " + Math.tan(radianes));

        System.out.println("=====================================");

        radianes = Math.toRadians(180d); //Aumentamos los grados de 90 a 180
        System.out.println("sin(180): " + Math.sin(radianes));
        System.out.println("cos(180): " + Math.cos(radianes));
        System.out.println("tan(180): " + Math.tan(radianes));


    }
    
}