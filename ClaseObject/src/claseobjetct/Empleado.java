/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobjetct;

/**
 *
 * @author usney
 */
public class Empleado {
    
    private String nombre;
    private double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
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

    @Override
    public String toString(){
        return "Nombre: " +nombre+ "\nSueldo: "+sueldo;
    }

     @Override
     public boolean equals(Object obj){
         if(obj == null){
             return false;
         }
         if(obj instanceof Empleado){
             Empleado e = (Empleado)obj;
             
             if(nombre.equals(e.nombre)&& sueldo == e.sueldo){
                 return true;
             }else{
                 return false;
             }
         }else{
             return false;
         }
         
         
     }
    

     @Override 
     public int hashCode(){
         int hash = 7;
         hash = 31 * hash + this.nombre.hashCode();
         hash = 31 * hash + Double.valueOf(this.sueldo).hashCode();
         return hash;
     }




}
