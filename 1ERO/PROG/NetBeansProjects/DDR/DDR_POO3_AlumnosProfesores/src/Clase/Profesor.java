package Clase;

public class Profesor extends Persona {

    private String materia;

    public Profesor() {
        super();

        super.setEdad(MetodosSueltos.generaNumeroAleatorio(25, 50));

        materia = Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0, 2)];

    }

    /*
    public Profesor(String matematicas, String filosofia, String fisica, int edad, String nombre, String sexo) {
        super();
        this.matematicas = matematicas;
        this.filosofia = filosofia;
        this.fisica = fisica;
    }
     */

    public String getMateria() {
        return materia;
    }

    public void setFisica(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" + "materia=" + materia + '}';
    }

    @Override
    public void disponibilidad() {
        int prob = MetodosSueltos.generaNumeroAleatorio(0, 100);
        if (prob < 20) {
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }

    }

}
