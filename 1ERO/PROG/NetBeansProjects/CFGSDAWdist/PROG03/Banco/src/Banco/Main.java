
package Banco;

public class Main {
    public static void main(String[] args) {
        CuenCorriente c1, c2, c3;
        Banco b1, b2;
        
        b1 = new Banco("Santander", 5.2, "Calle La Paz, n38 ");
        b2 = new Banco("CajaSiete", 5.2, "Plaza Weyler, s/n ");
       
        
        c1 = new CuenCorriente("Tegaday", "12345678-A", b1, 2875.5, 650);
        c2 = new CuenCorriente("Guayarmina", "12365578-W", b2, 10.38, 410);
        c1.mostrarDatos();
        c2.mostrarDatos();
        
        c3 = new CuenCorriente("Marcelo", "79045678-S");
        c3.mostrarDatos();
        c3.cambiarBanco(b1);
        c3.mostrarDatos();
    
       

    }
}
