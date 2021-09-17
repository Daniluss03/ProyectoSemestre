/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author danilus
 */
class BarraMenuuno extends JMenuBar implements ActionListener{
    
    
    
   
    private JMenu moperaciones, MAyuda;
    private JMenuItem micalcular, miBorrar, miSalir, miAyuda;
    private JLabel lbhora;
    private VentanaprincipalProyecto2_MiguelyDanilo ventPrin;

    public BarraMenuuno(VentanaprincipalProyecto2_MiguelyDanilo vp) {
        ventPrin = vp;

        moperaciones = new JMenu("Operaciones");
        moperaciones.setMnemonic('0');
        ImageIcon borrardos = new ImageIcon(getClass().getResource("/img/Calculadora1.png"));
        moperaciones.setIcon(new ImageIcon(borrardos.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH)));
        this.add(moperaciones);

        micalcular = new JMenuItem("FACTURA");
        micalcular.setActionCommand("FACTURA");
        micalcular.addActionListener(this);
        micalcular.setMnemonic('c');
        moperaciones.add(micalcular);

        JMenuItem misalir = new JMenuItem("SALIR");
        misalir.setActionCommand("SALIR");
        misalir.addActionListener(this);
        misalir.setMnemonic('c');
        moperaciones.add(misalir);

        MAyuda = new JMenu("AYUDA");
        MAyuda.setMnemonic('y');
        ImageIcon ayuda = new ImageIcon(getClass().getResource("/img/interrogacion.png"));
        MAyuda.setIcon(new ImageIcon(ayuda.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH)));
        this.add(MAyuda);

        miAyuda = new JMenuItem("AYUDA");
        miAyuda.setActionCommand("AYUDA");
        miAyuda.addActionListener(this);
        miAyuda.setMnemonic('p');
        MAyuda.add(miAyuda);

        JMenuItem calendario = new JMenuItem("FECHA Y HORA AUTOMATICA");
        calendario.setActionCommand("FECHA AUTOMATICA");
        calendario.addActionListener(this);
        calendario.setMnemonic('p');
        MAyuda.add(calendario);

        JMenu MENU = new JMenu("MENU INTERACTIVO");
        MENU.setMnemonic('y');
        
        this.add(MENU);

        JMenuItem miMENU = new JMenuItem("MENU INTERACTIVO");
        miMENU.setActionCommand("MENU INTERACTIVO");
        miMENU.addActionListener(this);
        miMENU.setMnemonic('p');
        MENU.add(miMENU);

        JMenu RUTA = new JMenu("RUTA");
        RUTA.setMnemonic('y');
        ImageIcon rutaa = new ImageIcon(getClass().getResource("/img/ruta.png"));
        RUTA.setIcon(new ImageIcon(rutaa.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH)));
        this.add(RUTA);

        JMenuItem miruta = new JMenuItem("RUTA");
        miruta.setActionCommand("RUTA");
        miruta.addActionListener(this);
        miruta.setMnemonic('p');
        RUTA.add(miruta);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
      
    }
    
}
