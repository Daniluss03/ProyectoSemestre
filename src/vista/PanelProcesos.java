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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author danilus
 */
public class PanelProcesos extends JPanel{
     public JButton procesos;
    
    public PanelProcesos(){
       
        setLayout(null);
    setBackground(Color.green);
 
        procesos = new JButton("PROCESOS ");
        procesos.setFont(new Font("Arial", BOLD, 25));
        procesos.setBounds(20,30,340,65);
        add(procesos);
        procesos.setActionCommand("procesos");
        procesos.setBackground(Color.WHITE);
    
   
         //adicionar  marco con titulo al panel
         TitledBorder borde=BorderFactory.createTitledBorder("  TU SOLICITUD");
         borde.setTitleColor(Color.BLACK);
         setBorder(borde);
         
}
    
     public void escucharlosbotonesss(ActionListener hellomoto)
    {
        procesos.addActionListener(hellomoto);
      
    }
      public void activarBotones()
    {
        procesos.setEnabled(true);
       
      
    }
    
    
}
