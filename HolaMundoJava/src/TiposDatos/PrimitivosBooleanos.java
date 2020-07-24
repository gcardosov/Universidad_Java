package TiposDatos;


import java.util.Scanner;


public class PrimitivosBooleanos {
    
    public static void main(String args[]){
    //Se les conoce tambien como tipo bandera    
    //solo toma 2 valores falso o verdadero    
    boolean varBoolean = false;
    System.out.println("varBoolean = " + varBoolean);
    //se utiliza en algoritmos
    
    //si esta variable contiene el valor de verdadero
    if(varBoolean){
        System.out.println("La bandera es verdadera");
    }
    else{
        System.out.println("La bandera es falsa");
    }
    
    //ejemplo con la edad

    var edad = 10;
    //var esAdulto = edad >= 18;
    //asignamos una expresion a una variable
    //debido a que tiene una condicion va a regresar un true o un fals
   
    if(edad >= 18){
        System.out.println("Eres mayor de edad");
    }
    else{
        System.out.println("Eres menor de edad");
    
        }
    }
      
}
