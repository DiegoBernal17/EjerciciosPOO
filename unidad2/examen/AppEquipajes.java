package unidad2.examen;

import javax.swing.JOptionPane;

/**
 *
 * @author Bernal
 */
public class AppEquipajes {
    public static void main(String[] args)
    {
        int registrados = 0;
        char op = '0';
        String owner, from, to, firm;
        // Maximo de equipajes: 40
        Equipaje[] equipajes = new Equipaje[40];
        
        Object[] options = 
        { 
            "1.- Registrar un equipaje",
            "2.- Mostrar todos los equipajes registrados",
            "3.- Listar los equipajes con un destino específico",
            "4.- Listar los equipajes transportados por una compañia",
            "5.- Listar los equipajes de un cliente",
            "6.- Salir"
        };
        
        Object[] places = { "Saltillo", "Parras", "Monterrey", "Guadalajara", "D.F.", "Estado de Mexico", "Morelia", "Hidalgo", "Puerto Vallarta", "Cuernavaca", "Tlaxcala" };
        Object[] companies = { "FedEx", "Castores", "DHL Express", "UPS", "Estafeta", "Multipak" };
        
        while(op != '6')
        {
            String message = "";
            Object option = JOptionPane.showInputDialog(null, "Equipajes registrados: "+registrados+"\n\nEscoje una opción:", "Seleccionar acción", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            op = option.toString().charAt(0);
            switch(op)
            {
                case '1':
                    int registrar;
                    for(int i=registrados; i<equipajes.length;i++)
                    {
                        owner = JOptionPane.showInputDialog("Dame el dueño del equipaje");

                        Object fromOb = JOptionPane.showInputDialog(null, "Escoje el punto de embarque", "Selecciona el embarque", JOptionPane.INFORMATION_MESSAGE, null, places, places[0]);
                        from = fromOb.toString();
                        Object toOb = JOptionPane.showInputDialog(null, "Escoje el destino del equipaje", "Selecciona el destino", JOptionPane.INFORMATION_MESSAGE, null, places, places[0]);
                        to = toOb.toString();

                        Object firmOb = JOptionPane.showInputDialog(null, "Empresa responsable de su transportación", "Empresa responsable", JOptionPane.INFORMATION_MESSAGE, null, companies, companies[0]);
                        firm = firmOb.toString();

                        equipajes[i] = new Equipaje(owner, from, to, firm);
                        registrados++;

                        registrar = JOptionPane.showConfirmDialog(null, "¿Registrar otro equipaje?\n"+(equipajes.length-registrados)+" registros sobrantes", "Nuevo Equipaje", JOptionPane.YES_NO_OPTION);
                        if(registrar == JOptionPane.NO_OPTION)
                            break;
                    }
                break;
                case '2':
                    for(int i=0; i<registrados; i++) 
                    {
                        message += (i+1)+".- "+equipajes[i].toString();
                    }
                    JOptionPane.showMessageDialog(null, "Equipajes registrados:\n"+message);
                break;
                case '3':
                    Object toOb = JOptionPane.showInputDialog(null, "Escoje el lugar de destino para mostrar los equipajes:", "Listar equipajes", JOptionPane.INFORMATION_MESSAGE, null, places, places[0]);
                    to = toOb.toString();
                    for(int i=0; i<registrados; i++)
                    {
                        if(equipajes[i].getTo().equals(to))
                            message += (i+1)+".- "+equipajes[i].toString();
                    }
                    JOptionPane.showMessageDialog(null, "Equipajes con destino a "+to+":\n"+message);
                break;
                case '4':
                    Object firmOb = JOptionPane.showInputDialog(null, "Escoje la compañia para mostrar los equipajes que enviara:", "Listar equipajes", JOptionPane.INFORMATION_MESSAGE, null, companies, companies[0]);
                    firm = firmOb.toString();
                    for(int i=0; i<registrados; i++)
                    {
                        if(equipajes[i].getFirm().equals(firm))
                            message += (i+1)+".- "+equipajes[i].toString();
                    }
                    JOptionPane.showMessageDialog(null, "Equipajes con destino a "+firm+":\n"+message);
                break;
                case '5':
                    owner = JOptionPane.showInputDialog("Ingrea el nombre del cliente para encontrar su equipaje o sus equipajes");
                    for(int i=0; i<registrados; i++)
                    {
                        if(equipajes[i].getOwner().equals(owner))
                            message += (i+1)+".- "+equipajes[i].toString();
                    }
                    if("".equals(message))
                        JOptionPane.showMessageDialog(null, "Dueño no registrado. Vuelve a intentarlo con otro nombre.");
                    else
                        JOptionPane.showMessageDialog(null, "Equipajes del dueño "+owner+":\n"+message);
                break;
                case '6':
                    JOptionPane.showMessageDialog(null, "Gracias por usar este programa. Saliendo...");
                break;
            }
        }
    }
}
