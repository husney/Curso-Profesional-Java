/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones1;

import domain.*;
/**
 *
 * @author usney
 */
public class ManejoExepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       
        try{
        
            Division d = new Division(10, 0);
            d.visualizarOperacion();
        
        }catch(Exception ex){
            
            System.out.println("Ocurrio un error!");
            ex.printStackTrace();
        }
        
    }
    
    
}
