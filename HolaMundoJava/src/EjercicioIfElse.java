
public class EjercicioIfElse {
    
    public static void main(String args[]){
        var condicion = true;
        
        if(!condicion){
            System.out.println("Condicion verdadera");              
        }else{
            System.out.println("Condicion falsa");
        }
        
        var numero = 5;
        //Rango de 1 a 4
        var numeroTexto = "Numero desconocido";
        
        if(numero == 1){   
            numeroTexto = "Numero uno";
        //Para preguntar por un caso que este relacionado con el if inicial 
        //usamos else if
        }else if (numero == 2){
            numeroTexto = "Numero dos";                        
        }else if (numero == 3){
            numeroTexto = "Numero tres";
        }else if (numero == 4){
            numeroTexto = "Numero cuatro";
        }/*else{
            numeroTexto = "Numero no encontrado";
        }*/
        
        System.out.println("numeroTexto = " + numeroTexto);
        //Practicamente hicimos un switch con else-if
        
    }  
}
