package unidad5.examen;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Bernal
 */
public class JuegoAdivinaNumero {
    public static void main(String[] args)
    {
        Random r = new Random();
        final int numAdivinar = r.nextInt(100)+1;
        int numIntentos = 0;
        int numInsertado = 0;
        boolean error;
        
        // System.out.println(numAdivinar);
        do
        {
            do
            {
                try
                {
                    numInsertado = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero.\n Dame un numero entre el 1 y 100 e intenta acertar."));
                    error=false;
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "No haz intrucido un número: "+e.getMessage()+"\nHaz perdido un intento.");
                    error=true;
                }
                numIntentos++;
            }
            while(error);
            if(numInsertado < numAdivinar)
                JOptionPane.showMessageDialog(null, "El número a adivinar es MAYOR al introducido.");
            else if(numInsertado > numAdivinar)
                JOptionPane.showMessageDialog(null, "El número a adivinar es MENOR al introducido.");
        }
        while(numAdivinar != numInsertado);
        
        JOptionPane.showMessageDialog(null, "¡Haz adivinado el número!\nNumero: "+numAdivinar+"\nIntentos realizados: "+numIntentos);
    }
}
