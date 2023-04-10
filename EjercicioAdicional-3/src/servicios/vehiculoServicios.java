/*
     private String Marca;
     private String modelo;
     private int anio;
     private String numeroMotor;
     private String chasis;
     private String color;
     private TipoCarroceria tipo;
     private Poliza polizas;
 */
package servicios;

import entidades.Vehiculo;
import enumeraciones.TipoCarroceria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class vehiculoServicios {

    public Vehiculo cargarVehiculo() {
        Scanner leer = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese la Marca");
        vehiculo.setMarca(leer.nextLine());
        System.out.println("Ingrese el modelo");
        vehiculo.setModelo(leer.nextLine());
        System.out.println("Ingrese el año");
        vehiculo.setAnio(leer.nextInt());
        System.out.println("Ingrese numero de motor");
        vehiculo.setNumeroMotor(leer.nextLine());
        System.out.println("Ingrese el numero de Chasis");
        vehiculo.setChasis(leer.nextLine());
        System.out.println("Ingrese el color");
        vehiculo.setColor(leer.nextLine());
        int carroceria=0;
        do {
            System.out.println("Seleccione una de las siguientes opciones");
            for (TipoCarroceria object : TipoCarroceria.values()) {
                System.out.println(object.getClave() + "-" + object.getDescripcion());
            }
            carroceria = leer.nextInt();
            switch (carroceria) {
                case 1:
                    vehiculo.setTipo(TipoCarroceria.SEDAN);
                    break;
                case 2:
                    vehiculo.setTipo(TipoCarroceria.SUV);
                    break;
                case 3:
                    vehiculo.setTipo(TipoCarroceria.CONVERTIBLE);
                    break;
                case 4:
                    vehiculo.setTipo(TipoCarroceria.DOBLE_CABINA);
                    break;
                case 5:
                    vehiculo.setTipo(TipoCarroceria.FURGON);
                    break;
                case 6:
                    vehiculo.setTipo(TipoCarroceria.HATCHBACK);
                    break;
                case 7:
                    vehiculo.setTipo(TipoCarroceria.COUPE);
                    break;
                case 8:
                    vehiculo.setTipo(TipoCarroceria.BYD);
                    break;
                case 9:
                    vehiculo.setTipo(TipoCarroceria.STATION_WAGON);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(carroceria>9||carroceria<1);
        
        vehiculo.setPolizas(null);
        System.out.println(vehiculo);
        return vehiculo;
    }
}
