
package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        //Con f7 en modo debug podemos ir viendo la ejecucion 
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la clase de prueba = " + resultado);
        
        aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("reultado usando argumentos = " + resultado);
        
    }    
    
    
}
