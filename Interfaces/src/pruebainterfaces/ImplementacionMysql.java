/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainterfaces;

/**
 *
 * @author usney
 */
public class ImplementacionMysql implements AccesoDatos {
    
    @Override
    public void insertar(){
        System.out.println("Insertando desde Mysql");
    }
    
    @Override
    public void listar(){
        System.out.println("Listando desde Mysql");
    }
    
}
