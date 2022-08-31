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
public class Guia1Extra20 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=read.nextInt();
        int vec[]=new int [n];
        relleno(vec,read);
    }
    public static void relleno (int[] vec, Scanner read){
        System.out.println("Se llena el vector");
        for (int i = 0; i < vec.length; i++) {
            vec[i]=(int)(Math.random()*100);
        }
        mostrar(vec);
    }
    public static void mostrar(int[] vec){
        System.out.println("Se muestra el vector");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]+" ");
        }
        System.out.println(" ");
    }
}
