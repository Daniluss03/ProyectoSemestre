/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import javax.swing.JTextField;
/**
 *
 * @author danilus
 */
public class jdialogtusolicitud extends JDialog{
      javax.swing.JComboBox<String> combo1;
       JComboBox combo2;
    JComboBox combo3;
    JComboBox combo4;
      
    
    public jdialogtusolicitud(){
         //Definición del contenedor de la ventana
        setLayout(null);
      
        
          //Primera combobox
        combo1 = new javax.swing.JComboBox<>();
        combo1.setBounds(70, 10, 100, 30);
        add(combo1);
        combo1.addItem("LECHUGA");
        combo1.addItem("REPOLLO");
        combo1.addItem("ZANAHORIA");
        combo1.addItem("TOMATE");
        combo1.addItem("NARANJA");
        combo1.addItem("LULO");
        combo1.addItem("CHILE");
        combo1.addItem("DURAZNO");
        
         //Segunda combobox
        combo2 = new JComboBox<String>();
        combo2.setBounds(70, 50, 100, 30);
        add(combo2);
        combo2.addItem("LECHUGA");
        combo2.addItem("REPOLLO");
        combo2.addItem("ZANAHORIA");
        combo2.addItem("TOMATE");
        combo2.addItem("NARANJA");
        combo2.addItem("LULO");
        combo2.addItem("CHILE");
        combo2.addItem("DURAZNO");
        
         //tercera combobox
        combo3 = new JComboBox<String>();
        combo3.setBounds(70, 90, 100, 30);
        add(combo3);
        combo3.addItem("LECHUGA");
        combo3.addItem("REPOLLO");
        combo3.addItem("ZANAHORIA");
        combo3.addItem("TOMATE");
        combo3.addItem("NARANJA");
        combo3.addItem("LULO");
        combo3.addItem("CHILE");
        combo3.addItem("DURAZNO");
        
        
          //Caracteristicas de la ventana
        setTitle("DATOS 2");
        setSize(400,300);
        setLocationRelativeTo(null);
        setResizable(false);
        this.getContentPane().  setBackground(Color.BLUE);
        setVisible(true);
}
}
