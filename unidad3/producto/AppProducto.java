package unidad3.producto;

import javax.swing.JOptionPane;

/**
 *
 * @author Padilla Bernal
 */
public class AppProductos {
    public static void main(String[] args)
    {
        String clave, desc;
        double precio;
        Object talla, sabor;
        int prods;
        Object[] prodDisp = { "Ropa", "Refresco" };
        
        prods = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos a registrar"));
        Producto[] productos = new Producto[prods];
        
        for(int i=0; i<productos.length; i++)
        {
            Object produc = JOptionPane.showInputDialog(null, "Selecciona un producto a registrar", "Selección del producto", JOptionPane.INFORMATION_MESSAGE, null, prodDisp, prodDisp[0]);
            
            clave = JOptionPane.showInputDialog("Dame la clave del producto "+(i+1));
            desc = JOptionPane.showInputDialog("Dame la descripción del producto "+(i+1));
            precio = Double.parseDouble(JOptionPane.showInputDialog("Dame el precio del producto "+(i+1)));
            if(produc.equals("Ropa"))
            {
                Object[] tallas = { "Extra chica", "Chica", "Mediana", "Grande", "Extra grande" };
                talla = JOptionPane.showInputDialog(null, "Talla de la prenda a registrar", "Selecciona la talla", JOptionPane.INFORMATION_MESSAGE, null, tallas, tallas[0]);
                productos[i] = new Ropa(clave, desc, precio, talla.toString());
            }
            else if(produc.equals("Refresco"))
            {
                Object[] sabores = { "Cola", "Fresa", "Manzana", "Naranja", "Toronja", "Uva" };
                sabor = JOptionPane.showInputDialog(null, "Sabor del refresco a registrar", "Selecciona el sabor", JOptionPane.INFORMATION_MESSAGE, null, sabores, sabores[0]);
                productos[i] = new Refresco(clave, desc, precio, sabor.toString());
            }
        }
        
        int cont = 1;
        String mostrar = "";
        for(Producto listarProds: productos)
        {
            mostrar += "Producto "+cont+": "+listarProds.toString();
            cont++;
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
}
