package unidad2.arregloobjetos;
import java.awt.Button;
import javax.swing.JOptionPane;

/**
 *
 * @author Bernal
 */
public class Botones {
    
    public static void main(String[] args)
    {
        String val;
        val = JOptionPane.showInputDialog("Dame el numero de botones");
        int tam = Integer.parseInt(val);
        Button[] buttons = new Button[tam];
        
        for(int i=0; i<buttons.length; i++)
        {
            val = JOptionPane.showInputDialog("Nombre del boton "+(i+1));
            buttons[i] = new Button(val);
        }
        
        String message = "";
        String mayor = "";
        int myr = 0;
        int menor = 99999;
        
        for (Button button : buttons) 
        {
            String name = button.getLabel();
            int tamBtn = name.length();
            message += "Nombre: "+name+". Tamaño: "+tamBtn+"\n";
            if(tamBtn > myr)
            {
                myr = tamBtn;
                mayor = name;
            }
            else if(tamBtn == myr)
                mayor += " "+name;
            
            if(tamBtn < menor)
                menor = tamBtn;
        }
        JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, "Mayor tamaño: "+myr+". Nombre(s): "+mayor);
        
        message = "";
        for (Button button : buttons) 
        {
            String name = button.getLabel();
            int tamBtn = name.length();
            if(tamBtn != menor)
                message += "Nombre: "+name+". Tamaño: "+tamBtn+"\n";
        }
        JOptionPane.showMessageDialog(null, message+"\nBoton con etiqueta mas corta eliminada.\nTamaño menor: "+menor);
    }
}
