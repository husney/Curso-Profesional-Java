/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author usney
 */
public class Clase4 {

    public Clase4(){
        System.out.println("Acceso constructor Clase 1 paquete 1 || desde Clase 4 Paquete 2, es posible");
        new Clase1();
    }
    
    public void metodosClase4(){
        Clase1 c1 = new Clase1();
        
        System.out.println("Acceso desde Clase 4 Paquete 2 || Clase 1 Paquete 1 Atributo publico :"+c1.publico);
        System.out.println("Acceso desde Clase 4 Paquete 2 || Clase 1 Paquete 1 Metodo publico :"+c1.metodoPublico());
        System.out.println("");
        System.out.println("Acceso desde Clase 4 Paquete 2 || Calse 1 Paqete 1 Atributo Publico: no es posible ya que esta clase no extiende de la clase 1 , un metodo o atributo protected solo puede ser usado desde el mismo paquete o dede otro paquete pero si una clase extiende de la clase en donde se declaro el modificador protected");
        System.out.println("");
                
        
        
    }
    
    
}
