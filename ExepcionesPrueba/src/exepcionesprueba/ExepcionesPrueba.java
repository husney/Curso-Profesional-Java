/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcionesprueba;

import domain.*;

/**
 *
 * @author usney
 */
public class ExepcionesPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Division division = new Division(10,0);
            division.visualizarOperacion();
        }catch(Exception oe){
            System.out.println("Ocurrion un Error");
            oe.printStackTrace();
        }
        
        
    }
    
}
