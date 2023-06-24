
package Legisladores;

public abstract class Legislador extends Persona{
    private String provincia;
    private String partidoPolitico;
    private float numeroDespacho;

    public Legislador() {
    }

    public Legislador(String provincia, String partidoPolitico, float numeroDespacho, String nombre, String apellidos, int edad, boolean casado) {
        super(nombre, apellidos, edad, casado);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
        this.numeroDespacho = numeroDespacho;
    }
    
    public abstract String getCamaraEnQueTrabaja();

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public float getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(float numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return ",  Legislador {" + "provincia= " + provincia + ", partidoPolitico= " + partidoPolitico + ", numeroDespacho= " + numeroDespacho + ", " + super.toString() + '}';
    }



    
    
}
