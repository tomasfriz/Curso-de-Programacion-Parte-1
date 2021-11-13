/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

import java.util.Scanner;

/**
 *
 * @author Tomy
 */
public class ACT_18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("ingrese un numero natural: ");

        long n = leer.nextLong();

        if (n <= 0) {
            System.out.println("el numero ingresado no pertenece a los naturales...");
            return;
        }

        int resultado = 1;

        for (int f = 1; f <= n; f++) {
            resultado *= f;
        }

        System.out.println("factorial de " + n + " es " + resultado);
    }
}
