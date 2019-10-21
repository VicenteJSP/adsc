/**
 * Clase padre para los articulos que maneja la Libreria
 * @author Vicente Santiago
 */
package mx.uam.ayd.practica4;
abstract public class Material {

    protected String nombre;
    protected double precio;

    public Material (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String dameNombre () {
        return this.nombre;
    }

    abstract public double damePrecio ();
    
    public boolean cambiaPrecio (double precio) {
        this.precio = precio;
        return true;
    }
   
}