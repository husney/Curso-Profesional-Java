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
public class Empleado extends Persona{
    
    private double salario;
    
    public Empleado(String nombre, int edad, int id, double salario){
        super(nombre, edad, id);
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nSalario: "+salario;
    }
}
