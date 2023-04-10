/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Compartadores.Comparador;
import Entidades.Baraja;
import Entidades.Carta;
import Entidades.enumeraciones.Numeros;
import Entidades.enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Usuario Final
 */
public class ServiciosBaraja {

    public Baraja crearBaraja() {
        ArrayList<Carta> usadas = new ArrayList<Carta>();
        ArrayList<Carta> cartas = new ArrayList<Carta>();
        for (Palo aux : Palo.values()) {
            for (Numeros aux2 : Numeros.values()) {
                Carta carta = new Carta();
                carta.setNumero(aux2);
                carta.setPalo(aux);

                cartas.add(carta);
            }
        }
        Baraja baraja = new Baraja();
        baraja.setCarta(cartas);
        baraja.setUsadas(usadas);
        return baraja;

    }

    public void barajar(Baraja x) {


        Collections.shuffle(x.getCarta());

        System.out.println(x.getCarta().toString());

    }

    public void ordenar(Baraja x) {


        Collections.sort(x.getCarta(), Comparador.ordenarPorNumero);
        Collections.sort(x.getCarta(), Comparador.ordenarPorPalo);
        System.out.println(x.getCarta().toString());

    }
//    siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.

    public void siguienteCarta(Baraja x) {

        System.out.println("La carta entregada es " + x.getCarta().get(0));
        Carta cartaUsada = x.getCarta().get(0);
        ArrayList<Carta> arrayCartaUsada = x.getUsadas();
        arrayCartaUsada.add(cartaUsada);
        x.setUsadas(arrayCartaUsada);
        x.getCarta().remove(0);

    }

    public void cartasDisponibles(Baraja x) {
        System.out.println("La cantidad de cartas disponibles es : " + x.getCarta().size());
    }

    public void darCartas(Baraja x) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cartas a dar:");
        int cantidad = leer.nextInt();
        if (cantidad > x.getCarta().size()) {
            System.out.println("No hay suficientes cartas");

        } else {
            for (int i = 0; i < cantidad; i++) {
                siguienteCarta(x);
            }
        }
    }

    public void cartasMonton(Baraja x){
        if(x.getUsadas().isEmpty()){
            System.out.println("No hay cartas usadas");
        }else{
            System.out.println("Las cartas usadas son");
            for (int i = 0; i < x.getUsadas().size(); i++) {
                System.out.println(x.getUsadas().get(i));
            }
        }
    }

    public void mostrarBaraja( Baraja x){
        for (int i = 0; i < x.getCarta().size(); i++) {
            System.out.println(x.getCarta().get(i));
        }
    }
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    
    public void menu(){
        Scanner leer = new Scanner (System.in);
        Baraja baraja = new Baraja();
        baraja = crearBaraja();
        int opcion=0;
        do{
        System.out.println("Ingrese una de las siguientes opciones");
        System.out.println("1-barajar");
        System.out.println("2-ordenar");
        System.out.println("3-Pedir cartas");
        System.out.println("4-Consultar cuantas cartas quedan");
        System.out.println("5-Mostrar cartas usadas");
        System.out.println("6-Mostrar la cartas que quedan");
        System.out.println("9-Salir");
        opcion=leer.nextInt();
        
        switch(opcion){
            case 1:
                barajar(baraja);
                break;
            case 2:
                ordenar(baraja);
                break;
            case 3:
                darCartas(baraja);
                break;
            case 4:
                cartasDisponibles(baraja);
                break;
            case 5:
                cartasMonton(baraja);
                break;
            case 6:
                mostrarBaraja(baraja);
                break;
            case 9:
                System.out.println("Muchas gracias por jugar");
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
            
        }while(opcion!=9);
        
    }
}
