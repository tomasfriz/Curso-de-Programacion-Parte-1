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
public class ACT_11 {
    public static void main(String[] args) {
        System.out.println("11) Cargar un vector con números aleatorios y poner "
                + "en cero el valor de una posición determinada por el usuario.");
        
        Scanner lector = new Scanner(System.in);
        
//        System.out.print("Ingrese la cantidad de posiciones del array: ");
//        int posiciones = lector.nextInt();
        
        //inicializo el array con numeros aleatorios
        
        
        //version Mauro

//            int[] n = {(int) Math.floor(Math.random() * 10 + 1),
//                
//            (int) Math.floor(Math.random() * 10 + 1),
//            (int) Math.floor(Math.random() * 10 + 1),
//            (int) Math.floor(Math.random() * 10 + 1),
//            (int) Math.floor(Math.random() * 10 + 1),
//            (int) Math.floor(Math.random() * 10 + 1),
//            (int) Math.floor(Math.random() * 10 + 1),
//            (int) Math.floor(Math.random() * 10 + 1)};
//         
//         System.out.println(Arrays.toString(n));
//        
//        System.out.print("Elegir valor de posicion: ");
//        int a = lector.nextInt();
//        
//        for (int i = 0; i < n.length ;i++) 
//        {
//            if (a == i) 
//            {
//                n[a] = 0;
//                System.out.println("El valor de la posicion " + a + " es: " + n[a]);
//            }
//        }
//        
//        System.out.println(Arrays.toString(n));
        
        //version Tomas
        int pos = 0;
        int [] n = new int[5];
        
        for (int i = 0; i < n.length; i++)
        {
            n[i]=(int)(Math.random()*5);
        }
        System.out.println(Arrays.toString(n));
        System.out.print("ingrese una posicion: ");
        pos = lector.nextInt();
         n[pos]= 0;
        System.out.println(Arrays.toString(n));
    }
}
