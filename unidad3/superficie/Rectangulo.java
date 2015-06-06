package unidad3.superficie;

/**
 *
 * @author Padilla Bernal
 */
public class Rectangulo extends Superficie {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
        this.calcularArea();
    }

    public void calcularArea()
    {
        area = base*altura;
    }
}
