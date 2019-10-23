package casting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usney
 */
public class Persona {
    
    protected String nombre;
    protected int edad;
    protected int cedula;
    
    protected Persona(String nombre, int edad, int cedula){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return  this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getCedula(){
        return this.cedula;
    }
    
    public void setCedula(int cedula){
        this.cedula = cedula;
    }
    
    
    @Override
    public String toString(){
        return "\nNombre: "+nombre+"\nEdad: "+edad+"\nCedula: "+cedula;
    }
    
    
    
    
}
