/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author usney
 */
public class Persona {
    
    protected String nombre;
    protected int edad;
    protected int id;
    
    protected Persona(String nombre, int edad, int id){
        this.nombre = nombre;
        this.edad= edad;
        this.id = id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "\nNombre: "+nombre+"\nEdad: "+edad+"\nId: "+id;
    }
    
    
}

