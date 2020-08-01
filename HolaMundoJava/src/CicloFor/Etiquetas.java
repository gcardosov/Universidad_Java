
package CicloFor;

//Uso de etiquetas en java
//Permite a las palabras reservadas continue y break 
//ir hacia una parte especifica de nuestro programa
//no es recomentable el famocisimo go to "Trampa"
//Son de utilidad en ciclos anidados para romperlos

public class Etiquetas {
        public static void main(String args[]){
        
        inicio:
        for(var contador=0; contador<3; contador++){
            if(contador % 2 != 0){
                continue inicio; //Va a la linea de codigo de la etiqueta que 
                                 //se agrego de esta manera se genera un 
                                 //bloque de codigo
            }
             System.out.println("contador = " + contador);
        }    
    }        
}
