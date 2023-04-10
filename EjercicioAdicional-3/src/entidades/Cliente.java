/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String Nombre;
    private String Apellido;
    private int documento;
    private String mail;
    private String domicilio;
    private int teléfono;
    private ArrayList<Poliza> polizas;

    public Cliente() {
    }

    public Cliente(String Nombre, String Apellido, int documento, String mail, String domicilio, int teléfono, ArrayList<Poliza> polizas) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.teléfono = teléfono;
        this.polizas = polizas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return "Cliente: " + "Nombre= " + Nombre + ", Apellido= " + Apellido + ", documento= " + documento + ", mail= " + mail + ", domicilio= " + domicilio + ", tel\u00e9fono= " + teléfono;
    }


}
