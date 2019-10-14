/**
 * Esta clase represnta una aplicacion
 * @author Vicente Santiago
 */
public class Aplicacion {

    /**
     * Este metodo crea el objeto inicial
     */
    public static void main(String[] args) {
        /** Crea la instancia de la aplicación */
        Aplicacion app = new Aplicacion();

        /** Invoca al metodo iniciar */
        app.iniciar();
    }

    /**
     * Este es el constructor
     */
    public Aplicacion() {
        /** No hay nada que inicializar */
    }

    public void iniciar() {
        System.out.println("La aplicacion ha iniciado!!!");
        /** Aquí se pueden crear e inicializar los objetos que realmente corresponden a la aplicaión */
    }
}