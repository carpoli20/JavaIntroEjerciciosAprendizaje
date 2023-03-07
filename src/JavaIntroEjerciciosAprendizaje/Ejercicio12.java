/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package JavaIntroEjerciciosAprendizaje;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        int contador;
        cadena="";
        contador=0;
        Scanner leer=new Scanner(System.in);
        
        
        do {
            cadena=leer.nextLine();
            if (cadena.length()==5) {
                if (cadena.substring(0,1).toLowerCase().equals("x") && cadena.substring(4,5).toLowerCase().equals("o")){
                    contador++;
                }
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("Se tuvieron un total de "+contador+" secuencias correctas");
    }
    
}
