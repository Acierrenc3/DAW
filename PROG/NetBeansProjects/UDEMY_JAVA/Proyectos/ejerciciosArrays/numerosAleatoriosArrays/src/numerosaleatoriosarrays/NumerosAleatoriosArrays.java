
package numerosaleatoriosarrays;

public class NumerosAleatoriosArrays {
    public static void main(String[] args) {
       int x[] = new int[20];
       
        for (int i = 0; i < 20; i++) {
            x[i] = (int)(Math.random()*100);
            
            System.out.println("" + (i+1) + "\t--->\t" + x[i]);
            
        }
        System.out.println("");
    }
    
}
