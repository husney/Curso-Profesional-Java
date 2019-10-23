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
public class Division {
    
    
    private int numerador;
    private int denominador;
    
    /**
     * Realiza division
     * @param numerador
     * @param denominador
     * @throws OperationException 
     */
    public Division(int numerador, int denominador) throws Exception{
    
        if(denominador == 0){
            throw new OperationException("Denominador igual a cero");
        }

            this.numerador = numerador;
            this.denominador = denominador;
        
    }
    
    /**
     * Regresa el resultado de la division
     */
    public void visualizarOperacion(){
        int resultado = numerador / denominador;
        
        System.out.println("El resultado es: "+resultado);
    }
    
    
}
