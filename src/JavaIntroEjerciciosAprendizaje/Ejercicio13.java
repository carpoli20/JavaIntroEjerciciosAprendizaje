/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *

 */
package JavaIntroEjerciciosAprendizaje;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dimension;
        
        Scanner leer=new Scanner(System.in);
        
      
            String lado_horizontal, linea_interna;
            lado_horizontal="";
            linea_interna="";
            System.out.println("Ingrese la dimensión del cuadrado:");
            dimension=leer.nextInt();
            
           
            
            String[] lineas=new String[dimension];
            for (int i=0; i<dimension; i++){
                lado_horizontal=lado_horizontal+"*";
            }
            lineas[0]=lado_horizontal;
            lineas[dimension-1]=lado_horizontal;
            
            if (dimension>=3){
                linea_interna=linea_interna+"*";
                for (int i=0;i<(dimension-2);i++){
                    linea_interna=linea_interna+" ";
                }
                linea_interna=linea_interna+"*";
                for (int i=1;i<(dimension-1);i++){
                    lineas[i]=linea_interna;
                }
            }
            
            for (int i=0;i<dimension;i++){
                System.out.println(lineas[i]);
            }
            
           System.out.println("");
           System.out.println("");
        
    }
    
}
