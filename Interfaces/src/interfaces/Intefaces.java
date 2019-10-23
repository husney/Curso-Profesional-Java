/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import pruebainterfaces.*;
/**
 *
 * @author usney
 */
public class Intefaces {
    public static void main(String args[]){
        
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos,"Listar");
        
        datos = new ImplementacionMysql();
        ejecutar(datos,"Insertar");
        
    }
    
    private static void ejecutar(AccesoDatos datos, String accion){
        
        if(accion.equals("Listar")){
            datos.listar();
        }
        
        else if("Insertar".equals(accion)){
            datos.insertar();
        }
        
        
    }
}
