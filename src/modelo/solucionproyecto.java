/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author danilus
 */
public class solucionproyecto {
     private String Nombre;
    private String Apellido;
     private int documento;
      private String ciudad;
 
    public solucionproyecto(String nombre, String apellido, int documento, String Ciudad) {
        this.Nombre = nombre;
        this.Apellido = apellido;
         this.documento = documento;
          this.ciudad = Ciudad;
    }

    public solucionproyecto(String nombre, String apellido, String Ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public solucionproyecto(String nombre, String apellido, String documento, String Ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
}
