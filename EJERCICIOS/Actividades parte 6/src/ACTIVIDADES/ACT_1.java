/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tomy
 */
public class ACT_1 {
    public static void main(String[] args) {
        System.out.println("1) Crear un array o arreglo unidimensional con un tamaño de 5, "
                + "asignale los valores numéricos ingresados por teclado y mostralos por "
                + "pantalla.");
        
        int [] numeros = new int [5];
        Scanner lector = new Scanner(System.in);
     
        //inicializo el array
        for (int i = 0; i < numeros.length; i++) 
        {
            System.out.printf("Introduzca número : ", i+1);
            numeros[i] = lector.nextInt();
        }
        
          //muestro el contenido del array
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

        System.out.println(Arrays.toString(numeros));
    }
}
