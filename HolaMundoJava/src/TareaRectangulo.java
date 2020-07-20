
import java.util.Scanner;

public class TareaRectangulo {
    
       public static void main(String args[]){
           
           System.out.println("Programa que calcula el area y perimetro de un rectangulo");
           System.out.println("Calculemos el perimetro");
           System.out.println("Proporciona el alto: ");
           Scanner consola = new Scanner(System.in);
           int alto = Integer.parseInt(consola.nextLine());
           System.out.println("Proporciona el ancho: ");
           int ancho = Integer.parseInt(consola.nextLine());
           var perimetro = (alto + ancho) * 2;
           var area = alto * ancho; 
           System.out.println("Area: " + area);           
           System.out.println("Perimetro: " + perimetro);
                            
       }    
}
