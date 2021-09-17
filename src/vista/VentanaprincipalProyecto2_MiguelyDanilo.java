/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author danilus
 */
public class VentanaprincipalProyecto2_MiguelyDanilo extends JFrame{

    public PanelEntradaDatos miPanelEntradaDatosproyecto;
    public PanelOperaciones miPanelOperacionesproyecto;
    public PanelResultados miPanelResultadoproyecto;
    public  PanelProcesos  mipanelprocesos;
     public BarraMenuuno mibarramenu;
  
  public Jdialogdatos midialogo;
   public jdialogtusolicitud misolicitud;
   public Jdialogprocesosplantas misprocesosplantas;
    public jdialogderivadosprocesosplantas miderivadoprocesosplantas1;
  
  private JLabel lbImagen ,lbImagen1 ;
    private ImageIcon iImagen, iImagen1;
        
        
    
//Metodo constructor
    public VentanaprincipalProyecto2_MiguelyDanilo()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
       
        //creacion de la barra
        mibarramenu = new BarraMenuuno(this);
        this.setJMenuBar(mibarramenu);
        

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatosproyecto = new PanelEntradaDatos();
        miPanelEntradaDatosproyecto.setBounds(10, 10, 380,100);
        add(miPanelEntradaDatosproyecto);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperacionesproyecto = new PanelOperaciones();
        miPanelOperacionesproyecto.setBounds(10,120,380,100);
        add(miPanelOperacionesproyecto);
         
        //Creación y adición del PanelOperaciones
        miPanelResultadoproyecto = new PanelResultados();
        miPanelResultadoproyecto.setBounds(440, 290, 380, 190);
        add(miPanelResultadoproyecto);
        
        
        //Creación y adición del PanelOperaciones
        mipanelprocesos = new PanelProcesos();
        mipanelprocesos.setBounds(10,240,380,100);
        add(mipanelprocesos);
        
       
        
         midialogo = null;
         misolicitud= null;
         misprocesosplantas=null;
         miderivadoprocesosplantas1=null;
         
        
      
        
          ImageIcon iLogo1 = new ImageIcon(getClass().getResource("/img/MIGUEL.png"));
        lbImagen1 = new JLabel(iLogo1);
        lbImagen1.setBounds(440, 10, 440, 190);
        add(lbImagen1);
        
        
        JLabel guia = new JLabel("guia :", JLabel.CENTER);
        guia = new JLabel(" M Y M ASOCIADOS");
        guia.setFont(new java.awt.Font("Times New Roman", 1, 12));
        guia.setBounds(490, 150, 400, 40);
        add(guia);
    
       //Caracteristicas de la ventana
        setTitle("--------------------------------------------------------PROYECTO MIGUEL Y DANILO-------------------------------------------------------");
        setSize(900, 620);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
    

}

    public void Creacionjdialog() {
       midialogo = new Jdialogdatos();
    }

    public void Creacionjdialognumerodos() {
      misolicitud = new jdialogtusolicitud();
    }

    public void Creacionjdialogprocesosplantas() {
        misprocesosplantas =  new Jdialogprocesosplantas();

    }

    public void Creacionjdialogderivadaprocesosplantas() {
        miderivadoprocesosplantas1 =new jdialogderivadosprocesosplantas();
    }
}
