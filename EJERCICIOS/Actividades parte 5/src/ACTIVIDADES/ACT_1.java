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
public class ACT_1 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30, 20};

        int sum = 0;
        int max = (arr[0]); //pongo el valor maximo como un numero perteneciente al array
        int cont20 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) //obtener maximo
            {
                max = arr[i];
            }

            if (!(i % 2 == 0)) //mirar si el indice es impar
            {
                System.out.print("Impar -> ");
            }

            if (arr[i] == 20) //buscar 20
            {
                cont20++;
            }

            sum += arr[i]; //sumar todos los valores del array

            System.out.println("Indice: " + i + ", valor: " + arr[i]); //mostrar valor
        }

        for (int i = 0; i < arr.length; i++) //imprimir un separador
        {
            System.out.print("-");
        }
        System.out.println("");

        System.out.println("Sumatoria: " + sum);
        System.out.println("Maximo: " + max);
        System.out.println("20 aparece " + cont20 + " veces");
    }
}
