

public class IfElse {
    
    public static void main(String args[]){
        var condicion = true;
        
        if(!condicion){
            System.out.println("Condicion verdadera");  
            //Si tenemos mas de una linea en el if es obligatorio usar llaves
            System.out.println("Nueva linea");
            
        }else{
            System.out.println("Condicion falsa");
        }
    } 
}
