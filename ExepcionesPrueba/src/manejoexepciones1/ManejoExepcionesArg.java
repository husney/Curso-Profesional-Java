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
public class ManejoExepcionesArg {

public static void main (String []args) throws OperationException, Exception{
 
    try{
        
        int op1 = Integer.parseInt(args[0]);
        int op2 = Integer.parseInt(args[1]);
        Division div = new Division (op1,op2);
        div.visualizarOperacion();
    }catch (ArrayIndexOutOfBoundsException aie){
        System.out.println("Ocurrrio una Excepcion");
        System.out.println("Hubo un error al acceder a un elemento fuera de rango");
        aie.printStackTrace();
    }catch (NumberFormatException nfe){
        System.out.println("Ocurrion una Excepecion");
        System.out.println("Uno de los argumentos no es entero");
        nfe.printStackTrace();
    }catch (OperationException ope){
        System.out.println("Ocurrion una Excepcion");
        System.out.println("Se trato de realizar una operacion erronea");
        ope.printStackTrace();
    }
    finally {
        System.out.println("Se revisaron todas las Excepciones");
    }







}
}
