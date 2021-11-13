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
public class ACT_12 {
    public static void main(String[] args) {
        Scanner contar = new Scanner(System.in);
        int acum = 0;
        for (int veces = 0; veces < 5; veces++) {
            System.out.print("Escriba un número: ");
            int num = contar.nextInt();
            acum+=num;
        }
        System.out.println("La suma total es: " + acum);
    }
}
