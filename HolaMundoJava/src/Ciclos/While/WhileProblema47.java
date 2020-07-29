
package Ciclos.While;
//Dado un numero, devolver el digito mayor

import java.util.Scanner;

public class WhileProblema47 {
    
    public static void main(String args[]){
        //VARIABLES
        /*
            n -> numero de entrada
            d -> digitos
            m -> numero mayor
        */
            int d, n, m = 0;
        
        //ENTRADA
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        n = teclado.nextInt(); 
        
        //PROCESO
        
        while(n > 0){
            d = n % 10;
            if(d > m){
                m = d;
            }
            n = n / 10;
           System.out.println("Valor de n: "+n+","+" Valor de d: "+d+" ,Valor de m: "+m );

        }
        
        //SALIDA 
        System.out.println("");
        System.out.println("Digito Mayor: " + m);
                
    }    
}
