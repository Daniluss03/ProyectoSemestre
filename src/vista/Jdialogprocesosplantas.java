/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;

/**
 *
 * @author danilus
 */
 public class Jdialogprocesosplantas extends JDialog {
    
      public JButton procesosplantas;
      public JButton procesosanimales;
      public JButton procesospeces;
      
    public  Jdialogprocesosplantas(){
        
        
        
         procesosplantas = new JButton("PLANTAS");
        procesosplantas.setFont(new Font("Arial", BOLD, 25));
        procesosplantas.setBounds(20,30,340,65);
        add(procesosplantas);
        procesosplantas.setActionCommand("plantas");
        procesosplantas.setBackground(Color.WHITE);
        setLayout(null);
        
         procesosanimales = new JButton("ANIMALES(VACAS)");
        procesosanimales.setFont(new Font("Arial", BOLD, 25));
        procesosanimales.setBounds(20,100,340,65);
        add(procesosanimales);
        procesosanimales.setActionCommand("animales");
        procesosanimales.setBackground(Color.WHITE);
        setLayout(null);
        
        
         procesospeces = new JButton("PECES");
        procesospeces.setFont(new Font("Arial", BOLD, 25));
        procesospeces.setBounds(20,170,340,65);
        add(procesospeces);
        procesospeces.setActionCommand("peces");
        procesospeces.setBackground(Color.WHITE);
        setLayout(null);
       //Caracteristicas de la ventana
        setTitle("PROCESOS");
        setSize(400,300);
        setLocationRelativeTo(null);
        setResizable(false);
        this.getContentPane().  setBackground(Color.BLUE);
        setVisible(true);
    }
     public void escucharlosbotonesssproocesos(ActionListener hellomototo)
    {
        procesosplantas.addActionListener(hellomototo);
      
    }
    
    
}
