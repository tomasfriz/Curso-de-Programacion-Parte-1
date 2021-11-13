/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

/**
 *
 * @author Tomy
 */
public class ACT_16 {

    public static void main(String[] args) {
        int cont = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                cont++;
            }
        }
        System.out.println("cantidad de nros multiplos de 2 y 3: " + cont);
    }
}
