package exampro2ejercicio;

 /*@author Brian*/
public class LataDeRefresco extends Cilindro{
    private String sabor;

    public LataDeRefresco(double radio, double altura, double precio, String sabor) {
        super(radio, altura, precio);
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Lata de refresco con radio " + super.radio + " y altura " + super.altura + " - Precio: " + super.precio + " EUR - Sabor: " + sabor;
    }
}
