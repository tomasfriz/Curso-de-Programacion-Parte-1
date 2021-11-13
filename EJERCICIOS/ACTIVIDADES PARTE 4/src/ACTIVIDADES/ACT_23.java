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
public class ACT_23 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int contador = -1;
        double acumulador = 0;
        double input;

        double maximo = -999999999;
        double minimo = 999999999;
        double promedio;

        do {
            System.out.print("ingrese el " + (contador + 2) + "° numero: ");

            input = leer.nextDouble();

            if (maximo < input) {
                maximo = input;
            }

            if (minimo > input && input != 0) {
                minimo = input;
            }

            acumulador += input;

            contador++;
        } while (input != 0);

        if (contador == 0) {
            return;
        }

        promedio = acumulador / (double) contador;

        System.out.println("maximo = " + maximo);
        System.out.println("minimo = " + minimo);
        System.out.println("promedio = " + promedio);

    }
}
