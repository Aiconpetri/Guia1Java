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
public class Guia1Extra12 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         int contD=0;int contC=0; int contU=0;String comC;String comD; String comU;
         for (int i = 0; i < 1000; i++) {
             if (contD>0){
                 comD=String.valueOf(contD);
             }else{
                 comD="0";
             }  
             if (contC>0){
                 comC=String.valueOf(contC);
             }else{
                 comC="0";
             }
             if (contU>0){
                 comU=String.valueOf(contU);
             }else{
                 comU="0";
             }
             if (comU.equals("3")){
                 comU="E";
             }
             if (comD.equals("3")){
                 comD="E";
             } 
             if (comC.equals("3")){
                 comC="E";
             }
             System.out.println(comC+"-"+comD+"-"+comU);
             contU++;
             if (contU>9){
                 contD++;contU=0;
             }
             if (contD>9){
                 contC++;contD=0;
             }
        }
    }
}
