
package Ciclos.While;
//Dado un rango de numeros enteros, obetener la cantidad de numeros
//enteros que contien 

import java.util.Scanner;


public class EjercicioWhileContenidoNumerosEnteros {
    
    public static void main(String args[]){
        
        //Variables
        /*
            ni -> numero inicial del rango 
            nf -> numero final del rango 
            i  -> acumula las posiciones
            c  -> acumula los numeros enteros                            
        */
        
        int i = 0, c = 0, ni, nf;
                        
        //Entrada
        Scanner consola = new Scanner(System.in);
        System.out.print("Num. inicial: ");
        ni = consola.nextInt();
        
        System.out.print("Num. Final: ");
        nf = consola.nextInt();
        
        //Proceso
        i = ni + 1; //Recorre las posiciones de numeros enteros
        
        while(i < nf){
            c = c + 1; //c +1;
            i = i + 1; //i++;           
        }
        //Salida
        System.out.print("");
        System.out.println("Cantidad: " + c);
    }    
}
