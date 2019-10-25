/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones1;

import domain.*;
/**
 *
 * @author usney
 */
public class ManejoExcepcionesArg {
    public static void main(String args[]) throws OperationExeption{
        
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division div = new Division(op1, op2);
            div.visualizarOperacion();
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Ocurrio un Error");
            System.out.println("Error al acceder a un elemento fuera de rango");
            aie.printStackTrace();
        }
        catch (NumberFormatException nfe){
            System.out.println("Ocurrio un Error");
            System.out.println("Uno de los argumentos no es un entero");
            nfe.printStackTrace();
        }
        catch (OperationExeption oe){
            System.out.println("Ocurrio un Error");
            System.out.println("Operacion Erronea");
            oe.printStackTrace();
        }
        finally{
            System.out.println("Se revisaron todas las Excepciones");
        }
        
        
        
        
        
        
        
    }
}
