/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author Tomy  
 */
public class ACT_30 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada=new BufferedReader(new java.io.InputStreamReader(System.in));

        String alumno;
        double notafinal;
        double np;
        double npro;
        double nt;

        System.out.print("Introduce el nombre del alumno: ");
        alumno = bufEntrada.readLine();

        while (!alumno.equals("")) {

            System.out.print("Introduce la nota practica: ");
            np = Double.parseDouble(bufEntrada.readLine());

            System.out.print("Introduce la nota de problemas: ");
            npro = Double.parseDouble(bufEntrada.readLine());

            System.out.print("Introduce la nota de teoria: ");
            nt = Double.parseDouble(bufEntrada.readLine());

            if ((np <= 10 && np >= 0) && (npro <= 10 && npro >= 0) && (nt <= 10 && nt >= 0)) 
            {

                System.out.println("El alumno " + alumno + " tuvo las siguientes notas: ");
                System.out.println("La nota practica es " + np);
                System.out.println("La nota de problemas es " + npro);
                System.out.println("La nota de teoria es " + nt);

                np = np * 0.1;
                npro = npro * 0.5;
                nt = nt * 0.4;
                notafinal = np + npro + nt;
                
                System.out.println("La nota final es " + notafinal);
                System.out.println("-----------------------------------------");

            } 
            else 
            {
                System.out.println("Has escrito una nota incorrecta, vuelve a intentarlo");
                System.out.println("-----------------------------------------");
            }

            System.out.print("Introduce el nombre de otro alumno: ");
            alumno = bufEntrada.readLine();

        }
        
        System.out.println("Proceso terminado.");
    }

   
}


