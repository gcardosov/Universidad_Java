package Operadores;


public class OperadoresAsignacion {
    public static void main(String args[]){
        int a = 3, b = 2;
        //le asignamos el valor de una expresion 
        //la evaluacion comienza de izquierda a derecha
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        //asignacion de composicion 
        
        a +=1; //a = a + 1
        System.out.println("a = " + a);
        
        //!!!!ojo aqui a ya vale 
        a += 3; //a = a + 3
        System.out.println("a = " + a);
        
        //funciona tambien con otros operadores
        a -=2; // a = a -2
        System.out.println("a = " + a);
        
        // *=, /=, %/
        
        a *= 2; //10
        System.out.println("a = " + a);
        
        a /= 5; //2
        System.out.println("a = " + a);
        
        a %=2;
        System.out.println("a = " + a);
        
        
        
    
    }    
}
