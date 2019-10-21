/**
 * Revista
 * @author Vicente Santiago
 */
package mx.uam.ayd.practica4;
public class Revista extends Material {

    private int numero;

    public Revista (String nombre, int numero, double precio) {
        super(nombre,precio);
        this.numero = numero;
    }

    public int dameNumero() {
        return this.numero;
    }

    @Override
    public double damePrecio () {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Revista: "+this.nombre+", Numero:"+this.numero+", "+this.precio;

    }
}