
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String args[]){
        System.out.println("Programa que valida si eres mayor de edad.");
        System.out.println("Ingresa tu edad: ");
        var consola = new Scanner(System.in); 
        var edad = Integer.parseInt(consola.nextLine());
        
        if(edad >= 18 ){
            System.out.println("Eres mayor de edad, estas ruco!!!");
        }else{
            System.out.println("Eres menor de edad, felicidades!!");        
        }                
    }    
}
