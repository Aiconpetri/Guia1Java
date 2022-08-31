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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese 2 numeros para asi sumarlos");
        int num1=read.nextInt(); int num2=read.nextInt();
        int suma=num1+num2;
        System.out.println("La suma de los dos numeros es:"+suma);
    }
    
}
