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
public class Gerente extends Empleado{
    
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
    super(nombre, sueldo);
    this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDetalles(){
        return super.getDetalles()+"\nDepartemento: "+departamento;
    }

}

