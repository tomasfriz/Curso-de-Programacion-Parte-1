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
public class ACT_13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese 2 numeros naturales...");

        System.out.print("base: ");
        int base = leer.nextInt();

        System.out.print("exponente: ");
        int exp = leer.nextInt();

        if (base <= 0 || exp <= 0) {
            System.out.println("los numeros ingresados no "
                    + "estan en el conjunto requerido");
            return; //finalizar la ejecucion del metodo actual
        }

        int res = base;

        //por cada valor en el exponente
        for (int times = 1; times <= exp - 1; times++) {
            res *= base; //multiplicar la base por si misma
        }

        System.out.println(res);
    }
}
