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
public class ACT_28 {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.print("Escriba el dividendo: ");
        int dividendo = numeros.nextInt();
        System.out.print("Escriba el divisor: ");
        int divisor = numeros.nextInt();
        while (divisor == 0) {
            System.out.print("Escriba el divisor: ");
            divisor = numeros.nextInt();
        }
        int resultado = dividendo / divisor;
        System.out.println("El resultado de la división es: " + resultado);
    }
}
