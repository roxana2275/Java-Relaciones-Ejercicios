/*
 private int numCuota;
    private double montoTotalCuota;
    private boolean pagada;
    private LocalDate fechaVencimiento;
    private FormaDePago formaPago;
    private Poliza poliza;
 */
package servicios;

import entidades.Cuota;
import entidades.Poliza;
import enumeraciones.FormaDePago;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class cuotaServicios {

    public ArrayList gargarCuotas(Poliza poliza, int cantidad) {
        ArrayList<Cuota> cuotaPoliza = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        FormaDePago forma=poliza.getFormaPago();
        for (int i = 0; i < cantidad; i++) {
            Cuota cuota = new Cuota();
            cuota.setNumCuota(i);
            cuota.setPoliza(poliza);
            cuota.setPagada(false);
            cuota.setFormaPago(forma);
            cuota.setFechaVencimiento(poliza.getFechaInicio().plusMonths(i));
            cuota.setMontoTotalCuota((poliza.getMontoTotal() + poliza.getMaximoGranizo()) /  cantidad);
            Duration duracion = Duration.between(poliza.getFechaInicio().atStartOfDay(), poliza.getFinPoliza().atStartOfDay());
            long duracionCuota = duracion.toDays() / cantidad;
            LocalDate fechaVencimiento = poliza.getFechaInicio().plusDays(i * duracionCuota);
            cuotaPoliza.add(cuota);
        }
        System.out.println(cuotaPoliza);
        return cuotaPoliza;

    }
}
