/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package JavaIntroEjerciciosAprendizaje;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                A[i][j]=(int)(Math.random()*10);
            }
        } 
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                B[i][j]=A[j][i];
            }
        }
        imprimirMatriz(A,4);
        imprimirMatriz(B,4);
    }
    
    static void imprimirMatriz(int[][] matriz,int tamanio){
        
        for (int i=0;i<tamanio;i++){
            String fila="";
            for (int j=0;j<tamanio;j++){
                fila=fila+matriz[i][j]+" ";
            }
            System.out.println(fila);
        }
        System.out.println(" ");
    }
    
}
