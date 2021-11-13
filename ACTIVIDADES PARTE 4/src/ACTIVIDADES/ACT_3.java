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
public class ACT_3 {
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int max = 0;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese primer numero: ");
        num1 = lector.nextInt();
        
        System.out.print("Ingrese segundo numero: ");
        num2 = lector.nextInt();
        while(num2 == num1)
        {
            System.out.print("ERROR, tiene que ser numeros diferentes, Reingrese: ");
            num2 = lector.nextInt();
        }
        while(num2 == num1)
        {
            System.out.print("ERROR, tiene que ser numeros diferentes, Reingrese: ");
            num2 = lector.nextInt();
        }       
        System.out.print("Ingrese tercer numero: ");
        num3 = lector.nextInt();
        while(num3 == num1 || num3 == num2)
        {
            System.out.print("ERROR, tiene que ser numeros diferentes, Reingrese: ");
            num3 = lector.nextInt();
        }
        max = num1;
        if (num2 > max) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }
        System.out.println("el numero mayor es: " + max);
    }
}
