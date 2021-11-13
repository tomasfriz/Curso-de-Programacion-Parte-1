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
public class ACT_27 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int num_1=1;
        int num_2=1;
        while(num_1!=0 || num_2!=0){
            System.out.print("Ingrese el primer número: ");
        num_1=numeros.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num_2=numeros.nextInt();
        if (num_1!=0 || num_2!=0){
              int suma= num_1+num_2;
            System.out.println("La suma de los números pares es: "+suma);
            System.out.println("");
        }
          
        }
        System.out.println("El programa concluyó");
    }
}
