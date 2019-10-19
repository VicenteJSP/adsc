/**
 * Iniciando la clase Libro
 */
public class Libro2 {

    private String nombre;
    private Autor2 autor;
    private double   precio;

    public Libro2(String nombre, Autor2 autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }
    
    public String dameNombre() {
        return this.nombre;
    }

    public Autor2 dameAutor() {
        return this.autor;
    }

    public double damePrecio() {
        return this.precio;
    }

    public boolean cambiaPrecio(double nuevoPrecio) {
        if( nuevoPrecio > 0 ){
            this.precio = nuevoPrecio;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre + ", " + autor + "," + precio;
    }
    
}