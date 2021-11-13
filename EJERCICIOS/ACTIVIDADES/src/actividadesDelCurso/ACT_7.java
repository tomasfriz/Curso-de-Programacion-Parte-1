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
public class ACT_7 {

    //La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá                 un productor por la uva que entrega en un embarque, considerando lo siguiente: si es 
    //de tipo A, se le cargan 20¢ al precio inicial cuando es de tamaño 1; y  3	0¢ si es de tamaño 2. Si es de tipo B, se rebajan 30¢ cuando es de tamaño 1, y 50¢ cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("tipo de uva A o B: ");
        String tipo = leer.next();

        System.out.println("tamaño de uva 1 o 2: ");
        int tamaño = leer.nextInt();

        System.out.println("$/Kg: ");
        double precio = leer.nextDouble();

        System.out.println("Kilos: ");
        double kilo = leer.nextDouble();

        if (tipo.equalsIgnoreCase("a")) {
            if (tamaño == 1) {
                precio = kilo * (precio + 0.20);
            } else {
                precio = kilo * (precio + 0.30);
            }
        } else {
            if (tamaño == 1) {
                precio = kilo * (precio - 0.30);
            } else {
                precio = kilo * (precio - 0.50);
            }
        }
        System.out.println("Total: $" + precio);
    }
}
