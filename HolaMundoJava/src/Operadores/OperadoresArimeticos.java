package Operadores;


public class OperadoresArimeticos {
    
    public static void main(String args[]){  
        //si declaramos nuestras variables con var no podremos declarar
        //mas de una variable en linea de codigo
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta  = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        var resultado2 =  3D / b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        if(a % 2 == 0){
            System.out.println("El numero es par");
        
        }else{
            System.out.println("El numero NO es par");
        }
    
    }    
}
