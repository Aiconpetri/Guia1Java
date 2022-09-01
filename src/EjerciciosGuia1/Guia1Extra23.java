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
public class Guia1Extra23 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese 5 palabras de 3 caracteres como minimo y 5 como maximo");
        String palabra[] = new String[5];
        int cont1;
        int cont = 0;

        String sopa[][] = new String[20][20];
        for (int i = 0; i < palabra.length; i++) {
            do {
                palabra[i] = read.next();
                if (palabra[i].length() > 5 || palabra[i].length() < 3) {
                    System.out.println("La palabra ingresada no cumple con los caracteres, ingrese otra");
                }
            } while (palabra[i].length() > 5 || palabra[i].length() < 3);
        }
        for (int i = 0; i < 20; i++) {
            do {
                cont1 = (int) (Math.random() * 19);
            } while (sopa[cont1][0] != null);
            for (int j = 0; j < 20; j++) {
                if (cont < 5 && j < palabra[i].length()) {
                    sopa[cont1][j] = palabra[i].substring(j, (j + 1));
                }
            }
            cont++;
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == null) {
                    System.out.print("[" + String.valueOf((int) (Math.random() * 10)) + "]");
                } else {
                    System.out.print("[" + sopa[i][j] + "]");
                }
            }
            System.out.println(" ");
        }
    }
}
