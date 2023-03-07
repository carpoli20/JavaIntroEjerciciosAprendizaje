/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package JavaIntroEjerciciosAprendizaje;
import java.util.Scanner;


/**
 *
 * @author cjalil
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,valor,posicion, repeticiones;
        repeticiones=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño N del vector");
        n=leer.nextInt();
        int[] vector = new int[n];
        for (int i=0;i<n;i++){
            vector[i]= (int)(Math.random()*10);
        }
        System.out.println("Ingrese el valor a buscar: ");
        valor=leer.nextInt();
        for (int i=0;i<n;i++){
            if(vector[i]==valor){
                System.out.println("Valor "+valor +" encontrado en la posición "+i);
                repeticiones++;
            }
        }
        
        if (repeticiones>0){
            System.out.println("Se encontraron "+repeticiones+" coincidencias del valor "+valor +" en el vector");
        } else{
            System.out.println("No se encontró ningun valor que coincida con "+valor+" en el vector");
        }
    }
    
    
}
