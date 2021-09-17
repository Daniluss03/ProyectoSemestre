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
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author danilus
 */
 public class PanelEntradaDatos extends JPanel{
    
       //Atributos
    //----------------------
    public JButton ingresardatos;
    
    
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
    setBackground(Color.ORANGE);
 
      ingresardatos = new JButton("INGRESE LOS DATOS");
        ingresardatos.setFont(new Font("Arial", BOLD, 25));
        ingresardatos.setBounds(10,30,360,65);
        add(ingresardatos);
        ingresardatos.setActionCommand("ingresardatos");
        ingresardatos.setBackground(Color.WHITE);
    
       

        //Borde y titulo del panel
      TitledBorder borde = BorderFactory.createTitledBorder("INGRESE SUS DATOS ");
      borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }
 
     public void escucharlosbotones(ActionListener hello)
    {
        ingresardatos.addActionListener(hello);
      
      
    }

   

 
    
}
