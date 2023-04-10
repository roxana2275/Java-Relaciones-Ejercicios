/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Asiento;
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCine {

    public Cine cargarSala() {
        Scanner leer = new Scanner(System.in);
        Cine cine = new Cine();
        ServicioAsientos sa = new ServicioAsientos();
        ServicioPelicula sp = new ServicioPelicula();
        ServicioEspectador se = new ServicioEspectador();

        cine.setSala(sa.cargarAsientos());
        System.out.println("Ingrese el valor de la entrada");
        cine.setPrecio(leer.nextInt());
        cine.setPelicula(sp.nuevaPelicula());

        ArrayList<Espectador> listaAleatoria = se.cargarEspectadorAleatorio();

        Random random = new Random();

        ArrayList<Asiento> auxSala = new ArrayList<>();

        for (int i = 0; i < cine.getSala().size(); i++) {
            int aleatorio = (int) Math.floor(Math.random() * (2 - 0 + 1));
            Espectador expectadorAux = listaAleatoria.get(i);
            if (edadCumple(cine.getPelicula(), expectadorAux)
                    && dineroCumple(cine, expectadorAux) && aleatorio != 0) {
                Asiento aux1 = cine.getSala().get(i);
                Asiento aux2;
                aux2 = new Asiento(aux1.getFila(), aux1.getColumna(), expectadorAux);
                auxSala.add(aux2);
            } else {
                Asiento aux1 = cine.getSala().get(i);
                auxSala.add(aux1);
            }
        }

        cine.setSala(auxSala);
        return cine;
    }

    public void imprimirSala(Cine cine) {

        for (int i = 0; i < cine.getSala().size(); i++) {
            Asiento auxSala = cine.getSala().get(i);

            if (auxSala.getEspectador() == null) {
                System.out.print(auxSala.getFila().getClave() + " " + auxSala.getColumna() + "   ||");
            } else {
                System.out.print(auxSala.getFila().getClave() + " " + auxSala.getColumna() + " X ||");
            }
            
            if (auxSala.getColumna().getClave() == 6) {
                System.out.println("");
            }

        }

    }

    private boolean edadCumple(Pelicula pelicula, Espectador espectador) {
        if (espectador.getEdad() >= pelicula.getEdadMinima()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean dineroCumple(Cine cine, Espectador espectador) {
        if (espectador.getSaldo() >= cine.getPrecio()) {
            return true;
        } else {
            return false;
        }

    }

}
