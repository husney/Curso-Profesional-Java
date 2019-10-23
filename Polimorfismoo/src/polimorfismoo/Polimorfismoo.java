/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoo;

/**
 *
 * @author usney
 */
public class Polimorfismoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



        Empleado e = new Empleado("Carlos", 1000);
        imprimir(e);

        System.out.println("");
        
        Empleado g = new Gerente("Karla",2000, "Finanzas");
        imprimir(g);

        System.out.println("");
        
        Gerente g1 = new Gerente("G1",3000,"Finanzas");
        imprimir(g1);







    }
    public static void imprimir(Empleado emp){
        System.out.println(emp.getDetalles());
    }
}
