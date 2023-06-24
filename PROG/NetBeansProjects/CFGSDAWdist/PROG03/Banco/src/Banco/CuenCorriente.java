
package Banco;


    public class CuenCorriente {
    String titular;
    Banco banco;
    String dni;
    double saldo;
    int limite;
    
    CuenCorriente (String titular, String dni,Banco banco, double saldo, int limite){
       this.banco = banco;
       this.titular = titular;
       this.dni = dni;
       this.saldo = saldo;
       this.limite = limite;   
    }
    
    CuenCorriente (String titular, String dni){ //Cuenta Corriente sin Banco
        this.titular = titular;
        this.dni = dni;
     
    }    
 public void cambiarBanco(Banco banco){
    this.banco = banco;
} 
 public void mostrarDatos(){
     System.out.println("Informacion del Banco");
     
     if  (banco == null){
         System.out.println("Cuenta no asociada a un Banco");
     }else{
         banco.mostrarDatos();
     }
     System.out.println("Informacion de la cuenta");
     System.out.println("Titular: "+titular);
     System.out.println("DNI "+dni);
     System.out.println("Saldo: "+saldo);
     System.out.println(limite + " Es el Limite de retiro diario\n");
     System.out.println("---------------------------------\n");
 }

    }