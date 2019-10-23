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
public class Escritor extends Empleado {
    
    private TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, int edad, int cedula, double salario, TipoEscritura tipoEscritura){
        super(nombre, edad, cedula, salario);
        this.tipoEscritura = tipoEscritura;
    }
    
    public TipoEscritura tipoEscritura(){
        return this.tipoEscritura;
    }
    
    public String getTipoEscrituraDescripcion(){
        return tipoEscritura.getDescripcion();
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nTipo de Escritura: "+tipoEscritura+"\nDescripcion: DD: "+getTipoEscrituraDescripcion();
    }
    
}
