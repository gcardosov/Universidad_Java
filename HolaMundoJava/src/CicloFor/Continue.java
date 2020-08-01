
package CicloFor;

//Palabra reservada continue
//Permite ir a la siguiente iteracion 

public class Continue {
        public static void main(String args[]){
        
        for(var contador=0; contador<3; contador++){
            if(contador % 2 != 0){
                continue;
            }
             System.out.println("contador = " + contador);
        }    
    }
}
