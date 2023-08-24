package math1;

public class math1 {
    public static void main(String[] args) {
      
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

    System.out.println("==============");

        double max = Math.max(3.5, 1.2);
        System.out.println("maximo = " + max);
        double max2 = Math.floor(3.5);
        System.out.println("Redondeo hacia abajo = " + max2);

    System.out.println("==============");    

        double min = Math.min(32.7546, 32.7543);
        System.out.println("minimo = " + min);

        double min2 = Math.ceil(32.7546);
        System.out.println("Redondeo hacia arriba = " + min2);

    System.out.println("==============");
    
    long redondeo = Math.round(3.4);
    long redondeo2 = Math.round(3.5);

    System.out.println("Redondeo automatico = " + redondeo);
    System.out.println("Redondeo automatico = " + redondeo2);



    }
}