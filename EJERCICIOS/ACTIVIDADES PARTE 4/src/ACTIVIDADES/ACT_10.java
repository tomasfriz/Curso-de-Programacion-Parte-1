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
public class ACT_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int input;

        do {
            System.out.println(" Men\u00fa de recomendaciones "
                    + "1. Literatura "
                    + "2. Cine "
                    + "3. M\u00fasica "
                    + "4. Videojuegos "
                    + "5. Salir ");
			//las 3 comillas inician y finalizan un bloque de texto literal
			
			input = leer.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Lecturas recomendables:\n"
                            + //"\n" imprime una linea nueva 
                            "+ Esperándolo a Tito y otros cuentos de fútbol (Eduardo Sacheri)\n"
                            + "+ El juego de Ender (Orson Scott Card)\n"
                            + "+ El sueño de los héroes (Adolfo Bioy Casares)");
                    break;
                case 2:
                    System.out.println("Películas recomendables:\n"
                            + "+ Matrix (1999)\n"
                            + "+ El último samurai (2003)\n"
                            + "+ Cars (2006)");
                    break;

                case 3:
                    System.out.println("Discos recomendables:\n"
                            + "+ Despedazado por mil partes (La Renga, 1996)\n"
                            + "+ Bufalo (La Mississippi, 2008)\n"
                            + "+ Gaia (Mägo de Oz, 2003)");
                    break;

                case 4:
                    System.out.println("Videojuegos clásicos recomendables:\n"
                            + "+ Día del tentáculo (LucasArts, 1993)\n"
                            + "+ Terminal Velocity (Terminal Reality/3D Realms, 1995)\n"
                            + "+ Death Rally (Remedy/Apogee, 1996)");
                    break;

                case 5: //si el usuario ingresa un 5
                    System.out.println("Adiós!");
                    return; //terminar la ejecucion del metodo

                default:
                    System.out.println("Opcion invalida");
                    System.out.print("\n\n\n"); //imprimir 3 lineas nuevas
            }
        } while (input < 1 || input > 5);
    }
}
