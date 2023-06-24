
package Concesionario;

class Vehiculo {
    private String matricula;  //En la clase Vehiculo declaramos las variables, Constructores y metodos Getter y Setters que tendrán cada uno de los 50 vehiculos.
    private String marca;
    private String dni;
    private String nombrePropietario;
    private int precio;
    private int kms;
    private String descripcion;

    public Vehiculo(String matricula, String marca, String dni, String nombrePropietario, int precio, int kms, String descripcion) {
        this.matricula = matricula;
        this.marca = marca;
        this.dni = dni;
        this.nombrePropietario = nombrePropietario;
        this.precio = precio;
        this.kms = kms;
        this.descripcion = descripcion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public int getPrecio(){
    return precio;
    }
    
    public void setPrecio(int precio) {
    this.precio = precio;
}

    public int getKms() {
    return kms;
}

    public void setKms(int kms) {
    this.kms = kms;
}

    public String getDescripcion() {
    return descripcion;
}

    public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

    public String getMarca() {
    return marca;
}

    public void setMarca(String marca) {
    this.marca = marca;
}
}
