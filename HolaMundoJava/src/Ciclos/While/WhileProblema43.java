package Ciclos.While;

//Dado un rango de numeros enteros

import java.util.Scanner;

//obtener la cantidad de numeros pares que contiene

public class WhileProblema43 {
    
    public static void main(String args[]){
        //VARIABLES
        int i, cp = 0, ni, nf;
        /*
        i  -> Contador de posiciones 
        cp -> cantidad de pares
        ni -> numero inicial 
        nf -> numero final         
        */
                        
        //ENTRADA
        Scanner teclado = new Scanner(System.in);
        System.out.print("Num. Inicial: ");
        ni = teclado.nextInt();
        System.out.print("Num. Final: ");
        nf = teclado.nextInt();
        
        //PROCESO        
        i = ni + 1;
        
        while(i < nf){
            if(i % 2 == 0){//Condicion para saber si el numero es par
                cp = cp + 1;
            }
            i = i + 1;
        }
        
        //SALIDA
        System.out.println("");
        System.out.println("Cant. Pares: " + cp);        
    }    
}
