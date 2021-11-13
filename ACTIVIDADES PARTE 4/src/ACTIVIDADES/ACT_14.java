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
public class ACT_14 {
    public static void main(String[] args) {
        Scanner simbolo = new Scanner(System.in);
        System.out.print("Escriba la cantidad de símbolos que desee implementar, tanto en alto, como en ancho: ");
        int cantidad = simbolo.nextInt();
        System.out.print("Escriba el símbolo que desea utilizar: ");
        String frase = simbolo.next();
        System.out.println("");
        String acum="";
        
        for (int suma_simbolo = 0; suma_simbolo < cantidad; suma_simbolo++) {
            acum+=frase; 
        }
        String ancho=acum;
        
        for (int veces = 0; veces < cantidad; veces++) {
            System.out.println(ancho);
        }
    }
}
