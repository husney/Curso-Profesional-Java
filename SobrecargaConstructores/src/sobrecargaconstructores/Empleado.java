
package sobrecargaconstructores;

public class Empleado extends Persona {


        private double sueldo;
        
        Empleado(String nombre, int edad, double sueldo){
            super(nombre, edad);
            this.sueldo = sueldo;
        }


    public double getSueldo() {
        return sueldo;
    }

  
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
}
