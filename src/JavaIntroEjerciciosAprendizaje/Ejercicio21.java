/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIntroEjerciciosAprendizaje;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] M = new int[10][10];
        int [][] P = new int[3][3];   
        int [] respuesta=new int[2];
        llenarMatrizAleatoriamente(M);
        System.out.println("Matriz M:");
        imprimirMatriz(M);
        System.out.println("Ingrese los datos de la Matriz P:");
        llenarMatrizManualmente(P);
        respuesta=comprobarMatrizContenida(M,P);
        if (respuesta[0]==1){
            System.out.println("La matriz M SI CONTIENE a la matriz P, a partir de la fila "+(respuesta[1]+1) + " columna "+(respuesta[2]+1));
        } else{
            System.out.println("La matriz M NO CONTIENE a la matriz P");
        }
                
    }
    
    
    static void llenarMatrizManualmente(int [][] matriz){
         Scanner lectura=new Scanner(System.in);
         int valor=0;
         for (int i=0;i<matriz.length;i++){
             for (int j=0;j<matriz.length;j++){
                 
                 System.out.print("Posición "+(i+1)+" ; "+(j+1)+" :");
                 
                 boolean valorCorrecto=false;
                 do {
                    valor=lectura.nextInt(); 
                    if (valor>=0 && valor<=Math.pow(matriz.length, 2)){
                        matriz[i][j]=valor;
                        valorCorrecto=true;
                    }
                    else{
                        System.out.println("El número ingresado no es correcto. Debe estar comprendido entre 0 y " +Math.pow(matriz.length, 2));
                    }
                 } while(!valorCorrecto);
                
                         
             }
         }
         System.out.println("Se ha llenado la matríz exitósamente");

     }
    
    static void imprimirMatriz (int[][] matriz){
         ;
         for (int i=0;i<matriz.length;i++){
             String fila="";
             for (int j=0;j<matriz.length;j++){
                 if (matriz[i][j]>=0){
                     fila=fila+" "+matriz[i][j]+" ";
                 } else {
                     fila=fila+matriz[i][j]+" ";
                 }
                 
             }
             System.out.println(fila);
         }
     }
    
    static void llenarMatrizAleatoriamente(int[][] matriz){
         int numero;
         for (int i=0;i<matriz.length;i++){
             for (int j=0;j<matriz.length;j++){
                 numero=(int)(Math.random()*10);
                 
                 matriz[i][j]=numero;
             }
         }
         System.out.println("Se ha llenado la matríz exitósamente");
     }
    
    static int[] comprobarMatrizContenida(int[][] principal,int[][] secundaria){
        int[] retorno=new int[3];
        retorno[0]=0;
        
        for (int i=0;i<(principal.length-secundaria.length);i++){
            for (int j=0;j<(principal.length-secundaria.length);j++){
                
                    if (principal[i][j]==secundaria[0][0]){
                        if (principal[i][j+1]==secundaria[0][1]){
                            if (principal[i][j+2]==secundaria[0][2]){
                                if (principal[i+1][j]==secundaria[1][0]){
                                    if (principal[i+1][j+1]==secundaria[1][1]){
                                        if(principal[i+1][j+2]==secundaria[1][2]){
                                            if(principal[i+2][j]==secundaria[2][0]){
                                                if(principal[i+2][j+1]==secundaria[2][1]){
                                                    if (principal[i+2][j+2]==secundaria[2][2]){
                                                        retorno[0]=1;
                                                        retorno[1]=i;
                                                        retorno[2]=j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                
            }
        }
        
        return retorno;
    }
    
}
