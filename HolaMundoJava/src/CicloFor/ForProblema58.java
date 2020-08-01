
package CicloFor;

//Dado un rango de numeros enteros, obtener la cantidad de numeros pares

import java.util.Scanner;

//que contiene
public class ForProblema58 {
    public static void main(String args[]){
    
        //VARIABLES
        /*
        ni = numero inicial
        nf = numero final 
        cp = cantidad pares
        */
        int ni, nf, cp=0;
        
        //ENTRAADA
        Scanner teclado = new Scanner(System.in);
        System.out.print("Num. Inicial: ");
        ni = teclado.nextInt();
        System.out.print("Num. Final: ");
        nf = teclado.nextInt();
        
        //PROCESO
        ni = ni + 1;
        nf = nf - 1;
        
        for(int i=ni; i<=nf; i++){
            if(i % 2 == 0){
                cp = cp + 1;
            }
        }  
        
        //SALIDA
        System.out.println("");
        System.out.println("Cant. Pares: " + cp);
    }    
}
