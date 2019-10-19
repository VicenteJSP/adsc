import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase representa al Almacen
 * @author Vicente Santiago
 */
public class Almacen {

    private List<Libro2> libros;

    /**
     * Constructor de la clase
     */
    public Almacen () {
        libros = new ArrayList<Libro2>();
    }

    /**
     * Este metodo permite agregar un libro al Almacen
     * @return True si el libro se agrego correctamente
     * de lo contrario regresa False
     */
    public boolean agregarLibro (Libro2 libro) {
        libros.add(libro);
        return true;
    }

    /**
     * Este merodo permite quitar un libro del Almacen
     * @return True si el libro fue removido, de lo contrario
     * regresa False
     */
    public boolean quitaLibro (Libro2 libro) {
        libros.remove(libro);
        return true;
    }

    /**
     * Este metodo regresa el arreglo de libros del Almacen
     * @return el arreglo de libros
     */
    public List<Libro2> dameLibros () {
        return libros;
    }

    /**
     * Este metodo busca los libros de un autor determinado
     * @return la lista de libros del autor
     */
    public List<Libro2> buscaLibrosPorAutor (Autor2 autor) {
        return libros.stream().filter( e -> e.dameAutor().dameNombre() == autor.dameNombre() ).collect(Collectors.toList());
    }

    /**
     * Este metodo cuenta la cantidad de libros en el Almacen
     * @return la cantidad de libros almacenados
     */
    public int cuantosLibros () {
        return libros.size();
    }
    
}