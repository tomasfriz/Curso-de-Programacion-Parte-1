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
public class ACT_6 {

    public static void main(String[] args) {
        System.out.println("6) Crear un arreglo de n posiciones y llenarlo "
                + "con los números que el usuario desee y luego busque en "
                + "el array un número ingresado por teclado.");

        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese cant de posiciones que desea: ");
        int n = lector.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese los numeros que desee: ");
            numeros[i] = lector.nextInt();
        }

        System.out.println("");
        System.out.println("Los numeros elegidos son: " + Arrays.toString(numeros));

        System.out.print("\nNumero del que quiero saber posicion: ");
        int a = lector.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            if (a == numeros[i]) {
                System.out.println("Posicion n°: " + Arrays.binarySearch(numeros, a));
            }

        }
    }
}
