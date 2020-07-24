
package Ciclos;

public class While {
    //Se revisa la condicion 
    //Tiene 2 caminos cuando la sentencia es verdadera o falsa
    //Se ejecuta un codigo cuando la condicion es verdadera
    //un determinado numero de veces
    //Cuando la condicion es falsa se sale del ciclo y este termina
    //El ciclo While es el mas elemental 
    
    public static void main (String args[]){
        
        //Contador 
        var contador = 0;
        
        while(contador < 3){
            System.out.println("contador = " + contador);
            contador++; //la siguiente vez que se ocupe
                        //su valor estara incrementado 
        
        }    
    }    
}
