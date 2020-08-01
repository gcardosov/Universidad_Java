
package Ciclos.While;

//Obtener la suma de los primeros N numeros naturales positivos
import java.util.Scanner;

public class Ejercicio56ConWhile {
    
    public static void main(String main[]){
        
        //VARIABLES
        /*
            n -> numero de entrada
            s -> suma
            
        */
        int n, i=0, s=0;
                
        //ENTRADA
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        n = teclado.nextInt();
        
                
        //PROCESO                  
        while(i<=n){           
           s = s + i;
           i = i + 1;
        }
        
        System.out.println("");
        System.out.println(s);
    }
}
