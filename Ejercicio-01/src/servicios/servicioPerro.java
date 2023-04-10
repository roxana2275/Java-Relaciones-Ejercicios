/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Perro;
import enumeraciones.Raza;
import enumeraciones.Tamanio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioPerro {

    private ArrayList<Perro> perros = new ArrayList<>();

    public servicioPerro() {
        this.perros = perros;
    }

    public ArrayList<Perro> cargarPerro() {
        Scanner leer = new Scanner(System.in);
        Perro pe = new Perro();
        System.out.println("Ingrese el nombre del perro");
        pe.setNombre(leer.nextLine());
       
        boolean razaOk = false;
        do {
            System.out.println("Ingrese la raza de perro");
            String raz = leer.nextLine();
            for (Raza aux : Raza.values()) {
                
                if (raz.equalsIgnoreCase(aux.getDescripcion())) {
                    pe.setRaza(aux);
                    razaOk = true;
                    break;
                }
            }
        } while (razaOk == false);
        
        System.out.println("Ingrese la edad del perro");
        pe.setEdad(leer.nextInt());
        
        boolean pesoOk = false;
        do {
            pesoOk=false;
            System.out.println("Ingrese el tamaño del perro: ");
            System.out.println("1-Pequeño 0-10 Kilos");
            System.out.println("2-Mediano 11 a 25 Kilos");
            System.out.println("3-Grande 25 a 50 Kilos");
            System.out.println("4-Gigante mas de 50 Kilos");
            int tamanio = leer.nextInt();
            switch (tamanio) {
                case 1:
                    pe.setTamanio(Tamanio.PEQUENIO);
                    break;
                case 2:
                    pe.setTamanio(Tamanio.MEDIANO);
                    break;
                case 3:
                    pe.setTamanio(Tamanio.GRANDE);
                    break;
                case 4:
                    pe.setTamanio(Tamanio.GIGANTE);
                    break;
                default:
                    pesoOk = true;
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (pesoOk == true);

        perros.add(pe);
        System.out.println("Quiere ingresar otro perro S/N");
        String opcion = leer.next().toUpperCase();
        if (opcion.equalsIgnoreCase("S")) {
            cargarPerro();
        }
        return perros;

    }
}
