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
public class Guia1Extra9 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese dos numeros para conocer el cociente y resto de su division");
         int div=read.nextInt(); int divid=read.nextInt();int cos=0;
         while (div>divid){
             cos++;
             div=div-divid;
         }
             System.out.println("El cociente es "+cos+" y el resto es "+div);
    }
}
