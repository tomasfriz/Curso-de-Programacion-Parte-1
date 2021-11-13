/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesDelCurso;

import java.util.Scanner;

/**
 *
 * @author Tomy
 */
public class ACT_1 {
    //Ingresar por teclado 2 números e informar cual es el mayor o si son iguales.
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese n1: ");
        int n1 = num.nextInt();
        
        System.out.println("Ingrese n2: ");
        int n2 = num.nextInt();
        
        if (n1 > n2) {
            System.out.println("n1 es el mayor: " + n1);
        } else {
            if (n2 > n1) {
                System.out.println("n2 es el mayor: " + n2);
            } else {
                System.out.println("n1 es igual que n2: " + n1);
            }
        }
    }
}
