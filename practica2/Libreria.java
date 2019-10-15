/**
 * Esta clase represnta una aplicacion
 * @author Vicente Santiago
 */
public class Libreria {

    /**
     * Este metodo crea el objeto inicial
     */
    public static void main(String[] args) {
        /** Crea la instancia de la aplicación */
        Libreria app = new Libreria();

        /** Invoca al metodo iniciar */
        app.iniciar();
    }

    /**
     * Este es el constructor
     */
    public Libreria() {
        /** No hay nada que inicializar */
    }

    public void iniciar() {
        System.out.println("La aplicacion ha iniciado!!! \n");
        /** Aquí se pueden crear e inicializar los objetos que realmente corresponden a la aplicaión */
        Autor autor1 = new Autor("Watts","Humphrey",1985);
        System.out.println("Autor creado: "+ autor1);
        Libro libro1 = new Libro("Personal Software Process", autor1, 550.5);
        System.out.println("\nLibros creados.");
        Libro libro2 = new Libro("Team Software Process", autor1, 450.5);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
    }
}