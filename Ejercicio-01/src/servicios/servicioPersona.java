/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioPersona {
    private ArrayList<Persona> personas = new ArrayList<>();

    public servicioPersona() {
        this.personas=personas;
    }
    
    public void cargarPersona(){
        Scanner leer = new Scanner (System.in);
        Persona p = new Persona();
        System.out.println("Ingrese el nombre: ");
        p.setNombre(leer.nextLine());
        System.out.println("Inferese el apellido:");
        p.setApellido(leer.nextLine());
        System.out.println("Ingrese la edad: ");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el DNI");
        p.setDocumento(leer.nextInt());
        
        servicioPerro servPerro = new servicioPerro();
        ArrayList<Perro> listaPerro = new ArrayList<Perro>();
        
        System.out.println("Ingrese la información del perro a adoptar");
        listaPerro = servPerro.cargarPerro();
        p.setPerro(listaPerro);
        System.out.println("Ser cargo algo");
        mostrarPersona(p);
    }
    
    public void mostrarPersona(Persona peu){
        
            System.out.println(peu.toString());
        
    }
}
