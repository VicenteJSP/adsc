/**
 * Clase Libro que hereda de clase Material
 * @author Vicente Santiago
 */
public class Libro extends Material {

    private Autor autor;

    public Libro (String nombre, Autor autor, double precio) {
        super(nombre,precio);
        this.autor = autor;
    }

    public Autor dameAutor() {
        return this.autor;
    }

}