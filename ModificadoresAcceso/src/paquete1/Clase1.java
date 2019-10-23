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
public class Clase1 {
    
   public int artPublico = 5;
   protected int artProtegido = 6;
   int artPaquete = 7;
   private int artPrivado = 8;
   
   //Constructores
   
   public Clase1(){
       
    }
   
   public Clase1(int i){
       System.out.println("Constructor publico 1");
   }
   
   protected Clase1(int i, int j){
       System.out.println("Constructor protected 2");
   }
   
   Clase1(int i, int j, int k){
       System.out.println("Constructor default 3");
   }
   
   private Clase1 (int i, int j, int k, int l){
       System.out.println("Constructor privado 4");
   }
   
   public int metodoPublico(){
       return 9;
   }
   
   protected int metodoProtegido(){
       return 10;
   }
   
   int metodPaquete(){
       return 11;
   }
   
   private int metodoPrivado(){
       return 12;
   }
   
}
