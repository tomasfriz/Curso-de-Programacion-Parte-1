/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadesDelCurso;

/**
 *
 * @author Tomy
 */
public class ACT_7 {

    public static void main(String[] args) {
        int cont = 1;
        int acum = 0;
        int num_suma = 0;
        while (cont <= 25) {
            if (cont % 2 == 0) {

                num_suma++;
                acum = acum + cont;
                System.out.println(num_suma + "° suma = " + acum);
            }
            cont++;
        }
    }
}
