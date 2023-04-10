/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.FormaDePago;
import enumeraciones.TipoPoliza;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Poliza {
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

    public Poliza() {
    }

    public Poliza(int numeroPoliza, LocalDate fechaInicio, LocalDate finPoliza, double montoTotal, Cliente cliente, boolean granizo, double maximoGranizo, TipoPoliza tipoPoliza, Vehiculo vehiculo, ArrayList<Cuota> cuotas, FormaDePago formaPago) {
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.finPoliza = finPoliza;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.granizo = granizo;
        this.maximoGranizo = maximoGranizo;
        this.tipoPoliza = tipoPoliza;
        this.vehiculo = vehiculo;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
    }



    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFinPoliza() {
        return finPoliza;
    }

    public void setFinPoliza(LocalDate finPoliza) {
        this.finPoliza = finPoliza;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMaximoGranizo() {
        return maximoGranizo;
    }

    public void setMaximoGranizo(double maximoGranizo) {
        this.maximoGranizo = maximoGranizo;
    }

    public TipoPoliza getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(TipoPoliza tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public FormaDePago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaDePago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", finPoliza=" + finPoliza + ", montoTotal=" + montoTotal + ", cliente=" + cliente + ", granizo=" + granizo + ", maximoGranizo=" + maximoGranizo + ", tipoPoliza=" + tipoPoliza + ", vehiculo=" + vehiculo + ", cuotas=" + cuotas + ", formaPago=" + formaPago + '}';
    }

    public void getFormaPago(FormaDePago formaDePago) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
