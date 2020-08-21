
package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        //Le pasamos una copia del valor desde el metodo principal 
        //a nuestro metodo cambio de valor
        cambioValor(x);
        System.out.println("x nuevo valor = " + x);
        //SI QUEREMOS HACER EL CAMBIO 
        //x = cambioValor(x)
    }
    
    //public static int cambioValor(int arg1){
    //     System.out.println("arg1 = " + arg1);
    //      return arg1 = 15
    //      }
    
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        //Le asignamos un nuevo valor a x pa ver si cambia de valor 
        arg1 = 15;
    }
    
    
}
