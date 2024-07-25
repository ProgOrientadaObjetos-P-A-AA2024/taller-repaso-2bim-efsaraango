
package paquete01;
import paquete03.*;
import paquete02.*;

/**
 *
 * @author Det-Pc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comprador comprador1 = new Comprador("Juan Perez", "0102030405");
        Comprador comprador2 = new Comprador("Ana Gomez", "0102030406");
        Comprador comprador3 = new Comprador("Luis Fernandez", "0102030407");

        VehiculoTipoSedan sedan1 = new VehiculoTipoSedan(comprador1, "Toyota", 20000, 5);
        VehiculoTipoSedan sedan2 = new VehiculoTipoSedan(comprador2, "Hyundai", 18000, 7);
        VehiculoTipoSuv suv = new VehiculoTipoSuv(comprador3, "Ford", 35000, 10);
        VehiculoTipoCamioeneta camioneta = new VehiculoTipoCamioeneta(comprador1, "Chevrolet", 30000, 15);

        Concesionaria concesionaria = new Concesionaria("Autos del Sol");
        concesionaria.agregarVehiculo(sedan1);
        concesionaria.agregarVehiculo(sedan2);
        concesionaria.agregarVehiculo(suv);
        concesionaria.agregarVehiculo(camioneta);

        System.out.println(concesionaria);
       
    }
}
    
