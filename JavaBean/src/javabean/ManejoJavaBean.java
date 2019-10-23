/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabean;

import bean.PersonaBean;

/**
 *
 * @author usney
 */
public class ManejoJavaBean  {
    
    public static void main(String args[]){
        
        
        
        PersonaBean bean = new PersonaBean("Juan",28);
        
        
        
        
        System.out.println("Nombre: "+bean.getNombre());
        System.out.println("Edad: "+bean.getEdad());
        
        
        
        
        
    }
    
}
