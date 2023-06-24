
package Logica;


public class ComplejoDeportivo implements IPiscina, ICampoFutbol { //Punto 4  //Punto 8: Da 1 error ya que no puede ser Hija de 1 clase Abstracta
    
   // ComplejoDeportivo cd = new ComplejoDeportivo(); //Punto 8

    @Override
    public void limpiarPiscina() {
        System.out.println("Se ha limpiado la piscina");
    }

    @Override                           //Punto 5
    public void limpiarVestuario() {
        System.out.println("Se ha limpiado los vestuarios");
    }

    @Override
    public void temperaturaAgua() {
        System.out.println("La temperatura del agua es la correcta");
    }

    @Override
    public void filtradoAgua() {
        System.out.println("El filtado de agua es el correcto");
    }

    @Override
    public void abrirGimnasio() {
        System.out.println("El gimnasio se ha abierto a las 6:00 AM");
    }

    @Override
    public void cerrarGimnasio() {
        System.out.println("El gimnasio se ha cerrado a las 20:00 PM");
    }

    @Override
    public void cuidarCampo() {
        System.out.println("El cesped del campo de Futbol se ha renovado");
    }

    @Override
    public void cuidarAlumbrado() {
        System.out.println("El alumbrado es el optimo");
    }
    
}
