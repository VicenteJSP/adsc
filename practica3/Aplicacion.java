/**
 * Clase principal
 * @author Vicente Santiago
 */
public class Aplicacion {

    private Libreria almacen;

    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        app.iniciar();
    }

    public Aplicacion () {
        almacen = new Libreria();
    }

    public void iniciar () {
        System.out.println("\nLa aplicacion2 ha iniciado!!! \n");
        /** Aquí se pueden crear e inicializar los objetos que realmente corresponden a la aplicaión */
        Autor autor1 = new Autor("Alan","Moore",1953);
        Autor autor2 = new Autor("H.P.","Lovecraft",1890);
        System.out.println("Autores creados!\n");
        
        Libro libro1 = new Libro("Batman: The Killing Joke", autor1, 550.5);
        Libro libro2 = new Libro("Watchmen", autor1, 450.5);
        Libro libro3 = new Libro("The Call of Cthulhu", autor2, 455.5);
        System.out.println("Libros creados!\n");

        almacen.agregaMaterial(libro1);
        almacen.agregaMaterial(libro2);
        almacen.agregaMaterial(libro3);

        System.out.println("Total de articulos almacenados: " + almacen.cuantosMateriales());
        almacen.dameMateriales().stream().forEach( e -> System.out.println(e.dameNombre()) );
        
        System.out.println("\nMateriales que contienen la palabra 'Joke': ");
        almacen.buscaMaterialCuyoNombreContenga("Joke").stream().forEach( e -> System.out.println(e.dameNombre()) );


    }
    
}