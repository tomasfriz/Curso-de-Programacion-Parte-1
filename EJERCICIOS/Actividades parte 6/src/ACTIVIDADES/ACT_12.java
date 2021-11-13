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
public class ACT_12 {
    public static void main(String[] args) {
        System.out.println("12) Crear un array o arreglo unidimensional donde "
                + "le indiques el tamaño por teclado y crear una función que "
                + "rellene el array o arreglo con los múltiplos de un número "
                + "pedido por teclado. Por ejemplo, si defino un array de "
                + "tamaño 5 y elijo un 3 en la función, el array contendrá "
                + "3, 6, 9, 12, 15. Mostrarlos por pantalla usando otra función "
                + "distinta.");
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Defina tamaño del array: ");
        int n = lector.nextInt();
        
        System.out.print("Elija un n° para multiplos: ");
        int m = lector.nextInt();
        
        
        int [] multiplos = new int [n];
        
        for (int i = 0; i < n; i++) {
            multiplos [i] = m * i;
            
        }
        System.out.print(Arrays.toString(multiplos));
    }
}
