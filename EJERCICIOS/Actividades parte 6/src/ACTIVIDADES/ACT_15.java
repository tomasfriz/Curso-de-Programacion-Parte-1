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
public class ACT_15 {

    public static void main(String[] args) {
        System.out.println("15) Escribir un programa en Java para realizar la "
                + "búsqueda del nombre de un cliente en un vector que contiene "
                + "5 clientes en total. El cliente a buscar será ingresado por "
                + "pantalla por el usuario. El algoritmo deberá devolver, en "
                + "caso de que ese nombre exista, la posición en donde se "
                + "encuentra dicho cliente dentro del vector.");

        Scanner lector = new Scanner(System.in);

        String[] clientes = {"Jorge", "Susana", "Pedro", "Javier", "Laura"};

        System.out.print("Nombre del cliente: ");
        String cliente = lector.next();

        for (int i = 0; i < clientes.length; i++) {
            if (cliente.equalsIgnoreCase(clientes[i])) {
                System.out.println("Posicion del cliente: " + i);
            }
        }
    }
}
