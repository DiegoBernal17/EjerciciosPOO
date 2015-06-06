package unidad3.comercio;

/**
 *
 * @author Padilla Bernal
 */
public abstract class Comercio {
    protected String nombre;
    protected double ganancias;
    
    public Comercio(String nombre)
    {
        this.nombre = nombre;
    }
    
    public abstract void calcularGanancias();
    
    public String toString()
    {
        return "Nombre del comercio: "+this.nombre+"\nGanancias: "+this.ganancias+"\n";
    }
}
