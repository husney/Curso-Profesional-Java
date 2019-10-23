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
    
    public Division(int numerador, int denominador) throws OperationExeption{
        
        if(denominador == 0){
            throw new OperationExeption("Denominador igual a Cero");
        }
        else{
            
        }
    }
}
