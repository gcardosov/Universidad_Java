
import java.util.Scanner;



public class EstacionesConSwitch {
    
    public static void main(String args[]){
        
        Scanner consola = new Scanner(System.in);   
        System.out.println("Programa estaciones del anio");
        System.out.println("Ingresa un numero del 1 al 12");
        var mes = Integer.parseInt(consola.nextLine());       
        var estacion = "Estacion desconocida";
        
        switch(mes){
            case 12: case 1: case 2:
               estacion =  "Es invierno";
            break;
            
            case 3: case 4: case 5:
               estacion =  "Es primavera";
            break;
            
            case 6: case 7: case 8:
               estacion =  "Es verano";
            break;
            
            case 9: case 10: case 11:
               estacion =  "Es otonio";
            break;

            default:
                estacion = "Estacion no valida";
        }
        
        System.out.println(estacion);
        
    }
    
}
