package unidad3.superficie;

/**
 *
 * @author Bernal
 */
public class App {
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(200, 100);
        System.out.println(rect1.getArea());
        
        Circulo cir1 = new Circulo(10);
        System.out.println(cir1.getArea());
    }
}
