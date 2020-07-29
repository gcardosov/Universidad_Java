
package Ciclos.While;
//Dado un numero determinar cuantos digitos tiene

import java.util.Scanner;

public class WhileProblema45 {
    public static void main(String args[]){
        
        //VARIABLES
        /*  c -> acumulador de cantidad de digitos
            i -> contador de posiciones
            n -> numero de entrada
        */
        int c = 0, n;        
        
        
        //ENTRADA
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        n = teclado.nextInt();
        
        
        //PROCESO
        //i = 1;
        while(n > 0){
            System.out.println("Valor de c: "+c+", Valor de n: "+n);
            n = n / 10;
            c = c + 1;
        }
                        
        
        //SALIDA
        System.out.println("Cant. Digitos: " + c);                        
        
    }                
}
