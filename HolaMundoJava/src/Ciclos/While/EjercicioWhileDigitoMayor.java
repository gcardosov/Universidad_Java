
package Ciclos.While;

import java.util.Scanner;

public class EjercicioWhileDigitoMayor {
    
    public static void main(String args[]){
        
        //Variables        
        int d, m = 0, n;
        
        //Entrada
        Scanner consola = new Scanner(System.in);
        System.out.print("Numero: ");
        n = consola.nextInt();
        
        //Proceso        
        while(n > 0){
            d = n % 10;  
                if(d > m){
                    m = d;
                }
                n = n / 10;         
            }
       //Salida
        System.out.println("");
        System.out.println("Digito Mayor: " + m);
            
        }    
    }   
