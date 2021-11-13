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
public class ACT_5 {
    public static void main(String[] args) {
        System.out.println("5) Crear un arreglo de n posiciones y llenarlo "
                + "con nombres de personas.");
        
        Scanner lector = new Scanner(System.in);
        System.out.print("ingrese la cantidad de posiciones del array: ");
        int posiciones = lector.nextInt();
        
        String [] nombres = new String[posiciones];
        
        //inicializo el array
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = lector.next();
        }
        
        //muestero el contenido del array
        System.out.println(Arrays.toString(nombres));
        
    }
}
