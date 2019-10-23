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
public enum TipoEscritura {
    
    CLASICA("Escritura a Mano"),
    MODERNA("Escritura Digital");
    
    private final String tipoEscritura;
    
    private TipoEscritura(String tipoEscritura){
        this.tipoEscritura = tipoEscritura;
    }
    
    public String getDescEscritura(){
        return tipoEscritura;
    }
}
