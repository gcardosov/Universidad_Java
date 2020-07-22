
import java.util.Scanner;


public class EjercicioMayorNumero {
    public static void main(String args[]){
    
        System.out.println("Programa para calcular el mayor de 2 numeros");
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciona el numero1: ");
        int numero1 = Integer.parseInt(consola.nextLine());
        
        System.out.println("Proporciona el numero2: ");
        int numero2 = Integer.parseInt(consola.nextLine());
        
        int numeroMayor = (numero1 > numero2 ? numero1 : numero2);
                
        System.out.println("El numero mayor es: " + numeroMayor);
        
    }  
}
