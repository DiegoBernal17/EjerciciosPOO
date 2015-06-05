package unidad1.esdeco;
import javax.swing.JOptionPane;

public class EstructuraDeControl 
{
    public static void main(String[] args)
    {
        char op=0;
        while(op != '7')
        {
            EstructuraDeControl accion = new EstructuraDeControl();
            Object[] options = 
            { 
                "1.- Calcular Factorial de un numero",
                "2.- Sumar serie de numeros hasta introducir 0",
                "3.- Imprimir la tabla de multiplicar de un numero",
                "4.- Calcular la suma de N numeros",
                "5.- Imprimir los divisores de un numero",
                "6.- Validar edad",
                "7.- Salir"
            };

            Object opcion = JOptionPane.showInputDialog(null,
                 "Escoje una opción", "Seleccionar acción",
                 JOptionPane.INFORMATION_MESSAGE, null,
                 options, options[0]);
            op = opcion.toString().charAt(0);
 
            switch(op)
            {
                case '1': accion.calcularFactorial();
                    break;
                case '2': accion.sumaSerie();
                    break;
                case '3': accion.imprimirTabla();
                    break;
                case '4': accion.calcularSuma();
                    break;
                case '5': accion.imprimirDivisores();
                    break;
                case '6': accion.validarEdad();
                    break;
            }
        }
    }
    
    public void calcularFactorial()
    {
        int num, fact = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame un número:"));
	for(int i=1; i<=num;i++)
	{
            fact = fact*i;
	}
	JOptionPane.showMessageDialog(null, "El  factorial de "+num+" es: "+fact);
    }
    
    public void sumaSerie()
    {
        int num, suma = 0;
        do
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame un número: (se sumara hasta introducir 0)"));
            suma += num;
        }
        while(num != 0);
        JOptionPane.showMessageDialog(null, "La suma de los números es: "+suma);
    }
    
    public void imprimirTabla()
    {
        int num, result, multiplicar = 1;
        String message = "", aux;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame un número:"));
        
        while(multiplicar <= 10)
        {
            result = num*multiplicar;
            aux = num+"x"+multiplicar+" = "+result;
            
            message = message+aux+"\n";
            multiplicar++;
        }
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void calcularSuma()
    {
        int contnum;
        double num, suma=0;
        contnum = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números se van a sumar?"));
        for(int i=0; i<contnum;i++)
        {
          num = Double.parseDouble(JOptionPane.showInputDialog("Dame el número "+(i+1)+":"));
          suma += num;
        }
        JOptionPane.showMessageDialog(null, "La suma de los números es:"+suma);
    }
    
    public void imprimirDivisores()
    {
        int num, cont = 1;
        String divisor = "";
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame un número:"));
        while(cont <= num)
        {
            if(cont == 1)
                divisor = divisor+cont;
            else {
                if(num%cont == 0)
                    divisor = divisor+", "+cont;
            }
            cont++;
        }
        JOptionPane.showMessageDialog(null, "Divisores de "+num+": "+divisor);
    }
    
    public void validarEdad()
    {
        int num;
        do
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame la edad:"));
            if(num <=0 || num > 110)
                JOptionPane.showMessageDialog(null, "La edad de "+num+" años NO es valida. Intentalo otra vez");
        }
        while(num <= 0 || num > 110);
        JOptionPane.showMessageDialog(null, "La edad de "+num+" años es valida");
    }
}
