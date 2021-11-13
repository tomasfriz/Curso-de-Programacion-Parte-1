
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tomy
 */
public class ACT_8 {

    public static void main(String[] args) {
        System.out.println("8) Desarrollar un algoritmo que permita ingresar "
                + "5 números pertenecientes al arreglo A y otros 5 números "
                + "pertenecientes al arreglo B. La computadora crea y muestra "
                + "un arreglo C, donde cada posición es el resultado de la suma "
                + "del número en la misma posición en el arreglo A con el "
                + "número en la misma posición en el arreglo B. Ejemplo: Se "
                + "ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra: "
                + "5 9 4 7 11.");

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 7, 1, 3, 6};
        int[] c = new int[5];

        //sumo
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }

        //muestro el contenido del array c
        System.out.println(Arrays.toString(c));
    }
}
