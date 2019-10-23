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
public enum Persona {
    
    VALENTINA("Marin",20),
    NATALIA("Torres",21),
    SARA("Orrego",22);
    
    
    private String nombre;
    private int edad;
    
    private Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    
}
