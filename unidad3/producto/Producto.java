package unidad3.producto;

/**
 *
 * @author Padilla Bernal
 */
public abstract class Producto {
    protected String clave;
    protected String descripcion;
    protected double precio;
    
    public Producto()
    {
        this.clave = "";
        this.descripcion = "";
        this.precio = 0.0;
    }
    
    public Producto(String clave, String descripcion, double precio)
    {
        this.clave = clave;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return "Clave: " + clave + ", Descripcion: " + descripcion + ", Precio: $" + precio;
    }
    
}
