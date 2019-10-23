/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author usney
 */
public class Empleado {
 
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void metodoEmpleado(){
        System.out.println("Empleado");
    }
           
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nSalario: "+salario;
    }
}
