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
public class Corrector extends Escritor{
    
    
    public Corrector(String nombre, int sueldo, String tipo){
        super(nombre, sueldo, tipo);
    }
    
    public String corrector (){
        return "Corrector ";
    }
}
