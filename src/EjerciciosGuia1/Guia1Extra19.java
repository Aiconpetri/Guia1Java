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
public class Guia1Extra19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int n = read.nextInt();
        int vec1[] = new int[n];
        int vec2[] = new int[n];
        boolean band=true;
        System.out.println("Rellene los vectores");
        for (int i = 0; i < vec1.length; i++) {
            System.out.println("Posicion " + (i) + " del vector 1");
            vec1[i] = read.nextInt();
            System.out.println("Posicion " + (i) + " del vector 2");
            vec2[i] = read.nextInt();
        }
        System.out.println("Se compararan los vectores para saber si son iguales");
        for (int i = 0; i < vec2.length; i++) {
            if (vec1[i] != vec2[i]) {
                band=false;
                break;
            }
        }
        if (band==true){
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores son diferentes");
        }
    }
}
