
package diseñoclases;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int Max_Productos= 10;
    
    public Orden(){
        this.idOrden= ++contadorOrdenes;
        productos = new Producto[Max_Productos];
    }
    
    public void agregarProducto(Producto producto){
        if(contadorProductos < Max_Productos){
            productos[contadorProductos]=producto;
        }
        else {
            System.out.println("Se ha superado el maximo de productos"+Max_Productos);
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i< contadorProductos; i++){
            total += productos[i].getPrecio();
        }
    return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #: "+idOrden);
        System.out.println("total de la orden: $"+calcularTotal());
        System.out.println("Productos en la orden: ");
        for(int i = 0; i< contadorProductos; i++){
            System.out.println(productos[i]);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
