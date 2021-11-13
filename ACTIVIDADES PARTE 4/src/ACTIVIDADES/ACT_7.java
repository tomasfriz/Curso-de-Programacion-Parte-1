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
public class ACT_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
		
		System.out.print("año: ");
		
		int year = leer.nextInt();
		
		/*
		*Operadores logicos:
		*
		*AND: devuelve TRUE si todas las condiciones son TRUE
		*
		*OR: devuelve TRUE si cualquiera de las condiciones son TRUE
		*
		*NOT: devuelve True si la condicion es FALSE
		*/
		
		 // && es AND, || es OR y ! es NOT
		
		if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0)
		{
			System.out.println(year+" es bisiesto");
		}
		else
		{
			System.out.println(year+" no es bisiesto");
		}
    }
}
