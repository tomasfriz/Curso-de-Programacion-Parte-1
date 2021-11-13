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
public class ACT_25 {
    public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		
		String usr;
		
		String pw;
		
		boolean login = false;

		//SACAR COMENTARIOS PARA TENER EL EJERCICIO 26
		
		do
		{
/*			System.out.print("usuario: ");
			usr = leer.next();
*/			
			System.out.print("contraseña: ");
			pw = leer.next();
			
			if (/*usr.equals("admin") && */pw.equals("1234"))
			{
				login = true;
			}
		}
		while (!login);
		
		if (login)
		{
			System.out.println("Bienvenido");
		}
		
	}
}
