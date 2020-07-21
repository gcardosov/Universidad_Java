
public class OperadoresCondicionales {
    
    public static void main(String args[]){
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        //definimos en lenguaje matematico la expresion de los rangos
        // >= 0, <=10 rango de 0 a 10 incluyendo los extremos
        var resultado = a >= 0 && a <= 10; //and && conecta una condicion
                                           //ambas deben de cumplirse
        if(resultado){//la condicion nos va a arrojar un valor booleano
                      //por lo cual "SI" resultado es true   
            System.out.println("Dentro de rango");
        }else{
            System.out.println("Fuera de rango");        
        }
        
        var vacaciones = false;
        var diaDescanzo = true;
        
        if( vacaciones || diaDescanzo){
             System.out.println("El padre puede asistir al juego de su hijo");
        }else{
            System.out.println("El padre esta ocupado");
        }                        
    }    
}
