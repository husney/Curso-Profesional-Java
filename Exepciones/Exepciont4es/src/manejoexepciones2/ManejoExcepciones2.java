/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones2;

import datos.*;
import exepciones.*;

/**
 *
 * @author usney
 */
public class ManejoExcepciones2 {
    
    public static void main(String args[]){
    
       ImplementacionMysql datos= new ImplementacionMysql();
       datos.simularError(true);
       
        ejecutar(datos, "Listar");
        
        datos.simularError(false);
        System.out.println("");
        ejecutar(datos,"Insertar");
        
        
    }
    private static void ejecutar(ImplementacionMysql datos, String accion) {
        if(accion.equalsIgnoreCase("Listar")){
            try{
                datos.listar();
            }catch( LecturaDatosEx ex){
                System.out.println("Error Lectura: Procesa la excepcion mas especifica de lectura de datos");
            }
            catch( AccesoDatosEx ex){
                System.out.println("Error Acceso Datos: Procesa la excepcion mas generica de acceso datos");
                
            }catch(Exception ex){
                System.out.println("Error general");
            }
            finally{
                System.out.println("Procesar finally es opcional, siempre se ejecuta sin importar si hubo error o no");
            }
        }
        else if(accion.equalsIgnoreCase("Insertar")){
            try{
                datos.insertar();
            }catch(AccesoDatosEx ex){
                System.out.println("Error acceso datos: podemos procesar solo la excepcion mas generica");
            }
            finally{
                System.out.println("Procesar finally es opciona, siempre se ejecutara");
            }
        }else{
            System.out.println("No se proporciono ninguna accion conocida");
        }
    }
}
