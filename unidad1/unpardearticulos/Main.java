package unidad1.unpardearticulos;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {
        String clave;
        String desc;
        double precio;
        int continuar = JOptionPane.YES_OPTION;
        
        while(continuar == JOptionPane.YES_OPTION)
        {
            clave = JOptionPane.showInputDialog("Dame la clave del articulo 1");
            desc = JOptionPane.showInputDialog("Dame la descripcion del articulo 1");
            precio = Double.parseDouble(JOptionPane.showInputDialog("Dame el precio del articulo 1"));

            Articulo objeto1 = new Articulo(clave, desc, precio);

            clave = JOptionPane.showInputDialog("Dame la clave del articulo 2");
            desc = JOptionPane.showInputDialog("Dame la descripcion del articulo 2");
            precio = Double.parseDouble(JOptionPane.showInputDialog("Dame el precio del articulo 2"));

            Articulo objeto2 = new Articulo(clave, desc, precio);

            double precio1 = objeto1.getPrecio();
            double precio2 = objeto2.getPrecio();
            double totalPagar = precio1+precio2;
            JOptionPane.showMessageDialog(null, "El total a pagar es: "+totalPagar);
            if(precio1 > precio2)
                JOptionPane.showMessageDialog(null, "Articulo mas caro.\nClave: "+objeto1.getClave()+"\nDescripción: "+objeto1.getDescripcion());
            else if(precio2 > precio1)
                JOptionPane.showMessageDialog(null, "Articulo mas caro.\nClave: "+objeto2.getClave()+"\nDescripción: "+objeto2.getDescripcion());
            else
                JOptionPane.showMessageDialog(null, "Los articulos son del mismo precio.");

            JOptionPane.showMessageDialog(null, "Articulo 1\n"+objeto1.toString()+"\nArticulo2\n"+objeto2.toString());
            JOptionPane.showMessageDialog(null, objeto1.equals(objeto2)?"LOS ARTICULOS SON IGUALES":"ARTICULOS DIFERENTES");
        
            continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Continuar", JOptionPane.YES_NO_OPTION);
        }
    }
}
