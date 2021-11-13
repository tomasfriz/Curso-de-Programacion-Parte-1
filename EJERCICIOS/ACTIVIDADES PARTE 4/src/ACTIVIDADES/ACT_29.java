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
public class ACT_29 {

    public static void main(String[] args) {
        Scanner calendario = new Scanner(System.in);

        System.out.println("Ingrese un día del mes: ");
        int dia = calendario.nextInt();
        String mes_palabra = "";

        int año;
        int mes;

        if (1 > dia || dia > 31) {
            System.out.println("No es un día válido de ningún mes");

        } else {
            System.out.println("Ingrese un mes del año (en números): ");

            mes = calendario.nextInt();

            if (((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31) || (mes == 2 && dia == 30)) {

                System.out.println("El mes elegido no contiene ese día");

            } else {
                if (1 > mes || mes > 12) {
                    System.out.println("No es un mes válido del año");

                } else {
                    System.out.println("Ingrese un año d.C.: ");
                    año = calendario.nextInt();
                    if (año <= 0) {
                        System.out.println("No es un año d.C.");
                    } else {
                        if ((dia == 29) && (mes == 2) && ((año > 0) && (año % 4 != 0) || ((año % 100 == 0) && (año % 400 != 0)))) {
                            System.out.println("El año elegido no contiene ese día en el calendario");
                        } else {
                            if (mes == 1) {
                                mes_palabra = ("enero");

                            }
                            if (mes == 2) {
                                mes_palabra = ("febrero");

                            }
                            if (mes == 3) {
                                mes_palabra = ("marzo");

                            }
                            if (mes == 4) {
                                mes_palabra = ("abril");

                            }
                            if (mes == 5) {
                                mes_palabra = ("mayo");
                            }
                            if (mes == 6) {
                                mes_palabra = ("junio");

                            }
                            if (mes == 7) {
                                mes_palabra = ("julio");

                            }
                            if (mes == 8) {
                                mes_palabra = ("agosto");

                            }

                            if (mes == 9) {

                                mes_palabra = ("septiembre");

                            }
                            if (mes == 10) {
                                mes_palabra = ("octubre");

                            }
                            if (mes == 11) {
                                mes_palabra = ("noviembre");

                            }
                            if (mes == 12) {
                                mes_palabra = ("diciembre");

                            }

                            if ((dia >= 1 && dia <= 28 && mes >= 1 && mes <= 12 && año > 0) || (dia == 29) && (año > 0) && ((mes == 1) || ((mes >= 3) || (mes <= 12)) || (mes == 2) && ((año % 4 == 0) && (año % 100 != 0 || año % 400 == 0))) || (dia == 30 && (mes == 1 || (mes >= 3 && mes <= 12))) || (dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))) {
                                System.out.println("Fecha: " + dia + " de " + mes_palabra + " de " + año);

                            }

                        }

                    }

                }

            }

        }

    }
}
