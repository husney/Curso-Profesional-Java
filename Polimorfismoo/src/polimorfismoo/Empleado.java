/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoo;

/**
 *
 * @author usney
 */
public class Empleado {
 
    protected String nombre;
    protected double sueldo;
    
    protected Empleado (String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo= sueldo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public String getDetalles(){
        return "Nombre: "+nombre+"\nSueldo: "+sueldo;
    }
    
    
}
