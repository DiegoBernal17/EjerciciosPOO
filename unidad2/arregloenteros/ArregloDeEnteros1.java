package unidad2.arregloenteros;
import javax.swing.JOptionPane;

public class ArregloDeEnteros1 {
    
    public ArregloDeEnteros1()
    {
        
    }
    
    public int poblarArreglo(int[] arr)
    {
        int count = 0, num;
        for(int i=0; i<arr.length; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor "+(i+1)+". Ingresa -1 para terminar captura"));
            if(num == -1)
               break;
            
            arr[i] = num;
            count++;
        }
        
        return count;
    }
    
    public int sumarEnteros(int[] arr, int n)
    {
        int aux=0;
        for(int i=0; i<n; i++)
        {
            aux += arr[i];
        }
        return aux;
    }
    
    public int maximo(int[] arr, int n)
    {
        int mayor = arr[0];
        for(int i=0; i<n; i++)
        {
            if(arr[i] > mayor)
                mayor = arr[i];
        }
        return mayor;
    }
    
    public static void main(String[] args)
    {
        final int TAM = 28;
        int[] arrEnteros = new int[TAM];
        ArregloDeEnteros1 arreglo = new ArregloDeEnteros1();
        int n = arreglo.poblarArreglo(arrEnteros);
        JOptionPane.showMessageDialog(null, "Suma de los numeros ingresados: " + arreglo.sumarEnteros(arrEnteros, n));
        JOptionPane.showMessageDialog(null, "Numero mayor ingresado: " + arreglo.maximo(arrEnteros, n));
    }
}
