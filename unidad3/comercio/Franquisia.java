package unidad3.comercio;
import javax.swing.JOptionPane;

/**
 *
 * @author Padilla Bernal
 */
public class Franquicia {
    
    public static void main(String[] args)
    {
        final String nombre;
        double precioLitro;
        double litros;
        
        nombre = JOptionPane.showInputDialog("Dame el nombre de la franquicia");
        precioLitro = Double.parseDouble(JOptionPane.showInputDialog("Dame el precio del litro de gasolina"));
        litros = Double.parseDouble(JOptionPane.showInputDialog("Dame los litros de gasolina vendidos"));
        
        Gasolinera gaso1 = new Gasolinera(nombre, precioLitro, litros);
        gaso1.calcularGanancias();
        JOptionPane.showMessageDialog(null, gaso1.toString());
    }
}
