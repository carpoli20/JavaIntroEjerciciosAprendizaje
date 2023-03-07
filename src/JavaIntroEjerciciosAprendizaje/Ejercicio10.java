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
public class Ejercicio10 {
    
public static void main(String[] args) {
        // TODO code application logic here
        int limite, suma;
        suma=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el límite:");
        limite=leer.nextInt();
        
        do {
           int num;
            System.out.println("Ingrese el siguiente número: ");
           num=leer.nextInt();
           if (suma+num>limite){
               break;
           }
           suma=suma+num;
        } while (suma<=limite);
        System.out.println("El resultado de la suma es: "+suma);
    }
  
    
}

