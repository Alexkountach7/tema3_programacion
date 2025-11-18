package org.example;

import java.util.Scanner;

public class matrices_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [3] [3];
        // rellenar
        for (int i =0; i<matriz.length; i++){ //filas
            for (int j =0; j<matriz[i].length; j++){ //columnas
                matriz[i][j] =i*j;
            } //matriz[i].length numero de columnas de esa fila
            //matriz[i] = una fila completa
        }
        //mostrar
        for (int i=0; i<matriz.length;i++){
            for (int j =0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
