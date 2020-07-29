
package Ciclos.While;

import java.util.Scanner;


public class EjercicioWhile2 {
    //Vamos a generar numeros pares
    
    public static void main(String args[]){
        
        Scanner consola = new Scanner(System.in);   
        int entrada, pares;
        int contador = 1;
        
        System.out.println("Programa para generar numeros pares");
        System.out.println("Ingresa un numero: ");
        entrada = consola.nextInt();
        //boolean condicion = (contador <= entrada);
        
        //Contador determina cuantas veces se repite un ciclo
        while(contador <= entrada){
        
            pares = 2 * contador - 2;
            System.out.println(pares +".");
            contador++;            
        }        
    }    
}
