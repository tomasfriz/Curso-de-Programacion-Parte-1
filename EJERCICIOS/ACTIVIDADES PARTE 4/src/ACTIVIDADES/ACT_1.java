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
public class ACT_1 {
    public static void main(String[] args) {
        
        int suma = 0;
        int multi = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese primer numero: ");
        num1 = lector.nextInt();

        System.out.print("Ingrese segundo numero: ");
        num2 = lector.nextInt();

        System.out.print("Ingrese tercer numero: ");
        num3 = lector.nextInt();
        
        if (num1 < 0) {
            multi = num1 * num2 * num3;
            System.out.println("El producto de los numeros es: " + multi);
        }
        else
        {
            suma = num1 + num2 + num3;
            System.out.println("La suma de los numeros es: " + suma);
        }
    }
}
