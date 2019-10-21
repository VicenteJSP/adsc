package mx.uam.ayd.practica4;
/**
 * Clase encargada del Menu
 * @author Vicente Santiago
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger; 

public class Menu {

    private Libreria almacen;
    
    public Menu () {
        almacen = new Libreria();
    }

    public void despliegaMenu () {
        int opt = 0;
        do {
            System.out.println("Sistema de administracion de Libreria\n\n"
                +"1.- Agregar un Material\n"
                +"2.- Buscar Material\n"
                +"3.- Eliminar Material\n"
                +"4.- Listar Todo\n"
            );
            do {
                System.out.println("Ingresa la opcion que deseas (0 para salir): ");
                opt = leeEntero();
                switch (opt) {
                    case 1:
                        int tipo;
                        String nombre;
                        int anioAutor;
                        double precio;
                        do {
                            System.out.println("Que tipo de Material deseas agregar:\n\n"
                            + "1.- Libro\n" + "2.- Revista\n");
                            tipo = leeEntero();
                        } while (tipo < 1 || tipo > 2);
                        switch (tipo) {
                            case 1:
                                String nombreAutor, apellidoAutor;
                                System.out.println("Agregando Libro");
                                System.out.print("Nombre: ");
                                nombre = leeCadena();
                                System.out.print("Nombre (Autor): ");
                                nombreAutor = leeCadena();
                                System.out.print("Apellido (Autor): ");
                                apellidoAutor = leeCadena();
                                System.out.print("Año de nacimiento(Autor): ");
                                anioAutor = leeEntero();
                                System.out.print("Precio: ");
                                precio = leeDoble();
                                Autor autor = new Autor(nombreAutor, apellidoAutor, anioAutor);
                                Libro libro = new Libro(nombre, autor, precio);
                                almacen.agregaMaterial(libro);
                                break;
                            case 2:
                                int numero;
                                System.out.println("Agrega Revista");
                                System.out.print("Nombre: ");
                                nombre = leeCadena();
                                System.out.print("Numero: ");
                                numero = leeEntero();
                                System.out.print("Precio: ");
                                precio = leeDoble();
                                Revista revista = new Revista(nombre, numero, precio);
                                almacen.agregaMaterial(revista);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\nBusqueda de Material");
                        System.out.print("Buscar: ");
                        nombre = leeCadena();
                        almacen.buscaMaterialCuyoNombreContenga(nombre).stream().forEach( e -> System.out.println(e));
                        break;
                    case 3:
                        int elemento = 0;
                        if (almacen.cuantosMateriales() > 0) {
                            AtomicInteger index = new AtomicInteger(0);
                            System.out.println("Lista de elementos");
                            almacen.dameMateriales().stream().forEach( e -> {
                                System.out.println( Integer.toString(index.get())+ " -> " + e);
                                index.getAndIncrement();
                            });
                            System.out.print("Ingresa el numero del material que deseas Eliminar: ");
                            elemento = leeEntero();
                            almacen.quitaMaterial(almacen.dameMateriales().get(elemento));
                        } else {
                            System.out.println("No hay materiales en el Almacen");
                        }
                        break;
                    case 4:
                        System.out.println("\nTotal de articulos almacenados: " + almacen.cuantosMateriales());
                        almacen.dameMateriales().stream().forEach( e -> System.out.println(e) );
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("Salir");
                        break;
                }
            } while (opt < 0 || opt > 4);
        } while (opt != 0);
    }
    
    public int leeEntero () {
        String entrada;
        int val;
        InputStreamReader leer;
        BufferedReader buff;
        try {
            leer = new InputStreamReader(System.in);
            buff = new BufferedReader(leer);
            entrada = buff.readLine();
            try {
                val = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                val = 0;
            }
        } catch (IOException e) {
            System.out.println("Error en la lectura del Integer");
            val = 0;
        }
        return val;
    }

    public String leeCadena () {
        InputStreamReader leer;
        BufferedReader buff;
        String entrada = "";        
        try {
            leer = new InputStreamReader(System.in);
            buff = new BufferedReader(leer);
            entrada = buff.readLine();
        } catch (IOException e) {
            System.out.println("Error en la lectura del String");
        }
        return (String) entrada;
    }

    public double leeDoble () {
        String entrada;
        double val;
        InputStreamReader leer;
        BufferedReader buff;
        try {
            leer = new InputStreamReader(System.in);
            buff = new BufferedReader(leer);
            entrada = buff.readLine();
            try {
                val = Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                val = 0;
            }
        } catch (IOException e) {
            val = 0;
            System.out.println("Error en la lectura del Doble");
        }
        return val;
    }
    
}