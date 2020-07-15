
public class InferenciaTiposPrimitivos {
    
    public static void main(String args[]){
        
        //Con la inferencia en java las variables numericas y que no tienen
        //punto son de tipo int
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        //Para especificar que queremos un tipo de dato float
        //necesitamos colocar la letra "F" en el valor de la 
        //asignacion 
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
    
    }   
}
