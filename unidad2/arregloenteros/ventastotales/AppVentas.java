package unidad2.ventastotales;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Diego Bernal
 */
public class AppVentas {
    public static void main(String[] args)
    {
        int[][] ventas = new int[6][5];
        String mensaje = "";
        
        Random num = new Random();
        
        // Ciclo solo para rellenar arreglo con datos aleatorios.
        for(int vendedores=0; vendedores < ventas.length; vendedores++)
        {   
            if(vendedores < ventas.length-1)
            {
                for(int productos=0; productos<ventas[vendedores].length; productos++)
                {
                    if(productos < ventas[vendedores].length-1)
                    {
                        ventas[vendedores][productos] = num.nextInt(31);
                        ventas[vendedores][ventas[vendedores].length-1] += ventas[vendedores][productos];
                    }
                    if(vendedores < ventas.length-1)
                    {
                        ventas[ventas.length-1][productos] += ventas[vendedores][productos];
                    }
                }
            }
        }
        
        //  Este ciclo anidado alinea todo el mensaje; Para tenerlo con mejor presentación.
        String aux;
        mensaje += "Vendedores\n 1 - 2 - 3 - 4 \n";
        mensaje += "___________\n";
        for(int vend=0; vend<ventas.length; vend++)
        {
            if(vend == ventas.length-1)
                mensaje+= "__  __  __  __       __\n";
            for(int prod=0; prod<ventas[vend].length; prod++)
            {
                if(prod == ventas[vend].length-1)
                    mensaje += "  | ";
                
                if(ventas[vend][prod]<10)
                    aux = 0+""+ventas[vend][prod];
                else
                    aux = ventas[vend][prod]+"";
                
                mensaje += aux+"  ";
            }
            mensaje += "\n";
        }
        
        // Para mostrar el vendedor que logro más ventas.
        mensaje += "\n";
        mensaje += AppVentas.calcularMejorVendedor(ventas);
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static String calcularMejorVendedor(int[][] ventas)
    {
        int vendedor = 0;
        for(int i=1; i<3; i++)
        {
            if(ventas[5][vendedor] < ventas[5][i])
                vendedor = i;
        }
        return "Vendedor "+(vendedor+1)+" con el mayor monto de ventas\nCantidad recaudada: $"+ventas[5][vendedor];
    }
}
