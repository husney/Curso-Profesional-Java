package ejemplojavadoc;

/**
 * Esta clase perimte realizar operaciones de aritmetica como sumar, restar etc.
 * 
 * 
 * @author usney
 * @version: 1.0
 */
public class Aritmetica {
    
    
    /**
     * Primer operando
     */
    
    int operandoA;
    
    /**
     * Segundo operando
     */
    
    int operandoB;
    
    /**
     * constructor vacio de clase
     * @param operandoa
     * @param operandob
     */
    
    public Aritmetica(int operandoa, int operandob){
        operandoA = operandoa;
        operandoB = operandob;
    }
 
    /**
     * Este metodo realiza la suma de los dos operandos enteros
     * @return int resultado suma
     */
    
    public int sumar(){
        return operandoA + operandoB;
    }
    
    
    
    
    
}
