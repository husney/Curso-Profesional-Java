/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploClaseAbstracta;

import abstracto.domain.*;

/**
 *
 * @author usney
 */
public class Main {
    
    
    public static void main(String []args){
    
        
    FiguraGeometrica f1 = new Circulo("Circulo");
    FiguraGeometrica f2  = new Rectangulo("Rectangulo");
    FiguraGeometrica f3 = new Triangulo("Triangulo");
    
    
    
        System.out.println(f1);
    f3.dibujar();
         
       
    
    
    
    }
}
