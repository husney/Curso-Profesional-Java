/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author usney
 */
public class Conversion {
    
    public static void main (String []args){
        
        
        Persona p = new Escritor("Rodriguez", 31, 500, 4000, TipoEscritura.MODERNA);
        
        Escritor escritor = (Escritor)p;
    
        
        System.out.println(escritor.getDescripcionTipoEscritura());
    }
}
