/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

/**
 *
 * @author Tomy
 */
public class ACT_14 {

    public static void main(String[] args) {
        System.out.println("14) Buscar el valor mayor de un array de N datos "
                + "utilizando un bucle for mejorado.");

        int[] vec = {12, 89, 43, 57, 5};

        int max = 0;

        //foreach o for mejorado
        for (int unValor : vec) {
            if (unValor > max) {
                max = unValor;
            }
        }

        System.out.println("maximo = " + max);

    }
}
