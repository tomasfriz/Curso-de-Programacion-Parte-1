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
public class ACT_6 {

    //“Bodega Campo” es un restaurante de campo  dedicado a ofrecer grandes parrilladas, previa reserva del evento; sus tarifas son las siguientes: el costo de plato por persona es de $95.00, pero si el número de personas es mayor a 200 pero menor o igual a 300, el costo es de $85.00. Para más de 300 personas el costo por platillo es de $75.00. Se requiere un algoritmo que ayude a determinar el presupuesto que se debe presentar a los clientes que deseen realizar un evento.
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de clientes: ");
        int clientes = lector.nextInt();

        int individual, grupal;
        if (clientes >= 300) {
            individual = 75;
        } else {
            if (clientes >= 200) {
                individual = 85;
            } else {
                individual = 95;
            }
        }
        grupal = individual * clientes;
        System.out.println("El costo x persona es = " + individual + " $\n"
                + " Total = " + grupal + " $");
    }
}
