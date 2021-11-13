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
public class ACT_9 {

    public static void main(String[] args) {
        System.out.println("9) Llenar un vector con números enteros "
                + "(números positivos ó negativos). Mostrar la cantidad "
                + "de números positivos y la cantidad de números negativos "
                + "que hay en dicho arreglo.");

        int[] n = {5, -6, 7, 10, -14, -3, 8};
        int pos = 0, neg = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] < 0) {
                neg++;
            }
            if (n[i] >= 0) {
                pos++;
            }
        }
        //Arrays.sort(ne);
        System.out.println(Arrays.toString(n));
        System.out.println("Cantidad de (+)= " + pos);
        System.out.println("Cantidad de (-)= " + neg);
    }
}
