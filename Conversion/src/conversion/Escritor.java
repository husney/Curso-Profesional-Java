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
public class Escritor extends Empleado{
    
    private TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, int edad, int id, double salario, TipoEscritura tipoEscritura){
        super(nombre, edad, id, salario);
        this.tipoEscritura = tipoEscritura;
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
    public String getDescripcionTipoEscritura(){
        return "\n"+tipoEscritura.getDescEscritura();
    }
    
    
}
