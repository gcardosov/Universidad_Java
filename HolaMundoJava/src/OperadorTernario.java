
public class OperadorTernario {
    
    public static void main(String args[]){
        //Es operador ternario porque tien 3 partes
        //Tiene condicion, Verdadero y falso
        //dependiendo el valor booleano ejecuta
        //falso o verdadero
        //Simplifica el if, else, 
        //Solo se recomienda usar cuando son validaciones sencillas
        var resultado = (3 > 5) ? "Verdadero" : "Falso" ;
        //System.out.println("resultado = " + resultado);
        
        
        var numero = 7;
        resultado = (numero % 2 == 0) ? "Es par" : "Es non";
        System.out.println("resultado = " + resultado);
        
        
    }
}
