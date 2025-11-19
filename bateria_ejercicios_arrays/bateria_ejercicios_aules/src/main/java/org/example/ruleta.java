package org.example;

import java.util.Scanner;

public class ruleta {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String [] color = {"rojo","negro"};
        int [] numerosvalidos_array = new int[36];
        String [] par_impar = {"par","impar"};
        int numerousuario;
do {
    System.out.println("introduce un numero");
     numerousuario = sc.nextInt();
        if (numerousuario>36 || numerousuario<0){
            System.out.println("ERROR: introduzca valores validos");
        }
}while (numerousuario<0 || numerousuario>36);

        System.out.println("introduce el color");
        color[] = sc.nextLine();
        }
    }

