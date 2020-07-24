package Operadores;


public class OperadoresUnarios {

    public static void main(String args[]) {
        
        var a = 3;
        var b = -3;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //operador unario de negacion !
        var c = true;
        var d = !c;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //operadores unarios de incremento y decremento 
        //1.- pre-incremento (simbolo antes de la variable) "++" <variable>
        //++ aumenta en 1
        
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //pre-decremento
        var i = 2;
        var j = --i; //primero se decrementa y despues se utiliza el valor 
        System.out.println("i = " + i); //imprime 1 posque esta decrementada
        System.out.println("j = " + j);
        
        
        //2.- post-incremento (simbolo despues de la variable)
        
        var g = 5;
        //primero se utiliza el valor de la varible y despues se incrementa
        //cuando se vuelve a usar la variable
        var h = g++; 
        //lo comprabamos
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        
        //postdecremento      
        var k = 4;
        var l = k--;
        //Ya esta decrementada por que es la segunda vez que se usa
        System.out.println("k = " + k);   
        System.out.println("l = " + l); //tiene pendiente el decremento 

     
       
        
        
        
    }    
}
