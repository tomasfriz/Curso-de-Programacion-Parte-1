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
public class ACT_24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String elec;

        double input;

        int contador = 0;

        do {
            System.out.print("Ingrese el numero: ");
            input = leer.nextDouble();

            if (input % 2 == 0) {
                contador++;
            }

            System.out.print("¿Desea ingresar otro numero? (S/N): ");
            elec = leer.next();
        } while (elec.equalsIgnoreCase("s") && !elec.equalsIgnoreCase("n"));

        System.out.println("Ingresaste " + contador + " numeros pares");

    }
}
