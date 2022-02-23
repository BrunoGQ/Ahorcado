/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjAhorcado;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Servicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra");
        String palabra = sc.next();

        String[] vector = new String[palabra.length()];
        String[] asteriscos = new String[palabra.length()];
        vector = llenarVector(vector, palabra);
        asteriscos = llenarVectorAsterisco(vector.length);

        System.out.println("Ingrese la cantidad de jugadas");
        Ahorcado j1 = new Ahorcado(vector, asteriscos, 0, sc.nextInt());
        System.out.println(j1.getCantLetras());
        return j1;
    }

    private String[] llenarVector(String[] v, String p) {

        for (int i = 0; i < p.length(); i++) {
            v[i] = p.substring(i, i + 1);
        }

        return v;
    }

    private String[] llenarVectorAsterisco(int aux) {
        String[] v = new String[aux];
        for (int i = 0; i < v.length; i++) {
            v[i] = "*";
        }

        return v;
    }

    public Ahorcado buscarLetra(Ahorcado a) {
        String letra;
        boolean control;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("----------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        mostrar(a.getAsteriscos());

        do {
            System.out.println("Ingrese la letra que desea buscar");

            letra = sc.next();
            control = controlLetra(a, letra);
        } while (letra.length() != 1 || control);

        int aux = 0;

        for (int i = 0; i < a.getPalabra().length; i++) {

            if (a.getPalabra()[i].equalsIgnoreCase(letra)) {
                a.getAsteriscos()[i] = letra;
                aux++;

            }

        }

        switch (aux) {
            case 0:
                System.out.println("");
                System.out.println("No se encontraron letras (" + letra + ") en la palabra");

                System.out.println("");
                intentos(a, aux);

                break;
            case 1:
                System.out.println("");
                System.out.println("Se encontró una letra (" + letra + ") en la palabra");

                System.out.println("");

                intentos(a, aux);
                break;
            default:
                System.out.println("");
                System.out.println("Se encontraron " + aux + " letras (" + letra + ") en la palabra");

                System.out.println("");

                intentos(a, aux);
                break;
        }
        return a;

    }

    public void mostrar(String[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "] ");
        }
        System.out.println("");

    }

    private void intentos(Ahorcado a, int aux) {
        if (aux == 0) {
            a.setCantJugadas(a.getCantJugadas() - 1);
        }
        a.setCantLetras(a.getCantLetras() + aux);

        System.out.println("Oportunidades restantes : [" + a.getCantJugadas() + "]");
        System.out.println("Letras encontradas : [" + a.getCantLetras() + "]");

    }

    private boolean controlLetra(Ahorcado a, String letra) {
        boolean esta = false;

        for (int i = 0; i < a.getAsteriscos().length; i++) {
            if (a.getAsteriscos()[i].equalsIgnoreCase(letra)) {
                esta = true;

            }

        }
        if (esta) {
            System.out.println("");
            System.out.println("Esta letra ya se ha encontrado");
            System.out.println("");
        }

        return esta;

    }

}
