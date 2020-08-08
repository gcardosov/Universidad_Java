
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
        
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("reultado usando argumentos = " + resultado);
        
        //El aputador this apunta a la direccion de memoria de un objeto
        //que se esta ejecutando 
        //Los metodos estatico sno pueden acceder al operador this
        
    }    
    
    
}
