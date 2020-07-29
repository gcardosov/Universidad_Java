
package Ciclos.While;

//Dado de un numero, determinar la cantidad de digitos pares que contiene

import java.util.Scanner;


public class WhileProblema46 {
    public static void main(String args[]){
        
        //VARIABLES
        /*
        n -> guarda numero ingresado 
        d -> guarda numero de digitos
        c -> guarda la cantidad de numeros pares
        */
        int i, d = 0, c = 0, n;
        
        //ENTRADA
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        n = teclado.nextInt();
        
        //PROCESO
        while(n > 0){
            System.out.println("Valor de n: "+n+","+" Valor de c: "+c+" ,Valor de d: "+d );
            d = n % 10;
                if(d % 2 == 0){
                    c = c + 1;
            }                
            n = n / 10;            
        }            
        System.out.println("Cant. Digitos pares: " + c);        
    }    
}
