
package operaciones;


public class Aritmetica {
    //Atributos de nuestra clase
    //Como buena practica se declaran primero los atributos
   int a;
   int b;
   
   
   //Constructor vacio
   //Lleva el mismo nombre de la clase
   //Constructor es una subrutina cuyo objetivo es inicilizar
   //un objeto 
   //En el constructor se asignan los valores iniciales del 
   //nuevo objeto
   //deben devclararse como publicos
   
   public Aritmetica(){
       System.out.println("Ejecutando constructor");
   }
   
   public Aritmetica(int a, int b){//No se puede usar var en la definicion de argumentos de metodos
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
   }
   
   
   
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
          return this.a + this.b;    
    }
       
       public int sumarConArgumentos(int a, int b){           
           this.a = a; //El argumento a se asigna al atributo this.a
           this.b = b;
           //return a + b;
           //el operator this solo se puede utilzar dentro de la
           //clase en la que se esta trabajando 
           return this.sumarConRetorno();
                             
       }
}
