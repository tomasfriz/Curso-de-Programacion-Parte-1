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
public class ACT_17 {

    public static void main(String[] args) {
        Scanner algoritmo = new Scanner(System.in);

        System.out.print("Cantidad de números a ingresar: ");
        int cant_num = algoritmo.nextInt();

        int mayor = 0;
        int guardado = 0;
        for (int ciclo = 1; ciclo <= cant_num; ciclo++) {
            System.out.print("Ingrese un número: ");
            int numeros = algoritmo.nextInt();

            if (numeros > mayor) {
                mayor = numeros;
                guardado = ciclo;
            }
        }
        System.out.println("El número mayor es: " + mayor + " y apareció en la " + guardado + "° posición");
    }
}
