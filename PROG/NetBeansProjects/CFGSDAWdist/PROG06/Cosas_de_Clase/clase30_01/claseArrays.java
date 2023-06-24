package clase30_01;

public class claseArrays {
    public static void main(String[] args) {
        int[] n = new int[4];
        n[0] = 26;
        n[1] = -30;
        n[2] = 0;
        n[3] = 100;
        System.out.println("Los valores del Array son los siguientes: ");
        System.out.println(n[0] + "," + n[1] + "," + n[2] + "," + n[3]);

        int suma = n[0] + n[3];

        System.out.println("El primer numero mas el ultimo del  Array suman: "+suma);
    }
}
