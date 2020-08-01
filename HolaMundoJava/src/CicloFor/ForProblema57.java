
package CicloFor;

//Dado un rango de numeros enteros, obtener la cantidad de numeros enteros que 

import java.util.Scanner;

//que contien 
public class ForProblema57 {
    
    public static void main(String args[]){    
    
    //VARIABLES
    /*
        ni = numero de inicio
        nf = numero final 
        c = cantidad de n naturales
    */    
    int ni, nf, c = 0;
    
    
    //ENTRADA
    Scanner teclado = new Scanner(System.in);
    System.out.print("Num. Inicial: ");
    ni = teclado.nextInt();
    System.out.print("Num. Final: ");
    nf = teclado.nextInt();
    
    //PROCESO
    
    ni = ni + 1;
    //nf = nf - 1;
    for(int i=ni; i<nf; i++){
        
        c += 1;
        
        }
  
    System.out.println("");    
    System.out.println("Cantidad: "+c);
    
    }            
}
