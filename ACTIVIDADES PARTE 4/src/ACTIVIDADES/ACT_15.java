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
public class ACT_15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("ingresa un numero: ");
        int entrada = leer.nextInt();
        int res = 0;

        //por cada valor de entrada
        for (int t = 1; t <= entrada; t++) {
            res += t; //agregar el valor actual de t

            System.out.print(t);

            if (t < entrada) {
                System.out.print("+");
            } else {
                System.out.print("=");
            }
        }
        System.out.println(res);
    }
}
