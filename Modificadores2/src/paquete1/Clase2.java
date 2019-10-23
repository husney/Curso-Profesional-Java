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
        System.out.println("Constructor public");
        new Clase1();
        System.out.println("Consturctor protegido");
        new Clase1(2);
        System.out.println("Constructor default");
        new Clase1(2,3);
        System.out.println("No hay acceso a constructor privado ya que un elemento privado solo se puede acceder desde la misma clase");
        
    }
    
    
    public void metodosClase2(){
        Clase1 c1 = new Clase1();
        
        System.out.println("Acceso Atributo Publico: "+c1.publico);
        System.out.println("Acceso Metodo Publico: "+c1.metodoPublico());
        System.out.println("");
        System.out.println("Acceso Atributo Protegido: "+c1.protegido);
        System.out.println("Acceso Metodo Protegido: "+c1.metodoProtegido());
        System.out.println("");
        System.out.println("Acceso Atributo Default: "+c1.adefault);
        System.out.println("Acceso Metodo Default: "+c1.metodosDefault());
        System.out.println("");
        System.out.println("Acceso a Atritubo y Metodo Privado: Un metodo o atributo private solo se puede acceder desde la misma clase en la que esta declarada");
        
        
        
    }
    
}
