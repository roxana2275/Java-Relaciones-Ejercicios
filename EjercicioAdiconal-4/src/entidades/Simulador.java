/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Simulador {

    private static final String[] NOMBRES = {"Juan", "María", "Pedro", "Luisa", "Ana", "Jorge", "Carla", "Diego",
                                            "Lucía", "Santiago"};
    private static final String[] APELLIDOS = {"Pérez", "García", "Fernández", "Martínez", "Rodríguez", "Sánchez",
                                            "González", "Romero", "Álvarez", "Torres"};
    private static final int DNI_MINIMO = 10000000;
    private static final int DNI_MAXIMO = 99999999;

    public List<Alumno> generarAlumnosAleatorios(int cantidad) {
        List<Alumno> alumnos = new ArrayList<>();
        HashSet<Integer> dnis = new HashSet<>();
        Random random = new Random();

        while (alumnos.size() < cantidad) {
            String nombre = NOMBRES[random.nextInt(NOMBRES.length)];
            String apellido = APELLIDOS[random.nextInt(APELLIDOS.length)];
            String nombreCompleto = nombre + " " + apellido;

            int dni = random.nextInt(DNI_MAXIMO - DNI_MINIMO + 1) + DNI_MINIMO;
            if (!dnis.contains(dni)) {
                Alumno alumno = new Alumno(nombreCompleto, dni);
                alumnos.add(alumno);
                dnis.add(dni);
            }
        }

        return alumnos;
    }
/*
    public List<Integer> generarDnisPosibles(int cantidad) {
        List<Integer> dnis = new ArrayList<>();
        Random random = new Random();

        while (dnis.size() < cantidad) {
            int dni = random.nextInt(DNI_MAXIMO - DNI_MINIMO + 1) + DNI_MINIMO;
            if (!dnis.contains(dni)) {
                dnis.add(dni);
            }
        }

        return dnis;
    }*/
    
    public void votacion(ArrayList alumnos){
        Random random = new Random();
        int voto = random.nextInt(3 - 0 + 1) + 0;
    }
}
