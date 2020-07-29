
package Ciclos.While;

import java.util.Scanner;

public class EjercicioWhile1 {
    //Programa que muestra un rango de numeros 
    public static void main(String args[]){
    
        System.out.println("Programa que imprime un rango de numeros");
        Scanner consola = new Scanner(System.in); 
        System.out.println("Ingresa hasta que numero quieres ver: ");
        var numero = consola.nextInt();
        System.out.println("Vamos imprimir numeros hasta el " + numero);
        var contador = 1;
        boolean condicion = numero < contador;
                
        while(contador <= numero){
        
            System.out.println(contador);
            contador++;
            
        }
        int n = 589;        
        float d = n % 10;
        n = n /10;
        System.out.println(d);
        System.out.println(n);
        
    
    }            
}
