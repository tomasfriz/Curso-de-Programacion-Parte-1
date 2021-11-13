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
public class ACT_3 {

    public static void main(String[] args) {
        //Ingresar por teclado 3 números enteros (siempre hay 2 números positivos y 1 negativo)
        //Informar la multiplicación de los dos números positivos.
        Scanner lector = new Scanner(System.in);
        int r;
        System.out.print("a = ");
        int a = lector.nextInt();

        System.out.print("b = ");
        int b = lector.nextInt();

        System.out.print("c = ");
        int c = lector.nextInt();

        if (a * b >= 0) {
            r = a * b;
        } else {
            if (a * c >= 0) {
                r = a * c;
            } else {
                r = b * c;
            }
        }
        System.out.println("r = " + r);
    }
}
