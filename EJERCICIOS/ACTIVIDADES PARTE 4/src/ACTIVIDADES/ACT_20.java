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
public class ACT_20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
		
		System.out.print("ingrese altura: ");
		int altura = leer.nextInt();
		
		for (int h = 1; h <= altura; h++)
		{
			for (int w = 1; w <= h; w++)
			{
				System.out.print("*");
			}
			System.out.println("");	
		}
    }
}
