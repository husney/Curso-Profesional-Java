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
public class Empleado {
    private String nombre;
    private int sueldo;
    
    public Empleado(String nombre, int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    
    public String empleado(){
        return "Empleado";
    }
}
