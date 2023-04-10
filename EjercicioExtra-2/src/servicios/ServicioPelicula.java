/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pelicula;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioPelicula {
    
    public Pelicula nuevaPelicula(){
        Scanner leer = new Scanner (System.in);
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el titulo");
        pelicula.setTitulo(leer.nextLine());
        System.out.println("Ingrese el nombre del director");
        pelicula.setDirector(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas");
        int horas = leer.nextInt();
        System.out.println("Ingrese la cnatidad de minutos");
        int minutos = leer.nextInt();
        LocalTime duracion = LocalTime.of(horas, minutos);
        pelicula.setDuracion(duracion);
        System.out.println("Ingrese la edad minima para ver la pelicula");
        pelicula.setEdadMinima(leer.nextInt());
        
        return pelicula;
        
    }
}
