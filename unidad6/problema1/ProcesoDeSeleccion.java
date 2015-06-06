package unidad6.problema1;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

/**
 * ProblemaDeArchivos_1.pdf;
 *
 * @author Sala General
 */
public class ProcesoDeSeleccion {

    private int totalCandidatos;
    
    public void registrarCandiatos() 
    {
        String nombre, apellido;
        double notap1, notap2;

        FileWriter archivo = null;
        PrintWriter pw = null;

        try {
            totalCandidatos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos son los candidatos a registrar?"));
            archivo = new FileWriter("Candidatos.txt");
            pw = new PrintWriter(archivo);

            for (int veces = 0; veces < totalCandidatos; veces++) {
                nombre = JOptionPane.showInputDialog("Dame el nombre del candidato " + (veces+1));
                apellido = JOptionPane.showInputDialog("Dame el apellido del candidato " + (veces+1));

                do {
                    notap1 = Double.parseDouble(JOptionPane.showInputDialog("Dame la nota del parcial 1 del candidato " + (veces+1)));
                } while (notap1 < 0 || notap1 > 100);
                do {
                    notap2 = Double.parseDouble(JOptionPane.showInputDialog("Dame la nota del parcial 2 del candidato " + (veces+1)));
                } while (notap1 < 0 || notap1 > 100);

                pw.println(nombre + "," + apellido + "," + notap1 + "," + notap2);
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid entry. Ingresa números.");
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        } finally {
            try {
                if (null != archivo) {
                    archivo.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void verCandidatos() 
    {
        FileWriter archivo = null;
        PrintWriter pw = null;
        String nombre, apellido;
        double notap1, notap2, prom;

        File f = new File("Candidatos.txt");
        Scanner s;

        try {
            s = new Scanner(f);
            archivo = new FileWriter("Seleccionados.txt");
            pw = new PrintWriter(archivo);

            while (s.hasNextLine()) {
                String linea = s.nextLine();
                Scanner sl = new Scanner(linea);
                sl.useDelimiter("\\s*,\\s*");
                nombre = sl.next();
                apellido = sl.next();
                notap1 = sl.nextDouble();
                notap2 = sl.nextDouble();
                
                prom = (notap1 + notap2)/2;
                if (prom > 60) {
                    pw.println(nombre + "," + apellido + "," + prom);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != archivo) {
                    archivo.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void mostrarSeleccionados()
    {
        File f = new File("Seleccionados.txt");
        Scanner s;
        int count= 0;
        
        try {
            s = new Scanner(f);

            while (s.hasNextLine()) {
                String linea = s.nextLine();
                Scanner sl = new Scanner(linea);
                System.out.println(sl.next());
                count++; // Candidatos seleccionaods
            }
            JOptionPane.showMessageDialog(null, "Seleccionados "+count+" candidatos de "+totalCandidatos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int newF;
        newF = JOptionPane.showConfirmDialog(null, "¿Deseas usar un archivo de Candidatos existente?", "Existente", JOptionPane.YES_NO_OPTION);

        ProcesoDeSeleccion pds = new ProcesoDeSeleccion();

        if (newF == JOptionPane.NO_OPTION) {
            pds.registrarCandiatos();
        }
        pds.verCandidatos();
        pds.mostrarSeleccionados();
    }
}
