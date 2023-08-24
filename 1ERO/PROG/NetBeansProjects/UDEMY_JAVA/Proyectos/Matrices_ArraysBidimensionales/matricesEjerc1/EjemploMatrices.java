public class EjemploMatrices {
    public static void main(String[] args) {
        double [][] numeros = new double [2][4];

        numeros [0][0] = 17;
        numeros [0][1] = 27;
        numeros [0][2] = 0;
        numeros [0][3] = 47;
        numeros [1][0] = Math.PI;
        numeros [1][1] = Math.PI + 0.5;
        numeros [1][2] = (17/2)*3;
        numeros [1][3] = 10;

        

        System.out.println("numero de filas: " + numeros.length);
        System.out.println("numero de columnas " + numeros[0].length);

        System.out.println("Primer elemento de la Matriz: " + numeros[0][0]);
        System.out.println("Elemento de en medio de la Matriz: " + numeros[1][0]);
        System.out.println("Ultimo elemento de la Matriz: " + numeros[numeros.length - 1][numeros[1].length - 1]);

        


    }
    
    
}
