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
public class Guia1Extra18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=read.nextInt(); int sum=0;
        int vec []= new int [n];
        System.out.println("Ingrese los valores del vector asi se suman entre si");
        for (int i = 0; i <vec.length; i++) {
            sum+=vec[i]=read.nextInt();
        }
        System.out.println("La suma de los elementos del vector es "+sum);
    }
}
