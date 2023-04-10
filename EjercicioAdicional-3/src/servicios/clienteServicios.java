/*
    private String Nombre;
    private String Apellido;
    private int documento;
    private String mail;
    private String domicilio;
    private int teléfono;
    private ArrayList<Poliza> polizas;
 */
package servicios;

import entidades.Cliente;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class clienteServicios {
    
    public Cliente cargarCliente(){
        Scanner leer = new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.println("Ingrese el nombre");
        cliente.setNombre(leer.nextLine());
        System.out.println("Ingrese el Apellido");
        cliente.setApellido(leer.nextLine());
        System.out.println("Ingrese el mail");
        cliente.setMail(leer.nextLine());
        System.out.println("Ingrese el domicilio");
        cliente.setDomicilio(leer.nextLine());
        System.out.println("Ingrese el telefono");
        cliente.setTeléfono(leer.nextInt());
        cliente.setPolizas(null);
        polizaServicios sp = new polizaServicios();
        
        cliente.toString();
        return cliente;
    }
    

    
}
