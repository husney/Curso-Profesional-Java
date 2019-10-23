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
public class Clase3 extends Clase1{
    
    public Clase3(){
        super(1,2);
        
    }
    
    public void pruebaDesdeClase3(){
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico: "+c1.artPublico +" o heredado: "+artPublico);
        System.out.println("Atributo protegido (Heredado): "+artProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Acceso denegado");
    
        new Clase1();
        
        System.out.println("");
        System.out.println("Metodo publico: "+c1.metodoPublico());
        System.out.println("Metodo protegido: "+metodoProtegido());
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: Acceso denegado");
    
    
    
    }
   
    
    
}
