
package operaciones;


public class Aritmetica {
    //Atributos de nuestra clase
    //Como buena practica se declaran primero los atributos
   int a;
   int b;
   
   //Metodos
   //Modificadores de acceso
   //Definiendo el metodo
   public void sumar(/*ARGUMENTOS*/){
      int resultado = a + b; //resultado es una variable local
       System.out.println("resultado = " + resultado);       
   }    
   
       public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;     
          return a + b;    
    }
       
       public int sumarConArgumentos(int arg1, int arg2){           
           a = arg1;
           b = arg2;
           //return a + b;
           return sumarConRetorno();
                             
       }
}
