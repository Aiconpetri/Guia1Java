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
public class Guia1Extra24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese cuantas posiciones de fibonacci desea rellenar");
        int n=read.nextInt();
        int vec[]=new int [n];
        for (int i = 0; i < vec.length; i++) {
            if (i==0){
                vec[i]=0;
            }else if (i==1){
                vec[i]=1;
            }else{
                vec[i]=(vec[i-2])+(vec[i-1]);
            }
        }
        System.out.println("Se muestra la sucesion");
        for (int i = 0; i < vec.length; i++) {
            if (i!=n-1){
                System.out.print(vec[i]+",");
            }else{
                System.out.print(vec[i]+"...");
            } 
        }
        System.out.println("");
    }
}
