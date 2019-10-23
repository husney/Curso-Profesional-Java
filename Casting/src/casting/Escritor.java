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
public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor (String nombre, double salario, TipoEscritura tipoEscritura){
        super(nombre, salario);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nTipo Escritura: "+tipoEscritura.getDescription();
    }    
    
    public TipoEscritura getTipoEscritura(){
        return tipoEscritura;
    }
    
    public String getTipoEscrituraTexto(){
        return tipoEscritura.getDescription();
    }
}
