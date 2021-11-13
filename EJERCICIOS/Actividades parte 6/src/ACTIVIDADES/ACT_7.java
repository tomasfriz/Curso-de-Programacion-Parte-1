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
public class ACT_7 {
    public static void main(String[] args) {
        System.out.println("7) Desarrollar un algoritmo que permita pedir "
                + "al usuario un número entero T y otro M. La computadora "
                + "crea un arreglo de enteros de T posiciones cargado con "
                + "los múltiplos de M y lo muestra. Ejemplo: Se ingresa 4 y 6,"
                + " la computadora muestra: 0 6 12 18.");
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Declare cant posiciones: ");
        int T = lector.nextInt();
        
        System.out.print("Declare numero entero: ");
        int M = lector.nextInt();
        
        int [] multiplos = new int [T];
        
        for (int i = 0; i < T; i++) {
            multiplos [i] = M * i;
        }
        
        System.out.println(Arrays.toString(multiplos));
        
    }
}
