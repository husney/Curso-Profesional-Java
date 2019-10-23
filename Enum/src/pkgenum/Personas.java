/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum;

/**
 *
 * @author usney
 */
public enum Personas {
    
    VALENTINA("Marin",19,1.70,1),
    NATALIA("Torres",23,1.78,2),
    SARA("Orrego",23,180,3),
    GABI("Gaby",20,1.65,4);
    
    
    private String apellido;
    private double altura;
        private int edad;
        private int edad2;
        
    private Personas(String apellido, int edad, double altura, int n2){
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.edad2 = n2;
    }
    
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }    
    
    public double getAltura(){
        return this.altura;
    }
    
    public int getN2(){
        return edad2;
    }
    
}
