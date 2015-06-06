package unidad2.procesararreglos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Bernal
 */
public class ProcesarArreglos2 {
    
    private double[] arreglo;
    
    public ProcesarArreglos2(int tam)
    {
        arreglo = new double[tam];
        this.iniciarArreglo();
    }
    
    public double obtenerMayor()
    {
        double mayor = arreglo[0];
        for(int i=0; i<arreglo.length; i++)
        {
            if(arreglo[i] > mayor)
                mayor = arreglo[i];
        }
        return mayor;
    }
    
    public void iniciarArreglo()
    {
        for(int i=0; i<arreglo.length; i++)
        {
            arreglo[i] = i*1.5;
        }
    }
    
    public double promediar()
    {
        double suma = 0;
        for(int i=0; i<arreglo.length; i++)
        {
            suma += arreglo[i];
        }
        
        return suma/arreglo.length;
    }
    
    public boolean compararArreglos(double[] arr)
    {
        return Arrays.equals(arreglo, arr);
    }
    
    public static void main(String[] args)
    {
        ProcesarArreglos2 obj = new ProcesarArreglos2(6);
        double[] otroArreglo = {1.5, 2.5, 3.5, 4.5, 5.5, 6.6};
        
        JOptionPane.showMessageDialog(null, "El promedio de los elementos del arreglo es: " + obj.promediar());
        JOptionPane.showMessageDialog(null, "El mayor de los elementos del arreglo es: " + obj.obtenerMayor());
        JOptionPane.showMessageDialog(null, "Los arreglos son: " + (obj.compararArreglos(otroArreglo)?"IGUALES":"DIFERENTES"));
        
        double[] unTercerArreglo = {0.0, 1.5, 3.0, 4.5, 6.0, 7.5};
        JOptionPane.showMessageDialog(null, "Los arreglos son: " + (obj.compararArreglos(unTercerArreglo)?"IGUALES":"DIFERENTES"));
    }
}
