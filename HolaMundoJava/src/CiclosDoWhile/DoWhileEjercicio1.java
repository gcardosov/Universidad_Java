
package CiclosDoWhile;

public class DoWhileEjercicio1 {
    
    public static void main(String args[]){
        
        var contador = 0;
        //diferecias con do while y while
        //es que si se ejecuta 1 vez las instrucciones a repetir 
        //la condicion se ejecuta hasta el final
        //si la condicion es falsa por lo menos se ejecuta 1 vez
        //las lineas que le indicamos al programa
        //porque hasta el final esta nuestra condicion 
        //depende nuestro requerimiento el lugar de la condicion 
        //es decir usar while o do while 
        do{
            System.out.println("contador = " + contador);
            //IMPORTANTE
            //si no aumentamos en 1 estaremos ejecutando infinitamente
            //por que en todo momento la condicion es verdadera
            //y se bloqueara nuestra maquina
            contador++;
         }while(contador < 3);            
    }    
}
