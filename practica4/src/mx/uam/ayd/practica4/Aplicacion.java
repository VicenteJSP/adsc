/**
 * Clase principal
 * @author Vicente Santiago
 */
package mx.uam.ayd.practica4;
public class Aplicacion {

    // private Libreria almacen;
    private Menu menu;

    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        app.iniciar();
    }

    public Aplicacion () {
        // almacen = new Libreria();
        menu = new Menu();
    }

    public void iniciar () {
        System.out.println("\nLa aplicacion2 ha iniciado!!! \n");
        /** Aquí se pueden crear e inicializar los objetos que realmente corresponden a la aplicaión */
        /* Autor autor1 = new Autor("Alan","Moore",1953);
        Autor autor2 = new Autor("H.P.","Lovecraft",1890);
        System.out.println("Autores creados!\n");
        
        Libro libro1 = new Libro("Batman: The Killing Joke", autor1, 550.50);
        Libro libro2 = new Libro("Watchmen", autor1, 450.50);
        Libro libro3 = new Libro("The Call of Cthulhu", autor2, 455.50);
        System.out.println("Libros creados!\n");

        Revista revista1 = new Revista("Premier: Joker", 77, 79.50);
        Revista revista2 = new Revista("Quo: Drones", 179, 89.50);

        almacen.agregaMaterial(libro1);
        almacen.agregaMaterial(libro2);
        almacen.agregaMaterial(libro3);
        almacen.agregaMaterial(revista1);
        almacen.agregaMaterial(revista2);

        System.out.println("Total de articulos almacenados: " + almacen.cuantosMateriales());
        almacen.dameMateriales().stream().forEach( e -> System.out.println(e) );
        
        System.out.println("\nMateriales que contienen la palabra 'Joke': ");
        almacen.buscaMaterialCuyoNombreContenga("Joke").stream().forEach( e -> System.out.println(e.dameNombre()) ); */

        menu.despliegaMenu();
    }
    
}