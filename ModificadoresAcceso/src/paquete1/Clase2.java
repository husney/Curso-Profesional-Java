/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author usney
 */
public class Clase2 {
    
    public Clase2(){
        System.out.println("");
        new Clase1(1);
        System.out.println("");
        new Clase1(1,2);
        System.out.println("");
        new Clase1(1,2,3);
        System.out.println("Construcotr private: acceso denegado");
        
    }
    
    
    public void puebaDesdeClase2(){
        Clase1 c1 = new Clase1();
        
        System.out.println("");
        System.out.println("Atributo publico: "+c1.artPublico);
        System.out.println("Atributo protegido: "+c1.artProtegido);
        System.out.println("Atributo default: "+c1.artPaquete);
        System.out.println("Atributo private: Acceso denegado");
        
        System.out.println("");
        System.out.println("Metodo publico: "+ c1.metodoPublico());
        System.out.println("Metodo protegido: "+ c1.metodoProtegido());
        System.out.println("Metodo default: "+ c1.metodPaquete());
        System.out.println("Metodo default: Acceso denegado");
        
        
    }
    
}
