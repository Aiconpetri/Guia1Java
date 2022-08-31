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
public class Ejercicio16 {
        public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
            System.out.println("Ingrese el tamaño del vector");
            int n=read.nextInt(); int cont=0;
         int[] vec=new int[n];
            for (int i = 0; i < vec.length; i++) {
                vec[i]=(int) (Math.random()*10);
            }
            for (int i = 0; i < vec.length; i++) {
                System.out.println(""+vec[i]+",");
            }
            System.out.println("Ingrese un numero a buscar");
            int bus=read.nextInt();
            for (int i = 0; i < vec.length; i++) {
                if (bus==vec[i]){
                    System.out.println("El numero se encuentra en la posicion "+i); 
                    cont++;
                }
            }
            System.out.println("El numero se encontro "+cont+" veces.");
        }
}
