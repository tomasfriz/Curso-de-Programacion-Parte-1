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
public class ACT_22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String input;

        int intentos = 3;

        String correcto = "eureka";

        System.out.println("Ingrese la contraseña...");

        do {
            System.out.println("intentos: " + intentos);

            input = leer.next();

            intentos--;
        } while (intentos > 0 && !input.equals(correcto));

        if (input.equals(correcto)) {
            System.out.println("Bienvenido");
        }
        else
        {
            System.out.println("Lo siento te quedaste sin intentos.");
        }

    }
}
