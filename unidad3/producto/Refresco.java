package unidad3.producto;

/**
 *
 * @author Padilla Bernal
 */
public class Refresco extends Producto {
    private String sabor;
    
    public Refresco()
    {
        super();
        sabor = "";
    }
    
    public Refresco(String clave, String descripcion, double precio, String sabor)
    {
        super(clave, descripcion, precio);
        this.sabor = sabor;
    }
    
    public void setSabor(String sabor)
    {
        this.sabor = sabor;
    }
    
    public String getSabor()
    {
        return this.sabor;
    }
    
    public String toString()
    {
        return super.toString()+", Sabor: "+this.sabor+"\n";
    }
}
