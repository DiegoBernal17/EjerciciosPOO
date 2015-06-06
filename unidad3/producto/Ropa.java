package unidad3.producto;

/**
 *
 * @author Padilla Bernal
 */
public class Ropa extends Producto {
    private String talla;
    
    public Ropa()
    {
        super();
        this.talla = "";
    }
    
    public Ropa(String clave, String descripcion, double precio, String talla)
    {
        super(clave, descripcion, precio);
        this.talla = talla;
    }
    
    public void setTalla(String talla)
    {
        this.talla = talla;
    }
    
    public String getTalla()
    {
        return this.talla;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+", Talla: "+this.talla+"\n";
    }
}
