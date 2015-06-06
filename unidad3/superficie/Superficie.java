package unidad3.superficie;

/**
 *
 * @author Padilla Bernal
 * 
 * ¿Cuál es la finalidad de un método abstracto?
 * Sirve para indicar que se necesita usar ese metodo pero que no se sabra su comportamiento
 * hasta en que sea implmentado en la clase a derivar. Un metodo abstracto obliga a toda las clases
 * derivadas a que lo sobrescriban.
 */ 

public abstract class Superficie {
    protected double area;
    
    public abstract void calcularArea();
    
    public double getArea()
    {
        return this.area;
    }
}
