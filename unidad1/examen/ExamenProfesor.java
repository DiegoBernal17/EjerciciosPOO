package unidad1.examen;
import javax.swing.JOptionPane;

public class ExamenProfesor {
    
    public static void main(String[] args)
    {
        String input, nombre;
        int antiguedad;
        double salario;
        nombre = JOptionPane.showInputDialog("Dame el nombre del primer profesor");
        input = JOptionPane.showInputDialog("Dame la antiguedad del primer profesor");
        antiguedad = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Dame el salario del primer profesor");
        salario = Double.parseDouble(input);
        
        Profesor pfsor1 = new Profesor(nombre, antiguedad, salario);
        
        nombre = JOptionPane.showInputDialog("Dame el nombre del segundo profesor");
        input = JOptionPane.showInputDialog("Dame la antiguedad del segundo profesor");
        antiguedad = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Dame el salario del segundo profesor");
        salario = Double.parseDouble(input);
        
        Profesor pfsor2 = new Profesor(nombre, antiguedad, salario);
        
        nombre = JOptionPane.showInputDialog("Dame el nombre del tercer profesor");
        input = JOptionPane.showInputDialog("Dame la antiguedad del tercer profesor");
        antiguedad = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Dame el salario del tercer profesor");
        salario = Double.parseDouble(input);
        
        Profesor pfsor3 = new Profesor(nombre, antiguedad, salario);
        
        JOptionPane.showMessageDialog(null, "Profesor 1:\n"+pfsor1.toString()+"Profesor 2:\n"+pfsor2.toString()+"Profesor 3:\n"+pfsor3.toString());
        JOptionPane.showMessageDialog(null, "Suma de los salarios: "+(pfsor1.getSalario()+pfsor2.getSalario()+pfsor3.getSalario()));
        
        int antiguedad1 = pfsor1.getAntiguedad();
        int antiguedad2 = pfsor2.getAntiguedad();
        int antiguedad3 = pfsor3.getAntiguedad();
        
        if(antiguedad1 > antiguedad2 && antiguedad1 > antiguedad3)
        {
            JOptionPane.showMessageDialog(null, "Profesor con más antiguedad:\n"+pfsor1.getNombre());
        } 
        else if(antiguedad2 > antiguedad1 && antiguedad2 > antiguedad3)
        {
            JOptionPane.showMessageDialog(null, "Profesor con más antiguedad:\n"+pfsor2.getNombre());
        }
        else if(antiguedad3 > antiguedad2 && antiguedad3 > antiguedad1)
        {
            JOptionPane.showMessageDialog(null, "Profesor con más antiguedad:\n"+pfsor3.getNombre());
        }
        else
            JOptionPane.showMessageDialog(null, "Hay varios profesores con la misma antiguedad");
        
        String profesores = "";
        if(antiguedad1 < 2)
           profesores += pfsor1.getNombre()+"\n";
        if(antiguedad2 < 2)
           profesores += pfsor2.getNombre()+"\n";
        if(antiguedad3 < 2)
           profesores += pfsor3.getNombre()+"\n";
        
        JOptionPane.showMessageDialog(null, "Profesores con antiguedad menor a 2:\n"+profesores);
    }
}
