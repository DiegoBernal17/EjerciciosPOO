package unidad3.superficie;

/**
 *
 * @author Padilla Bernal
 */
public class Circulo extends Superficie {
    private double radio;
    
    public Circulo(double radio)
    {
        this.radio = radio;
        this.calcularArea();
    }
    
    public void calcularArea()
    {
        area = Math.PI*Math.pow(radio,2);
    }
}
