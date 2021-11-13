/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ACT_4 {
     public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = num.nextInt();
        
        if (n <= 0 ) {
            System.out.println("ERROR!!!");
        }
        else
        {
            System.out.println("La suma de los numeros es: " + Math.pow(n, 2));
            System.out.println("La suma de los numeros es: " + Math.sqrt(n));
        }
    }
}
