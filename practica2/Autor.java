/**
 * Autor
 */
public class Autor {

    String nombre;
    String apellido;
    Integer anioNacimiento;

    public Autor(String nombre, String apellido, Integer anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
    }

    public String dameNombre() {
        return this.nombre;
    }

    public String dameApellido() {
        return this.apellido;
    }

    public Integer dameAnioNacimiento() {
        return this.anioNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " "+ apellido;
    }
    
}