/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.JDialog;

/**
 *
 * @author danilus
 */
 public class jdialogderivadosprocesosplantas  extends JDialog{
    
    
    public jdialogderivadosprocesosplantas(){
         setLayout(null);
      
        
     //Caracteristicas de la ventana
        setTitle("PROCESOS");
        setSize(400,300);
        setLocationRelativeTo(null);
        setResizable(false);
        this.getContentPane().  setBackground(Color.BLUE);
        setVisible(true);
    }
}
