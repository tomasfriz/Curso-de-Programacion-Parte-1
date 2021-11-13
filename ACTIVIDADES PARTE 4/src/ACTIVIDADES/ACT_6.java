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
public class ACT_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
		
		System.out.print("escribir numero: ");
		
		int a = leer.nextInt();
		
		if (a % 2 == 0)
		{
			System.out.println("es par");
		}
		else
		{
			System.out.println("es impar");
		}
    }
}
