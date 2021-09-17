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
public  class PanelOperaciones extends JPanel{
    public JButton ingresardatosanimalesvacunasetc;
    
    public PanelOperaciones(){
       
        setLayout(null);
    setBackground(Color.RED);
 
      ingresardatosanimalesvacunasetc = new JButton("SOLICITUD");
        ingresardatosanimalesvacunasetc.setFont(new Font("Arial", BOLD, 25));
        ingresardatosanimalesvacunasetc.setBounds(20,30,340,65);
        add(ingresardatosanimalesvacunasetc);
        ingresardatosanimalesvacunasetc.setActionCommand("SOLICITUD");
        ingresardatosanimalesvacunasetc.setBackground(Color.WHITE);
    
   
         //adicionar  marco con titulo al panel
         TitledBorder borde=BorderFactory.createTitledBorder("  TU SOLICITUD");
         borde.setTitleColor(Color.BLACK);
         setBorder(borde);
         
}
    
     public void escucharlosbotoness(ActionListener hellomoto)
    {
        ingresardatosanimalesvacunasetc.addActionListener(hellomoto);
      
    }
      public void activarBotones()
    {
        ingresardatosanimalesvacunasetc.setEnabled(true);
       
      
    }
}
