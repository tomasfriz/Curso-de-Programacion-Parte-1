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
public class ACT_2 {

    public static void main(String[] args) {
        System.out.println("2) Desarrollar un algoritmo que permita mostrar "
                + "un arreglo de enteros con sus valores a la mitad. "
                + "Ejemplo: Arreglo {1,2,3,4}, la computadora muestra:"
                + " 0.5 1.0 1.5 2.0.");

        double[] ent = {1, 3, 5, 7, 9};

        for (int i = 0; i < ent.length; i++) {
            System.out.println(ent[i] / 2);
        }

    }
}
