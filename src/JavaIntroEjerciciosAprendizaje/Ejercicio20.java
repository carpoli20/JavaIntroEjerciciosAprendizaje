/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package JavaIntroEjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[4][4];
        llenarMatrizManualmente(matriz);
        System.out.println("-----------------------");
        System.out.println("La matriz: ");
        imprimirMatriz(matriz);
        if (comprobarCuadradoMagico(matriz)) {
            System.out.println("ES un cuadrado mágico");
        } else {
            System.out.println("NO es un cuadrado mágico");
        }

    }

    static void llenarMatrizManualmente(int[][] matriz) {
        Scanner lectura = new Scanner(System.in);
        int valor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("Posición " + (i + 1) + " ; " + (j + 1) + " :");

                boolean valorCorrecto = false;
                do {
                    valor = lectura.nextInt();
                    if (valor >= 0 && valor <= Math.pow(matriz.length, 2)) {
                        matriz[i][j] = valor;
                        valorCorrecto = true;
                    } else {
                        System.out.println("El número ingresado no es correcto. Debe estar comprendido entre 0 y " + Math.pow(matriz.length, 2));
                    }
                } while (!valorCorrecto);

            }
        }
        System.out.println("Se ha llenado la matríz exitósamente");

    }

    static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            String fila = "";
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] >= 0) {
                    fila = fila + " " + matriz[i][j] + " ";
                } else {
                    fila = fila + matriz[i][j] + " ";
                }

            }
            System.out.println(fila);
        }
    }

    public static boolean comprobarCuadradoMagico(int[][] A) {
        boolean magico = true;
        int primerafila = 0;
        for (int j = 0; j < A.length; j++) {
            primerafila += A[0][j];
        }
        //Sumatoria de filas
        for (int i = 0; i < A.length; i++) {
            int sumafila = 0;
            for (int j = 0; j < A.length; j++) {
                sumafila += A[i][j];
            }
           
            if (sumafila != primerafila) {
                magico = false;
            }
        }

        //Sumatoria de columnas
        for (int j = 0; j < A.length; j++) {
            int sumacolumna = 0;
            for (int i = 0; i < A.length; i++) {
                sumacolumna += A[i][j];
            }
            
            if (sumacolumna != primerafila) {
                magico = false;
            }
        }

        //Sumatoria diagonal principal
        int sumaDiagonal = 0;
        for (int i = 0; i < A.length; i++) {
            sumaDiagonal += A[i][i];

        }
        if (sumaDiagonal != primerafila) {
            magico = false;

        }

        //Sumatoria diagonal secundaria
        int sumaDiagonalSec = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j) == A.length - 1) {
                    sumaDiagonalSec += A[i][j];
                }
            }

        }
        if (sumaDiagonalSec != primerafila) {
            magico = false;
        }
        return magico;
    }

}
