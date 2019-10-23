/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author usney
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Empleado emp = new Empleado("Juan",1000);
        imprimirDetalles(emp);
        
        System.out.println("");
        
        Gerente ger = new Gerente("Karla",2000,"Finanzas");
        imprimirDetalles(ger);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
