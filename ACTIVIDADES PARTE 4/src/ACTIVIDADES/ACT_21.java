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
public class ACT_21 {

    /*
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double input;
        boolean flag = false;
        do {
            System.out.print("Ingrese un numero natural: ");
            input = leer.nextInt();//4

//                        if (flag == true) {}
//                        if (flag) {}
            if (input > 0) {
                flag = true;
            }

        } while (!flag);
// !true equivale a false
        // !false equivale a true

        System.out.println("la raiz cuadrada del numero es " + Math.pow(input, 0.5));
        System.out.println("la raiz cuadrada del numero es " + Math.sqrt(input));
    }
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double input;
        //boolean flag = false;
        do {
            System.out.print("Ingrese un numero natural: ");
            input = leer.nextInt();//4

//                        if (flag == true) {}
//                        if (flag) {}
            if (input >= 0) {
                break;
                //flag = true;
            }

        } while (true);
// !true equivale a false

        // !false equivale a true
        System.out.println("la raiz cuadrada del numero es " + Math.pow(input, 0.5));
        //System.out.println("la raiz cuadrada del numero es " + Math.sqrt(input));
    }
}
