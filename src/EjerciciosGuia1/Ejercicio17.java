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
public class Ejercicio17 {
        public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
            System.out.println("Ingrese el tamaño del vector");
         int n=read.nextInt(); int num1=0; int num2=0; int num3=0; int num4=0; int num5=0;
         int[] vec=new int[n];
            for (int i = 0; i < vec.length; i++) {
                vec[i]=read.nextInt();
                if (vec[i]/10<1){
                    num1++;
                }else if (vec[i]/100<1){
                    num2++;
                }else if (vec[i]/1000<1){
                    num3++;
                }else if (vec[i]/10000<1){
                    num4++;
                }else if (vec[i]/100000<1){
                    num5++;
                } 
            }
            for (int i = 0; i < vec.length; i++) {
                System.out.println(""+vec[i]);
            }
            System.out.println("Los numeros de un digito son "+num1);
            System.out.println("Los numeros de dos digitos son "+num2);
            System.out.println("Los numeros de tres digitos son "+num3);
            System.out.println("Los numeros de cuatro digito son "+num4);
            System.out.println("Los numeros de cinco digito son "+num5);
        }
}
