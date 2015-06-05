package unidad1.unpardearticulos;

public class Articulo {
	private String clave;
	private String descripcion;
	private double precio;
	
	public Articulo()
	{
		clave = "";
		descripcion = "";
		precio = 0.0;
	}
	
	public Articulo(String clave, String desc, double price)
	{
		this.clave = clave;
		this.descripcion = desc;
		this.precio = price;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

        @Override
	public String toString() {
		return "[Clave: " + clave + ", Descripcion: " + descripcion
				+ ", Precio: " + precio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

        @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		return Double.doubleToLongBits(precio) == Double
                        .doubleToLongBits(other.precio);
	}
	
	
}
