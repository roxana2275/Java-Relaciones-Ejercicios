/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.TipoCarroceria;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
     private String Marca;
     private String modelo;
     private int anio;
     private String numeroMotor;
     private String chasis;
     private String color;
     private TipoCarroceria tipo;
     private Poliza polizas;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, String modelo, int anio, String numeroMotor, String chasis, String color, TipoCarroceria tipo, Poliza polizas) {
        this.Marca = Marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.polizas = polizas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoCarroceria getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarroceria tipo) {
        this.tipo = tipo;
    }

    public Poliza getPolizas() {
        return polizas;
    }

    public void setPolizas(Poliza polizas) {
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Marca=" + Marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + ", polizas=" + polizas + '}';
    }
     
}
