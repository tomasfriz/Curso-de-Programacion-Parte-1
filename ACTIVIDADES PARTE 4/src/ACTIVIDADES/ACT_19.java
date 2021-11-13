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
public class ACT_19 {

    public static void main(String[] args) {
        Scanner cuadrado = new Scanner(System.in);
        System.out.print("Escriba la cantidad de símbolos que desee implementar, tanto en alto, como en ancho: ");
        int cantidad = cuadrado.nextInt();
        System.out.print("Escriba el símbolo que desea utilizar: ");
        String frase = cuadrado.next();
        System.out.println("");
        System.out.println("");
        String acum = "";
        String borde = frase + "";
        String espacio = " ";

        for (int suma_simbolo = 1; suma_simbolo <= cantidad; suma_simbolo++) {

            acum = acum + frase;
            if (suma_simbolo != 1 && suma_simbolo != cantidad) {
                borde = borde + espacio;
            }
            if (suma_simbolo == cantidad) {
                borde = borde + frase;
            }

        }
        String ancho = acum;
        String x = borde;

        for (int veces = 1; veces <= cantidad; veces++) {

            if (veces == 1 || veces == cantidad) {
                System.out.println(ancho);
            } else {
                System.out.println(x);
            }
        }
    }
}
