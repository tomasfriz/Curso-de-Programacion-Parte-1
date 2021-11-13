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
public class ACT_3 {

    public static void main(String[] args) {
        System.out.println("3) Desarrollar un algoritmo que permita mostrar "
                + "un arreglo de caracteres de atrás para adelante. "
                + "Ejemplo: Arreglo {‘A’,’V’,’A’,’J’}, la computadora muestra: "
                + "‘J’ ‘A’ ‘V’ ‘A’.");

        String[] letras = {"A", "V", "A", "J"};

        for (int i = letras.length - 1; i >= 0; i--) {
            System.out.print(letras[i]);
        }

        System.out.println("");
    }
}
