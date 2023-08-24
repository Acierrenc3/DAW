
package cuentas;

/**
 *
 * @author acie
 */
public class Main {
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Accediendo a los atributos de CCuenta a través de los getters y setters
        cuenta1.setNombre("Juan Pérez");
        cuenta1.setCuenta("1000-2365-85-1230456790");
        cuenta1.setSaldo(3000);
        cuenta1.setTipoInterés(1.5);

        // Imprimiendo los atributos de CCuenta a través de los getters
        System.out.println("Nombre: " + cuenta1.getNombre());
        System.out.println("Cuenta: " + cuenta1.getCuenta());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println("Tipo de interés: " + cuenta1.getTipoInterés());
    }
}

