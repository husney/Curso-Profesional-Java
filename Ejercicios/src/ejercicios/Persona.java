/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author usney
 */
public enum Persona {
    
    VALENTINA("Marin",19,"Colombia"),
    SARA("Orrego",23,"Colombia"),
    NATALIA("Torres",23,"Colombia"),
    VALENTINAL("Leal",24,"Colombia"),
    VICTORIA("Valencia",24,"Venezuela"),
    GABI("Staneco",20,"Brasil");
    
    
    private String nombre;
    private int edad;
    private String pais;
    
    private Persona(String nombre, int edad, String pais){
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getPais(){
        return this.pais;
    }
    
}
