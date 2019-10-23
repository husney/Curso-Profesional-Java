/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author usney
 */
public class OperationException extends Exception{
     
    /**
     * Recibe un mensaje y lo re envia a la clase padre 
     * @param mensaje 
     */
    public OperationException(String mensaje){
        super(mensaje);
        
    }
    
}
