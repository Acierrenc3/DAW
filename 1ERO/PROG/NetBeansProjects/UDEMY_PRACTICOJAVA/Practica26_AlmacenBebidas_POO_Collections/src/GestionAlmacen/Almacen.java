
package GestionAlmacen;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    
    private List<Bebida> contenedor;

    public Almacen() {
        contenedor = new ArrayList<Bebida>();
      
    }
    
    private boolean existeBebida(Bebida b){
        for (int i = 0; i < contenedor.size() ; i++) {
            if (contenedor.get(i).getId() == b.getId()) {
                return true;
            }
        }
            return false;
    }
    
    public boolean agregarBebida(Bebida b){
        boolean existe = existeBebida(b);
        if (existe) {
            return false;
            
        }else {
            contenedor.add(b);
            return true;
        }
        
    }
    
    public boolean eliminarBebida(Bebida b){
        boolean existe = existeBebida(b);
        if (existe) {
            contenedor.remove(b);
            return true;
        }else{
            return false;
        }
    }
    
    public double precioTotalMarca(String marca){
        double precioTotalMarca = 0;
        for (Bebida b: contenedor) {
            if (b.getMarca().equalsIgnoreCase(marca)) {
                precioTotalMarca += b.getPrecio();
                
            }
            
        }
        return precioTotalMarca;
    }
    
    public double precioTotal(){
        double precioTotal = 0;
        for (Bebida b:contenedor) {
            precioTotal += b.getPrecio();
            
        }
        return precioTotal;
    }
    
    public void mostrarInformacion(){
        for (Bebida b : contenedor) {
            System.out.println(b.toString());
        }
    }
    
    
    
}
