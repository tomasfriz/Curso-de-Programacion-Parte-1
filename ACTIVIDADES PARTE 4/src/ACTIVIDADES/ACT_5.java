/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDADES;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ACT_5 {
    public static void main(String[] args) {
        String mes;
        double descuento;
        double precio;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el mes: ");
        mes = lector.next();
        
        System.out.print("Ingrese el importe de la compra: ");
        precio = lector.nextDouble();
        
        if(mes.equals("octubre"))
        {
            descuento = precio * 0.85;
            System.out.println("El precio de la compra con descuento es: "+descuento);
        }
        else
        {
            System.out.println("El precio de la compra es: "+precio);
        }
        
        
    }
}
