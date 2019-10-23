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
    
    private String tipoEscritura;
    
    
    public Escritor(String nombre, int sueldo, String tipo){
        super(nombre, sueldo);
        this.tipoEscritura = tipo;
        
    }
    
    public String escritor(){
        return"Escritor";
    }
}
