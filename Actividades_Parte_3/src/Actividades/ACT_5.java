/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ACT_5 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int edades = 0;
        int promedio = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la edad: ");
            edades = lector.nextInt();
            promedio += edades;
        }
        System.out.println("El promedio de las edades es: "+promedio/5);
    }
}
