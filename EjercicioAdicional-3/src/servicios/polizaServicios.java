/*
   private int numeroPoliza;
   private LocalDate fechaInicio;
   private LocalDate finPoliza;
   private double montoTotal;
   private Cliente cliente;
   private boolean granizo;
   private double maximoGranizo;
   private TipoPoliza tipoPoliza;
   private Vehiculo vehiculo;
   private ArrayList<Cuota> cuotas;
   private FormaDePago formaPago;
 */
package servicios;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import enumeraciones.FormaDePago;
import enumeraciones.TipoPoliza;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class polizaServicios {

    public Poliza cargarPoliza(Cliente cliente, Vehiculo vehiculo) {
        //scanner
        Scanner leer = new Scanner(System.in);
       //crear poliza
        Poliza poliza = new Poliza();
         //cargar numero de poliza manual
        System.out.println("Ingrese el numero de Poliza");
        poliza.setNumeroPoliza(leer.nextInt());
        //cargar la fecha de inicio de la poliza ingresando dia mes y año para construirlo
        System.out.println("Ingrese el dia de inicio");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de inicio");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de inicio");
        int anio = leer.nextInt();
        //construccion de la fecha de inicio
        LocalDate inicio = LocalDate.of(anio, mes, dia);
        poliza.setFechaInicio(inicio);
        //envio de la información del cliente
        poliza.setCliente(cliente);
        //carga del monto total
        System.out.println("Ingrese el monto total");
        poliza.setMontoTotal(leer.nextDouble());
        //pregunta si cubre granizo y según respuesta carga verdadero o falso
        System.out.println("Ingrese si tiene cobertura en granizo S/N");
        String opcionGra = leer.next();
        //en caso de decir si en ranizo pide el monto de cobertura
        if (opcionGra.equalsIgnoreCase("S")) {
            poliza.setGranizo(true);
            System.out.println("Ingrese el monto total por granizo");
            poliza.setMaximoGranizo(leer.nextDouble());
        } else {
            poliza.setGranizo(false);
        }
        //carga de tipo de poliza según el enum TipoPoliza
        int opcionPol = 0;
        do {
            System.out.println("Seleccione una de las siguientes polizas");
            for (TipoPoliza object : TipoPoliza.values()) {
                System.out.println(object.Clave + "-" + object.Descripcion);
            }
            opcionPol = leer.nextInt();
            switch(opcionPol){
                case 1:
                    poliza.setTipoPoliza(TipoPoliza.RESPONSABILIDAD_CIVIL);
                    break;
                case 2:
                    poliza.setTipoPoliza(TipoPoliza.DANIOS_TERCEROS_Y_DESTRUCCION_TOTAL);
                    break;
                case 3:
                    poliza.setTipoPoliza(TipoPoliza.TODO_RIESGO);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcionPol > 3 || opcionPol < 1);
        //llama al médito para cargar vehiculo
        poliza.setVehiculo(vehiculo);
        //Ingreso de formas de pago según el Enum Fomra de Pago
        int opcion = 0;
            do {
                System.out.println("Ingrese una de las siguientes formas de pago");
                for (FormaDePago object : FormaDePago.values()) {
                    System.out.println(object.Clave + "-" + object.getDescripcion());
                }
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        poliza.setFormaPago(FormaDePago.VISA);
                        break;
                    case 2:
                        poliza.setFormaPago(FormaDePago.MASTERCARD);
                        break;
                    case 3:
                        poliza.setFormaPago(FormaDePago.PAGOS_LINK);
                        break;
                    case 4:
                        poliza.setFormaPago(FormaDePago.PAGO_MIS_CUENTAS);
                        break;
                    case 5:
                        poliza.setFormaPago(FormaDePago.EFECTIVO);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } while (opcion < 1 || opcion > 5);
        
        
        System.out.println("Ingrese la cantidad de cuotas");
        int cantidadCuota=leer.nextInt();
        //Agrega la cantidad de meses a la fecha de inicio
        LocalDate fin = poliza.getFechaInicio().plusMonths(cantidadCuota);
        poliza.setFinPoliza(fin);
        
        
        cuotaServicios cs = new cuotaServicios();
        
        cs.gargarCuotas(poliza,cantidadCuota);
        System.out.println(poliza);
        return poliza;

    }
}
