/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades;

/**
 *
 * @author USUARIO
 */
public class ACT_4 {
    public static void main(String[] args) {
        int acum = 0;
        for (int i = 1; i <= 25; i++) {
            if (i % 2 == 0) {
                acum += i;  
            } 
        }
        System.out.println(acum);
    }
}
