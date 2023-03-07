/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIntroEjerciciosAprendizaje;
import java.util.Scanner;

/**
 *
 * @author cjalil
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, longitud;
        int [] conteo=new int[5];
        for (int i=0;i<5;i++){
            conteo[i]=0;
        }
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño N del vector:");
        n=leer.nextInt();
        int [] vector=new int[n];
        for (int i=0;i<n;i++){
            vector[i]=(int)(Math.random()*100000);
        }
        for (int i=0;i<n;i++){
            
            longitud=String.valueOf(vector[i]).length();
            switch (longitud){
                case 1: conteo[0]=conteo[0]+1;
                break;
                case 2: conteo[1]=conteo[1]+1;
                break;
                case 3: conteo[2]=conteo[2]+1;
                break;
                case 4: conteo[3]=conteo[3]+1;
                break;
                case 5: conteo[4]=conteo[4]+1;
                break;
            }
        }
        
        System.out.println("En el vector creado se tienen un total de: ");
        System.out.println(conteo[0] +" números de 1 dígito");
        System.out.println(conteo[1] +" números de 2 dígitos");
        System.out.println(conteo[2] +" números de 3 dígitos");
        System.out.println(conteo[3] +" números de 4 dígitos");
        System.out.println(conteo[4] +" números de 5 dígitos");
            
    }
    
}
