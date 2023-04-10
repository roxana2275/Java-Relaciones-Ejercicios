/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioadicional.pkg3;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import java.util.ArrayList;

import servicios.clienteServicios;
import servicios.polizaServicios;
import servicios.vehiculoServicios;

/**
 *
 * @author Usuario
 */
public class EjercicioAdicional3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clienteServicios cs = new clienteServicios();
        Cliente cliente = new Cliente();
        cliente=cs.cargarCliente();
        vehiculoServicios vs = new vehiculoServicios();
        Vehiculo vehiculo = new Vehiculo();
        vehiculo=vs.cargarVehiculo();
        polizaServicios ps = new polizaServicios();
        Poliza poliza = new Poliza();
        ArrayList<Poliza> polizas = new ArrayList();
        poliza=ps.cargarPoliza(cliente, vehiculo);
        polizas.add(poliza);
        cliente.setPolizas(polizas);
    }
    
}
