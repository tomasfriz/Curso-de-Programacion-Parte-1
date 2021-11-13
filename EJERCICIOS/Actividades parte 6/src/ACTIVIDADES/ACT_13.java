/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

import java.util.Arrays;

/**
 *
 * @author Tomy
 */
public class ACT_13 {

    public static void main(String[] args) {
        System.out.println("13) Buscar los dos mayores de un array de N datos.");

        int[] numeros = new int[5];
        int max = numeros[0], max1 = numeros[1];

        for (int i = 0; i < 5; i++) {
            numeros[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("");

        for (int i = 0; i < 5; i++) {

            if (numeros[i] >= max) {
                max1 = max;
                max = numeros[i];

            } else {
                if (numeros[i] > max1) {
                    max1 = numeros[1];
                }
            }

        }
        System.out.println("1° mayor: " + max + " 2° mayor: " + max1);

        System.out.println("version compacta");
        //ordeno de menor a mayor
        Arrays.sort(numeros);

        System.out.println("Primer mayor: " + numeros[numeros.length - 1]);
        System.out.println("Segundo mayor: " + numeros[numeros.length - 2]);

    }
}
