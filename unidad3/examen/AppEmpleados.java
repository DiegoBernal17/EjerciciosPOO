package unidad3.examen;
import javax.swing.JOptionPane;

/**
 *
 * @author Padilla Be
 * 
 * rnal
 */
public class AppEmpleados {
    public static void main(String[] args)
    {
        String nombre;
        String cedula;
        int edad = 0;
        boolean casado;
        double salario = 0.0;
        int lineasPorHora;
        String lenguaje;
        int addNew = JOptionPane.YES_OPTION;
        int programador;
        Empleado[] empleados = new Empleado[30];
        boolean verificar;
        
        for(int i=1;addNew == JOptionPane.YES_OPTION; i++)
        {
            nombre = JOptionPane.showInputDialog("Dame el NOMBRE y APELLIDO del nuevo empleado "+i);
            cedula = JOptionPane.showInputDialog("Dame la CÉDULA del nuevo empleado "+i);
            
            verificar = true;
            while(verificar)
            {
                try
                {
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Dame la EDAD del nuevo empleado "+1));
                        
                    if(edad < 18 || edad > 45)
                        JOptionPane.showMessageDialog(null, "Debe ser tener minimo 18 años y maximo 45 para registrarlo.");
                    else
                        verificar = false;
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "La edad no es valida. Vuelve a intentarlo");
                }
            }
            
            int csd = JOptionPane.showConfirmDialog(null, "¿Es casado el nuevo empleado "+i+"?", "Relacion sentimental", JOptionPane.YES_NO_OPTION);
            casado = (csd == JOptionPane.YES_OPTION);
            
            verificar = true;
            while(verificar)
            {
                try
                {
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Dame el SALARIO del nuevo empleado "+i));
                    verificar = false;
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Salario no valido. Vuelve a intentarlo");
                }
            }
            
            
            programador = JOptionPane.showConfirmDialog(null, "¿El empleado es programador?", "Programador", JOptionPane.YES_NO_OPTION);
            if(programador == JOptionPane.YES_OPTION)
            {
                lineasPorHora = Integer.parseInt(JOptionPane.showInputDialog("Dame las líneas de código por hora del empleado ."));
                lenguaje = JOptionPane.showInputDialog("Dame el lenguaje dominante del empleado");
                
                empleados[i-1] = new Programador(nombre, cedula, edad, casado, salario, lineasPorHora, lenguaje);
            }
            else
                empleados[i-1] = new Empleado(nombre, cedula, edad, casado, salario);
                
            addNew = JOptionPane.showConfirmDialog(null, "¿Deseas agregar un nuevo empleado?\n Restan "+(empleados.length-i)+" vacantes más", "Nuevo empleado", JOptionPane.YES_NO_OPTION);
        }
        
        String message = "Empleados contratados:\n";
        for(Empleado emps : empleados)
        {
            if(emps != null)
                message += "- "+emps.toString() +". Es "+ emps.clasificar()+"\n";
        }
        JOptionPane.showMessageDialog(null, message);
        
        message = "Empleados con aumento salarial del 20%\n";
        for(Empleado emps : empleados)
        {
            if(emps != null)
            {
                double aumento = emps.getSalario()*.80;
                emps.aumentarSalario(aumento);
                message += emps.toString() +". Es " + emps.clasificar()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
