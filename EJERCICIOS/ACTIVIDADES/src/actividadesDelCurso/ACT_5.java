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
public class ACT_5 {

    //Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad de lápices considerando que si son 1000 o más el costo es de 85 centavos; de lo contrario, el precio es de 90 centavos. Represéntelo con el pseudocódigo y el diagrama de flujo.
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int limite = 1000;
        double precio;

        System.out.print("Por favor, ingrese la cantidad de lapices: ");
        int lapices = lector.nextInt();
//logica
        if (lapices >= limite) {
            precio = 0.85;
        } else {
            precio = 0.9;
        }

        System.out.println("Precio Final = " + lapices * precio);
    }
}
