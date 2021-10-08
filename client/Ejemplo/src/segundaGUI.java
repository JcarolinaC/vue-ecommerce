import javax.swing.*;
import java.awt.*;

public class segundaGUI {
    public static void main(String args[]) {
        // Creando el Marco
        JFrame frame = new JFrame("Chat Frame"); //este es para poner el nombre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //este es para poner el nombre de las opciones
        frame.setSize(400, 400);//este es el tamañode la ventana
        // Creando MenuBar y agregando componentes
        JMenuBar mb = new JMenuBar(); //es elespacio gris claro de las ventanas
        JMenu m1 = new JMenu("ARCHIVO"); //este es el nombre del objeto
        JMenu m2 = new JMenu("Ayuda");
        JMenu m3 = new JMenu("Ver"); 
        JMenu m4 = new JMenu("Ventana");
        mb.add(m1); //este adiciona al menu bar 
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        JMenuItem m11 = new JMenuItem("Abrir");
        JMenuItem m12 = new JMenuItem("Guardar como");
        JMenuItem m33 = new JMenuItem("archivo");
        JMenuItem m44 = new JMenuItem("nueva");
        m1.add(m11);
        m1.add(m12);
        m3.add(m33);
        m4.add(m44);
        // Creando el panel en la parte inferior
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Introducir texto");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Enviar");
        JButton reset = new JButton("Restablecer");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
// Área de texto en el centro
        JTextArea ta = new JTextArea();
        // Agregar componentes al marco.
        frame.getContentPane().add(BorderLayout.SOUTH, panel); //sur es abajo el panel
        frame.getContentPane().add(BorderLayout.NORTH, mb); //mb es el menu bar
        frame.getContentPane().add(BorderLayout.CENTER, ta);// en el ta : es el texto
        frame.setVisible(true);
    }
}