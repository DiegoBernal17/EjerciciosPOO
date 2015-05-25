package unidad1.cuadro;

public class Cuadro {
	private double lado;

	public Cuadro(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return lado*lado;
	}

        @Override
	public String toString() {
		return "Lado del cuadrado: " + lado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuadro other = (Cuadro) obj;
		return Double.doubleToLongBits(lado) == Double
                        .doubleToLongBits(other.lado);
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.lado) ^ (Double.doubleToLongBits(this.lado) >>> 32));
        return hash;
    }
}
