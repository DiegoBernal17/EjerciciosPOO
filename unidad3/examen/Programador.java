package unidad3.examen;

/**
 *
 * @author Padilla Bernal
 */
public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int ldcph, String lenguajeDom)
    {
        super(nombre, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = ldcph;
        this.lenguajeDominante = lenguajeDom;
    }
    
    public String toString()
    {
        return super.toString()+". Lineas de codigo por hora: "+this.lineasDeCodigoPorHora+", Lenguaje dominante: "+this.lenguajeDominante;
    }
}
