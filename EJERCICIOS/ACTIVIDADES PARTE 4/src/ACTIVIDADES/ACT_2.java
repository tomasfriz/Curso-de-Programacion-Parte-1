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
public class ACT_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = num.nextInt();
        
        if (n > 0) {
            System.out.println("n es positivo.");
        } else {
            if (n < 0) {
                System.out.println("n es negativo.");
            } else {
                System.out.println("n es cero.");
            }
        }
    }
}
