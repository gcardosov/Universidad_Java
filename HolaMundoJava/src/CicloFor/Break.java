
package CicloFor;

//Palabra reservada Break
//Esta palabra permite romper un ciclo 
public class Break {
    
    public static void main(String args[]){
        
        for(var contador=0; contador<3; contador++){
            if(contador % 2 == 0){
                System.out.println("contador = " + contador);
                    //break; //ROMPEMOS EL CICLO Y SOLO NOS VA A MOSTRAR
                           //EL PRIMER NUMERO EN LA ITERACION
            }            
        }                
    }    
}
