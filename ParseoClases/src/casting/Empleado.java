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
public class Empleado extends Persona {
    
    protected double salario;
    
    public Empleado(String nombre, int edad, int cedula, double salario){
        super(nombre, edad, cedula);
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
