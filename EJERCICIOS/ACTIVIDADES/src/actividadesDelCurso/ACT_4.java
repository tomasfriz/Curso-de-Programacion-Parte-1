/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesDelCurso;

import java.util.Scanner;

/**
 *
 * @author Tomy
 */
public class ACT_4 {
    //Ingresar por teclado usuario y clave.
    //Informar los siguientes casos:
    //Si usuario=”pepito” y clave=”1234”  	informar “Bienvenido pepito!”
    //Si usuario=”pepito” y clave no es “1234” informar “Usuario incorrecto”
    //Si usuario no es “pepito” y clave= “1234”  informar “Contraseña incorrecta”

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        String usuario = lector.next();
        if (usuario.equals("pepito")) {
            System.out.print("Ingrese su clave: ");
            String clave = lector.next();
            if (clave.equals("1234")) {
                System.out.println("Bienvenido Pepito!!");
            } else {
                System.out.println("Clave incorrecta  :(");
            }
        } else {
            System.out.println("usuario incorrecto   :(");
        }
    }
}
