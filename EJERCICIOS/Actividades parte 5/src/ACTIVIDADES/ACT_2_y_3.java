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
public class ACT_2_y_3 {

    public static void main(String[] args) {
        String[] Mes = {null, "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        double[] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};

        double infAnual = 0; //inflacion anual

        int mesMin = 0; //mes con minimo de inflacion
        double infMin = inflacion[0]; //minimo de inflacion mensual

        //inicializo el mes del minimo y del maximo en 0 porque es el mismo numero que
        //el indice en el que inicializo los minimos y maximos de inflacion, pero puede
        //ser iniciado con cualquier valor, esto da igual
        //inicializo el maximo y el minimo de inflacion en inflacion[0] para asegurarme
        //de que en caso de no encontrar un valor mas grande o mas chico (en cada caso).
        //El valor igual estaria adentro del array y va a ser el correcto.
        int mesMax = 0; //mes con maximo de inflacion
        double infMax = inflacion[0]; //maximo de inflacion

        for (int mes = 0; mes < inflacion.length; mes++) {
            infAnual += inflacion[mes]; //sumatoria de la inflacion mensual a lo largo del año

            if (infMin > inflacion[mes]) //si la inflacion del mes actual es mas baja que la minima:
            {
                mesMin = mes; //actualizar el mes del minimo
                infMin = inflacion[mes]; //actualizar el minimo valor de inflacion
            }

            if (infMax < inflacion[mes]) //si la inflacion actual es mayor que la maxima observada:
            {
                mesMax = mes; //actualizar el mes con la maxima inflacion
                infMax = inflacion[mes]; //actualizar el maximo valor de inflacion mensual
            }
        }
        System.out.println("Inflacion anual: " + infAnual);
        System.out.println("Maximo: Mes " + mesMax + " (" + Mes[mesMax] + ") inflacion: " + infMax);
        System.out.println("Minimo: Mes " + mesMin + " (" + Mes[mesMin] + ") inflacion: " + infMin);
        System.out.println("Promedio: " + (infAnual / inflacion.length));
    }
}
