/**
 * Esta clase represnta una aplicacion
 * @author Vicente Santiago
 */
public class Libreria2 {

    Almacen almacen;

    /**
     * Este metodo crea el objeto inicial
     */
    public static void main(String[] args) {
        /** Crea la instancia de la aplicación */
        Libreria2 app = new Libreria2();

        /** Invoca al metodo iniciar */
        app.iniciar();
    }

    /**
     * Este es el constructor
     */
    public Libreria2() {
        /** No hay nada que inicializar */
        almacen = new Almacen();
    }

    public void iniciar() {
        System.out.println("La aplicacion2 ha iniciado!!! \n");
        /** Aquí se pueden crear e inicializar los objetos que realmente corresponden a la aplicaión */
        Autor2 autor1 = new Autor2("Alan","Moore",1953);
        Autor2 autor2 = new Autor2("H.P.","Lovecraft",1890);
        System.out.println("Autores creados!");

        Libro2 libro1 = new Libro2("Batman: The Killing Joke", autor1, 550.5);
        Libro2 libro2 = new Libro2("Watchmen", autor1, 450.5);
        Libro2 libro3 = new Libro2("The Call of Cthulhu", autor2, 455.5);
        System.out.println("Libros creados!");
        
        almacen.agregarLibro(libro1);
        almacen.agregarLibro(libro2);
        almacen.agregarLibro(libro3);
        
        System.out.println("Libros almacenados: " + almacen.cuantosLibros() );
        
        System.out.println("\nTodos los libros!");
        almacen.dameLibros().stream().forEach( (e) -> {
            System.out.println(e.dameNombre());
        });
        
        System.out.println("\nLibros de Alan Moore!");
        almacen.buscaLibrosPorAutor(autor1).stream().forEach( (e) -> {
            System.out.println(e.dameNombre());
        });
    }
}