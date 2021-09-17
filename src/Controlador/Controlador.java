/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;




import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VentanaprincipalProyecto2_MiguelyDanilo;
import modelo.solucionproyecto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author danilus
 */
public class Controlador implements ActionListener {

    private VentanaprincipalProyecto2_MiguelyDanilo venPrin;
    private solucionproyecto model;


    public Controlador(VentanaprincipalProyecto2_MiguelyDanilo miVentanaaa, solucionproyecto pModel) {

        this.venPrin = miVentanaaa;
        this.venPrin.miPanelEntradaDatosproyecto.escucharlosbotones(this);
        this.venPrin.miPanelOperacionesproyecto.escucharlosbotoness(this);
        this.venPrin.mipanelprocesos.escucharlosbotonesss(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String comando = ae.getActionCommand();

        if (comando.equals("ingresardatos")) {
            venPrin.miPanelEntradaDatosproyecto.ingresardatos.setBackground(Color.yellow);

            venPrin.Creacionjdialog();
          
            this.venPrin.midialogo.escucharlosbotonesdeljdialogdatos(this);

        }
        if (comando.equals("SOLICITUD")) {
            venPrin.Creacionjdialognumerodos();

        }
        if (comando.equals("procesos")) {
            venPrin.Creacionjdialogprocesosplantas();

        }
        if (comando.equals("Aceptar")){
            try{
                Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/datosproyecto","root", "");
                PreparedStatement pst = cn.prepareStatement("insert into proyecto values(?,?,?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, venPrin.midialogo.getnombre());
                pst.setString(3, venPrin.midialogo.getapellido());
                pst.setString(4, venPrin.midialogo.getdocumento());
                pst.setString(5, venPrin.midialogo.getciudad());
                pst.executeUpdate();
                
                venPrin.midialogo.borrartodo();
                
            } catch (SQLException ex) {
                        venPrin.Creacionjdialogderivadaprocesosplantas();
            }
        }
        if (comando.equals("plantas")) {
            venPrin.Creacionjdialogderivadaprocesosplantas();

        }
        

        }
    
}