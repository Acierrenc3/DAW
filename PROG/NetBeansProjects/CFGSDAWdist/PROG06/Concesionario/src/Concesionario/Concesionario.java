
package Concesionario;

import java.util.Scanner;
import java.util.regex.Pattern;

class Concesionario { //Declaramos dos variables, un  Array que contendrá los vehiculos, y una variable que los listará
    private Vehiculo[] vehiculos;
    private int numVehiculos;
    
 public Concesionario(){
     vehiculos = new Vehiculo[50]; //Declaramos que el Array tendrá un máximo de 50 espacios.
     numVehiculos = 0; //Inicializamos la variable numVehiculos en 0.
 } 
 
 public static void main(String[] args) {
    Concesionario concesionario = new Concesionario(); //Creamos un nuevo Objeto "Concesionario" 
    concesionario.menu(); //Llamamos al menú del Concesionario
}
 
 public void nuevoVehiculo(){ //Declaramos el método para un nuevo vehiculo
     Scanner entrada = new Scanner(System.in);
     String matricula, dni, nombrePropietario, descripcion;
     int precio, kms;
     String marca;
     boolean matriculaValida, dniValido, nombreValido,existeVehiculo;
     
     do{
         System.out.println("Introduce la matricula: ");
         matricula = entrada.nextLine();
         matriculaValida= Pattern.matches("[0-9]{4}[A-Z]{3}",matricula); //validacion real de 1a matricula https://es.stackoverflow.com/questions/48115/como-poner-una-matricula-en-java-segura
         if (!matriculaValida) {
             System.out.println("Matriculanovalida. Debe tener el formato"
                     + "NNNNLLL donde NNNN es unnumeroentre 0000 y 9999 y LLL son"
                     + "Letras mayusculas del abecedario");
         }else{
             existeVehiculo = existeVehiculo(matricula);
             
         if (existeVehiculo) {
             System.out.println("Ya existe un vehiculo con la misma matricula"
                     + "en nuestro Concesionario");
             matriculaValida = false;
             
         }
     } 
     }while (!matriculaValida);
     
     do { //Validacion real de un DNI https://es.stackoverflow.com/questions/341564/validar-dni-en-java
        System.out.print("Introduce DNI: ");
        dni = entrada.nextLine();
        dniValido = Pattern.matches("[0-9]{8}[A-Z]", dni);
        if (!dniValido) {
          System.out.println("DNI no valido. Debe tener el formato NNNNNNNNL donde N"
                  + " es un numero entre 0 y 9 y L es una letra mayuscula del abecedario");
            }
    } while (!dniValido);
     
     do {
        System.out.print("Introduce nombre propietario: "); 
        //Validacion de Nombre real (Problema con Apellidos compuestos como De la Rosa) https://www.lawebdelprogramador.com/foros/Java/1648447-Validaciones-Apellidos-y-NIF.html
        nombrePropietario = entrada.nextLine();
        nombreValido = nombrePropietario.matches("[A-Z][a-z]+ [A-Z][a-z]+ [A-Z][a-z]+");
        if (!nombreValido) {
            System.out.println("Nombre no valido. Debe contener al menos un nombre y dos apellidos y su longitud no debe exceder de 40 caracteres");
        }
    } while (!nombreValido);
     
        System.out.print("Introduce marca: ");
        marca = entrada.nextLine();
        
        System.out.print("Introduce precio: ");
        precio = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce kms: ");
        kms = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce descripcion: ");
        descripcion = entrada.nextLine();
        
        vehiculos[numVehiculos] = new Vehiculo(matricula, marca, dni,nombrePropietario, precio, kms, descripcion);
            numVehiculos++;

            System.out.println("Vehiculo agregado exitosamente");
     }       
 
    public void listarVehiculos() {
        if (numVehiculos == 0) {
        System.out.println("No hay vehiculos en el concesionario");
    } else {
        for (int i = 0; i < numVehiculos; i++) {
            System.out.println("Vehiculo " + (i + 1) + ":");
            System.out.println("Marca: " + vehiculos[i].getMarca());
            System.out.println("Matricula: " + vehiculos[i].getMatricula());
            System.out.println("Precio: " + vehiculos[i].getPrecio());
            System.out.println("Kms: " + vehiculos[i].getKms());
            System.out.println("Descripcion: " + vehiculos[i].getDescripcion());
        }
    }
 }
    public void buscarVehiculo(){
        Scanner sc = new Scanner(System.in);
        String matricula;
        boolean existeVehiculo = false;

        System.out.print("Introduce matricula: ");
        matricula = sc.nextLine(); 
    
        for (int i = 0; i < numVehiculos; i++) {
        if (vehiculos[i].getMatricula().equals(matricula)) {
            System.out.println("Marca: " + vehiculos[i].getMarca());
            System.out.println("Matricula: " + vehiculos[i].getMatricula());
            System.out.println("Precio: " + vehiculos[i].getPrecio());
            existeVehiculo = true;
            break;
        }
    }

    if (!existeVehiculo) {
        System.out.println("No existe vehiculo con la matricula introducida");
    }
}
 
    public void modificarKmsVehiculo() {
        Scanner sc = new Scanner(System.in);
        String matricula;
        int kms;
        boolean existeVehiculo = false;

    System.out.print("Introduce matricula: ");
    matricula = sc.nextLine();
    System.out.print("Introduce kms: ");
    kms = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < numVehiculos; i++) {
        if (vehiculos[i].getMatricula().equals(matricula)) {
            vehiculos[i].setKms(kms);
            existeVehiculo = true;
            System.out.println("Kms del vehiculo actualizado exitosamente");
            break;
        }
    }

    if (!existeVehiculo) {
        System.out.println("No existe vehiculo con la matricula introducida");
    }
}

    public boolean existeVehiculo(String matricula) {
        boolean existe = false;
    
    for (int i = 0; i < numVehiculos; i++) {
        if (vehiculos[i].getMatricula().equals(matricula)) {
            existe = true;
                break;
            }
        }
            return existe;
            }
    
    public void menu() { //EL MENU DEL PROGRAMA
    Scanner sc = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("Menu:");
        System.out.println("1. Nuevo Vehiculo");
        System.out.println("2. Listar Vehiculos");
        System.out.println("3. Buscar Vehiculo");
        System.out.println("4. Modificar kms Vehiculo");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                nuevoVehiculo();
                break;
            case 2:
                listarVehiculos();
                break;
            case 3:
                buscarVehiculo();
                break;
            case 4:
                modificarKmsVehiculo();
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    } while (opcion != 5);
}


}

         
     
      

