
package Ciclos.While;

import java.util.Scanner;

/*
    Obtener la cantidad de los primeros N numeros multiplos de 5
*/
public class WhileProblema44 {
    
    public static void main(String args[]){    
        //VARIABLES
        /*
        i -> Recorre los numeros
        n -> Numero ingresado
        c -> Cantidad de multiplos
        */        
        int i, n, c = 0;
        
        //ENTRADA        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        n = teclado.nextInt();
        
        //PROCESO
        i = 1;
        
        while(i <= n){
            if(i % 5 == 0){
                c = c + 1;                
            }
            i = i + 1;
        }
        
        System.out.println("");
        System.out.println("Cantidad: " + c);                    
    }
    
}
