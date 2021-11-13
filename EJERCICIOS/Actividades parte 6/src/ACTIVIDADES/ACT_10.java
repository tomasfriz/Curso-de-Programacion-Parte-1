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
public class ACT_10 {

    public static void main(String[] args) {
        System.out.println("10) Almacenar en un arreglo de n posiciones nombres "
                + "de países. Implementar una opción que al digitar una posición "
                + "muestre el dato que contiene.");

        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese cant de posiciones que desea: ");
        int n = lector.nextInt();

        String[] paises = new String[n];

        //inicializacion del array
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un pais: ");
            paises[i] = lector.next();
        }

        System.out.println("");
        System.out.println("Contenido del array: " + Arrays.toString(paises));

        System.out.print("\nIngrese la posicion: ");
        int posicion = lector.nextInt();

        System.out.println("Pais en la posicion " + posicion + " = " + paises[posicion]);

    }
}
