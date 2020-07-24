package TiposDatos;


public class TiposPrimitivosFlotantes {

    /*
    Tipos primitivos de tipo flotantes: float 32b, double64b
    double utiliza notacion exponencial asi que pueden almacenar
    mas que float        
    double es el tipo de dato mas grande en java 
     */
    public static void main(String args[]) {

        //float numeroFloat = 3.4028235E38F;
        float numeroFloat = (float) 4028235E38D; //INFINITY YA NO SE SUPO CALCULAR 
      
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);
    
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo de Double: " + Double.MIN_VALUE);
        System.out.println("Valor nmaximo de Double: " + Double.MAX_VALUE);
    
    }
}
