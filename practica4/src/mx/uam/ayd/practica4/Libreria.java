package mx.uam.ayd.practica4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase represnta a la Libreria
 * @author Vicente Santiago
 */
public class Libreria {

    private List<Material> almacen;

    public Libreria () {
        almacen = new ArrayList<Material>();
    }

    public boolean agregaMaterial (Material elemento) {
        almacen.add(elemento);
        return true;
    }
    
    public boolean quitaMaterial (Material elemento) {
        almacen.remove(elemento);
        return true;
    }

    public List<Material> dameMateriales () {
        return almacen;
    }

    public List<Material> buscaMaterialCuyoNombreContenga (String criterio) {
        return almacen.stream().filter( e -> e.dameNombre().contains(criterio) ).collect(Collectors.toList());
    }

    public int cuantosMateriales () {
        return almacen.size();
    }    

    
}