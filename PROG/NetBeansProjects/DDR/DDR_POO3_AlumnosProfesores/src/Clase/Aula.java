package Clase;

public class Aula  {

    private int id;
    public final int MAX_ALUMNOS=20;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;

    public Aula() {

        id = 1;
        profesor = new Profesor();

        alumnos = new Alumno[MAX_ALUMNOS];
        creaAlumnos();

        materia = Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0, 2)];

    }

    private void creaAlumnos(){
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();

        }
    }

    private boolean asistenciaAlumnos(){
        int cuentaAsistencia = 0;
        for (int i = 0; i < alumnos.length; i++) {

            if (alumnos[i].isAsistencia()) {
                cuentaAsistencia++;
            }
        }

        return cuentaAsistencia >= (int)(MAX_ALUMNOS/2) ;

    }

public boolean darClase(){
    
    if (profesor.isAsistencia()) {
        System.out.println("El profesor no ha acudido a clase");
        return false;
    }else if(profesor.getMateria().equals(materia)){
        System.out.println("La materia del profesor y del aula no es la misma");
        return false;
        
    }else if(asistenciaAlumnos()){
        System.out.println("La asistencia no es suficiente, no se puede dar clase");
        return false;
    }
    
    System.out.println("Se da la clase");
    return true;
}

    public void notas(){
        int chicosAprob=0;
        int chicasAprob=0;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getCalificacion() >= 5 ) {
                if (alumnos[i].getSexo().equals("Hombre")) {
                    chicosAprob++;
                }else{
                    chicasAprob++;
                }

                System.out.println(alumnos[i].toString());

            }

        }

        System.out.println("Hay " +chicosAprob+ " chicos y "+chicasAprob+" chicas aprobados/as");

    }

}
