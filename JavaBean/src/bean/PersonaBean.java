/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author usney
 */
public class PersonaBean  implements Serializable{
    
    
    private String nombre;
    private int edad;
    
    public PersonaBean(){}//Void Constructor
    
    public PersonaBean(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
        
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    
    
    
    
}
