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
public class Guia1Extra21 {
   public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double tp1; double tp2; double p1; double p2;
        double vec[]=new double [10];
        int cont=0;
        for (int i = 0; i <vec.length; i++) {
            System.out.println("Ingrese las notas del alumno n°"+(i+1));
            System.out.println("Nota del trabajo practico n°1"); tp1=read.nextInt();
            System.out.println("Nota del trabajo practico n°2"); tp2=read.nextInt();
            System.out.println("Nota del parcial n°1"); p1=read.nextInt();
            System.out.println("Nota del parcial n°2"); p2=read.nextInt();
            System.out.println("Se promedian las notas del alumno n°"+(i+1));
            vec[i]=(tp1*0.1)+(tp2*0.15)+(p1*0.25)+(p2*0.50);
            if(vec[i]>=7){
                cont++;
            }
       }
        System.out.println("La cantidad de alumnos aprobados es: "+cont);
        System.out.println("La cantidad de alumnos desaprobados es: "+(10-cont));
   }
}
