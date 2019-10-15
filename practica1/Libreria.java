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
        System.out.println("La aplicacion ha iniciado!!! \nLibros creados.");
        /** Aquí se pueden crear e inicializar los objetos que realmente corresponden a la aplicaión */
        Libro libro1 = new Libro("Ingeniería de Software", "Sommerville", 500.0);
        Libro libro2 = new Libro("Proceso de Software Personal", "Humphrey", 400.0);
        Libro libro3 = new Libro("Compiladores", "Aho", 350);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println("\nPrecios actualizados");
        libro1.cambiaPrecio(410.00);
        libro2.cambiaPrecio(510.00);
        libro3.cambiaPrecio(360);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println("cambiaPrecio regreso: "+libro3.cambiaPrecio(0));
    }
}