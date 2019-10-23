/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

import abstracto.domain.*;

/**
 *
 * @author usney
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        FiguraGeometrica f1 = new Circulo();
         
        f1.dibujar();
        System.out.println(f1);
        
        
        
    }
    
}
