
package Ciclos.While;
import java.util.Scanner;
//Factorial de un numero
public class WhileFactorial {
    
    public static void main(String args[]){
        
        //VARIABLES        
        /*
            n -> numero ingresado 
            f -> factorial
            i -> contador
        */        
        int n, i=1, f=1;
        
        //ENTRADA
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un numero para obtener su factorial: ");
        n = teclado.nextInt();
        
        //PROCESO
        while(i <= n){
            System.out.println("El valor de i es: " +i+ ", El valor de f: " + f);
            f = f * i;
            i = i + 1;
        }
        System.out.println("El factorial de " + n + " es " + f);
    }    
}
