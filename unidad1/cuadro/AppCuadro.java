package unidad1.cuadro;
import javax.swing.JOptionPane;

public class AppCuadro {

	public static void main(String[] args) {
		int continuar = JOptionPane.YES_OPTION;
		
		while(continuar != JOptionPane.NO_OPTION)
		{
			double lado;
			
			// pedir lado para el cuadrado 1
			lado = Double.parseDouble(JOptionPane.showInputDialog("Dame el lado del primer cuadrado"));
			Cuadro cuad1 = new Cuadro(lado);
			
			// Pedir lado para el cuadrado 2
			lado = Double.parseDouble(JOptionPane.showInputDialog("Dame el lado del segundo cuadrado"));
			Cuadro cuad2 = new Cuadro(lado);
			
			// Pedir lado para el cuadrado 3
			lado = Double.parseDouble(JOptionPane.showInputDialog("Dame el lado del tercer cuadrado"));
			Cuadro cuad3 = new Cuadro(lado);
			
                        double nuevaArea;
                        String accion;
			// Guardar areas de los cuadrados en variables
			double area1, area2, area3;
			area1 = cuad1.calcularArea();
			area2 = cuad2.calcularArea();
			area3 = cuad3.calcularArea();
                        
			if(area1 >= area2 && area1 >= area3)
                        {
                            // Si el cuadro 2 y 3 son iguales
                            if(cuad2.equals(cuad3)) 
                            {
                                accion = "Cuadrado 2 y 3 iguales, se restan al 1";
                                nuevaArea = area1-(area2+area3);
                            }
                            else 
                            {
                                // Si el area del cuadro 2 es mayor
                                if(area2 > area3)
                                {
                                    accion = "El area del cuadro 2 es mayor y se resta al 1";
                                    nuevaArea = area1-area2;	
                                }
                                // Si el area del cuadro 3 es mayor
                                else
                                {
                                    accion = "El area del cuadro 3 es mayor y se resta al 1";
                                    nuevaArea = area1-area3;
                                }
                            }
                            JOptionPane.showMessageDialog(null, "Area cuadrado 1: "+area1+"\nArea cuadrado 2: "+area2+"\nArea cuadrado 3: "+area3+"\n\n"+accion+"\nArea cuadro 1 restada:  "+nuevaArea);
                            // Confirmar salida
                            continuar = JOptionPane.showConfirmDialog(null, "¿Deseas CONTINUAR?", "Seguir", JOptionPane.YES_NO_OPTION);
                        }
                        else
                            JOptionPane.showMessageDialog(null, "El lado del cuadro 1 debe ser mayor. Vuelve a intentarlo.");
		}
	}

}
