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
public class Main {
    public static void main(String []args){
        
    
        
        for(Persona p : Persona.values()){
            System.out.println(p+" "+p.getEdad()+" "+p.getNombre());
        }
        
        
    }
}
