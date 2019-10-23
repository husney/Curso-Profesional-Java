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
    
    
    
    public String publico = "Accesible Publico";
    protected String protegido = "Accesible protegido";
    String adefault= "Accesible default";
    private String privado = "Accesible pribado";
    
    
    public Clase1(){
        System.out.println("Accesible Consructor Publico");
    }
    
    protected Clase1(int i){
        System.out.println("Accesible Constructor Protegido");
    }
    
    Clase1 (int i, int j){
        System.out.println("Accesible Constructor default");
    }
    
    private Clase1 (int i, int j,int k){
        System.out.println("Accesible Constructor privado");
    }
    
    
    public String metodoPublico(){
        return "Accesible metodo publico";
    }
    
    protected String metodoProtegido(){
        return "Accesible metodo protegido";
    }
    
    String metodosDefault(){
        return "Accesible metodo default";
    }
    
    private String metodoPrivado(){
        return "Accesible metod privado";
        
        
    }
}
