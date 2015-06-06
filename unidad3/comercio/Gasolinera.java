package unidad3.comercio;

/**
 *
 * @author Padilla Bernal
 */
public class Gasolinera extends Comercio {
    private double litrosVendidos;
    private double precioDelLitro;
    
    public Gasolinera(String nombre, double ltsVendidos, double precioLts)
    {
        super(nombre);
        this.litrosVendidos = ltsVendidos;
        this.precioDelLitro = precioLts;
    }
    
    public void calcularGanancias()
    {
        this.ganancias = litrosVendidos*precioDelLitro;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"Litros vendidos: "+this.litrosVendidos+"\nPrecio del litro: "+this.precioDelLitro;
    }
}
