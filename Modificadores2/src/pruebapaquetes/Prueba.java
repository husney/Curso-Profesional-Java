/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapaquetes;

import paquete1.*;
import paquete2.*;
/**
 *
 * @author usney
 */
public class Prueba {
    public static void main (String[] args){
        
        System.out.println("Prueba desde el mismo paquete desde Clase 1 Paquete 1 || Clase 2 Paquete 1");
        new Clase2().metodosClase2();
        System.out.println("");
        
        System.out.println("Prueba desde otro paquete desde Clase 1 Paquete 1 || Clase 3 Paquete2");
        new Clase3().metodosClase3();
        System.out.println("");
        
        System.out.println("Preuba desde otro patuqete desde Clase1 Paquete 1 || Clase 4 Paqute 2 ");
        new Clase4().metodosClase4();
        
    }
}
