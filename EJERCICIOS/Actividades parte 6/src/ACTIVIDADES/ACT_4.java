/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

/**
 *
 * @author Tomy
 */
public class ACT_4 {
     public static void main(String[] args) {
        System.out.println("4) Crear un array unidimensional con un tamaño "
                + "de 10, inserta los valores numéricos que desees de la "
                + "manera que quieras y muestra por pantalla la media de "
                + "valores (promedio) del array. Nota: puede utilizar el "
                + "método random de la Clase Math para generar números "
                + "aleatorios al cargar el array.");
        
        double total = 0;
        int [] valores = new int [10];
        
        //inicializo el array
        for (int i = 0; i < valores.length; i++) 
        {
            valores[i] = (int)(Math.random()*100+1);
        }
        
        //muestro el contenido y totalizo el array
        for (int i = 0; i < valores.length; i++) 
        {
            System.out.println("Valores: " + valores[i]);
            total += valores[i];
        }
        //muestro en consola el total y el promedio
        System.out.println("Total Valores= " + total);
        System.out.println("Promedio valores= " + total / valores.length);
    }
}
