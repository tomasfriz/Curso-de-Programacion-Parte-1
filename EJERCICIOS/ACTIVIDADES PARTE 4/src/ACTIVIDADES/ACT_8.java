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
public class ACT_8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;

        do //el cuerpo de este se ejecuta como minimo una vez
        {
            System.out.println("ingresar nota entre 1 y 10");

            nota = leer.nextInt();

        } while (nota < 1 || nota > 10); //condicion que determina si se sigue ejecutando

        switch (nota) //evaluar el valor de nota
        {
            case 1: //si el valor es 1
            case 2: //si el valor es 2
            case 3: //si el valor es 3
                System.out.println("desaprobado");
                break; //salir de switch
            case 4:
            case 5:
            case 6:
                System.out.println("aprobado");
                break;
            case 7:
            case 8:
                System.out.println("calificacion notable");
                break;
            case 9:
            case 10:
                System.out.println("calificacion sobresaliente");
                break;

        }
    }
}
