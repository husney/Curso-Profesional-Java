/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author usney
 */
public enum Enum {
    
    BLANCO("El color es blanco"),
    NEGRO("El color es negro"),
    AZUL("El color es azul"),
    AMARILLO("El color es amarillo");
    
    private String descripcion;
    
    private Enum(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    
}
