/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
 */
package JavaIntroEjerciciosAprendizaje;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         float valor;
         String moneda;
        
         do {
   
            System.out.println("Ingrese el valor en euros");
            valor=leer.nextFloat();
            if (valor==0){ 
                continue; //Me permite terminar la ejecución cuando ingreso un valor de cero
            }
            System.out.println("Ingrese la moneda de destino (dólares/yenes/libras)");
            moneda=leer.next();
             convertir_moneda(valor, moneda);
             System.out.println("");
             System.out.println("-------------------------------------------------------------------------------");
             System.out.println("");
            } while (valor!=0);
        
    }
    
    public static void convertir_moneda(float value, String currency){
        switch (currency.toLowerCase()){
            case "dolares":{
                System.out.println(value + " euros equivalen a " +1.28611*value +" dólares");
            } break;
            case "libras":{
                System.out.println(value + " euros equivalen a " +0.86*value +" libras");
            } break;
            case "yenes":{
                System.out.println(value + " euros equivalen a " +129.852*value +" yenes");
            } break;
            default:{
                System.out.println("No disponemos de una conversión para la moneda ingresada");
            } break;
        }
    }
    
}
