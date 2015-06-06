package unidad3.examen;

/**
 *
 * @author Padilla Bernal
 */
public class Empleado {
    protected String nombre;
    protected String cedula;
    protected int edad;
    protected boolean casado;
    protected double salario;
    
    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario)
    {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public String clasificar()
    {
        if(edad <= 21)
            return "Principiante";
        else if(edad >= 22 && edad <= 35)
            return "Intermedio";
        else if(edad > 35)
            return "Senior";
        
        return "Error";
    }
    
    public double getSalario()
    {
        return this.salario;
    }
    
    public void aumentarSalario(double aumento)
    {
        this.salario += aumento;
    }
    
    public String toString()
    {
        return "Nombre: "+this.nombre+", Cédula: "+this.cedula+".\n Edad: "+this.edad+", Casado: "+this.casado+", Salario: "+this.salario;
    }
}
