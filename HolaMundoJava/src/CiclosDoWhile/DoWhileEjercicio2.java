
package CiclosDoWhile;

//Algoritmo que visualiza los numeros del 1 al 10 

import java.util.Scanner;


public class DoWhileEjercicio2 {
    
    public static void main(String args[]){
        
        //VARIABLES
        /*
            ni -> numero inicial 
            nf -> numero final 
            i -> contador
            cr -> acumulador rango
        */        
        int ni, nf;
                
        //ENTRADA
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el numero inicial: ");
        ni = teclado.nextInt();
        System.out.println("Ingresa el numero final: ");
        nf = teclado.nextInt();
        System.out.println("El rango de numeros es: ");       
        
        //PROCESO
                
        while(ni<nf){            
           ni = ni + 1;
           
           System.out.println(ni);
                      
        }
    }    
}
