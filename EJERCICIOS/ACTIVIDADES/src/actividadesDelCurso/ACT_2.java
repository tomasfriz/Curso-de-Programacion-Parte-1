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
public class ACT_2 {

    public static void main(String[] args) {
        //Ingresar por teclado 3 números enteros y distintos e informar cual es el mayor.
        Scanner lector = new Scanner(System.in);
        int max;
        //ingreso de datos
        System.out.print("a = ");
        int a = lector.nextInt();

        System.out.print("b = ");
        int b = lector.nextInt();

        System.out.print("c = ");
        int c = lector.nextInt();

        //Logica
        max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        System.out.print("max = " + max);
        
    }
}
