package TiposDatos;


import java.util.Scanner;


public class ConversionTiposPrimitivos {
    
    public static void main(String args[]){
     //Conversion de tipo string a tipo enteros y viceversa
     //var edad = Integer.parseInt("20");
    //var edad = "20";  
    //System.out.println("edad = " + (edad + 1));
    //se aplica el criterio de contexto String 201 20 + 1
     
      //var valoPI = Double.parseDouble("3.1416");
      //System.out.println("valoPI = " + valoPI);
    
      //Pedir un valor
      var consola = new Scanner(System.in);
      System.out.println("Proporciona tu edad: ");
      var edad = Integer.parseInt(consola.nextLine());
      System.out.println("edad = " + edad);
        
    }    
}
