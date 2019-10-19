/**
 * Clase padre para los articulos que maneja la Libreria
 * @author Vicente Santiago
 */
public class Material {

    protected String nombre;
    protected double precio;

    public Material (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String dameNombre () {
        return this.nombre;
    }

    public double damePrecio () {
        return this.precio;
    }
    
    public boolean cambiaPrecio (double precio) {
        this.precio = precio;
        return true;
    }
   
}