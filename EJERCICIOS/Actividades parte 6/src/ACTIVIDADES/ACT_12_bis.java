/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tomy
 */
public class ACT_12_bis {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Defina tamaño del array: ");
        int n = lector.nextInt();

        System.out.print("Elija un n° para multiplos: ");
        int m = lector.nextInt();

        //invoco o llamo al metodo almacenarMultiplos
        almacenarMultiplos(n, m);
    }

    //defino de metodos
    public static void almacenarMultiplos(int pos, int nro) {
        int[] multiplos = new int[pos];

        for (int i = 0; i < pos; i++) {
            multiplos[i] = nro * (i + 1);

        }

        //invoco o llamo al metodo mostrarArray
        mostrarArray(multiplos);
    }

    public static void mostrarArray(int[] multiplos) {
        System.out.print(Arrays.toString(multiplos));
    }
}
