/**
 * Revista
 */
public class Revista extends Material {

    private int numero;

    public Revista (String nombre, int numero, double precio) {
        super(nombre,precio);
        this.numero = numero;
    }

    public int dameNumero() {
        return this.numero;
    }
}