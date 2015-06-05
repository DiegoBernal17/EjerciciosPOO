package unidad1.examen;

public class Profesor {
    private String nombre;
    private int antiguedad;
    private double salario;
    
    public Profesor(String n, int a, double s)
    {
        nombre = n;
        antiguedad = a;
        salario = s;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + ", Antiguedad = " + antiguedad + " años, Salario = $" + salario + "\n";
    }
    
}
