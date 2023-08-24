package clase30_01;

public class claseMatrices {
    public static void main(String[] args) throws InterruptedException{

        int[][] matriz = new int[3][2];

        matriz[0][0]=20;
        matriz[1][0]=67;
        matriz[1][1]=33;
        matriz[2][1]=7;

        int i,j;
        for ( i = 0; i < 3; i++) {
            System.out.println("Fila:" + matriz[i]);
            for ( j = 0; j < 2; j++) {
           
            System.out.printf("%10d" + matriz[i][j]);
            Thread.sleep(1000);
            }
        System.out.println();
        }
    }
}
