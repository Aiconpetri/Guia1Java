/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia1;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Ejercicio4 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese una temperatura en grados centigrados para asi convertirla a Fahrenheit");
         double temp= read.nextDouble();
        double f= temp*9/5+32;
        System.out.println(temp+"°C equivalen a "+f+"°F");
    }
}
