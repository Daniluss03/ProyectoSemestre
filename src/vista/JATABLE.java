/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danilus
 */
public class JATABLE extends JFrame {
    
    
    public JATABLE(){
        super("TABLA DE DATOS");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        modelo.addColumn("Telefono");
        
        String [] pl={"danilo","18","colombia","3132146645"};
        modelo.addRow(pl);
        
        JTable tabla = new JTable(modelo);
        tabla.setBounds(0,0,500,500);
        setSize(200,220);
        add(tabla);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
            
}
