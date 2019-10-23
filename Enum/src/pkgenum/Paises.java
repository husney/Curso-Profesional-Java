package pkgenum;

/**
 *
 * @author usney
 */
public enum Paises {
    
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    
    private int paises;
    
    private Paises(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return paises;
        
    }
    
    
}
