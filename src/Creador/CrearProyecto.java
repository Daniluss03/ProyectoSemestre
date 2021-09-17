/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creador;

import Controlador.Controlador;
import vista.VentanaprincipalProyecto2_MiguelyDanilo;
import modelo.solucionproyecto;

/**
 *
 * @author danilus
 */
public class CrearProyecto {
    
      public static void main(String[] args)
    {
    
     VentanaprincipalProyecto2_MiguelyDanilo miVentanaaa1 = new VentanaprincipalProyecto2_MiguelyDanilo();
    
     
      solucionproyecto misolucion= null;
      Controlador miControlador = new Controlador(miVentanaaa1,misolucion);
     
    }
    
    
}
