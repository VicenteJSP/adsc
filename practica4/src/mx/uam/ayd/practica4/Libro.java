/**
 * Clase Libro que hereda de clase Material
 * @author Vicente Santiago
 */

package mx.uam.ayd.practica4;
public class Libro extends Material {

    private Autor autor;

    public Libro (String nombre, Autor autor, double precio) {
        super(nombre,precio);
        this.autor = autor;
    }

    public Autor dameAutor() {
        return this.autor;
    }

    @Override
    public double damePrecio () {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Libro: "+this.nombre+", "+this.autor.dameNombre()+" "+this.autor.dameApellido()+", "+this.precio;
    }

}