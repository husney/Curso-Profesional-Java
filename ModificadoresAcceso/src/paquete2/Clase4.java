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
public class Clase4  {
    
    public Clase4(){
        
    }
    
    public void pruebaDesdeClase4(){
        Clase1 c1 = new Clase1();
        
        System.out.println("");
        System.out.println("Atributo publico: "+c1.artPublico);
        System.out.println("Atributo protegido: No se puede acceder desde un paquete externo a No ser que sea una clase hija (Sub  Clase)");
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Acceso negado");
        
        new Clase1();
        
        System.out.println("");
        System.out.println("Metodo publico: "+c1.metodoPublico());
        System.out.println("Metodo protegido: No se puede acceder desde un paquete externo a No ser que sea una clase hija (Sub Clase)");
        System.out.println("Metodo private: Acceso negado");
        
        
    }
}
