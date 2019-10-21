/**
 * Clase Autor
 * @author Vicente Santiago
 */
package mx.uam.ayd.practica4;
public class Autor {

    private String nombre;
    private String apellido;
    private Integer anioNacimiento;

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
    
}