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
public class Clase3 extends Clase1 {
    
    public Clase3(){
     
        super(1);
        System.out.println("Acceso a Constructor Protegido Desde Paquete 2 Clase 3 || Por medio de Hrencia (Extends) de la clase 1 paquete 1 haciendo referencia al constructor parde (super) consturctor protegido");
    }
    
    
    public void metodosClase3(){
        Clase1 c1 = new Clase1();
        
        System.out.println("Acceso Dese Clase 3 Paquete 2 || Clase 1 Paquete 1 Atributo Publico: "+c1.publico);
        System.out.println("Acceso Dese Clase 3 Paquete 2 || Clase 1 Paquete 1 Metodo Publico: "+c1.metodoPublico());
        System.out.println("");
        System.out.println("Acceso Desde Clase 3 Paquete 2 || Clase 1 Paquete 1 Atributo Protegido: "+protegido);
        System.out.println("Es posible por que La clase 3 toma por Herencia a la clase 1 por lo tanto tiene una copia de sus atributos y metodos");
        System.out.println("Con el modificador private se pueden acceder desde todas las clases del paquete o clases de otro paquete que Hereden de la clase que declaro el modificador");
        System.out.println("");
        System.out.println("Accesao Default No se puede por que default solo permite acceder desde el mismo paquete");
        System.out.println("");
        System.out.println("Acceso Private No se puede por que el modificado private solo deja acceder a sus metodos o atributos dese la misma clase en la que se declaro");
        
        
    }
    
}
