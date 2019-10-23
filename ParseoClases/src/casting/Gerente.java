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
public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, int edad, int cedula, double salario, String departamento){
        super(nombre, edad, cedula, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nDepartamento: "+departamento;
    }
    
    
}
