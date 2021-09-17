/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author danilus
 */
public class Jdialogdatos extends JDialog{
    
    
    
     private JLabel  Nombre,apellido,DOCUMENTO,ciudad;
    private JTextField nombredelnombre,apellidodelapellido,documentodeldocumento,ciudaddelaciudad;
     private JButton btAceptar,btBorrrar;
    
    public Jdialogdatos(){
         //Definición del contenedor de la ventana
        setLayout(null);
        
        
         setBackground(Color.ORANGE);
        
         //Creación y adición del elementos
        Nombre = new JLabel("NOMBRE",JLabel.NORTH_EAST);
        Nombre.setFont(new Font("Arial", Font.BOLD, 25));
        Nombre.setBounds(10,10,280,20);
        add(Nombre);
         //Creación y adición del elementos
        apellido = new JLabel("APELLIDO",JLabel.NORTH_EAST);
        apellido.setFont(new Font("Arial", Font.BOLD, 25));
        apellido.setBounds(10,40,280,20);
        add(apellido);
         //Creación y adición del elementos
        DOCUMENTO = new JLabel("DOCUMENTO",JLabel.NORTH_EAST);
        DOCUMENTO.setFont(new Font("Arial", Font.BOLD, 25));
        DOCUMENTO.setBounds(10,70,280,20);
        add(DOCUMENTO);
       
        
        ciudad = new JLabel("CIUDAD",JLabel.NORTH_EAST);
        ciudad.setFont(new Font("Arial", Font.BOLD, 25));
        ciudad.setBounds(10,100,280,20);
        add(ciudad);
        
        nombredelnombre= new JTextField(JTextField.RIGHT);
        nombredelnombre.setFont(new Font("Arial", Font.BOLD, 25));
        nombredelnombre.setBounds(200,10,120,20);
        add(nombredelnombre);
        
        apellidodelapellido= new JTextField(JTextField.RIGHT);
        apellidodelapellido.setFont(new Font("Arial", Font.BOLD, 25));
        apellidodelapellido.setBounds(200,40,120,20);
        add(apellidodelapellido);
        
        documentodeldocumento= new JTextField(JTextField.RIGHT);
        documentodeldocumento.setFont(new Font("Arial", Font.BOLD, 25));
        documentodeldocumento.setBounds(200,70,120,20);
        add(documentodeldocumento);
        
        ciudaddelaciudad= new JTextField(JTextField.RIGHT);
        ciudaddelaciudad.setFont(new Font("Arial", Font.BOLD, 25));
        ciudaddelaciudad.setBounds(200,100,120,20);
        add(ciudaddelaciudad);

        
        
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 10));
        btAceptar.setBounds(20,170,100,25);
        btAceptar.setBackground(Color.white);
        btAceptar.setActionCommand("Aceptar");
        add(btAceptar);
        
        btBorrrar = new JButton("Borrar");
       btBorrrar.setFont(new Font("Arial", Font.BOLD, 10));
        btBorrrar.setBounds(150,170,100,25);
        btBorrrar.setBackground(Color.white);
       btBorrrar.setActionCommand("Borrar");
        add(btBorrrar);
       
         //Caracteristicas de la ventana
        setTitle("DATOS");
        setSize(400,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
    }
    
    public String getnombre(){
        return nombredelnombre.getText();
    }
     public String  getapellido(){
        return apellidodelapellido.getText();
    }
      public String  getdocumento(){
        return documentodeldocumento.getText();
    }
       public String  getciudad(){
        return ciudaddelaciudad.getText();
    }
    
        public void borrartodo()
    {
        nombredelnombre.setText("");
        apellidodelapellido.setText("");
         documentodeldocumento.setText("");
          ciudaddelaciudad.setText("");

    }
         public void escucharlosbotonesdeljdialogdatos(ActionListener hellomoto)
    {
        btAceptar.addActionListener(hellomoto);
         btBorrrar.addActionListener(hellomoto);
    }
   
    
        
    
}
