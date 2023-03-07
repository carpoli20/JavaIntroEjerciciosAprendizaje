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
public class Ejercicio06 {
    
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        boolean es_mayor;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        numero1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        numero2=leer.nextInt();
        
        if ((numero1 > 25) || (numero2 > 25)){
        System.out.println("Al menos uno de los números ingresados ES mayor a 25");
    } 
        else {
               System.out.println("Ninguno de los números ingresados en mayor a 25"); 
                }
        
        // TODO code application logic here
    }
    
}