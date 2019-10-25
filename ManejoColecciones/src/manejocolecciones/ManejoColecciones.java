/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocolecciones;

import java.util.*;

/**
 *
 * @author usney
 */
public class ManejoColecciones {
    public static void main(String args[]) {
   
        List l = new ArrayList();
           
        l.add(5);
        l.add(1);
        l.add("List");
        l.add(true);
        
       imprimir(l);
       
       
       Set ms = new HashSet();
       
       ms.add(5);
       ms.add("Hello");
       ms.add(1);
       ms.add(10);
       ms.add(150);
       ms.add(true);
       
       imprimir(ms);
       
       Map mp = new HashMap();
       
       mp.put(l, 5);
       mp.put(2,200);
       mp.put(3, "Map");
       mp.put(4, true);
       
        System.out.println(mp.values());
    
    }
   
    public static void imprimir(Collection c){
        
        for(Object a: c){
            System.out.print(a+ " ");
        }
        System.out.println("");
    }
}