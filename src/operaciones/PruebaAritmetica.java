
package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
     
       //Si tenemos un metodo con argumentos el metodo
       //constructor por defecto deja de funcionar?
       
       //variables locales 
       //en las variables locales solo funciona var
       //var solo funcionar con variables locales
       var a = 10 ;
       var b = 2;
       miMetodo();
        
       Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
       
       
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a );
        System.out.println("aritmetica2 b: " + aritmetica2.b);        
        
        /*
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        //Con f7 en modo debug podemos ir viendo la ejecucion 
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la clase de prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("reultado usando argumentos = " + resultado);
        
        //El aputador this apunta a la direccion de memoria de un objeto
        //que se esta ejecutando 
        //Los metodos estatico sno pueden acceder al operador this*/
        
        
        
        //el manejo de memoria en java depende del tipo de variable
        //con el que se este trabajando 
        //las variables que no son objetos se almacenan en
        //la memoria stack 
        //las variables de tipo objeto se almacenan 
        //en memoria heap
        //el recolector de basura o garbaje colector
        //elimina las variables que ya no esten siendo 
        //referenciadas
        aritmetica1 = null;
        //mandar a llamar la linea de garbaje colector 
        //implica consumir muchos recursos ademas        
        //que no garantiza limpiar la memoria 
        //System.gc();
    
    }    
    
    
    public static void miMetodo(){
        //Variable esta fuera del alcanse de donde fue definida
        //por que fue establecidad dentro de otro metodo 
        //osea es una variable local
        //a = 10;
        System.out.println("otro metodo");
    
    }
    
    
}
